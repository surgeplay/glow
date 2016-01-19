package com.surgeplay.glow.gl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.lwjgl.PointerBuffer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

/**
 * Exposes functions as if they were OpenGL ES 2.0, but forwards down to function pointers which are
 * safe to call in an OpenGL Core 3.0 context.
 */
public class GLCore implements CompatibleGL {
	public static GLCore INSTANCE = new GLCore();

	@Override
	public void glActiveTexture(int texture) {
		GL13.glActiveTexture(texture);
	}

	@Override
	public void glAttachShader(int program, int shader) {
		GL20.glAttachShader(program, shader);
	}

	@Override
	public void glBindAttribLocation(int program, int index, CharSequence name) {
		GL20.glBindAttribLocation(program, index, name);
	}

	@Override
	public void glBindBuffer(int target, int buffer) {
		GL15.glBindBuffer(target, buffer);
	}

	@Override
	public void glBindFramebuffer(int target, int framebuffer) {
		GL30.glBindFramebuffer(target, framebuffer);
	}

	@Override
	public void glBindRenderbuffer(int target, int renderbuffer) {
		GL30.glBindRenderbuffer(target, renderbuffer);
	}

	@Override
	public void glBindTexture(int target, int texture) {
		GL11.glBindTexture(target, texture);
	}

	@Override
	public void glBlendColor(float red, float green, float blue, float alpha) {
		GL14.glBlendColor(red, green, blue, alpha);
	}

	@Override
	public void glBlendEquation(int mode) {
		GL14.glBlendEquation(mode);
	}

