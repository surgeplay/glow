package com.surgeplay.glow;

import static com.surgeplay.glow.GLConstant.*;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL42;

public class LegacyGLTexture {
	private int handle = GL_FALSE;
	public LegacyGLTexture(BufferedImage im) {
		handle = GL11.glGenTextures();
		bind();
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		
		uploadData(im);
	}
	
	public LegacyGLTexture(int width, int height) {
		handle = GL11.glGenTextures();
		bind();
		
		if (GLIntegerState.MAJOR_VERSION.get()>=4) {
			GL42.glTexStorage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height);
		} else {
			uploadData(new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE));
		}
	}
	
	private void uploadData(BufferedImage im) {
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
		
		GL11.glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, im.getWidth(), im.getHeight(), 0, GL_RGBA, GL_UNSIGNED_BYTE, pixelData);
	}
	
	
	public void bind() {
		GL11.glBindTexture(GL_TEXTURE_2D, handle);
	}
	
	/**
	 * Controls whether the texture wraps when encountering S/T/U/V values outside 0..1
	 * @param wrap If true, the texture will wrap. If false, nothing will render outside the normal texture range
	 */
	public void setWrap(boolean wrap) {
		if (wrap) {
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
		} else {
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_BORDER_COLOR, 0x00000000);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_BORDER);
			GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_BORDER);
		}
	}
	
	@Override
	public void finalize() {
		if (handle!=-1 && handle!=0) GL11.glDeleteTextures(handle);
	}
}
