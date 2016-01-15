package com.surgeplay.glow;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL14.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL21.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL31.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.opengl.GL33.*;
import static org.lwjgl.opengl.GL43.*;

import java.util.ArrayList;
import java.util.EnumSet;

import org.lwjgl.opengl.ARBImaging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GLStateExplosion {
	private static final Logger logger = LoggerFactory.getLogger("GLState");
	
	private static final int[] BOOLEAN_FEATURES = {
			GL_ALPHA_TEST, GL_AUTO_NORMAL, GL_BLEND, GL_CLIP_PLANE0, GL_CLIP_PLANE1, //TODO: GL_CLIP_PLANEi for each i
			GL_COLOR_ARRAY, GL_COLOR_LOGIC_OP, GL_COLOR_MATERIAL, GL_COLOR_SUM, ARBImaging.GL_COLOR_TABLE,
			ARBImaging.GL_CONVOLUTION_1D, ARBImaging.GL_CONVOLUTION_2D, GL_CULL_FACE, GL_DEPTH_TEST,
			GL_DITHER, GL_EDGE_FLAG_ARRAY
	};
	
	public static void invoke() {
		//int activeTexture = glGetInteger(GL_ACTIVE_TEXTURE);
		int curVBO = glGetInteger(GL_ARRAY_BUFFER_BINDING);
		if (curVBO==0) {
			logger.info("Vertex buffer is UNSET (are you using immediate mode?)");
		} else {
			int sz = glGetBufferParameteri(GL_ARRAY_BUFFER, GL_BUFFER_SIZE);
			logger.info("Current VBO: {} ({} bytes)", curVBO, sz);
		}
		
		//PROGRAM
		int curProgram = glGetInteger(GL_CURRENT_PROGRAM);
		if (curProgram==0) {
			logger.info("Shader Program UNSET (Will draw nothing in any core profile!)");
		} else {
			logger.info("Current program: {}",curProgram);
			;
		}
		
		
		//ENABLE/DISABLE
		EnumSet<GLBooleanState> features = GLBooleanState.enabledFeatures();
		logger.info("Enabled Features: {}", features);
		//logger.info("Texture2D enabled: {}", glIsEnabled(GL_TEXTURE_2D));
		//logger.info("Lighting enabled: {}", glIsEnabled(GL_COLOR));
		
		//TEXTURING
		int activeTexture = glGetInteger(GL_ACTIVE_TEXTURE);
		if (activeTexture==0) {
			
		}
	}
}
