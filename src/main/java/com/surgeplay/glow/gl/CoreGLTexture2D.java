package com.surgeplay.glow.gl;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL42;

import static com.surgeplay.glow.GLConstant.*;
import com.surgeplay.glow.Texture2D;

public class CoreGLTexture2D implements Texture2D {
	private int handle = 0;
	private Texture2D.WrapMode wrapMode = Texture2D.WrapMode.REPEAT; //The GL default
	private int width = 0;
	private int height = 0;
	
	@Override
	public int handle() {
		return handle;
	}

	@Override
	public WrapMode wrapMode() {
		return wrapMode;
	}

	@Override
	public int width() {
		return width;
	}

	@Override
	public int height() {
		return height;
	}

	@Override
	public void bind() {
		GL11.glBindTexture(GL_TEXTURE_2D, handle);
	}

	@Override
	public void setWrapMode(WrapMode mode) {
		wrapMode = mode;
		switch(mode) {
		case REPEAT:
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
			return;
		case CLAMP:
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);
			return;
		case HIDE:
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_BORDER_COLOR, 0x00000000);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_BORDER);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_BORDER);
			return;
		}
	}

	@Override
	public void setSize(int width, int height) {
		GL42.glTexStorage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height);
	}

	@Override
	public void setImage(BufferedImage image) {
		ByteBuffer pixelData = ByteBuffer.allocateDirect(image.getWidth()*image.getHeight()*4).order(ByteOrder.LITTLE_ENDIAN);
		for(int y=0; y<image.getHeight(); y++) {
			for(int x=0; x<image.getWidth(); x++) {
				int col = image.getRGB(x, y);
				//Swizzle components from argb into the rgba bytebuffer
				pixelData.put((byte)((col >> 16) & 0xFF)); //r
				pixelData.put((byte)((col >>  8) & 0xFF)); //g
				pixelData.put((byte)((col >>  0) & 0xFF)); //b
				pixelData.put((byte)((col >> 24) & 0xFF)); //a
			}
		}
		pixelData.flip();
		
		GL11.glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, image.getWidth(), image.getHeight(), 0, GL_RGBA, GL_UNSIGNED_BYTE, pixelData);

	}
	
	
	public static ByteBuffer extractImageData(BufferedImage im) {
		ByteBuffer pixelData = ByteBuffer.allocateDirect(im.getWidth()*im.getHeight()*4).order(ByteOrder.LITTLE_ENDIAN);
		for(int y=0; y<im.getHeight(); y++) {
			for(int x=0; x<im.getWidth(); x++) {
				int col = im.getRGB(x, y);
				//Swizzle components from argb into the rgba bytebuffer
				pixelData.put((byte)((col >> 16) & 0xFF)); //r
				pixelData.put((byte)((col >>  8) & 0xFF)); //g
				pixelData.put((byte)((col >>  0) & 0xFF)); //b
				pixelData.put((byte)((col >> 24) & 0xFF)); //a
			}
		}
		pixelData.flip();
		
		return pixelData;
	}
}
