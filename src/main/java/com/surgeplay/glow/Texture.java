package com.surgeplay.glow;

import static com.surgeplay.glow.GLConstant.*;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.lwjgl.opengl.GL11;

public class Texture {
	private int handle = GL_FALSE;
	public Texture(BufferedImage im) {
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
		handle = GL11.glGenTextures();
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, handle);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);
		GL11.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
		
		GL11.glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, im.getWidth(), im.getHeight(), 0, GL_RGBA, GL_UNSIGNED_BYTE, pixelData);
	}
	
	public void bind() {
		GL11.glBindTexture(GL_TEXTURE_2D, handle);
	}
	
	@Override
	public void finalize() {
		if (handle!=-1 && handle!=0) GL11.glDeleteTextures(handle);
	}
}
