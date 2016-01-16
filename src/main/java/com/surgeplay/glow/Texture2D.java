package com.surgeplay.glow;

import java.awt.image.BufferedImage;

public interface Texture2D {
	public int handle();
	public WrapMode wrapMode();
	public int width();
	public int height();
	
	public void bind();
	public void setWrapMode(WrapMode mode);
	public void setSize(int width, int height);
	public void setImage(BufferedImage image);
	
	public static enum WrapMode {
		CLAMP,
		REPEAT,
		HIDE;
	}
	
	public static Texture2D create(BufferedImage image) {
		if (Context.isGL()) {
			if (Context.check(42)) { //glTexStorage2D is core since 4.2
				//TODO: Return a modern-GL texture that allocates using glTexStorage2D
			} else {
				//TODO: Return a LegacyGLTexture that allocates using dummy images if necessary
			}
		} else {
			//TODO: Return a texture that allocates using glTexStorage2D from the GLES function ptr
		}
		return null;
	}
	
	public static Texture2D create(int width, int height) {
		return null;
	}
}
