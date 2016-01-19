package com.surgeplay.glow.capsule;

import static com.surgeplay.glow.GLConstant.*;

import com.surgeplay.glow.gl.CompatibleGL;

/**
 * Represents an OpenGL Framebuffer Object.
 * 
 * <p>Make sure to create instances only after you have a valid GL context.
 */
public class FBO {
	private final int handle;
	public FBO() {
		handle = CompatibleGL.getInstance().glGenFramebuffers();
	}
	
	public boolean isComplete() {
		int status = CompatibleGL.getInstance().glCheckFramebufferStatus(handle);
		return status==GL_FRAMEBUFFER_COMPLETE;
	}
	
	public String getDebugInfo() {
		int status = CompatibleGL.getInstance().glCheckFramebufferStatus(handle);
		switch(status) {
		case GL_FRAMEBUFFER_COMPLETE:
			return "There's nothing wrong.";
		case GL_FRAMEBUFFER_UNDEFINED:
			return "Undefined framebuffer. Usually happens when the target is zero (this object's handle is "+handle+")";
		case GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT:
			return "One of the COLOR, DEPTH, STENCIL, or DEPTH_STENCIL attachment points is broken or incomplete - did you try to attach a compressed image to an FBO?";
		case GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT:
			return "There's nothing attached - try binding something to the COLOR attachment point.";
		case GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER:
			return "A draw buffer is specified but it doesn't specify a COLOR attachment point where a target image is.";
		case GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER:
			return "A read buffer is set, but it references an attachment point of this FBO that isn't set.";
		case GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE:
			return "Different images are specified that have different numbers of multisampling samples. They need to be the same.";
		case GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS:
			return "One of the attached images is layered, but not all the rest are layered. Layering is an all-or-none thing here.";
		case GL_FRAMEBUFFER_UNSUPPORTED:
			return "The implementation doesn't support this combination of image formats.";
		default:
			return "Something went wrong... but when I asked GL about the error it passed back an enum I don't know?!?";
		}
	}
	
	public void setDrawTarget(int textureHandle) {
		CompatibleGL.getInstance().glFramebufferTexture2D(GL_DRAW_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, GL_TEXTURE_2D, textureHandle, 0);
	}
	
	public void bindForDrawing() {
		CompatibleGL.getInstance().glBindFramebuffer(GL_DRAW_FRAMEBUFFER, handle);
	}
	
	@Override
	public void finalize() {
		if (handle!=-1 && handle!=0) CompatibleGL.getInstance().glDeleteFramebuffers(handle);
	}
	
	public static void bindDefault() {
		CompatibleGL.getInstance().glBindFramebuffer(GL_FRAMEBUFFER, 0);
	}
}
