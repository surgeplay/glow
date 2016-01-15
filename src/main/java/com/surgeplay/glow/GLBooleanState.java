package com.surgeplay.glow;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;

import static com.surgeplay.glow.GLConstant.*;

/* Static imports here are to assist in finding constants */


import java.util.EnumSet;

import org.lwjgl.opengl.ARBImaging;

public enum GLBooleanState {
	/** @see {@link GL11#glAlphaFunc} */
	ALPHA_TEST		(GL_ALPHA_TEST),
	/** @see {@link GL11#glEvalCoord1d} */
	AUTO_NORMAL		(GL_AUTO_NORMAL),
	/** @see {@link GL11#glBlendFunc} */
	BLEND			(GL_BLEND),
	/** @see {@link GL11#glClipPlane} */
	CLIP_PLANE0		(GL_CLIP_PLANE0),
	/** @see {@link GL11#glClipPlane} */
	CLIP_PLANE1		(GL_CLIP_PLANE1),
	/** @see {@link GL11#glClipPlane} */
	CLIP_PLANE2		(GL_CLIP_PLANE2),
	/** @see {@link GL11#glClipPlane} */
	CLIP_PLANE3		(GL_CLIP_PLANE3),
	/** @see {@link GL11#glClipPlane} */
	CLIP_PLANE4		(GL_CLIP_PLANE4),
	/** @see {@link GL11#glClipPlane} */
	CLIP_PLANE5		(GL_CLIP_PLANE5),
	/** @see {@link GL11#glColorPointer} */
	COLOR_ARRAY		(GL_COLOR_ARRAY),
	/** @see {@link GL11#glLogicOp} */
	COLOR_LOGIC_OP	(GL_COLOR_LOGIC_OP),
	/** @see {@link GL11#glColorMaterial} */
	COLOR_MATERIAL	(GL_COLOR_MATERIAL),
	/** @see {@link GL14#glSecondaryColor3f} */
	COLOR_SUM		(GL_COLOR_SUM),
	/** @see {@link ARBImaging#glColorTable} */
	COLOR_TABLE		(ARBImaging.GL_COLOR_TABLE),
	/** @see {@link ARBImaging#glConvolutionFilter1D} */
	CONVOLUTION_1D	(ARBImaging.GL_CONVOLUTION_1D),
	/** @see {@link ARBImaging#glConvolutionFilter2D} */
	CONVOLUTION_2D	(ARBImaging.GL_CONVOLUTION_2D),
	/** @see {@link GL11#glCullFace} */
	CULL_FACE		(GL_CULL_FACE),
	/** @see {@link GL11#glDepthFunc}, {@link GL11#glDepthRange} */
	DEPTH_TEST		(GL_DEPTH_TEST),
	/** Looks better than it sounds. Enabled by default in the OpenGL specs. */
	DITHER			(GL_DITHER),
	EDGE_FLAG_ARRAY	(GL_EDGE_FLAG_ARRAY),
	FOG				(GL_FOG),
	FOG_COORD_ARRAY	(GL_FOG_COORD_ARRAY),
	HISTOGRAM		(ARBImaging.GL_HISTOGRAM),
	INDEX_ARRAY		(GL_INDEX_ARRAY),
	INDEX_LOGIC_OP	(GL_INDEX_LOGIC_OP),
	LIGHT0			(GL_LIGHT0),
	LIGHT1			(GL_LIGHT1),
	LIGHT2			(GL_LIGHT2),
	LIGHT3			(GL_LIGHT3),
	LIGHT4			(GL_LIGHT4),
	LIGHT5			(GL_LIGHT5),
	LIGHT6			(GL_LIGHT6),
	LIGHT7			(GL_LIGHT7),
	LIGHTING		(GL_LIGHTING),
	LINE_SMOOTH		(GL_LINE_SMOOTH),
	LINE_STIPPLE	(GL_LINE_STIPPLE),
	MAP1_COLOR_4	(GL_MAP1_COLOR_4),
	MAP1_INDEX		(GL_MAP1_INDEX),
	MAP1_NORMAL		(GL_MAP1_NORMAL),
	//TODO: GL_MAP1_TEXTURE_COORD_1-4
	//TODO: GL_MAP2_*
	MINMAX			(ARBImaging.GL_MINMAX),
	/** Often enabled by default or as a result of user control panel settings. */
	MULTISAMPLE		(GL_MULTISAMPLE),
	NORMAL_ARRAY	(GL_NORMAL_ARRAY),
	NORMALIZE		(GL_NORMALIZE),
	
	//TODO: More data entry
	TEXTURE_2D		(GL_TEXTURE_2D),
	
	
	
	;
	private final int glConstant;
	
	GLBooleanState(int glConstant) {
		this.glConstant = glConstant;
	}
	
	public int value() { return glConstant; }
	
	public boolean isEnabled() {
		return GL11.glIsEnabled(glConstant);
	}
	
	public void setEnabled(boolean enable) {
		if (enable) GL11.glEnable(glConstant);
		else GL11.glDisable(glConstant);
	}
	
	public static EnumSet<GLBooleanState> enabledFeatures() {
		EnumSet<GLBooleanState> result = EnumSet.noneOf(GLBooleanState.class);
		
		for(GLBooleanState feature : values()) {
			if (GL11.glIsEnabled(feature.value())) result.add(feature);
		}
		return result;
	}
}
