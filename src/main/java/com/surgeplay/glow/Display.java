package com.surgeplay.glow;

import java.util.function.Consumer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.slf4j.Logger;

public class Display {
	private static long handle = 0;
	private static GLFWErrorCallback errorCallback = null;
	private static GLFWKeyCallback keyCallback = null;
	
	/**
	 * Creates a GL context and window with the default GLFW_OPENGL_ANY_PROFILE,
	 * *backwards*-compatible to whatever extent the drivers support (this is the
	 * opposite of so-called "compatibility" profiles!). Normally this also emulates
	 * fixed-function pipeline behaviors with the option to break out if more advanced
	 * features exist.
	 * 
	 * <p>Use this if you're not sure which profile to create, or if your code flexes
	 * to accommodate different available feature-sets.
	 * 
	 * <p><b>State Side-Effects:</b> Makes the new context current, and returns the
	 * numeric handle to it.
	 */
	public static long createGL(String title, int width, int height) {
		if (isCreated()) return handle;
		GLFW.glfwInit();
		GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_OPENGL_API);
		return doCreate(title, width, height);
	}
	
	/**
	 * This method forwards down to createCoreGLES, asking for a baseline 1.0 version.
	 * 
	 * <p>Since GLES ignores the GLFW_OPENGL_ANY_PROFILE, and GLES 1.x is incompatible with GLES 2.x,
	 * but drivers are free to provide any compatible higher version, you can expect this method to
	 * provide any 1.x version of GLES.
	 * 
	 * <p>The reason for defaulting to 1.0 instead of 2.0 is that drivers are required to reject a
	 * version higher than the one asked for. This method gives the *best* chance of success at
	 * creating a GLES context of nonspecific kind.
	 * 
	 * <p><b>State Side-Effects:</b> Makes the new context current, and returns the
	 * numeric handle to it.
	 */
	public static long createGLES(String title, int width, int height) {
		return createCoreGLES(1, 0, title, width, height);
	}
	
	public static long createCoreGL(int majorVersion, int minorVersion, String title, int width, int height) {
		if (isCreated()) return handle;
		if ((majorVersion==3 && minorVersion<2) ||
			majorVersion<3) throw new IllegalArgumentException("Core contexts were only introduced in OpenGL 3.2. Requested context is "+majorVersion+"."+minorVersion);
		
		GLFW.glfwInit();
		GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_OPENGL_API);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, majorVersion);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, minorVersion);
		return doCreate(title, width, height);
	}
	
	/**
	 * Creates a Core GLES context of the version indicated OR any compatible higher version. Does
	 * not force-deprecate old functions, however.
	 * 
	 * <p><b>State Side-Effects:</b> Makes the new context current, and returns the
	 * numeric handle to it.
	 */
	public static long createCoreGLES(int majorVersion, int minorVersion, String title, int width, int height) {
		if (isCreated()) return handle;
		GLFW.glfwInit();
		GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_OPENGL_ES_API);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, majorVersion);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, minorVersion);
		return doCreate(title, width, height);
	}
	
	private static long doCreate(String title, int width, int height) {
		handle = GLFW.glfwCreateWindow(width, height, title, 0, 0);
		
		GLFW.glfwMakeContextCurrent(handle);
		org.lwjgl.opengl.GL.createCapabilities();
		return handle;
	}
	
	public static boolean isCreated() {
		return handle!=0;
	}
	
	public static void setErrorCallback(GLFWErrorCallback callback) {
		GLFW.glfwSetErrorCallback(callback);
		errorCallback = callback;
		//GLFWErrorCallback.createString((int err,String str) -> LOGGER.warning(""+err+": "+str));
	}
	
	public static void setErrorCallback(Consumer<String> consumer) {
		GLFWErrorCallback tmp = GLFWErrorCallback.createString(
				(int err,String str) -> consumer.accept(""+err+": "+str)
		);
		GLFW.glfwSetErrorCallback(tmp);
		errorCallback = tmp;
	}
	
	/** Convenience method to throw an IllegalStateException when an error occurs. */
	public static void setErrorCallbackToThrowExceptions() {
		//Temporary variable ensures no race conditions occur with GC for the old callback
		GLFWErrorCallback tmp = GLFWErrorCallback.createThrow();
		GLFW.glfwSetErrorCallback(tmp);
		errorCallback = tmp;
	}
	
	/** Convenience method to print a message out to System.err when an error occurs */
	public static void setErrorCallbackToPrintToSterr() {
		GLFWErrorCallback tmp = GLFWErrorCallback.createPrint(System.err);
		GLFW.glfwSetErrorCallback(tmp);
		errorCallback = tmp;
	}
	
	/** Convenience method to print a message out to System.err when an error occurs */
	public static void setErrorCallbackToLog(Logger log) {
		GLFWErrorCallback tmp = GLFWErrorCallback.createString(
				(int err,String str) -> log.error(""+err+": "+str)
		);
		GLFW.glfwSetErrorCallback(tmp);
		errorCallback = tmp;
	}
	
	public static void destroy() {
		if (handle!=0) GLFW.glfwDestroyWindow(handle);
		handle = 0;
	}
}
