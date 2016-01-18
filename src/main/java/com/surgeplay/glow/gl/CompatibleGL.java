package com.surgeplay.glow.gl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.lwjgl.PointerBuffer;

/**
 * Every function from OpenGL ES 2.0 - because all of this functionality also occurs in OpenGL
 * Core contexts, this can be seen as the baseline for compatibility across GL versions and APIs.
 */
public interface CompatibleGL {
	public void glActiveTexture(int texture);
	
	public void glAttachShader(int program, int shader);
	
	public void glBindAttribLocation(int program, int index, CharSequence name);
	public void glBindBuffer(int target, int buffer);
	public void glBindFramebuffer(int target, int framebuffer);
	public void glBindRenderbuffer(int target, int renderbuffer);
	public void glBindTexture(int target, int texture);
	
	public void glBlendColor(float red, float green, float blue, float alpha);
	public void glBlendEquation(int mode);
	public void glBlendEquationSeparate(int modeRGB, int modeAlpha);
	public void glBlendFunc(int sfactor, int dfactor);
	public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha);
	
	public void glBufferData(int target, long size, ByteBuffer data, int usage);
	public void glBufferData(int target, long size, int usage);
	public void glBufferData(int target, ByteBuffer data, int usage);
	public void glBufferData(int target, ShortBuffer data, int usage);
	public void glBufferData(int target, IntBuffer data, int usage);
	public void glBufferData(int target, FloatBuffer data, int usage);
	
	public void glBufferSubData(int target, long offset, long size, ByteBuffer data);
	public void glBufferSubData(int target, long offset, ByteBuffer data);
	public void glBufferSubData(int target, long offset, ShortBuffer data);
	public void glBufferSubData(int target, long offset, IntBuffer data);
	public void glBufferSubData(int target, long offset, FloatBuffer data);
	
	public int glCheckFramebufferStatus(int target);
	
	public void glClear(int mask);
	public void glClearColor(float red, float green, float blue, float alpha);
	/**
	 * Note: Depth will be cleared using glClearDepth on CoreGL and glClearDepthf on GLES
	 */
	public void glClearDepth(float d);
	public void glClearStencil(int s);
	
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);
	
	public void glCompileShader(int shader);
	
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, ByteBuffer data);
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long dataOffset);
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data);
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data);
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset);
	public void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data);
	
	public void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);
	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);
	
	public int glCreateProgram();
	
	public int glCreateShader(int type);
	
	public void glCullFace(int mode);
	
	public void glDeleteBuffers(int n, ByteBuffer buffers);
	public void glDeleteBuffers(IntBuffer buffers);
	public void glDeleteBuffers(int buffer);
	
	public void glDeleteFramebuffers(int n, ByteBuffer framebuffers);
	public void glDeleteFramebuffers(IntBuffer framebuffers);
	public void glDeleteFramebuffers(int framebuffer);
	
	public void glDeleteProgram(int program);
	
	public void glDeleteRenderbuffers(int n, ByteBuffer renderbuffers);
	public void glDeleteRenderbuffers(IntBuffer renderbuffers);
	public void glDeleteRenderbuffers(int renderbuffer);
	
	public void glDeleteShader(int shader);
	
	public void glDeleteTextures(int n, ByteBuffer textures);
	public void glDeleteTextures(IntBuffer textures);
	public void glDeleteTextures(int texture);
	
	public void glDepthFunc(int func);
	
	public void glDepthMask(boolean flag);
	
	public void glDepthRangef(float n, float f);
	
	public void glDetachShader(int program, int shader);
	
	public void glDisable(int cap);
	
	public void glDisableVertexAttribArray(int index);
	
	public void glDrawArrays(int mode, int first, int count);
	
	public void glDrawElements(int mode, int count, int type, ByteBuffer indices);
	public void glDrawElements(int mode, int count, int type, long indicesOffset);
	public void glDrawElements(int mode, int type, ByteBuffer indices);
	public void glDrawElements(int mode, ByteBuffer indices);
	public void glDrawElements(int mode, ShortBuffer indices);
	public void glDrawElements(int mode, IntBuffer indices);
	
	public void glEnable(int cap);
	
	public void glEnableVertexAttribArray(int index);
	
	public void glFinish();
	
	public void glFlush();
	
	public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer);
	
	public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);
	
	public void glFrontFace(int mode);
	
	public void glGenBuffers(int n, ByteBuffer buffers);
	public void glGenBuffers(IntBuffer buffers);
	public int glGenBuffers();
	
	public void glGenerateMipmap(int target);
	
	public void glGenFramebuffers(int n, ByteBuffer framebuffers);
	public void glGenFramebuffers(IntBuffer framebuffers);
	public int glGenFramebuffers();
	
	public void glGenRenderbuffers(int n, ByteBuffer renderbuffers);
	public void glGenRenderbuffers(IntBuffer renderbuffers);
	public int glGenRenderbuffers();
	
	public void glGenTextures(int n, ByteBuffer textures);
	public void glGenTextures(IntBuffer textures);
	public int glGenTextures();
	
	public void glGetActiveAttrib(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name);
	public void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);
	public String glGetActiveAttrib(int program, int index, int bufSize, IntBuffer size, IntBuffer type);
	public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type);
	
	public void glGetActiveUniform(int program, int index, int bufSize, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name);
	public void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name);
	public String glGetActiveUniform(int program, int index, int bufSize, IntBuffer size, IntBuffer type);
	public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type);
	
	public void glGetAttachedShaders(int program, int maxCount, ByteBuffer count, ByteBuffer shaders);
	public void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders);
	public IntBuffer glGetAttachedShaders(int program, int maxCount);
	public IntBuffer glGetAttachedShaders(int program);
	
	public int glGetAttribLocation(int program, CharSequence name);
	
	public void glGetBooleanv(int pname, ByteBuffer data);
	public boolean glGetBoolean(int pname);
	
	public void glGetBufferParameteriv(int target, int pname, ByteBuffer params);
	public void glGetBufferParameteriv(int target, int pname, IntBuffer params);
	public int glGetBufferParameteri(int target, int pname);
	
	public int glGetError();
	
	public void glGetFloatv(int pname, ByteBuffer data);
	public void glGetFloatv(int pname, FloatBuffer data);
	public float glGetFloat(int pname);
	
	public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, ByteBuffer params);
	public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params);
	public int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname);
	
	public void glGetIntegerv(int pname, ByteBuffer data);
	public void glGetIntegerv(int pname, IntBuffer data);
	public int glGetInteger(int pname);
	
	public void glGetProgramiv(int program, int pname, ByteBuffer params);
	public void glGetProgramiv(int program, int pname, IntBuffer params);
	public int glGetProgrami(int program, int pname);
	public void glGetProgramInfoLog(int program, int bufSize, ByteBuffer length, ByteBuffer infoLog);
	public void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog);
	public String glGetProgramInfoLog(int program, int bufSize);
	public String glGetProgramInfoLog(int program);
	
	public void glGetRenderbufferParameteriv(int target, int pname, ByteBuffer params);
	public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params);
	public int glGetRenderbufferParameteri(int target, int pname);
	
	public void glGetShaderiv(int shader, int pname, ByteBuffer params);
	public void glGetShaderiv(int shader, int pname, IntBuffer params);
	public int glGetShaderi(int shader, int pname);
	public String glGetShaderInfoLog(int shader);
	public String glGetShaderSource(int shader);
	
	public String glGetString(int name);
	
	public void glGetTexParameterfv(int target, int pname, ByteBuffer params);
	public void glGetTexParameterfv(int target, int pname, FloatBuffer params);
	public float glGetTexParameterf(int target, int pname);
	public void glGetTexParameteriv(int target, int pname, ByteBuffer params);
	public void glGetTexParameteriv(int target, int pname, IntBuffer params);
	public int glGetTexParameteri(int target, int pname);
	
	public void glGetUniformfv(int program, int location, ByteBuffer params);
	public void glGetUniformfv(int program, int location, FloatBuffer params);
	public float glGetUniformf(int program, int location);
	public void glGetUniformiv(int program, int location, ByteBuffer params);
	public void glGetUniformiv(int program, int location, IntBuffer params);
	public int glGetUniformi(int program, int location);
	
	//public int glGetUniformLocation(int program, ByteBuffer name);
	public int glGetUniformLocation(int program, CharSequence name);
	
	public void glGetVertexAttribfv(int index, int pname, ByteBuffer params);
	public void glGetVertexAttribfv(int index, int pname, FloatBuffer params);
	public void glGetVertexAttribiv(int index, int pname, ByteBuffer params);
	public void glGetVertexAttribiv(int index, int pname, IntBuffer params);
	
	public void glGetVertexAttribPointerv(int index, int pname, ByteBuffer pointer);
	public void glGetVertexAttribPointerv(int index, int pname, PointerBuffer pointer);
	public long glGetVertexAttribPointer(int index, int pname);
	
	public void glHint(int target, int mode);
	
	public boolean glIsBuffer(int buffer);
	public boolean glIsEnabled(int cap);
	public boolean glIsFramebuffer(int framebuffer);
	public boolean glIsProgram(int program);
	public boolean glIsRenderbuffer(int renderbuffer);
	public boolean glIsShader(int shader);
	public boolean glIsTexture(int texture);
	
	public void glLineWidth(float width);
	
	public void glLinkProgram(int program);
	
	public void glPixelStorei(int pname, int param);
	
	public void glPolygonOffset(float factor, float units);
	
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels);
	public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset);
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels);
	public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels);
	public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels);
	
	public void glReleaseShaderCompiler();
	
	public void glRenderbufferStorage(int target, int internalformat, int width, int height);
	
	public void glSampleCoverage(float value, boolean invert);
	
	public void glScissor(int x, int y, int width, int height);
	
	public void glShaderBinary(int count, ByteBuffer shaders, int binaryformat, ByteBuffer binary, int length);
	public void glShaderBinary(IntBuffer shaders, int binaryformat, ByteBuffer binary);
	
	//public void glShaderSource(int shader, int count, ByteBuffer string, ByteBuffer length);
	//public void glShaderSource(int shader, PointerBuffer string, IntBuffer length);
	public void glShaderSource(int shader, CharSequence... string);
	public void glShaderSource(int shader, CharSequence string);
	
	public void glStencilFunc(int func, int ref, int mask);
	public void glStencilFuncSeparate(int face, int func, int ref, int mask);
	public void glStencilMask(int mask);
	public void glStencilMaskSeparate(int face, int mask);
	public void glStencilOp(int fail, int zfail, int zpass);
	public void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass);
	
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer pixels);
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixelsOffset);
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ShortBuffer pixels);
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, IntBuffer pixels);
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, FloatBuffer pixels);
	
	public void glTexParameterf(int target, int pname, float param);
	public void glTexParameterfv(int target, int pname, ByteBuffer params);
	public void glTexParameterfv(int target, int pname, FloatBuffer params);
	public void glTexParameteri(int target, int pname, int param);
	public void glTexParameteriv(int target, int pname, ByteBuffer params);
	public void glTexParameteriv(int target, int pname, IntBuffer params);
	
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels);
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset);
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels);
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels);
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels);
	
	public void glUniform1f(int location, float v0);
	public void glUniform1fv(int location, int count, ByteBuffer value);
	public void glUniform1fv(int location, FloatBuffer value);
	public void glUniform1i(int location, int v0);
	public void glUniform1iv(int location, int count, ByteBuffer value);
	public void glUniform1iv(int location, IntBuffer value);
	public void glUniform2f(int location, float v0, float v1);
	public void glUniform2fv(int location, int count, ByteBuffer value);
	public void glUniform2fv(int location, FloatBuffer value);
	public void glUniform2i(int location, int v0, int v1);
	public void glUniform2iv(int location, int count, ByteBuffer value);
	public void glUniform2iv(int location, IntBuffer value);
	public void glUniform3f(int location, float v0, float v1, float v2);
	public void glUniform3fv(int location, int count, ByteBuffer value);
	public void glUniform3fv(int location, FloatBuffer value);
	public void glUniform3i(int location, int v0, int v1, int v2);
	public void glUniform3iv(int location, int count, ByteBuffer value);
	public void glUniform3iv(int location, IntBuffer value);
	public void glUniform4f(int location, float v0, float v1, float v2, float v3);
	public void glUniform4fv(int location, int count, ByteBuffer value);
	public void glUniform4fv(int location, FloatBuffer value);
	public void glUniform4i(int location, int v0, int v1, int v2, int v3);
	public void glUniform4iv(int location, int count, ByteBuffer value);
	public void glUniform4iv(int location, IntBuffer value);
	public void glUniformMatrix2fv(int location, int count, boolean transpose, ByteBuffer value);
	public void glUniformMatrix2fv(int location, boolean transpose, FloatBuffer value);
	public void glUniformMatrix3fv(int location, int count, boolean transpose, ByteBuffer value);
	public void glUniformMatrix3fv(int location, boolean transpose, FloatBuffer value);
	public void glUniformMatrix4fv(int location, int count, boolean transpose, ByteBuffer value);
	public void glUniformMatrix4fv(int location, boolean transpose, FloatBuffer value);
	
	public void glUseProgram(int program);
	
	public void glValidateProgram(int program);
	
	public void glVertexAttrib1f(int index, float x);
	public void glVertexAttrib1fv(int index, ByteBuffer v);
	public void glVertexAttrib1fv(int index, FloatBuffer v);
	public void glVertexAttrib2f(int index, float x, float y);
	public void glVertexAttrib2fv(int index, ByteBuffer v);
	public void glVertexAttrib2fv(int index, FloatBuffer v);
	public void glVertexAttrib3f(int index, float x, float y, float z);
	public void glVertexAttrib3fv(int index, ByteBuffer v);
	public void glVertexAttrib3fv(int index, FloatBuffer v);
	public void glVertexAttrib4f(int index, float x, float y, float z, float w);
	public void glVertexAttrib4fv(int index, ByteBuffer v);
	public void glVertexAttrib4fv(int index, FloatBuffer v);
	
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer);
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointerOffset);
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer);
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer);
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer);
	
	public void glViewport(int x, int y, int width, int height);
}
