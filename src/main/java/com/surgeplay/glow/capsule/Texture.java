package com.surgeplay.glow.capsule;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.surgeplay.glow.gl.CompatibleGL;

import static com.surgeplay.glow.GLConstant.*;

public class Texture {
	private static ByteBuffer APIBUFFER = null;
	private int handle = 0;
	private WrapMode wrapMode = WrapMode.REPEAT; //The GL default
	private int width = 0;
	private int height = 0;
	
	public Texture(BufferedImage image) {
		CompatibleGL gl = CompatibleGL.getInstance();
		
		this.handle = gl.glGenTextures();
		if (handle==0) throw new IllegalStateException("Couldn't create texture");
		gl.glBindTexture(GL_TEXTURE_2D, handle);
		
		this.width = image.getWidth();
		this.height = image.getHeight();
		
		ByteBuffer buf = extractImageData(image);
		
		gl.glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8, width, height, 0, GL_BGRA, GL_UNSIGNED_BYTE, buf);
		gl.glGenerateMipmap(GL_TEXTURE_2D);
	}
	
	public int handle() {
		return handle;
	}

	public WrapMode wrapMode() {
		return wrapMode;
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public void bind() {
		CompatibleGL.getInstance().glBindTexture(GL_TEXTURE_2D, handle);
	}

	public Texture setWrapMode(WrapMode mode) {
		CompatibleGL gl = CompatibleGL.getInstance();
		
		wrapMode = mode;
		switch(mode) {
		case REPEAT:
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
			return this;
		case CLAMP:
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
			return this;
		case HIDE:
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_BORDER_COLOR, 0x00000000);
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_BORDER);
			gl.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_BORDER);
			return this;
		default:
			return this;
		}
	}

	public void setImage(BufferedImage image) {
		ByteBuffer pixelData = extractImageData(image);
		
		CompatibleGL gl = CompatibleGL.getInstance();
		gl.glBindTexture(GL_TEXTURE_2D, handle);
		gl.glTexSubImage2D(GL_TEXTURE_2D, 0, 0, 0, image.getWidth(), image.getHeight(), GL_BGRA, GL_UNSIGNED_BYTE, pixelData);
		gl.glGenerateMipmap(GL_TEXTURE_2D);

	}
	
	
	public static ByteBuffer extractImageData(BufferedImage im) {
		if (APIBUFFER==null || APIBUFFER.capacity()<im.getWidth()*im.getHeight()*4) {
			APIBUFFER = ByteBuffer.allocateDirect(im.getWidth()*im.getHeight()*4).order(ByteOrder.nativeOrder());
		}
		
		for(int y=0; y<im.getHeight(); y++) {
			for(int x=0; x<im.getWidth(); x++) {
				int col = im.getRGB(x, y);
				APIBUFFER.putInt(col);
			}
		}
		APIBUFFER.rewind();
		
		return APIBUFFER;
	}
	
	public Texture setMinFilter(Filter filter, MipFilter mip) {
		int minFilter = GL_NEAREST;
		if (filter==Filter.NEAREST && mip==MipFilter.NONE)	minFilter=GL_NEAREST;
		if (filter==Filter.LINEAR && mip==MipFilter.NONE)	minFilter=GL_LINEAR;
		if (filter==Filter.NEAREST && mip==MipFilter.LINEAR)	minFilter=GL_NEAREST_MIPMAP_LINEAR;
		if (filter==Filter.LINEAR && mip==MipFilter.LINEAR)		minFilter=GL_LINEAR_MIPMAP_LINEAR;
		if (filter==Filter.NEAREST && mip==MipFilter.NEAREST)	minFilter=GL_NEAREST_MIPMAP_NEAREST;
		if (filter==Filter.LINEAR && mip==MipFilter.NEAREST)	minFilter=GL_LINEAR_MIPMAP_NEAREST;
		
		CompatibleGL.getInstance().glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, minFilter);
		
		return this;
	}
	
	public Texture setMagFilter(Filter mag) {
		int magFilter = GL_NEAREST;
		if (mag==Filter.LINEAR) magFilter = GL_LINEAR;
		if (mag==Filter.NEAREST) magFilter = GL_NEAREST;
		CompatibleGL.getInstance().glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, magFilter);
		
		return this;
	}
	
	@Override
	public void finalize() {
		if (handle!=0) CompatibleGL.getInstance().glDeleteTextures(handle);
	}
	
	public static enum WrapMode {
		CLAMP,
		REPEAT,
		HIDE;
	}
	
	public static enum Filter {
		LINEAR,
		NEAREST;
	}
	
	public static enum MipFilter {
		NONE,
		LINEAR,
		NEAREST;
	}
}
