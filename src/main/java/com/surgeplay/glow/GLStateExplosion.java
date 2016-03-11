package com.surgeplay.glow;

import static com.surgeplay.glow.GLConstant.*;

import java.util.EnumSet;
import java.util.Map;

import org.lwjgl.opengl.GL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.surgeplay.glow.gl.CompatibleGL;

public class GLStateExplosion {
	private static final Logger logger = LoggerFactory.getLogger("GLState");
	
	public static void invoke() {
		CompatibleGL gl = CompatibleGL.getInstance();
		
		//Limits
		logger.info("Limits");
		for(GLLimit limit: GLLimit.values()) {
			int lim = limit.get();
			if (gl.glGetError()!=0) {
				while(gl.glGetError()!=GL_NO_ERROR) {}
				logger.info("{}: Unsupported", limit);
			} else {
				logger.info("{}: {}", limit, limit.get());
			}
			
		}
		while(gl.glGetError()!=GL_NO_ERROR) {}
		
		//VertexBuffer
		int curVBO = gl.glGetInteger(GL_ARRAY_BUFFER_BINDING);
		if (curVBO==0) {
			logger.info("Vertex buffer is UNSET (are you using immediate mode?)");
		} else {
			int sz = gl.glGetBufferParameteri(GL_ARRAY_BUFFER, GL_BUFFER_SIZE);
			logger.info("Current VBO: {} ({} bytes)", curVBO, sz);
		}
		
		//PROGRAM
		int curProgram = gl.glGetInteger(GL_CURRENT_PROGRAM);
		if (curProgram==0) {
			logger.info("Shader Program UNSET (Will draw nothing in any core profile!)");
		} else {
			logger.info("Current program: {}",curProgram);
			;
		}
		
		
		//ENABLE/DISABLE
		EnumSet<GLBooleanState> features = GLBooleanState.enabledFeatures();
		logger.info("Enabled Features: {}", features);
		
		
		//Integer values
		for(GLIntegerState state : GLIntegerState.values()) {
			logger.info("{}: {}", state, state.get());
		}
		
		while(gl.glGetError()!=GL_NO_ERROR) {}
		
		
	}
}