	@Override
	public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		GL20.glBlendEquationSeparate(modeRGB, modeAlpha);
	}

	@Override
	public void glBlendFunc(int sfactor, int dfactor) {
		GL11.glBlendFunc(sfactor, dfactor);
	}

	@Override
	public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		GL14.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
	}

	@Override
	public void glBufferData(int target, long size, ByteBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}

	@Override
	public void glBufferData(int target, long size, int usage) {
		GL15.glBufferData(target, size, usage);
	}

	@Override
	public void glBufferData(int target, ByteBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}

	@Override
	public void glBufferData(int target, ShortBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}

	@Override
	public void glBufferData(int target, IntBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}

	@Override
	public void glBufferData(int target, FloatBuffer data, int usage) {
		GL15.glBufferData(target, data, usage);
	}

	@Override
	public void glBufferSubData(int target, long offset, long size, ByteBuffer data) {
		GL15.glBufferSubData(target, offset, size, data);
	}

	@Override
	public void glBufferSubData(int target, long offset, ByteBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}

	@Override
	public void glBufferSubData(int target, long offset, ShortBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}

	@Override
	public void glBufferSubData(int target, long offset, IntBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}

	@Override
	public void glBufferSubData(int target, long offset, FloatBuffer data) {
		GL15.glBufferSubData(target, offset, data);
	}

	@Override
	public int glCheckFramebufferStatus(int target) {
		return GL30.glCheckFramebufferStatus(target);
	}

	@Override
	public void glClear(int mask) {
		GL11.glClear(mask);
	}

	@Override
	public void glClearColor(float red, float green, float blue, float alpha) {
		GL11.glClearColor(red, green, blue, alpha);
	}

	@Override
	public void glClearDepth(float d) {
		//GL41.glClearDepthf(d); //No.
		GL11.glClearDepth(d);
	}

	@Override
	public void glClearStencil(int s) {
		GL11.glClearStencil(s);
	}

	@Override
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
		GL11.glColorMask(red, green, blue, alpha);
	}

	@Override
	public void glCompileShader(int shader) {
		GL20.glCompileShader(shader);
	}

	@Override
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data) {
		GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
	}

	@Override
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset) {
		GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, dataOffset);
		
	}

	@Override
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
		GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
	}

	@Override
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	@Override
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}

	@Override
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
	}

	@Override
	public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
		GL11.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
	}

	@Override
	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width,int height) {
		GL11.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
	}

	@Override
	public int glCreateProgram() {
		return GL20.glCreateProgram();
	}

	@Override
	public int glCreateShader(int type) {
		return GL20.glCreateShader(type);
	}

	@Override
	public void glCullFace(int mode) {
		GL11.glCullFace(mode);
	}

	@Override
	public void glDeleteBuffers(int n, ByteBuffer buffers) {
		GL15.glDeleteBuffers(n, buffers);
	}

	@Override
	public void glDeleteBuffers(IntBuffer buffers) {
		GL15.glDeleteBuffers(buffers);
	}

	@Override
	public void glDeleteBuffers(int buffer) {
		GL15.glDeleteBuffers(buffer);
	}

	@Override
	public void glDeleteFramebuffers(int n, ByteBuffer framebuffers) {
		GL30.glDeleteFramebuffers(n, framebuffers);
	}

	@Override
	public void glDeleteFramebuffers(IntBuffer framebuffers) {
		GL30.glDeleteFramebuffers(framebuffers);
	}

	@Override
	public void glDeleteFramebuffers(int framebuffer) {
		GL30.glDeleteFramebuffers(framebuffer);
	}

	@Override
	public void glDeleteProgram(int program) {
		GL20.glDeleteProgram(program);
	}

	@Override
	public void glDeleteRenderbuffers(int n, ByteBuffer renderbuffers) {
		GL30.glDeleteRenderbuffers(n, renderbuffers);
	}

	@Override
	public void glDeleteRenderbuffers(IntBuffer renderbuffers) {
		GL30.glDeleteRenderbuffers(renderbuffers);
	}

	@Override
	public void glDeleteRenderbuffers(int renderbuffer) {
		GL30.glDeleteRenderbuffers(renderbuffer);
	}

	@Override
	public void glDeleteShader(int shader) {
		GL20.glDeleteShader(shader);
	}

	@Override
	public void glDeleteTextures(int n, ByteBuffer textures) {
		GL11.glDeleteTextures(n, textures);
	}

	@Override
	public void glDeleteTextures(IntBuffer textures) {
		GL11.glDeleteTextures(textures);
	}

	@Override
	public void glDeleteTextures(int texture) {
		GL11.glDeleteTextures(texture);
	}

	@Override
	public void glDepthFunc(int func) {
		GL11.glDepthFunc(func);
	}

	@Override
	public void glDepthMask(boolean flag) {
		GL11.glDepthMask(flag);
	}

	@Override
	public void glDepthRangef(float n, float f) {
		GL11.glDepthRange(n, f);
	}

	@Override
	public void glDetachShader(int program, int shader) {
		GL20.glDetachShader(program, shader);
	}

	@Override
	public void glDisable(int cap) {
		GL11.glDisable(cap);
	}

	@Override
	public void glDisableVertexAttribArray(int index) {
		GL20.glDisableVertexAttribArray(index);
	}

	@Override
	public void glDrawArrays(int mode, int first, int count) {
		GL11.glDrawArrays(mode, first, count);
	}

	@Override
	public void glDrawElements(int mode, int count, int type, ByteBuffer indices) {
		GL11.glDrawElements(mode, count, type, indices);
	}

	@Override
	public void glDrawElements(int mode, int count, int type, long indicesOffset) {
		GL11.glDrawElements(mode, count, type, indicesOffset);
	}

	@Override
	public void glDrawElements(int mode, int type, ByteBuffer indices) {
		GL11.glDrawElements(mode, type, indices);
	}

	@Override
	public void glDrawElements(int mode, ByteBuffer indices) {
		GL11.glDrawElements(mode, indices);
	}

	@Override
	public void glDrawElements(int mode, ShortBuffer indices) {
		GL11.glDrawElements(mode, indices);
	}

	@Override
	public void glDrawElements(int mode, IntBuffer indices) {
		GL11.glDrawElements(mode, indices);
	}

	@Override
	public void glEnable(int cap) {
		GL11.glEnable(cap);
	}

	@Override
	public void glEnableVertexAttribArray(int index) {
		GL20.glEnableVertexAttribArray(index);
	}

	@Override
	public void glFinish() {
		GL11.glFinish();
	}

	@Override
	public void glFlush() {
		GL11.glFlush();
	}

	@Override
	public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
		GL30.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
	}

	@Override
	public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
		GL30.glFramebufferTexture2D(target, attachment, textarget, texture, level);
	}

	@Override
	public void glFrontFace(int mode) {
		GL11.glFrontFace(mode);
	}

	@Override
	public void glGenBuffers(int n, ByteBuffer buffers) {
		GL15.glGenBuffers(n, buffers);
	}

	@Override
	public void glGenBuffers(IntBuffer buffers) {
		GL15.glGenBuffers(buffers);
	}

	@Override
	public int glGenBuffers() {
		return GL15.glGenBuffers();
	}

	@Override
	public void glGenerateMipmap(int target) {
		GL30.glGenerateMipmap(target);
	}

	@Override
	public void glGenFramebuffers(int n, ByteBuffer framebuffers) {
		GL30.glGenFramebuffers(n, framebuffers);
	}

	@Override
	public void glGenFramebuffers(IntBuffer framebuffers) {
		GL30.glGenFramebuffers(framebuffers);
	}

	@Override
	public int glGenFramebuffers() {
		return GL30.glGenFramebuffers();
	}

	@Override
	public void glGenRenderbuffers(int n, ByteBuffer renderbuffers) {
		GL30.glGenRenderbuffers(n, renderbuffers);
	}

	@Override
	public void glGenRenderbuffers(IntBuffer renderbuffers) {
		GL30.glGenRenderbuffers(renderbuffers);
	}

	@Override
	public int glGenRenderbuffers() {
		return GL30.glGenRenderbuffers();
	}

	@Override
	public void glGenTextures(int n, ByteBuffer textures) {
		GL11.glGenTextures(n, textures);
	}

	@Override
	public void glGenTextures(IntBuffer textures) {
		GL11.glGenTextures(textures);
	}

	@Override
	public int glGenTextures() {
		return GL11.glGenTextures();
	}

	@Override
	public void glGetActiveAttrib(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		GL20.glGetActiveAttrib(program, index, bufSize, length, size, type, name);
	}

	@Override
	public void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		GL20.glGetActiveAttrib(program, index, length, size, type, name);
	}

	@Override
	public String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		return GL20.glGetActiveAttrib(program, index, bufSize, size, type);
	}

	@Override
	public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type) {
		return GL20.glGetActiveAttrib(program, index, size, type);
	}

	@Override
	public void glGetActiveUniform(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		GL20.glGetActiveUniform(program, index, bufSize, length, size, type, name);
	}

	@Override
	public void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		GL20.glGetActiveUniform(program, index, length, size, type, name);
	}

	@Override
	public String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type) {
		return GL20.glGetActiveUniform(program, index, bufSize, size, type);
	}

	@Override
	public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type) {
		return GL20.glGetActiveUniform(program, index, size, type);
	}

	@Override
	public void glGetAttachedShaders(int program, int maxCount, ByteBuffer count, ByteBuffer shaders) {
		GL20.glGetAttachedShaders(program, maxCount, count, shaders);
	}

	@Override
	public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
		GL20.glGetAttachedShaders(program, count, shaders);
	}

	@Override
	public IntBuffer glGetAttachedShaders(int program, int maxCount) {
		return GL20.glGetAttachedShaders(program, maxCount);
	}

	@Override
	public IntBuffer glGetAttachedShaders(int program) {
		return GL20.glGetAttachedShaders(program);
	}

	@Override
	public int glGetAttribLocation(int program, CharSequence name) {
		return GL20.glGetAttribLocation(program, name);
	}

	@Override
	public void glGetBooleanv(int pname, ByteBuffer data) {
		GL11.glGetBooleanv(pname, data);
	}

	@Override
	public boolean glGetBoolean(int pname) {
		return GL11.glGetBoolean(pname);
	}

	@Override
	public void glGetBufferParameteriv(int target, int pname, ByteBuffer params) {
		GL15.glGetBufferParameteriv(target, pname, params);
	}

	@Override
	public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		GL15.glGetBufferParameteriv(target, pname, params);
	}

	@Override
	public int glGetBufferParameteri(int target, int pname) {
		return GL15.glGetBufferParameteri(target, pname);
	}

	@Override
	public int glGetError() {
		return GL11.glGetError();
	}

	@Override
	public void glGetFloatv(int pname, ByteBuffer data) {
		GL11.glGetFloatv(pname, data);
	}

	@Override
	public void glGetFloatv(int pname, FloatBuffer data) {
		GL11.glGetFloatv(pname, data);
	}

	@Override
	public float glGetFloat(int pname) {
		return GL11.glGetFloat(pname);
	}

	@Override
	public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, ByteBuffer params) {
		GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
	}

	@Override
	public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params) {
		GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
	}

	@Override
	public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname) {
		return GL30.glGetFramebufferAttachmentParameteri(target, attachment, pname);
	}

	@Override
	public void glGetIntegerv(int pname, ByteBuffer data) {
		GL11.glGetIntegerv(pname, data);
	}

	@Override
	public void glGetIntegerv(int pname, IntBuffer data) {
		GL11.glGetIntegerv(pname, data);
	}

	@Override
	public int glGetInteger(int pname) {
		return GL11.glGetInteger(pname);
	}

	@Override
	public void glGetProgramiv(int program, int pname, ByteBuffer params) {
		GL20.glGetProgramiv(program, pname, params);
	}

	@Override
	public void glGetProgramiv(int program, int pname, IntBuffer params) {
		GL20.glGetProgramiv(program, pname, params);
	}

	@Override
	public int glGetProgrami(int program, int pname) {
		return GL20.glGetProgrami(program, pname);
	}

	@Override
	public void glGetProgramInfoLog(int program, int bufSize, ByteBuffer length, ByteBuffer infoLog) {
		GL20.glGetProgramInfoLog(program, bufSize, length, infoLog);
	}

	@Override
	public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
		GL20.glGetProgramInfoLog(program, length, infoLog);
	}

	@Override
	public String glGetProgramInfoLog(int program, int bufSize) {
		return GL20.glGetProgramInfoLog(program, bufSize);
	}

	@Override
	public String glGetProgramInfoLog(int program) {
		return GL20.glGetProgramInfoLog(program);
	}

	@Override
	public void glGetRenderbufferParameteriv(int target, int pname, ByteBuffer params) {
		GL30.glGetRenderbufferParameteriv(target, pname, params);
	}

	@Override
	public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params) {
		GL30.glGetRenderbufferParameteriv(target, pname, params);
	}

	@Override
	public int glGetRenderbufferParameteri(int target, int pname) {
		return GL30.glGetRenderbufferParameteri(target, pname);
	}

	@Override
	public void glGetShaderiv(int shader, int pname, ByteBuffer params) {
		GL20.glGetShaderiv(shader, pname, params);
	}

	@Override
	public void glGetShaderiv(int shader, int pname, IntBuffer params) {
		GL20.glGetShaderiv(shader, pname, params);
	}

	@Override
	public int glGetShaderi(int shader, int pname) {
		return GL20.glGetShaderi(shader, pname);
	}

	@Override
	public String glGetShaderInfoLog(int shader) {
		return GL20.glGetShaderInfoLog(shader);
	}

	@Override
	public String glGetShaderSource(int shader) {
		return GL20.glGetShaderSource(shader);
	}

	@Override
	public String glGetString(int name) {
		return GL11.glGetString(name);
	}

	@Override
	public void glGetTexParameterfv(int target, int pname, ByteBuffer params) {
		GL11.glGetTexParameterfv(target, pname, params);
	}

	@Override
	public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		GL11.glGetTexParameterfv(target, pname, params);
	}

	@Override
	public float glGetTexParameterf(int target, int pname) {
		return GL11.glGetTexParameterf(target, pname);
	}

	@Override
	public void glGetTexParameteriv(int target, int pname, ByteBuffer params) {
		GL11.glGetTexParameteriv(target, pname, params);
	}

	@Override
	public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		GL11.glGetTexParameteriv(target, pname, params);
	}

	@Override
	public int glGetTexParameteri(int target, int pname) {
		return GL11.glGetTexParameteri(target, pname);
	}

	@Override
	public void glGetUniformfv(int program, int location, ByteBuffer params) {
		GL20.glGetUniformfv(program, location, params);
	}

	@Override
	public void glGetUniformfv(int program, int location, FloatBuffer params) {
		GL20.glGetUniformfv(program, location, params);
	}

	@Override
	public float glGetUniformf(int program, int location) {
		return GL20.glGetUniformf(program, location);
	}

	@Override
	public void glGetUniformiv(int program, int location, ByteBuffer params) {
		GL20.glGetUniformiv(program, location, params);
	}

	@Override
	public void glGetUniformiv(int program, int location, IntBuffer params) {
		GL20.glGetUniformiv(program, location, params);
	}

	@Override
	public int glGetUniformi(int program, int location) {
		return GL20.glGetUniformi(program, location);
	}

	@Override
	public int glGetUniformLocation(int program, CharSequence name) {
		return GL20.glGetUniformLocation(program, name);
	}

	@Override
	public void glGetVertexAttribfv(int index, int pname, ByteBuffer params) {
		GL20.glGetVertexAttribfv(index, pname, params);
	}

	@Override
	public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
		GL20.glGetVertexAttribfv(index, pname, params);
	}

	@Override
	public void glGetVertexAttribiv(int index, int pname, ByteBuffer params) {
		GL20.glGetVertexAttribiv(index, pname, params);
	}

	@Override
	public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
		GL20.glGetVertexAttribiv(index, pname, params);
	}

	@Override
	public void glGetVertexAttribPointerv(int index, int pname, ByteBuffer pointer) {
		GL20.glGetVertexAttribPointerv(index, pname, pointer);
	}

	@Override
	public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer) {
		GL20.glGetVertexAttribPointerv(index, pname, pointer);
	}

	@Override
	public long glGetVertexAttribPointer(int index, int pname) {
		return GL20.glGetVertexAttribPointer(index, pname);
	}

	@Override
	public void glHint(int target, int mode) {
		GL11.glHint(target, mode);
	}

	@Override
	public boolean glIsBuffer(int buffer) {
		return GL15.glIsBuffer(buffer);
	}

	@Override
	public boolean glIsEnabled(int cap) {
		return GL11.glIsEnabled(cap);
	}

	@Override
	public boolean glIsFramebuffer(int framebuffer) {
		return GL30.glIsFramebuffer(framebuffer);
	}

	@Override
	public boolean glIsProgram(int program) {
		return GL20.glIsProgram(program);
	}

	@Override
	public boolean glIsRenderbuffer(int renderbuffer) {
		return GL30.glIsRenderbuffer(renderbuffer);
	}

	@Override
	public boolean glIsShader(int shader) {
		return GL20.glIsShader(shader);
	}

	@Override
	public boolean glIsTexture(int texture) {
		return GL11.glIsTexture(texture);
	}

	@Override
	public void glLineWidth(float width) {
		GL11.glLineWidth(width);
	}

	@Override
	public void glLinkProgram(int program) {
		GL20.glLinkProgram(program);
	}

	@Override
	public void glPixelStorei(int pname, int param) {
		GL11.glPixelStorei(pname, param);
	}

	@Override
	public void glPolygonOffset(float factor, float units) {
		GL11.glPolygonOffset(factor, units);
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset) {
		GL11.glReadPixels(x, y, width, height, format, type, pixelsOffset);
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}

	@Override
	public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		GL11.glReadPixels(x, y, width, height, format, type, pixels);
	}

	@Override
	public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
		GL30.glRenderbufferStorage(target, internalformat, width, height);
	}

	@Override
	public void glSampleCoverage(float value, boolean invert) {
		GL13.glSampleCoverage(value, invert);
	}

	@Override
	public void glScissor(int x, int y, int width, int height) {
		GL11.glScissor(x, y, width, height);
	}

	@Override
	public void glShaderSource(int shader, CharSequence... string) {
		GL20.glShaderSource(shader, string);
	}

	@Override
	public void glShaderSource(int shader, CharSequence string) {
		GL20.glShaderSource(shader, string);
	}

	@Override
	public void glStencilFunc(int func, int ref, int mask) {
		GL11.glStencilFunc(func, ref, mask);
	}

	@Override
	public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		GL20.glStencilFuncSeparate(face, func, ref, mask);
	}

	@Override
	public void glStencilMask(int mask) {
		GL11.glStencilMask(mask);
	}

	@Override
	public void glStencilMaskSeparate(int face, int mask) {
		GL20.glStencilMaskSeparate(face, mask);
	}

	@Override
	public void glStencilOp(int fail, int zfail, int zpass) {
		GL11.glStencilOp(fail, zfail, zpass);
	}

	@Override
	public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
		GL20.glStencilOpSeparate(face, sfail, dpfail, dppass);
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixelsOffset);
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	@Override
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels) {
		GL11.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}

	@Override
	public void glTexParameterf(int target, int pname, float param) {
		GL11.glTexParameterf(target, pname, param);
	}

	@Override
	public void glTexParameterfv(int target, int pname, ByteBuffer params) {
		GL11.glTexParameterfv(target, pname, params);
	}

	@Override
	public void glTexParameterfv(int target, int pname, FloatBuffer params) {
		GL11.glTexParameterfv(target, pname, params);
	}

	@Override
	public void glTexParameteri(int target, int pname, int param) {
		GL11.glTexParameteri(target, pname, param);
	}

	@Override
	public void glTexParameteriv(int target, int pname, ByteBuffer params) {
		GL11.glTexParameteriv(target, pname, params);
	}

	@Override
	public void glTexParameteriv(int target, int pname, IntBuffer params) {
		GL11.glTexParameteriv(target, pname, params);
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
		
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	@Override
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		GL11.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	@Override
	public void glUniform1f(int location, float v0) {
		GL20.glUniform1f(location, v0);
	}

	@Override
	public void glUniform1fv(int location, int count, ByteBuffer value) {
		GL20.glUniform1fv(location, count, value);
	}

	@Override
	public void glUniform1fv(int location, FloatBuffer value) {
		GL20.glUniform1fv(location, value);
	}

	@Override
	public void glUniform1i(int location, int v0) {
		GL20.glUniform1i(location, v0);
	}

	@Override
	public void glUniform1iv(int location, int count, ByteBuffer value) {
		GL20.glUniform1iv(location, count, value);
	}

	@Override
	public void glUniform1iv(int location, IntBuffer value) {
		GL20.glUniform1iv(location, value);
	}

	@Override
	public void glUniform2f(int location, float v0, float v1) {
		GL20.glUniform2f(location, v0, v1);
	}

	@Override
	public void glUniform2fv(int location, int count, ByteBuffer value) {
		GL20.glUniform2fv(location, count,value);
	}

	@Override
	public void glUniform2fv(int location, FloatBuffer value) {
		GL20.glUniform2fv(location, value);
	}

	@Override
	public void glUniform2i(int location, int v0, int v1) {
		GL20.glUniform2i(location, v0, v1);
	}

	@Override
	public void glUniform2iv(int location, int count, ByteBuffer value) {
		GL20.glUniform2iv(location, count, value);
	}

	@Override
	public void glUniform2iv(int location, IntBuffer value) {
		GL20.glUniform2iv(location, value);
	}

	@Override
	public void glUniform3f(int location, float v0, float v1, float v2) {
		GL20.glUniform3f(location, v0, v1, v2);
	}

	@Override
	public void glUniform3fv(int location, int count, ByteBuffer value) {
		GL20.glUniform3fv(location, count, value);
	}

	@Override
	public void glUniform3fv(int location, FloatBuffer value) {
		GL20.glUniform3fv(location, value);
	}

	@Override
	public void glUniform3i(int location, int v0, int v1, int v2) {
		GL20.glUniform3i(location, v0, v1, v2);
	}

	@Override
	public void glUniform3iv(int location, int count, ByteBuffer value) {
		GL20.glUniform3iv(location, count, value);
	}

	@Override
	public void glUniform3iv(int location, IntBuffer value) {
		GL20.glUniform3iv(location, value);
	}

	@Override
	public void glUniform4f(int location, float v0, float v1, float v2, float v3) {
		GL20.glUniform4f(location, v0, v1, v2, v3);
	}

	@Override
	public void glUniform4fv(int location, int count, ByteBuffer value) {
		GL20.glUniform4fv(location, count, value);
	}

	@Override
	public void glUniform4fv(int location, FloatBuffer value) {
		GL20.glUniform4fv(location, value);
	}

	@Override
	public void glUniform4i(int location, int v0, int v1, int v2, int v3) {
		GL20.glUniform4i(location, v0, v1, v2, v3);
	}

	@Override
	public void glUniform4iv(int location, int count, ByteBuffer value) {
		GL20.glUniform4iv(location, count, value);
	}

	@Override
	public void glUniform4iv(int location, IntBuffer value) {
		GL20.glUniform4iv(location, value);
	}

	@Override
	public void glUniformMatrix2fv(int location, int count, boolean transpose, ByteBuffer value) {
		GL20.glUniformMatrix2fv(location, count, transpose, value);
	}

	@Override
	public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value) {
		GL20.glUniformMatrix2fv(location, transpose, value);
	}

	@Override
	public void glUniformMatrix3fv(int location, int count, boolean transpose, ByteBuffer value) {
		GL20.glUniformMatrix3fv(location, count, transpose, value);
	}

	@Override
	public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value) {
		GL20.glUniformMatrix3fv(location, transpose, value);
	}

	@Override
	public void glUniformMatrix4fv(int location, int count, boolean transpose, ByteBuffer value) {
		GL20.glUniformMatrix4fv(location, count, transpose, value);
	}

	@Override
	public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value) {
		GL20.glUniformMatrix4fv(location, transpose, value);
	}

	@Override
	public void glUseProgram(int program) {
		GL20.glUseProgram(program);
	}

	@Override
	public void glValidateProgram(int program) {
		GL20.glValidateProgram(program);
	}

	@Override
	public void glVertexAttrib1f(int index, float x) {
		GL20.glVertexAttrib1f(index, x);
	}

	@Override
	public void glVertexAttrib1fv(int index, ByteBuffer v) {
		GL20.glVertexAttrib1fv(index, v);
	}

	@Override
	public void glVertexAttrib1fv(int index, FloatBuffer v) {
		GL20.glVertexAttrib1fv(index, v);
	}

	@Override
	public void glVertexAttrib2f(int index, float x, float y) {
		GL20.glVertexAttrib2f(index, x, y);
	}

	@Override
	public void glVertexAttrib2fv(int index, ByteBuffer v) {
		GL20.glVertexAttrib2fv(index, v);
	}

	@Override
	public void glVertexAttrib2fv(int index, FloatBuffer v) {
		GL20.glVertexAttrib2fv(index, v);
	}

	@Override
	public void glVertexAttrib3f(int index, float x, float y, float z) {
		GL20.glVertexAttrib3f(index, x, y, z);
	}

	@Override
	public void glVertexAttrib3fv(int index, ByteBuffer v) {
		GL20.glVertexAttrib3fv(index, v);
	}

	@Override
	public void glVertexAttrib3fv(int index, FloatBuffer v) {
		GL20.glVertexAttrib3fv(index, v);
	}

	@Override
	public void glVertexAttrib4f(int index, float x, float y, float z, float w) {
		GL20.glVertexAttrib4f(index, x, y, z, w);
	}

	@Override
	public void glVertexAttrib4fv(int index, ByteBuffer v) {
		GL20.glVertexAttrib4fv(index, v);
	}

	@Override
	public void glVertexAttrib4fv(int index, FloatBuffer v) {
		GL20.glVertexAttrib4fv(index, v);
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointerOffset) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointerOffset);
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
		GL20.glVertexAttribPointer(index, size, type, normalized, stride, pointer);
	}

	@Override
	public void glViewport(int x, int y, int width, int height) {
		GL11.glViewport(x, y, width, height);
	}

}
