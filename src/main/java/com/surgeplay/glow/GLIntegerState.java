package com.surgeplay.glow;


import static com.surgeplay.glow.GLConstant.*;

//import static org.lwjgl.opengl.ARBComputeShader.*;
//import static org.lwjgl.opengl.GLCapabilities.*;
//import static org.lwjgl.opengl.ARBShaderAtomicCounters.*;
import static org.lwjgl.opengl.ARBImaging.*;

import java.util.concurrent.Callable;

import org.lwjgl.opengl.GL11;

public enum GLIntegerState {
	ACTIVE_TEXTURE					(GL_ACTIVE_TEXTURE),
	ARRAY_BUFFER_BINDING			(GL_ARRAY_BUFFER_BINDING),
	BLEND_DST_ALPHA					(GL_BLEND_DST_ALPHA),
	BLEND_DST_RGB					(GL_BLEND_DST_RGB),
	BLEND_EQUATION_RGB				(GL_BLEND_EQUATION_RGB),
	BLEND_EQUATION_ALPHA			(GL_BLEND_EQUATION_ALPHA),
	BLEND_SRC_ALPHA					(GL_BLEND_SRC_ALPHA),
	BLEND_SRC_RGB					(GL_BLEND_SRC_RGB),
	DISPATCH_INDIRECT_BUFFER_BINDING(GL_DISPATCH_INDIRECT_BUFFER_BINDING),
	DEBUG_GROUP_STACK_DEPTH			(GL_DEBUG_GROUP_STACK_DEPTH),
	CONTEXT_FLAGS					(GL_CONTEXT_FLAGS),
	CURRENT_PROGRAM					(GL_CURRENT_PROGRAM),
	DEPTH_FUNC						(GL_DEPTH_FUNC),
	DRAW_BUFFER						(GL_DRAW_BUFFER),
	//TODO: GL_DRAW_BUFFERi for each i
	DRAW_FRAMEBUFFER_BINDING		(GL_DRAW_FRAMEBUFFER_BINDING),
	ELEMENT_ARRAY_BUFFER_BINDING	(GL_ELEMENT_ARRAY_BUFFER_BINDING),
	FRAGMENT_SHADER_DERIVATIVE_HINT	(GL_FRAGMENT_SHADER_DERIVATIVE_HINT),
	IMPLEMENTATION_COLOR_READ_FORMAT(GL_IMPLEMENTATION_COLOR_READ_FORMAT),
	IMPLEMENTATION_COLOR_READ_TYPE	(GL_IMPLEMENTATION_COLOR_READ_TYPE),
	LINE_SMOOTH_HINT				(GL_LINE_SMOOTH_HINT),
	LINE_WIDTH						(GL_LINE_WIDTH),
	LAYER_PROVOKING_VERTEX			(GL_LAYER_PROVOKING_VERTEX),
	LOGIC_OP_MODE					(GL_LOGIC_OP_MODE),
	MAJOR_VERSION					(GL_MAJOR_VERSION),
	MINOR_VERSION					(GL_MINOR_VERSION),
	NUM_COMPRESSED_TEXTURE_FORMATS	(GL_NUM_COMPRESSED_TEXTURE_FORMATS),
	NUM_EXTENSIONS					(GL_NUM_EXTENSIONS),
	NUM_SHADER_BINARY_FORMATS		(GL_NUM_SHADER_BINARY_FORMATS),
	PACK_ALIGNMENT					(GL_PACK_ALIGNMENT),
	PACK_IMAGE_HEIGHT				(GL_PACK_IMAGE_HEIGHT),
	PACK_ROW_LENGTH					(GL_PACK_ROW_LENGTH),
	PACK_SKIP_IMAGES				(GL_PACK_SKIP_IMAGES),
	PACK_SKIP_PIXELS				(GL_PACK_SKIP_PIXELS),
	PACK_SKIP_ROWS					(GL_PACK_SKIP_ROWS),
	PIXEL_PACK_BUFFER_BINDING		(GL_PIXEL_PACK_BUFFER_BINDING),
	PIXEL_UNPACK_BUFFER_BINDING		(GL_PIXEL_UNPACK_BUFFER_BINDING),
	PRIMITIVE_RESTART_INDEX			(GL_PRIMITIVE_RESTART_INDEX),
	PROGRAM_PIPELINE_BINDING		(GL_PROGRAM_PIPELINE_BINDING),
	PROVOKING_VERTEX				(GL_PROVOKING_VERTEX),
	POLYGON_SMOOTH_HINT				(GL_POLYGON_SMOOTH_HINT),
	READ_BUFFER						(GL_READ_BUFFER),
	RENDERBUFFER_BINDING			(GL_RENDERBUFFER_BINDING),
	SAMPLE_BUFFERS					(GL_SAMPLE_BUFFERS),
	SAMPLER_BINDING					(GL_SAMPLER_BINDING),
	SAMPLES							(GL_SAMPLES),
	SCISSOR_BOX_X,		//1/4 of GL_SCISSOR_BOX
	SCISSOR_BOX_Y,		//1/4 of GL_SCISSOR_BOX
	SCISSOR_BOX_WIDTH,	//1/4 of GL_SCISSOR_BOX
	SCISSOR_BOX_HEIGHT,	//1/4 of GL_SCISSOR_BOX
	SHADER_STORAGE_BUFFER_BINDING	(GL_SHADER_STORAGE_BUFFER_BINDING),
	SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT	(GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT),
	SHADER_STORAGE_BUFFER_START		(GL_SHADER_STORAGE_BUFFER_START),
	SHADER_STORAGE_BUFFER_SIZE		(GL_SHADER_STORAGE_BUFFER_SIZE),
	STENCIL_BACK_FAIL				(GL_STENCIL_BACK_FAIL),
	STENCIL_BACK_FUNC				(GL_STENCIL_BACK_FUNC),
	STENCIL_BACK_PASS_DEPTH_FAIL	(GL_STENCIL_BACK_PASS_DEPTH_FAIL),
	STENCIL_BACK_PASS_DEPTH_PASS	(GL_STENCIL_BACK_PASS_DEPTH_PASS),
	STENCIL_BACK_VALUE_MASK			(GL_STENCIL_BACK_VALUE_MASK),
	STENCIL_BACK_WRITEMASK			(GL_STENCIL_BACK_WRITEMASK),
	STENCIL_CLEAR_VALUE				(GL_STENCIL_CLEAR_VALUE),
	STENCIL_FAIL					(GL_STENCIL_FAIL),
	STENCIL_FUNC					(GL_STENCIL_FUNC),
	STENCIL_PASS_DEPTH_FAIL			(GL_STENCIL_PASS_DEPTH_FAIL),
	STENCIL_PASS_DEPTH_PASS			(GL_STENCIL_PASS_DEPTH_PASS),
	STENCIL_REF						(GL_STENCIL_REF),
	STENCIL_VALUE_MASK				(GL_STENCIL_VALUE_MASK),
	STENCIL_WRITEMASK				(GL_STENCIL_WRITEMASK),
	SUBPIXEL_BITS					(GL_SUBPIXEL_BITS),
	TEXTURE_BINDING_1D				(GL_TEXTURE_BINDING_1D),
	TEXTURE_BINDING_1D_ARRAY		(GL_TEXTURE_BINDING_1D_ARRAY),
	TEXTURE_BINDING_2D				(GL_TEXTURE_BINDING_2D),
	TEXTURE_BINDING_2D_ARRAY		(GL_TEXTURE_BINDING_2D_ARRAY),
	TEXTURE_BINDING_2D_MULTISAMPLE	(GL_TEXTURE_BINDING_2D_MULTISAMPLE),
	TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY	(GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY),
	TEXTURE_BINDING_3D				(GL_TEXTURE_BINDING_2D),
	TEXTURE_BINDING_BUFFER			(GL_TEXTURE_BINDING_BUFFER),
	TEXTURE_BINDING_CUBE_MAP		(GL_TEXTURE_BINDING_CUBE_MAP),
	TEXTURE_BINDING_RECTANGLE		(GL_TEXTURE_BINDING_RECTANGLE),
	TEXTURE_COMPRESSION_HINT		(GL_TEXTURE_COMPRESSION_HINT),
	TEXTURE_BUFFER_OFFSET_ALIGNMENT	(GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT),
	TIMESTAMP						(GL_TIMESTAMP),
	TRANSFORM_FEEDBACK_BUFFER_BINDING		(GL_TRANSFORM_FEEDBACK_BUFFER_BINDING),
	UNIFORM_BUFFER_BINDING			(GL_UNIFORM_BUFFER_BINDING),
	UNIFORM_BUFFER_OFFSET_ALIGNMENT	(GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT),
	UNPACK_ALIGNMENT				(GL_UNPACK_ALIGNMENT),
	UNPACK_IMAGE_HEIGHT				(GL_UNPACK_IMAGE_HEIGHT),
	UNPACK_ROW_LENGTH				(GL_UNPACK_ROW_LENGTH),
	UNPACK_SKIP_IMAGES				(GL_UNPACK_SKIP_IMAGES),
	UNPACK_SKIP_PIXELS				(GL_UNPACK_SKIP_PIXELS),
	UNPACK_SKIP_ROWS				(GL_UNPACK_SKIP_ROWS),
	VERTEX_ARRAY_BINDING			(GL_VERTEX_ARRAY_BINDING),
	VIEWPORT_X,		//1/4 of GL_VIEWPORT
	VIEWPORT_Y,		//1/4 of GL_VIEWPORT
	VIEWPORT_WIDTH,	//1/4 of GL_VIEWPORT
	VIEWPORT_HEIGHT,//1/4 of GL_VIEWPORT
	VIEWPORT_BOUNDS_MIN, //half of GL_VIEWPORT_BOUNDS_RANGE
	VIEWPORT_BOUNDS_MAX, //half of GL_VIEWPORT_BOUNDS_RANGE
	VIEWPORT_SUBPIXEL_BITS			(GL_VIEWPORT_SUBPIXEL_BITS),
	
	;
	private final int glConstant;
	private final boolean readOnly;
	private Callable<Integer> getter = null;
	
	GLIntegerState() { glConstant=GL11.GL_FALSE; readOnly=true;}
	GLIntegerState(int glConstant) {
		this.glConstant = glConstant;
		this.readOnly = true;
	}
	GLIntegerState(int glConstant, boolean readOnly) {
		this.glConstant = glConstant;
		this.readOnly = readOnly;
	}
	
	public int value() { return glConstant; }
	public int get() {
		if (glConstant==GL11.GL_FALSE) return -1;
		return GL11.glGetInteger(glConstant);
	}
}
