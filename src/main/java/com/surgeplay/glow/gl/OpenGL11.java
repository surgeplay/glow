package com.surgeplay.glow.gl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.lwjgl.PointerBuffer;

public class OpenGL11 implements GL11 {
	public static final OpenGL11 INSTANCE = new OpenGL11();
	
	@Override
	public void glEnable(int target) {
		org.lwjgl.opengl.GL11.glEnable(target);
	}

	@Override
	public void glDisable(int target) {
		org.lwjgl.opengl.GL11.glDisable(target);
	}

	@Override
	public boolean glAreTexturesResident(int n, ByteBuffer textures, ByteBuffer residences) {
		return org.lwjgl.opengl.GL11.glAreTexturesResident(n, textures, residences);
	}

	@Override
	public boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences) {
		return org.lwjgl.opengl.GL11.glAreTexturesResident(textures, residences);
	}

	@Override
	public boolean glAreTexturesResident(int texture, ByteBuffer residences) {
		return org.lwjgl.opengl.GL11.glAreTexturesResident(texture, residences);
	}

	@Override
	public void glArrayElement(int i) {
		org.lwjgl.opengl.GL11.glArrayElement(i);
	}

	@Override
	public void glBindTexture(int target, int texture) {
		org.lwjgl.opengl.GL11.glBindTexture(target, texture);
	}

	@Override
	public void glBlendFunc(int sfactor, int dfactor) {
		org.lwjgl.opengl.GL11.glBlendFunc(sfactor, dfactor);
	}

	@Override
	public void glClear(int mask) {
		org.lwjgl.opengl.GL11.glClear(mask);
	}

	@Override
	public void glClearColor(float red, float green, float blue, float alpha) {
		org.lwjgl.opengl.GL11.glClearColor(red, green, blue, alpha);
	}

	@Override
	public void glClearDepth(double depth) {
		org.lwjgl.opengl.GL11.glClearDepth(depth);
	}

	@Override
	public void glClearStencil(int s) {
		org.lwjgl.opengl.GL11.glClearStencil(s);
	}

	@Override
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		org.lwjgl.opengl.GL11.glColorMask(red, green, blue, alpha);
	}

	@Override
	public void glCullFace(int mode) {
		org.lwjgl.opengl.GL11.glCullFace(mode);
	}

	@Override
	public void glDepthFunc(int func) {
		org.lwjgl.opengl.GL11.glDepthFunc(func);
	}

	@Override
	public void glDepthMask(boolean flag) {
		org.lwjgl.opengl.GL11.glDepthMask(flag);
	}

	@Override
	public void glDepthRange(double zNear, double zFar) {
		org.lwjgl.opengl.GL11.glDepthRange(zNear, zFar);
	}

	@Override
	public void glDisableClientState(int array) {
		org.lwjgl.opengl.GL11.glDisableClientState(array);
	}

	@Override
	public void glDrawArrays(int mode, int first, int count) {
		org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count);
	}

	@Override
	public void glDrawBuffer(int buf) {
		org.lwjgl.opengl.GL11.glDrawBuffer(buf);
	}

	@Override
	public void glDrawElements(int mode, int count, int type, ByteBuffer indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDrawElements(int mode, int count, int type, long indicesOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDrawElements(int mode, int type, ByteBuffer indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDrawElements(int mode, ByteBuffer indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDrawElements(int mode, ShortBuffer indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDrawElements(int mode, IntBuffer indices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glEnableClientState(int array) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glFinish() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glFlush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glFrontFace(int dir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGenTextures(int n, ByteBuffer textures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGenTextures(IntBuffer textures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int glGenTextures() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glDeleteTextures(int n, ByteBuffer textures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDeleteTextures(IntBuffer textures) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glDeleteTextures(int texture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetBooleanv(int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean glGetBoolean(int pname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void glGetFloatv(int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetFloatv(int pname, FloatBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float glGetFloat(int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glGetIntegerv(int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetIntegerv(int pname, IntBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int glGetInteger(int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glGetDoublev(int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetDoublev(int pname, DoubleBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double glGetDouble(int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int glGetError() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glGetPointerv(int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetPointerv(int pname, PointerBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long glGetPointer(int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String glGetString(int name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexImage(int tex, int level, int format, int type, long pixelsOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexLevelParameteriv(int target, int level, int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int glGetTexLevelParameteri(int target, int level, int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glGetTexLevelParameterfv(int target, int level, int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float glGetTexLevelParameterf(int target, int level, int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glGetTexParameteriv(int target, int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int glGetTexParameteri(int target, int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glGetTexParameterfv(int target, int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float glGetTexParameterf(int target, int pname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void glHint(int target, int hint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glIndexPointer(int type, int stride, ByteBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glIndexPointer(int type, int stride, long pointerOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glIndexPointer(int stride, ByteBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glIndexPointer(int stride, ShortBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glIndexPointer(int stride, IntBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glInterleavedArrays(int format, int stride, ByteBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glInterleavedArrays(int format, int stride, long pointerOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glInterleavedArrays(int format, int stride, ShortBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glInterleavedArrays(int format, int stride, IntBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glInterleavedArrays(int format, int stride, FloatBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glInterleavedArrays(int format, int stride, DoubleBuffer pointer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean glIsEnabled(int cap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean glIsTexture(int texture) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void glLineWidth(float width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glLogicOp(int op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPixelStorei(int pname, int param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPixelStoref(int pname, int param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPointSize(float size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPolygonMode(int face, int mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPolygonOffset(float factor, float units) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPrioritizeTextures(int n, ByteBuffer textures, ByteBuffer priorities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glReadBuffer(int src) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glScissor(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glSelectBuffer(int size, ByteBuffer buffer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glSelectBuffer(IntBuffer buffer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glStencilFunc(int func, int ref, int mask) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glStencilMask(int mask) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glStencilOp(int sfail, int dpfail, int dppass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, ByteBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, long pixelsOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, ShortBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, IntBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, FloatBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, DoubleBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			ByteBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			long pixelsOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			ShortBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			IntBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			FloatBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			DoubleBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height,
			int border) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexParameteri(int target, int pname, int param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexParameteriv(int target, int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexParameteriv(int target, int pname, IntBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexParameterf(int target, int pname, float param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexParameterfv(int target, int pname, ByteBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexParameterfv(int target, int pname, FloatBuffer params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			ByteBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			long pixelsOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			ShortBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			FloatBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			DoubleBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, ByteBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, long pixelsOffset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, ShortBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, IntBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, FloatBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, DoubleBuffer pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void glViewport(int x, int y, int w, int h) {
		// TODO Auto-generated method stub
		
	}

}
