package com.surgeplay.glow;

import java.io.File;

import org.lwjgl.glfw.GLFW;

/**
 * Centralized way to examine the GL context and make use of features if they're available.
 */
public class Context {
	private static boolean init = false;
	private static boolean gl = true;
	private static int version 		= -1;
	
	/**
	 * Make sure the context is initialized. Nothing happens if the context has already been initialized.
	 */
	public static void init() {
		if (!init) refresh();
		init = true;
	}
	
	/**
	 * Reexamine GLFW to find out what kind of OpenGL context is current.
	 */
	public static void refresh() {
		long hWin = GLFW.glfwGetCurrentContext();
		int api = GLFW.glfwGetWindowAttrib(hWin, GLFW.GLFW_CLIENT_API);
		if (api==GLFW.GLFW_OPENGL_ES_API) {
			gl = false;
		} else if (api==GLFW.GLFW_OPENGL_API) {
			gl = true;
		} else throw new IllegalStateException("GLFW indicated an invalid API (0x"+Integer.toHexString(api)+")");
		
		int glMajor = GLFW.glfwGetWindowAttrib(hWin, GLFW.GLFW_CONTEXT_VERSION_MAJOR);
		int glMinor = GLFW.glfwGetWindowAttrib(hWin, GLFW.GLFW_CONTEXT_VERSION_MINOR);
		version = glMajor*10 + glMinor;
	}
	
	public static String asString() {
		init();
		return (gl ? "OpenGL" : "OpenGL ES") + " " + (version/10.0f);
	}
	
	public static boolean check(Object o) {
		init();
		GLCoreSince req = o.getClass().getDeclaredAnnotation(GLCoreSince.class);
		if (req==null) return false;
		
		if (gl) {
			return version >= req.gl();
		} else {
			return version >= req.es();
		}
	}
	
	public static boolean check(int gl, int es) {
		init();
		if (Context.gl) {
			return version >= gl;
		} else {
			return version >= es;
		}
	}
	
	/**
	 * Sets up an OpenGL context in a really non-picky way. Often, on desktop environments, this
	 * creates a compatibility context with fixed-function pipeline features still enabled. This
	 * method is generally best if your code can bend to accommodate different feature sets.
	 * 
	 * <p>As a reminder, if you're having trouble with natives at this stage, try setting the path
	 * for lwjgl to look for its natives:
	 * <pre><code>
	 * System.setProperty("org.lwjgl.librarypath", new File("native").getAbsolutePath());
	 * </code></pre>
	 */
	public static long createWindow(String title) {
		GLFW.glfwInit();
		GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_OPENGL_API);
		long hWin = GLFW.glfwCreateWindow(1024, 768, "GL", 0, 0);
		GLFW.glfwMakeContextCurrent(hWin);
		org.lwjgl.opengl.GL.createCapabilities();
		return hWin;
	}
	
}
