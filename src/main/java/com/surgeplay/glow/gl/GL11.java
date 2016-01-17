package com.surgeplay.glow.gl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.lwjgl.PointerBuffer;

/**
 * Contains OpenGL1.1 functions which were NOT deprecated in OpenGL 3.1 - that is, functions which
 * may possibly exist in other kinds of contexts and so could be cross-platform.
 */
public interface GL11 {

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glEnable.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Enables the specified OpenGL state.
	 *
	 * @param target
	 *            the OpenGL state to enable
	 */
	public void glEnable(int target);

	// --- [ glDisable ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glEnable.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Disables the specified OpenGL state.
	 *
	 * @param target
	 *            the OpenGL state to disable
	 */
	public void glDisable(int target);

	// --- [ glAreTexturesResident ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glAreTexturesResident.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns {@link #GL_TRUE TRUE} if all of the texture objects named in
	 * textures are resident, or if the implementation does not distinguish a
	 * working set. If at least one of the texture objects named in textures is
	 * not resident, then {@link #GL_FALSE FALSE} is returned, and the residence
	 * of each texture object is returned in residences. Otherwise the contents
	 * of residences are not changed.
	 *
	 * @param n
	 *            the number of texture objects in {@code textures}
	 * @param textures
	 *            an array of texture objects
	 * @param residences
	 *            returns the residences of each texture object
	 */
	public boolean glAreTexturesResident(int n, ByteBuffer textures, ByteBuffer residences);

	/**
	 * Alternative version of: {@link #glAreTexturesResident
	 * AreTexturesResident}
	 */
	public boolean glAreTexturesResident(IntBuffer textures, ByteBuffer residences);

	/**
	 * Single value version of: {@link #glAreTexturesResident
	 * AreTexturesResident}
	 */
	public boolean glAreTexturesResident(int texture, ByteBuffer residences);

	// --- [ glArrayElement ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glArrayElement.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Transfers the ith element of every enabled, non-instanced array, and the
	 * first element of every enabled, instanced array to the GL.
	 *
	 * @param i
	 *            the element to transfer
	 */
	public void glArrayElement(int i);

	// --- [ glBindTexture ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glBindTexture.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Binds the a texture to a texture target.
	 * 
	 * <p>
	 * While a texture object is bound, GL operations on the target to which it
	 * is bound affect the bound object, and queries of the target to which it
	 * is bound return state from the bound object. If texture mapping of the
	 * dimensionality of the target to which a texture object is bound is
	 * enabled, the state of the bound texture object directs the texturing
	 * operation.
	 * </p>
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D
	 *            TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}
	 *            , {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP},
	 *            {@link GL12#GL_TEXTURE_3D TEXTURE_3D},
	 *            {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY},
	 *            {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY},
	 *            {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY
	 *            TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param texture
	 *            the texture object to bind
	 */
	public void glBindTexture(int target, int texture);

	// --- [ glBlendFunc ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glBlendFunc.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Specifies the weighting factors used by the blend equation, for both RGB
	 * and alpha functions and for all draw buffers.
	 *
	 * @param sfactor
	 *            the source weighting factor. One of:<br>
	 *            {@link #GL_ZERO ZERO}, {@link #GL_ONE ONE},
	 *            {@link #GL_SRC_COLOR SRC_COLOR},
	 *            {@link #GL_ONE_MINUS_SRC_COLOR ONE_MINUS_SRC_COLOR},
	 *            {@link #GL_DST_COLOR DST_COLOR},
	 *            {@link #GL_ONE_MINUS_DST_COLOR ONE_MINUS_DST_COLOR},
	 *            {@link #GL_SRC_ALPHA SRC_ALPHA},
	 *            {@link #GL_ONE_MINUS_SRC_ALPHA ONE_MINUS_SRC_ALPHA},
	 *            {@link #GL_DST_ALPHA DST_ALPHA},
	 *            {@link #GL_ONE_MINUS_DST_ALPHA ONE_MINUS_DST_ALPHA},
	 *            {@link GL14#GL_CONSTANT_COLOR CONSTANT_COLOR},
	 *            {@link GL14#GL_ONE_MINUS_CONSTANT_COLOR
	 *            ONE_MINUS_CONSTANT_COLOR}, {@link GL14#GL_CONSTANT_ALPHA
	 *            CONSTANT_ALPHA}, {@link GL14#GL_ONE_MINUS_CONSTANT_ALPHA
	 *            ONE_MINUS_CONSTANT_ALPHA}, {@link #GL_SRC_ALPHA_SATURATE
	 *            SRC_ALPHA_SATURATE}, {@link GL33#GL_SRC1_COLOR SRC1_COLOR},
	 *            {@link GL33#GL_ONE_MINUS_SRC1_COLOR ONE_MINUS_SRC1_COLOR},
	 *            {@link GL15#GL_SRC1_ALPHA SRC1_ALPHA},
	 *            {@link GL33#GL_ONE_MINUS_SRC1_ALPHA ONE_MINUS_SRC1_ALPHA}
	 * @param dfactor
	 *            the destination weighting factor
	 */
	public void glBlendFunc(int sfactor, int dfactor);

	// --- [ glClear ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glClear.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Sets portions of every pixel in a particular buffer to the same value.
	 * The value to which each buffer is cleared depends on the setting of the
	 * clear value for that buffer.
	 *
	 * @param mask
	 *            Zero or the bitwise OR of one or more values indicating which
	 *            buffers are to be cleared. One or more of:<br>
	 *            {@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT},
	 *            {@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT},
	 *            {@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT},
	 *            {@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}
	 */
	public void glClear(int mask);

	// --- [ glClearColor ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glClearColor.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the clear value for fixed-point and floating-point color buffers in
	 * RGBA mode. The specified components are stored as floating-point values.
	 *
	 * @param red
	 *            the value to which to clear the R channel of the color buffer
	 * @param green
	 *            the value to which to clear the G channel of the color buffer
	 * @param blue
	 *            the value to which to clear the B channel of the color buffer
	 * @param alpha
	 *            the value to which to clear the A channel of the color buffer
	 */
	public void glClearColor(float red, float green, float blue, float alpha);

	// --- [ glClearDepth ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glClearDepth.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the depth value used when clearing the depth buffer. When clearing a
	 * fixedpoint depth buffer, {@code depth} is clamped to the range [0,1] and
	 * converted to fixed-point. No conversion is applied when clearing a
	 * floating-point depth buffer.
	 *
	 * @param depth
	 *            the value to which to clear the depth buffer
	 */
	public void glClearDepth(double depth);

	// --- [ glClearStencil ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glClearStencil.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the value to which to clear the stencil buffer. {@code s} is masked
	 * to the number of bitplanes in the stencil buffer.
	 *
	 * @param s
	 *            the value to which to clear the stencil buffer
	 */
	public void glClearStencil(int s);

	// --- [ glColorMask ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glColorMask.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Masks the writing of R, G, B and A values to all draw buffers. In the
	 * initial state, all color values are enabled for writing for all draw
	 * buffers.
	 *
	 * @param red
	 *            whether R values are written or not
	 * @param green
	 *            whether G values are written or not
	 * @param blue
	 *            whether B values are written or not
	 * @param alpha
	 *            whether A values are written or not
	 */
	public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha);

	// --- [ glCullFace ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glCullFace.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Specifies which polygon faces are culled if {@link #GL_CULL_FACE
	 * CULL_FACE} is enabled. Front-facing polygons are rasterized if either
	 * culling is disabled or the CullFace mode is {@link #GL_BACK BACK} while
	 * back-facing polygons are rasterized only if either culling is disabled or
	 * the CullFace mode is {@link #GL_FRONT FRONT}. The initial setting of the
	 * CullFace mode is {@link #GL_BACK BACK}. Initially, culling is disabled.
	 *
	 * @param mode
	 *            the CullFace mode. One of:<br>
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK},
	 *            {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 */
	public void glCullFace(int mode);

	// --- [ glDepthFunc ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDepthFunc.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Specifies the comparison that takes place during the depth buffer test
	 * (when {@link #GL_DEPTH_TEST DEPTH_TEST} is enabled).
	 *
	 * @param func
	 *            the depth test comparison. One of:<br>
	 *            {@link #GL_NEVER NEVER}, {@link #GL_ALWAYS ALWAYS},
	 *            {@link #GL_LESS LESS}, {@link #GL_LEQUAL LEQUAL},
	 *            {@link #GL_EQUAL EQUAL}, {@link #GL_GREATER GREATER},
	 *            {@link #GL_GEQUAL GEQUAL}, {@link #GL_NOTEQUAL NOTEQUAL}
	 */
	public void glDepthFunc(int func);

	// --- [ glDepthMask ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDepthMask.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Masks the writing of depth values to the depth buffer. In the initial
	 * state, the depth buffer is enabled for writing.
	 *
	 * @param flag
	 *            whether depth values are written or not.
	 */
	public void glDepthMask(boolean flag);

	// --- [ glDepthRange ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDepthRange.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the depth range for all viewports to the same values.
	 *
	 * @param zNear
	 *            the near depth range
	 * @param zFar
	 *            the far depth range
	 */
	public void glDepthRange(double zNear, double zFar);

	// --- [ glDisableClientState ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glDisableClientState.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Disables the specified fixed-function attribute array.
	 *
	 * @param array
	 *            the attribute array to disable. One of:<br>
	 *            {@link #GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link #GL_NORMAL_ARRAY
	 *            NORMAL_ARRAY}, {@link #GL_COLOR_ARRAY COLOR_ARRAY},
	 *            {@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY},
	 *            {@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY},
	 *            {@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY},
	 *            {@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}
	 */
	public void glDisableClientState(int array);

	// --- [ glDrawArrays ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDrawArrays.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Constructs a sequence of geometric primitives by successively
	 * transferring elements for {@code count} vertices. Elements {@code first}
	 * through
	 * <code style="font-family: monospace">first + count &ndash; 1</code> of
	 * each enabled non-instanced array are transferred to the GL.
	 * 
	 * <p>
	 * If an array corresponding to an attribute required by a vertex shader is
	 * not enabled, then the corresponding element is taken from the current
	 * attribute state. If an array is enabled, the corresponding current vertex
	 * attribute value is unaffected by the execution of this function.
	 * </p>
	 *
	 * @param mode
	 *            the kind of primitives being constructed
	 * @param first
	 *            the first vertex to transfer to the GL
	 * @param count
	 *            the number of vertices after {@code first} to transfer to the
	 *            GL
	 */
	public void glDrawArrays(int mode, int first, int count);

	// --- [ glDrawBuffer ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDrawBuffer.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Defines the color buffer to which fragment color zero is written.
	 * 
	 * <p>
	 * Acceptable values for {@code buf} depend on whether the GL is using the
	 * default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING
	 * DRAW_FRAMEBUFFER_BINDING} is zero), or a framebuffer object (i.e.,
	 * {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is
	 * non-zero). In the initial state, the GL is bound to the default
	 * framebuffer.
	 * </p>
	 *
	 * @param buf
	 *            the color buffer to draw to. One of:<br>
	 *            {@link #GL_NONE NONE}, {@link #GL_FRONT_LEFT FRONT_LEFT},
	 *            {@link #GL_FRONT_RIGHT FRONT_RIGHT}, {@link #GL_BACK_LEFT
	 *            BACK_LEFT}, {@link #GL_BACK_RIGHT BACK_RIGHT},
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK},
	 *            {@link #GL_LEFT LEFT}, {@link #GL_RIGHT RIGHT},
	 *            {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}, {@link #GL_AUX0
	 *            AUX0}, {@link #GL_AUX1 AUX1}, {@link #GL_AUX2 AUX2},
	 *            {@link #GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0
	 *            COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public void glDrawBuffer(int buf);

	// --- [ glDrawElements ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDrawElements.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Constructs a sequence of geometric primitives by successively
	 * transferring elements for {@code count} vertices to the GL. The i
	 * <sup>th</sup> element transferred by {@code DrawElements} will be taken
	 * from element {@code indices[i]} (if no element array buffer is bound), or
	 * from the element whose index is stored in the currently bound element
	 * array buffer at offset {@code indices + i}.
	 *
	 * @param mode
	 *            the kind of primitives being constructed. One of:<br>
	 *            {@link #GL_POINTS POINTS}, {@link #GL_LINE_STRIP LINE_STRIP},
	 *            {@link #GL_LINE_LOOP LINE_LOOP}, {@link #GL_LINES LINES},
	 *            {@link #GL_POLYGON POLYGON}, {@link #GL_TRIANGLE_STRIP
	 *            TRIANGLE_STRIP}, {@link #GL_TRIANGLE_FAN TRIANGLE_FAN},
	 *            {@link #GL_TRIANGLES TRIANGLES}, {@link #GL_QUAD_STRIP
	 *            QUAD_STRIP}, {@link #GL_QUADS QUADS},
	 *            {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY},
	 *            {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY},
	 *            {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY},
	 *            {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY
	 *            TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count
	 *            the number of vertices to transfer to the GL
	 * @param type
	 *            indicates the type of index values in {@code indices}. One of:
	 *            <br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE},
	 *            {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT},
	 *            {@link #GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices
	 *            the index values
	 */
	public void glDrawElements(int mode, int count, int type, ByteBuffer indices);

	/** Buffer object offset version of: {@link #glDrawElements DrawElements} */
	public void glDrawElements(int mode, int count, int type, long indicesOffset);

	/** Alternative version of: {@link #glDrawElements DrawElements} */
	public void glDrawElements(int mode, int type, ByteBuffer indices);

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElements DrawElements} */
	public void glDrawElements(int mode, ByteBuffer indices);

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElements DrawElements} */
	public void glDrawElements(int mode, ShortBuffer indices);

	/** GL_UNSIGNED_INT version of: {@link #glDrawElements DrawElements} */
	public void glDrawElements(int mode, IntBuffer indices);

	// --- [ glEnableClientState ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glEnableClientState.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Enables the specified fixed-function attribute array.
	 *
	 * @param array
	 *            the attribute array to enable. One of:<br>
	 *            {@link #GL_VERTEX_ARRAY VERTEX_ARRAY}, {@link #GL_NORMAL_ARRAY
	 *            NORMAL_ARRAY}, {@link #GL_COLOR_ARRAY COLOR_ARRAY},
	 *            {@link GL14#GL_SECONDARY_COLOR_ARRAY SECONDARY_COLOR_ARRAY},
	 *            {@link #GL_EDGE_FLAG_ARRAY EDGE_FLAG_ARRAY},
	 *            {@link GL15#GL_FOG_COORD_ARRAY FOG_COORD_ARRAY},
	 *            {@link #GL_TEXTURE_COORD_ARRAY TEXTURE_COORD_ARRAY}
	 */
	public void glEnableClientState(int array);

	// --- [ glFinish ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glFinish.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Forces all previously issued GL commands to complete. {@code Finish} does
	 * not return until all effects from such commands on GL client and server
	 * state and the framebuffer are fully realized.
	 */
	public void glFinish();

	// --- [ glFlush ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glFlush.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Causes all previously issued GL commands to complete in finite time
	 * (although such commands may still be executing when {@code Flush}
	 * returns).
	 */
	public void glFlush();

	// --- [ glFrontFace ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glFrontFace.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * The first step of polygon rasterization is to determine if the polygon is
	 * back-facing or front-facing. This determination is made based on the sign
	 * of the (clipped or unclipped) polygon's area computed in window
	 * coordinates. The interpretation of the sign of this value is controlled
	 * with this function. In the initial state, the front face direction is set
	 * to {@link #GL_CCW CCW}.
	 *
	 * @param dir
	 *            the front face direction. One of:<br>
	 *            {@link #GL_CCW CCW}, {@link #GL_CW CW}
	 */
	public void glFrontFace(int dir);

	// --- [ glGenTextures ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGenTextures.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Returns n previously unused texture names in textures. These names are
	 * marked as used, for the purposes of GenTextures only, but they acquire
	 * texture state and a dimensionality only when they are first bound, just
	 * as if they were unused.
	 *
	 * @param n
	 *            the number of textures to create
	 * @param textures
	 *            a scalar or buffer in which to place the returned texture
	 *            names
	 */
	public void glGenTextures(int n, ByteBuffer textures);

	/** Alternative version of: {@link #glGenTextures GenTextures} */
	public void glGenTextures(IntBuffer textures);

	/** Single return value version of: {@link #glGenTextures GenTextures} */
	public int glGenTextures();

	// --- [ glDeleteTextures ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glDeleteTextures.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Deletes texture objects. After a texture object is deleted, it has no
	 * contents or dimensionality, and its name is again unused. If a texture
	 * that is currently bound to any of the target bindings of
	 * {@link #glBindTexture BindTexture} is deleted, it is as though
	 * {@link #glBindTexture BindTexture} had been executed with the same target
	 * and texture zero. Additionally, special care must be taken when deleting
	 * a texture if any of the images of the texture are attached to a
	 * framebuffer object.
	 * 
	 * <p>
	 * Unused names in textures that have been marked as used for the purposes
	 * of {@link #glGenTextures GenTextures} are marked as unused again. Unused
	 * names in textures are silently ignored, as is the name zero.
	 * </p>
	 *
	 * @param n
	 *            the number of texture names in the {@code textures} parameter
	 * @param textures
	 *            contains {@code n} names of texture objects to be deleted
	 */
	public void glDeleteTextures(int n, ByteBuffer textures);

	/** Alternative version of: {@link #glDeleteTextures DeleteTextures} */
	public void glDeleteTextures(IntBuffer textures);

	/** Single value version of: {@link #glDeleteTextures DeleteTextures} */
	public void glDeleteTextures(int texture);

	// --- [ glGetBooleanv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK
	 * Reference</a>
	 * </p>
	 * 
	 * Returns the current boolean value of the specified state variable.
	 * 
	 * <p>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may
	 * be a single value or an array of values. In the case of an array of
	 * values, LWJGL will <b>not</b> validate if {@code params} has enough space
	 * to store that array. Doing so would introduce significant overhead, as
	 * the OpenGL state variables are too many. It is the user's responsibility
	 * to avoid JVM crashes by ensuring enough space for the returned values.
	 * </p>
	 *
	 * @param pname
	 *            the state variable
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetBooleanv(int pname, ByteBuffer params);

	/** Single return value version of: {@link #glGetBooleanv GetBooleanv} */
	public boolean glGetBoolean(int pname);

	// --- [ glGetFloatv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK
	 * Reference</a>
	 * </p>
	 * 
	 * Returns the current float value of the specified state variable.
	 * 
	 * <p>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may
	 * be a single value or an array of values. In the case of an array of
	 * values, LWJGL will <b>not</b> validate if {@code params} has enough space
	 * to store that array. Doing so would introduce significant overhead, as
	 * the OpenGL state variables are too many. It is the user's responsibility
	 * to avoid JVM crashes by ensuring enough space for the returned values.
	 * </p>
	 *
	 * @param pname
	 *            the state variable
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetFloatv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glGetFloatv GetFloatv} */
	public void glGetFloatv(int pname, FloatBuffer params);

	/** Single return value version of: {@link #glGetFloatv GetFloatv} */
	public float glGetFloat(int pname);

	// --- [ glGetIntegerv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK
	 * Reference</a>
	 * </p>
	 * 
	 * Returns the current integer value of the specified state variable.
	 * 
	 * <p>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may
	 * be a single value or an array of values. In the case of an array of
	 * values, LWJGL will <b>not</b> validate if {@code params} has enough space
	 * to store that array. Doing so would introduce significant overhead, as
	 * the OpenGL state variables are too many. It is the user's responsibility
	 * to avoid JVM crashes by ensuring enough space for the returned values.
	 * </p>
	 *
	 * @param pname
	 *            the state variable
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetIntegerv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glGetIntegerv GetIntegerv} */
	public void glGetIntegerv(int pname, IntBuffer params);

	/** Single return value version of: {@link #glGetIntegerv GetIntegerv} */
	public int glGetInteger(int pname);

	// --- [ glGetDoublev ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGet.xhtml">OpenGL SDK
	 * Reference</a>
	 * </p>
	 * 
	 * Returns the current double value of the specified state variable.
	 * 
	 * <p>
	 * <b>LWJGL note</b>: The state that corresponds to the state variable may
	 * be a single value or an array of values. In the case of an array of
	 * values, LWJGL will <b>not</b> validate if {@code params} has enough space
	 * to store that array. Doing so would introduce significant overhead, as
	 * the OpenGL state variables are too many. It is the user's responsibility
	 * to avoid JVM crashes by ensuring enough space for the returned values.
	 * </p>
	 *
	 * @param pname
	 *            the state variable
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetDoublev(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glGetDoublev GetDoublev} */
	public void glGetDoublev(int pname, DoubleBuffer params);

	/** Single return value version of: {@link #glGetDoublev GetDoublev} */
	public double glGetDouble(int pname);

	// --- [ glGetError ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGetError.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Returns error information. Each detectable error is assigned a numeric
	 * code. When an error is detected, a flag is set and the code is recorded.
	 * Further errors, if they occur, do not affect this recorded code. When
	 * {@code GetError} is called, the code is returned and the flag is cleared,
	 * so that a further error will again record its code. If a call to
	 * {@code GetError} returns {@link #GL_NO_ERROR NO_ERROR}, then there has
	 * been no detectable error since the last call to {@code GetError} (or
	 * since the GL was initialized).
	 */
	public int glGetError();

	// --- [ glGetPointerv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGetPointer.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Returns a pointer in the current GL context.
	 *
	 * @param pname
	 *            the pointer to return. One of:<br>
	 *            {@link #GL_FEEDBACK_BUFFER_POINTER FEEDBACK_BUFFER_POINTER},
	 *            {@link #GL_SELECTION_BUFFER_POINTER SELECTION_BUFFER_POINTER},
	 *            {@link #GL_VERTEX_ARRAY_POINTER VERTEX_ARRAY_POINTER},
	 *            {@link #GL_NORMAL_ARRAY_POINTER NORMAL_ARRAY_POINTER},
	 *            {@link #GL_COLOR_ARRAY_POINTER COLOR_ARRAY_POINTER},
	 *            {@link #GL_INDEX_ARRAY_POINTER INDEX_ARRAY_POINTER},
	 *            {@link #GL_TEXTURE_COORD_ARRAY_POINTER
	 *            TEXTURE_COORD_ARRAY_POINTER},
	 *            {@link #GL_EDGE_FLAG_ARRAY_POINTER EDGE_FLAG_ARRAY_POINTER},
	 *            {@link GL14#GL_SECONDARY_COLOR_ARRAY_POINTER
	 *            SECONDARY_COLOR_ARRAY_POINTER},
	 *            {@link GL15#GL_FOG_COORD_ARRAY_POINTER
	 *            FOG_COORD_ARRAY_POINTER},
	 *            {@link GL43#GL_DEBUG_CALLBACK_FUNCTION
	 *            DEBUG_CALLBACK_FUNCTION},
	 *            {@link GL43#GL_DEBUG_CALLBACK_USER_PARAM
	 *            DEBUG_CALLBACK_USER_PARAM}
	 * @param params
	 *            a buffer in which to place the returned pointer
	 */
	public void glGetPointerv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glGetPointerv GetPointerv} */
	public void glGetPointerv(int pname, PointerBuffer params);

	/** Single return value version of: {@link #glGetPointerv GetPointerv} */
	public long glGetPointer(int pname);

	// --- [ glGetString ] ---

	public String glGetString(int name);

	// --- [ glGetTexImage ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGetTexImage.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Obtains texture images.
	 *
	 * @param tex
	 *            the texture (or texture face) to be obtained. One of:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D
	 *            TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X
	 *            TEXTURE_CUBE_MAP_POSITIVE_X},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X
	 *            TEXTURE_CUBE_MAP_NEGATIVE_X},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y
	 *            TEXTURE_CUBE_MAP_POSITIVE_Y},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y
	 *            TEXTURE_CUBE_MAP_NEGATIVE_Y},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z
	 *            TEXTURE_CUBE_MAP_POSITIVE_Z},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z
	 *            TEXTURE_CUBE_MAP_NEGATIVE_Z}
	 * @param level
	 *            the level-of-detail number
	 * @param format
	 *            the pixel format. One of:<br>
	 *            {@link #GL_STENCIL_INDEX STENCIL_INDEX},
	 *            {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT},
	 *            {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED
	 *            RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE},
	 *            {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB
	 *            RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR},
	 *            {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE},
	 *            {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA},
	 *            {@link GL30#GL_RED_INTEGER RED_INTEGER},
	 *            {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER},
	 *            {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER},
	 *            {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER},
	 *            {@link GL30#GL_RG_INTEGER RG_INTEGER},
	 *            {@link GL30#GL_RGB_INTEGER RGB_INTEGER},
	 *            {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER},
	 *            {@link GL30#GL_BGR_INTEGER BGR_INTEGER},
	 *            {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type
	 *            the pixel type. One of:<br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}
	 *            , {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT
	 *            SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT
	 *            INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT
	 *            FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2
	 *            UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV
	 *            UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5
	 *            UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV
	 *            UNSIGNED_SHORT_5_6_5_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV
	 *            UNSIGNED_SHORT_4_4_4_4_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1},
	 *            {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV
	 *            UNSIGNED_SHORT_1_5_5_5_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV
	 *            UNSIGNED_INT_8_8_8_8_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_10_10_10_2
	 *            UNSIGNED_INT_10_10_10_2},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8
	 *            UNSIGNED_INT_24_8},
	 *            {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV
	 *            UNSIGNED_INT_10F_11F_11F_REV},
	 *            {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV
	 *            UNSIGNED_INT_5_9_9_9_REV},
	 *            {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV
	 *            FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels
	 *            the buffer in which to place the returned data
	 */
	public void glGetTexImage(int tex, int level, int format, int type, ByteBuffer pixels);

	/** Buffer object offset version of: {@link #glGetTexImage GetTexImage} */
	public void glGetTexImage(int tex, int level, int format, int type, long pixelsOffset);

	/** ShortBuffer version of: {@link #glGetTexImage GetTexImage} */
	public void glGetTexImage(int tex, int level, int format, int type, ShortBuffer pixels);

	/** IntBuffer version of: {@link #glGetTexImage GetTexImage} */
	public void glGetTexImage(int tex, int level, int format, int type, IntBuffer pixels);

	/** FloatBuffer version of: {@link #glGetTexImage GetTexImage} */
	public void glGetTexImage(int tex, int level, int format, int type, FloatBuffer pixels);

	/** DoubleBuffer version of: {@link #glGetTexImage GetTexImage} */
	public void glGetTexImage(int tex, int level, int format, int type, DoubleBuffer pixels);

	// --- [ glGetTexLevelParameteriv ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glGetTexLevelParameter.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Places integer information about texture image parameter {@code pname}
	 * for level-of-detail {@code level} of the specified {@code target} into
	 * {@code params}.
	 *
	 * @param target
	 *            the texture image target. One of:<br>
	 *            {@link #GL_TEXTURE_2D TEXTURE_2D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP},
	 *            {@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D},
	 *            {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_PROXY_TEXTURE_RECTANGLE
	 *            PROXY_TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP},
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link GL12#GL_TEXTURE_3D
	 *            TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}
	 *            , {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY
	 *            TEXTURE_CUBE_MAP_ARRAY}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE
	 *            TEXTURE_2D_MULTISAMPLE},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY
	 *            TEXTURE_2D_MULTISAMPLE_ARRAY}, {@link #GL_PROXY_TEXTURE_1D
	 *            PROXY_TEXTURE_1D}, {@link GL12#GL_PROXY_TEXTURE_3D
	 *            PROXY_TEXTURE_3D}, {@link GL30#GL_PROXY_TEXTURE_2D_ARRAY
	 *            PROXY_TEXTURE_2D_ARRAY},
	 *            {@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY
	 *            PROXY_TEXTURE_CUBE_MAP_ARRAY},
	 *            {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE
	 *            PROXY_TEXTURE_2D_MULTISAMPLE},
	 *            {@link GL32#GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY
	 *            PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param level
	 *            the level-of-detail number
	 * @param pname
	 *            the parameter to query. One of:<br>
	 *            {@link #GL_TEXTURE_WIDTH TEXTURE_WIDTH},
	 *            {@link #GL_TEXTURE_HEIGHT TEXTURE_HEIGHT},
	 *            {@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH},
	 *            {@link #GL_TEXTURE_BORDER TEXTURE_BORDER},
	 *            {@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES},
	 *            {@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS
	 *            TEXTURE_FIXED_SAMPLE_LOCATIONS},
	 *            {@link #GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT},
	 *            {@link #GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE},
	 *            {@link #GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE},
	 *            {@link #GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE},
	 *            {@link #GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE},
	 *            {@link #GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE},
	 *            {@link #GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE},
	 *            {@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE},
	 *            {@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE},
	 *            {@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE},
	 *            {@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE},
	 *            {@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE},
	 *            {@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE},
	 *            {@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE},
	 *            {@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE},
	 *            {@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE},
	 *            {@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE},
	 *            {@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED},
	 *            {@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE
	 *            TEXTURE_COMPRESSED_IMAGE_SIZE},
	 *            {@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING
	 *            TEXTURE_BUFFER_DATA_STORE_BINDING},
	 *            {@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET},
	 *            {@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexLevelParameteriv(int target, int level, int pname, ByteBuffer params);

	/**
	 * Alternative version of: {@link #glGetTexLevelParameteriv
	 * GetTexLevelParameteriv}
	 */
	public void glGetTexLevelParameteriv(int target, int level, int pname, IntBuffer params);

	/**
	 * Single return value version of: {@link #glGetTexLevelParameteriv
	 * GetTexLevelParameteriv}
	 */
	public int glGetTexLevelParameteri(int target, int level, int pname);

	// --- [ glGetTexLevelParameterfv ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glGetTexLevelParameter.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Float version of {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}
	 * .
	 *
	 * @param target
	 *            the texture image target
	 * @param level
	 *            the level-of-detail number
	 * @param pname
	 *            the parameter to query
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexLevelParameterfv(int target, int level, int pname, ByteBuffer params);

	/**
	 * Alternative version of: {@link #glGetTexLevelParameterfv
	 * GetTexLevelParameterfv}
	 */
	public void glGetTexLevelParameterfv(int target, int level, int pname, FloatBuffer params);

	/**
	 * Single return value version of: {@link #glGetTexLevelParameterfv
	 * GetTexLevelParameterfv}
	 */
	public float glGetTexLevelParameterf(int target, int level, int pname);

	// --- [ glGetTexParameteriv ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glGetTexParameter.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Place integer information about texture parameter {@code pname} for the
	 * specified {@code target} into {@code params}.
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D
	 *            TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP},
	 *            {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY
	 *            TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param pname
	 *            the parameter to query. One of:<br>
	 *            {@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL},
	 *            {@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR},
	 *            {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE},
	 *            {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC},
	 *            {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS},
	 *            {@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER},
	 *            {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL},
	 *            {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD},
	 *            {@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER},
	 *            {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD},
	 *            {@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA},
	 *            {@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S},
	 *            {@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T},
	 *            {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R},
	 *            {@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE},
	 *            {@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP},
	 *            {@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE
	 *            IMAGE_FORMAT_COMPATIBILITY_TYPE},
	 *            {@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT
	 *            TEXTURE_IMMUTABLE_FORMAT},
	 *            {@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS
	 *            TEXTURE_IMMUTABLE_LEVELS},
	 *            {@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL},
	 *            {@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS
	 *            TEXTURE_VIEW_NUM_LEVELS},
	 *            {@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER},
	 *            {@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS
	 *            TEXTURE_VIEW_NUM_LAYERS}, {@link #GL_TEXTURE_RESIDENT
	 *            TEXTURE_RESIDENT}
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexParameteriv(int target, int pname, ByteBuffer params);

	/**
	 * Alternative version of: {@link #glGetTexParameteriv GetTexParameteriv}
	 */
	public void glGetTexParameteriv(int target, int pname, IntBuffer params);

	/**
	 * Single return value version of: {@link #glGetTexParameteriv
	 * GetTexParameteriv}
	 */
	public int glGetTexParameteri(int target, int pname);

	// --- [ glGetTexParameterfv ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glGetTexParameter.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Float version of {@link #glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param target
	 *            the texture target
	 * @param pname
	 *            the parameter to query
	 * @param params
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexParameterfv(int target, int pname, ByteBuffer params);

	/**
	 * Alternative version of: {@link #glGetTexParameterfv GetTexParameterfv}
	 */
	public void glGetTexParameterfv(int target, int pname, FloatBuffer params);

	/**
	 * Single return value version of: {@link #glGetTexParameterfv
	 * GetTexParameterfv}
	 */
	public float glGetTexParameterf(int target, int pname);

	// --- [ glHint ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glHint.xhtml">OpenGL SDK
	 * Reference</a>
	 * </p>
	 * 
	 * Certain aspects of GL behavior, when there is room for variation, may be
	 * controlled with this function. The initial value for all hints is
	 * {@link #GL_DONT_CARE DONT_CARE}.
	 *
	 * @param target
	 *            the behavior to control. One of:<br>
	 *            {@link #GL_PERSPECTIVE_CORRECTION_HINT
	 *            PERSPECTIVE_CORRECTION_HINT}, {@link #GL_POINT_SMOOTH_HINT
	 *            POINT_SMOOTH_HINT}, {@link #GL_LINE_SMOOTH_HINT
	 *            LINE_SMOOTH_HINT}, {@link #GL_POLYGON_SMOOTH_HINT
	 *            POLYGON_SMOOTH_HINT}, {@link #GL_FOG_HINT FOG_HINT},
	 *            {@link GL14#GL_GENERATE_MIPMAP_HINT GENERATE_MIPMAP_HINT},
	 *            {@link GL13#GL_TEXTURE_COMPRESSION_HINT
	 *            TEXTURE_COMPRESSION_HINT},
	 *            {@link GL20#GL_FRAGMENT_SHADER_DERIVATIVE_HINT
	 *            FRAGMENT_SHADER_DERIVATIVE_HINT}
	 * @param hint
	 *            the behavior hint. One of:<br>
	 *            {@link #GL_FASTEST FASTEST}, {@link #GL_NICEST NICEST},
	 *            {@link #GL_DONT_CARE DONT_CARE}
	 */
	public void glHint(int target, int hint);

	// --- [ glIndexPointer ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexPointer.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies the location and organization of a color index array.
	 *
	 * @param type
	 *            the data type of the values stored in the array. One of:<br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_SHORT
	 *            SHORT}, {@link #GL_INT INT}, {@link #GL_FLOAT FLOAT},
	 *            {@link #GL_DOUBLE DOUBLE}
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the color index array data
	 */
	public void glIndexPointer(int type, int stride, ByteBuffer pointer);

	/** Buffer object offset version of: {@link #glIndexPointer IndexPointer} */
	public void glIndexPointer(int type, int stride, long pointerOffset);

	/** GL_UNSIGNED_BYTE version of: {@link #glIndexPointer IndexPointer} */
	public void glIndexPointer(int stride, ByteBuffer pointer);

	/** GL_SHORT version of: {@link #glIndexPointer IndexPointer} */
	public void glIndexPointer(int stride, ShortBuffer pointer);

	/** GL_INT version of: {@link #glIndexPointer IndexPointer} */
	public void glIndexPointer(int stride, IntBuffer pointer);

	// --- [ glInterleavedArrays ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glInterleavedArrays.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Efficiently initializes the six vertex arrays and their enables to one of
	 * 14 configurations.
	 *
	 * @param format
	 *            the interleaved array format. One of:<br>
	 *            {@link #GL_V2F V2F}, {@link #GL_V3F V3F}, {@link #GL_C4UB_V2F
	 *            C4UB_V2F}, {@link #GL_C4UB_V3F C4UB_V3F}, {@link #GL_C3F_V3F
	 *            C3F_V3F}, {@link #GL_N3F_V3F N3F_V3F}, {@link #GL_C4F_N3F_V3F
	 *            C4F_N3F_V3F}, {@link #GL_T2F_V3F T2F_V3F}, {@link #GL_T4F_V4F
	 *            T4F_V4F}, {@link #GL_T2F_C4UB_V3F T2F_C4UB_V3F},
	 *            {@link #GL_T2F_C3F_V3F T2F_C3F_V3F}, {@link #GL_T2F_N3F_V3F
	 *            T2F_N3F_V3F}, {@link #GL_T2F_C4F_N3F_V3F T2F_C4F_N3F_V3F},
	 *            {@link #GL_T4F_C4F_N3F_V4F T4F_C4F_N3F_V4F}
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the vertex array data
	 */
	public void glInterleavedArrays(int format, int stride, ByteBuffer pointer);

	/**
	 * Buffer object offset version of: {@link #glInterleavedArrays
	 * InterleavedArrays}
	 */
	public void glInterleavedArrays(int format, int stride, long pointerOffset);

	/**
	 * ShortBuffer version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public void glInterleavedArrays(int format, int stride, ShortBuffer pointer);

	/** IntBuffer version of: {@link #glInterleavedArrays InterleavedArrays} */
	public void glInterleavedArrays(int format, int stride, IntBuffer pointer);

	/**
	 * FloatBuffer version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public void glInterleavedArrays(int format, int stride, FloatBuffer pointer);

	/**
	 * DoubleBuffer version of: {@link #glInterleavedArrays InterleavedArrays}
	 */
	public void glInterleavedArrays(int format, int stride, DoubleBuffer pointer);

	// --- [ glIsEnabled ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glIsEnabled.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Determines if {@code cap} is currently enabled (as with {@link #glEnable
	 * Enable}) or disabled.
	 *
	 * @param cap
	 *            the enable state to query
	 */
	public boolean glIsEnabled(int cap);

	// --- [ glIsTexture ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glIsTexture.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Returns true if {@code texture} is the name of a texture object.
	 *
	 * @param texture
	 *            the texture name to query
	 */
	public boolean glIsTexture(int texture);

	// --- [ glLineWidth ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glLineWidth.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the width of rasterized line segments. The default width is 1.0.
	 *
	 * @param width
	 *            the line width
	 */
	public void glLineWidth(float width);

	// --- [ glLogicOp ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glLogicOp.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Sets the logical framebuffer operation.
	 *
	 * @param op
	 *            the operation to set. One of:<br>
	 *            {@link #GL_CLEAR CLEAR}, {@link #GL_AND AND},
	 *            {@link #GL_AND_REVERSE AND_REVERSE}, {@link #GL_COPY COPY},
	 *            {@link #GL_AND_INVERTED AND_INVERTED}, {@link #GL_NOOP NOOP},
	 *            {@link #GL_XOR XOR}, {@link #GL_OR OR}, {@link #GL_NOR NOR},
	 *            {@link #GL_EQUIV EQUIV}, {@link #GL_INVERT INVERT},
	 *            {@link #GL_OR_REVERSE OR_REVERSE}, {@link #GL_COPY_INVERTED
	 *            COPY_INVERTED}, {@link #GL_OR_INVERTED OR_INVERTED},
	 *            {@link #GL_NAND NAND}, {@link #GL_SET SET}
	 */
	public void glLogicOp(int op);

	// --- [ glPixelStorei ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glPixelStorei.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the integer value of a pixel store parameter.
	 *
	 * @param pname
	 *            the pixel store parameter to set. One of:<br>
	 *            {@link #GL_UNPACK_SWAP_BYTES UNPACK_SWAP_BYTES},
	 *            {@link #GL_UNPACK_LSB_FIRST UNPACK_LSB_FIRST},
	 *            {@link #GL_UNPACK_ROW_LENGTH UNPACK_ROW_LENGTH},
	 *            {@link #GL_UNPACK_SKIP_ROWS UNPACK_SKIP_ROWS},
	 *            {@link #GL_UNPACK_SKIP_PIXELS UNPACK_SKIP_PIXELS},
	 *            {@link #GL_UNPACK_ALIGNMENT UNPACK_ALIGNMENT},
	 *            {@link GL12#GL_UNPACK_IMAGE_HEIGHT UNPACK_IMAGE_HEIGHT},
	 *            {@link GL12#GL_UNPACK_SKIP_IMAGES UNPACK_SKIP_IMAGES},
	 *            {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_WIDTH
	 *            UNPACK_COMPRESSED_BLOCK_WIDTH},
	 *            {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_HEIGHT
	 *            UNPACK_COMPRESSED_BLOCK_HEIGHT},
	 *            {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_DEPTH
	 *            UNPACK_COMPRESSED_BLOCK_DEPTH},
	 *            {@link GL42#GL_UNPACK_COMPRESSED_BLOCK_SIZE
	 *            UNPACK_COMPRESSED_BLOCK_SIZE}
	 * @param param
	 *            the parameter value
	 */
	public void glPixelStorei(int pname, int param);

	// --- [ glPixelStoref ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glPixelStoref.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Float version of {@link #glPixelStorei PixelStorei}.
	 *
	 * @param pname
	 *            the pixel store parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glPixelStoref(int pname, int param);

	// --- [ glPointSize ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glPointSize.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Controls the rasterization of points if no vertex, tessellation control,
	 * tessellation evaluation, or geometry shader is active. The default point
	 * size is 1.0.
	 *
	 * @param size
	 *            the request size of a point
	 */
	public void glPointSize(float size);

	// --- [ glPolygonMode ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glPolygonMode.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Controls the interpretation of polygons for rasterization.
	 * 
	 * <p>
	 * {@link #GL_FILL FILL} is the default mode of polygon rasterization. Note
	 * that these modes affect only the final rasterization of polygons: in
	 * particular, a polygon's vertices are lit, and the polygon is clipped and
	 * possibly culled before these modes are applied. Polygon antialiasing
	 * applies only to the {@link #GL_FILL FILL} state of PolygonMode. For
	 * {@link #GL_POINT POINT} or {@link #GL_LINE LINE}, point antialiasing or
	 * line segment antialiasing, respectively, apply.
	 * </p>
	 *
	 * @param face
	 *            the face for which to set the rasterizing method. One of:<br>
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK},
	 *            {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param mode
	 *            the rasterization mode. One of:<br>
	 *            {@link #GL_POINT POINT}, {@link #GL_LINE LINE},
	 *            {@link #GL_FILL FILL}
	 */
	public void glPolygonMode(int face, int mode);

	// --- [ glPolygonOffset ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glPolygonOffset.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * The depth values of all fragments generated by the rasterization of a
	 * polygon may be offset by a single value that is computed for that
	 * polygon. This function determines that value.
	 * 
	 * <p>
	 * {@code factor} scales the maximum depth slope of the polygon, and
	 * {@code units} scales an implementation-dependent constant that relates to
	 * the usable resolution of the depth buffer. The resulting values are
	 * summed to produce the polygon offset value.
	 * </p>
	 *
	 * @param factor
	 *            the maximum depth slope factor
	 * @param units
	 *            the constant scale
	 */
	public void glPolygonOffset(float factor, float units);

	// --- [ glPrioritizeTextures ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glPrioritizeTextures.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the priority of texture objects. Each priority value is clamped to
	 * the range [0, 1] before it is assigned. Zero indicates the lowest
	 * priority, with the least likelihood of being resident. One indicates the
	 * highest priority, with the greatest likelihood of being resident.
	 *
	 * @param n
	 *            the number of texture object priorities to set
	 * @param textures
	 *            an array of texture object names
	 * @param priorities
	 *            an array of texture object priorities
	 */
	public void glPrioritizeTextures(int n, ByteBuffer textures, ByteBuffer priorities);

	/**
	 * Alternative version of: {@link #glPrioritizeTextures PrioritizeTextures}
	 */
	public void glPrioritizeTextures(IntBuffer textures, FloatBuffer priorities);

	// --- [ glReadBuffer ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glReadBuffer.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Defines the color buffer from which values are obtained.
	 * 
	 * <p>
	 * Acceptable values for {@code src} depend on whether the GL is using the
	 * default framebuffer (i.e., {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING
	 * DRAW_FRAMEBUFFER_BINDING} is zero), or a framebuffer object (i.e.,
	 * {@link GL30#GL_DRAW_FRAMEBUFFER_BINDING DRAW_FRAMEBUFFER_BINDING} is
	 * non-zero). In the initial state, the GL is bound to the default
	 * framebuffer.
	 * </p>
	 *
	 * @param src
	 *            the color buffer to read from. One of:<br>
	 *            {@link #GL_NONE NONE}, {@link #GL_FRONT_LEFT FRONT_LEFT},
	 *            {@link #GL_FRONT_RIGHT FRONT_RIGHT}, {@link #GL_BACK_LEFT
	 *            BACK_LEFT}, {@link #GL_BACK_RIGHT BACK_RIGHT},
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK},
	 *            {@link #GL_LEFT LEFT}, {@link #GL_RIGHT RIGHT},
	 *            {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}, {@link #GL_AUX0
	 *            AUX0}, {@link #GL_AUX1 AUX1}, {@link #GL_AUX2 AUX2},
	 *            {@link #GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0
	 *            COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public void glReadBuffer(int src);

	// --- [ glReadPixels ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glReadPixels.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * ReadPixels obtains values from the selected read buffer from each pixel
	 * with lower left hand corner at {@code (x + i, y + j)} for
	 * {@code 0 <= i < width} and {@code 0 <= j < height}; this pixel is said to
	 * be the i<sup>th</sup> pixel in the j<sup>th</sup> row. If any of these
	 * pixels lies outside of the window allocated to the current GL context, or
	 * outside of the image attached to the currently bound read framebuffer
	 * object, then the values obtained for those pixels are undefined. When
	 * {@link GL30#GL_READ_FRAMEBUFFER_BINDING READ_FRAMEBUFFER_BINDING} is
	 * zero, values are also undefined for individual pixels that are not owned
	 * by the current context. Otherwise, {@code ReadPixels} obtains values from
	 * the selected buffer, regardless of how those values were placed there.
	 *
	 * @param x
	 *            the left pixel coordinate
	 * @param y
	 *            the lower pixel coordinate
	 * @param width
	 *            the number of pixels to read in the x-dimension
	 * @param height
	 *            the number of pixels to read in the y-dimension
	 * @param format
	 *            the pixel format. One of:<br>
	 *            {@link #GL_STENCIL_INDEX STENCIL_INDEX},
	 *            {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT},
	 *            {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED
	 *            RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE},
	 *            {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB
	 *            RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR},
	 *            {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE},
	 *            {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA},
	 *            {@link GL30#GL_RED_INTEGER RED_INTEGER},
	 *            {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER},
	 *            {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER},
	 *            {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER},
	 *            {@link GL30#GL_RG_INTEGER RG_INTEGER},
	 *            {@link GL30#GL_RGB_INTEGER RGB_INTEGER},
	 *            {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER},
	 *            {@link GL30#GL_BGR_INTEGER BGR_INTEGER},
	 *            {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type
	 *            the pixel type. One of:<br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}
	 *            , {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT
	 *            SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT
	 *            INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT
	 *            FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2
	 *            UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV
	 *            UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5
	 *            UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV
	 *            UNSIGNED_SHORT_5_6_5_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV
	 *            UNSIGNED_SHORT_4_4_4_4_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1},
	 *            {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV
	 *            UNSIGNED_SHORT_1_5_5_5_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV
	 *            UNSIGNED_INT_8_8_8_8_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_10_10_10_2
	 *            UNSIGNED_INT_10_10_10_2},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8
	 *            UNSIGNED_INT_24_8},
	 *            {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV
	 *            UNSIGNED_INT_10F_11F_11F_REV},
	 *            {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV
	 *            UNSIGNED_INT_5_9_9_9_REV},
	 *            {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV
	 *            FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels
	 *            a buffer in which to place the returned pixel data
	 */
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels);

	/** Buffer object offset version of: {@link #glReadPixels ReadPixels} */
	public void glReadPixels(int x, int y, int width, int height, int format, int type, long pixelsOffset);

	/** ShortBuffer version of: {@link #glReadPixels ReadPixels} */
	public void glReadPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels);

	/** IntBuffer version of: {@link #glReadPixels ReadPixels} */
	public void glReadPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels);

	/** FloatBuffer version of: {@link #glReadPixels ReadPixels} */
	public void glReadPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels);

	// --- [ glScissor ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glScissor.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Defines the scissor rectangle for all viewports. The scissor test is
	 * enabled or disabled for all viewports using {@link #glEnable Enable} or
	 * {@link #glDisable Disable} with the symbolic constant
	 * {@link #GL_SCISSOR_TEST SCISSOR_TEST}. When disabled, it is as if the
	 * scissor test always passes. When enabled, if
	 * <code style="font-family: monospace">left <= x<sub>w</sub> < left + width</code>
	 * and
	 * <code style="font-family: monospace">bottom <= y<sub>w</sub> < bottom + height</code>
	 * for the scissor rectangle, then the scissor test passes. Otherwise, the
	 * test fails and the fragment is discarded.
	 *
	 * @param x
	 *            the left scissor rectangle coordinate
	 * @param y
	 *            the bottom scissor rectangle coordinate
	 * @param width
	 *            the scissor rectangle width
	 * @param height
	 *            the scissor rectangle height
	 */
	public void glScissor(int x, int y, int width, int height);

	// --- [ glSelectBuffer ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glSelectBuffer.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the selection array.
	 *
	 * @param size
	 *            the maximum number of values that can be stored in
	 *            {@code buffer}
	 * @param buffer
	 *            an array of unsigned integers to be potentially filled names
	 */
	public void glSelectBuffer(int size, ByteBuffer buffer);

	/** Alternative version of: {@link #glSelectBuffer SelectBuffer} */
	public void glSelectBuffer(IntBuffer buffer);

	// --- [ glStencilFunc ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glStencilFunc.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Controls the stencil test.
	 * 
	 * <p>
	 * {@code ref} is an integer reference value that is used in the unsigned
	 * stencil comparison. Stencil comparison operations and queries of
	 * {@code ref} clamp its value to the range [0, 2<sup>s</sup> &ndash; 1],
	 * where s is the number of bits in the stencil buffer attached to the draw
	 * framebuffer. The s least significant bits of {@code mask} are bitwise
	 * ANDed with both the reference and the stored stencil value, and the
	 * resulting masked values are those that participate in the comparison
	 * controlled by {@code func}.
	 * </p>
	 *
	 * @param func
	 *            the stencil comparison function. One of:<br>
	 *            {@link #GL_NEVER NEVER}, {@link #GL_ALWAYS ALWAYS},
	 *            {@link #GL_LESS LESS}, {@link #GL_LEQUAL LEQUAL},
	 *            {@link #GL_EQUAL EQUAL}, {@link #GL_GEQUAL GEQUAL},
	 *            {@link #GL_GREATER GREATER}, {@link #GL_NOTEQUAL NOTEQUAL}
	 * @param ref
	 *            the reference value
	 * @param mask
	 *            the stencil comparison mask
	 */
	public void glStencilFunc(int func, int ref, int mask);

	// --- [ glStencilMask ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glStencilMask.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Masks the writing of particular bits into the stencil plans.
	 * 
	 * <p>
	 * The least significant s bits of {@code mask}, where s is the number of
	 * bits in the stencil buffer, specify an integer mask. Where a 1 appears in
	 * this mask, the corresponding bit in the stencil buffer is written; where
	 * a 0 appears, the bit is not written.
	 * </p>
	 *
	 * @param mask
	 *            the stencil mask
	 */
	public void glStencilMask(int mask);

	// --- [ glStencilOp ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glStencilOp.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Indicates what happens to the stored stencil value if this or certain
	 * subsequent tests fail or pass.
	 * 
	 * <p>
	 * The supported actions are {@link #GL_KEEP KEEP}, {@link #GL_ZERO ZERO},
	 * {@link #GL_REPLACE REPLACE}, {@link #GL_INCR INCR}, {@link #GL_DECR DECR}
	 * , {@link #GL_INVERT INVERT}, {@link GL14#GL_INCR_WRAP INCR_WRAP} and
	 * {@link GL14#GL_DECR_WRAP DECR_WRAP}. These correspond to keeping the
	 * current value, setting to zero, replacing with the reference value,
	 * incrementing with saturation, decrementing with saturation, bitwise
	 * inverting it, incrementing without saturation, and decrementing without
	 * saturation.
	 * </p>
	 * 
	 * <p>
	 * For purposes of increment and decrement, the stencil bits are considered
	 * as an unsigned integer. Incrementing or decrementing with saturation
	 * clamps the stencil value at 0 and the maximum representable value.
	 * Incrementing or decrementing without saturation will wrap such that
	 * incrementing the maximum representable value results in 0, and
	 * decrementing 0 results in the maximum representable value.
	 * </p>
	 *
	 * @param sfail
	 *            the action to take if the stencil test fails
	 * @param dpfail
	 *            the action to take if the depth buffer test fails
	 * @param dppass
	 *            the action to take if the depth buffer test passes
	 */
	public void glStencilOp(int sfail, int dpfail, int dppass);

	// --- [ glTexImage2D ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexImage2D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Specifies a two-dimensional texture image.
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_2D TEXTURE_2D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP},
	 *            {@link #GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D},
	 *            {@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_PROXY_TEXTURE_RECTANGLE
	 *            PROXY_TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}
	 * @param level
	 *            the level-of-detail number
	 * @param internalformat
	 *            the texture internal format. One of:<br>
	 *            {@link #GL_RED RED}, {@link GL30#GL_RG RG}, {@link #GL_RGB
	 *            RGB}, {@link #GL_RGBA RGBA}, {@link #GL_DEPTH_COMPONENT
	 *            DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL},
	 *            {@link GL30#GL_R8 R8}, {@link GL31#GL_R8_SNORM R8_SNORM},
	 *            {@link GL30#GL_R16 R16}, {@link GL31#GL_R16_SNORM R16_SNORM},
	 *            {@link GL30#GL_RG8 RG8}, {@link GL31#GL_RG8_SNORM RG8_SNORM},
	 *            {@link GL30#GL_RG16 RG16}, {@link GL31#GL_RG16_SNORM
	 *            RG16_SNORM}, {@link #GL_R3_G3_B2 R3_G3_B2}, {@link #GL_RGB4
	 *            RGB4}, {@link #GL_RGB5 RGB5}, {@link GL41#GL_RGB565 RGB565},
	 *            {@link #GL_RGB8 RGB8}, {@link GL31#GL_RGB8_SNORM RGB8_SNORM},
	 *            {@link #GL_RGB10 RGB10}, {@link #GL_RGB12 RGB12},
	 *            {@link #GL_RGB16 RGB16}, {@link GL31#GL_RGB16_SNORM
	 *            RGB16_SNORM}, {@link #GL_RGBA2 RGBA2}, {@link #GL_RGBA4 RGBA4}
	 *            , {@link #GL_RGB5_A1 RGB5_A1}, {@link #GL_RGBA8 RGBA8},
	 *            {@link GL31#GL_RGBA8_SNORM RGBA8_SNORM}, {@link #GL_RGB10_A2
	 *            RGB10_A2}, {@link GL33#GL_RGB10_A2UI RGB10_A2UI},
	 *            {@link #GL_RGBA12 RGBA12}, {@link #GL_RGBA16 RGBA16},
	 *            {@link GL31#GL_RGBA16_SNORM RGBA16_SNORM},
	 *            {@link GL21#GL_SRGB8 SRGB8}, {@link GL21#GL_SRGB8_ALPHA8
	 *            SRGB8_ALPHA8}, {@link GL30#GL_R16F R16F}, {@link GL30#GL_RG16F
	 *            RG16F}, {@link GL30#GL_RGB16F RGB16F}, {@link GL30#GL_RGBA16F
	 *            RGBA16F}, {@link GL30#GL_R32F R32F}, {@link GL30#GL_RG32F
	 *            RG32F}, {@link GL30#GL_RGB32F RGB32F}, {@link GL30#GL_RGBA32F
	 *            RGBA32F}, {@link GL30#GL_R11F_G11F_B10F R11F_G11F_B10F},
	 *            {@link GL30#GL_RGB9_E5 RGB9_E5}, {@link GL30#GL_R8I R8I},
	 *            {@link GL30#GL_R8UI R8UI}, {@link GL30#GL_R16I R16I},
	 *            {@link GL30#GL_R16UI R16UI}, {@link GL30#GL_R32I R32I},
	 *            {@link GL30#GL_R32UI R32UI}, {@link GL30#GL_RG8I RG8I},
	 *            {@link GL30#GL_RG8UI RG8UI}, {@link GL30#GL_RG16I RG16I},
	 *            {@link GL30#GL_RG16UI RG16UI}, {@link GL30#GL_RG32I RG32I},
	 *            {@link GL30#GL_RG32UI RG32UI}, {@link GL30#GL_RGB8I RGB8I},
	 *            {@link GL30#GL_RGB8UI RGB8UI}, {@link GL30#GL_RGB16I RGB16I},
	 *            {@link GL30#GL_RGB16UI RGB16UI}, {@link GL30#GL_RGB32I RGB32I}
	 *            , {@link GL30#GL_RGB32UI RGB32UI}, {@link GL30#GL_RGBA8I
	 *            RGBA8I}, {@link GL30#GL_RGBA8UI RGBA8UI},
	 *            {@link GL30#GL_RGBA16I RGBA16I}, {@link GL30#GL_RGBA16UI
	 *            RGBA16UI}, {@link GL30#GL_RGBA32I RGBA32I},
	 *            {@link GL30#GL_RGBA32UI RGBA32UI},
	 *            {@link GL14#GL_DEPTH_COMPONENT16 DEPTH_COMPONENT16},
	 *            {@link GL14#GL_DEPTH_COMPONENT24 DEPTH_COMPONENT24},
	 *            {@link GL14#GL_DEPTH_COMPONENT32 DEPTH_COMPONENT32},
	 *            {@link GL30#GL_DEPTH24_STENCIL8 DEPTH24_STENCIL8},
	 *            {@link GL30#GL_DEPTH_COMPONENT32F DEPTH_COMPONENT32F},
	 *            {@link GL30#GL_DEPTH32F_STENCIL8 DEPTH32F_STENCIL8},
	 *            {@link GL30#GL_COMPRESSED_RED COMPRESSED_RED},
	 *            {@link GL30#GL_COMPRESSED_RG COMPRESSED_RG},
	 *            {@link GL13#GL_COMPRESSED_RGB COMPRESSED_RGB},
	 *            {@link GL13#GL_COMPRESSED_RGBA COMPRESSED_RGBA},
	 *            {@link GL21#GL_COMPRESSED_SRGB COMPRESSED_SRGB},
	 *            {@link GL21#GL_COMPRESSED_SRGB_ALPHA COMPRESSED_SRGB_ALPHA},
	 *            {@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1},
	 *            {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1
	 *            COMPRESSED_SIGNED_RED_RGTC1},
	 *            {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2},
	 *            {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2
	 *            COMPRESSED_SIGNED_RG_RGTC2},
	 *            {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM
	 *            COMPRESSED_RGBA_BPTC_UNORM},
	 *            {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM
	 *            COMPRESSED_SRGB_ALPHA_BPTC_UNORM},
	 *            {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT
	 *            COMPRESSED_RGB_BPTC_SIGNED_FLOAT},
	 *            {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT
	 *            COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT},
	 *            {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2},
	 *            {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2},
	 *            {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
	 *            COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2},
	 *            {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2
	 *            COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2},
	 *            {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC
	 *            COMPRESSED_RGBA8_ETC2_EAC},
	 *            {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC
	 *            COMPRESSED_SRGB8_ALPHA8_ETC2_EAC},
	 *            {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC},
	 *            {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC
	 *            COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC
	 *            COMPRESSED_RG11_EAC},
	 *            {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC
	 *            COMPRESSED_SIGNED_RG11_EAC}, see
	 *            {@link EXTTextureCompressionS3TC}, see
	 *            {@link EXTTextureCompressionLATC}, see
	 *            {@link ATITextureCompression3DC}
	 * @param width
	 *            the texture width
	 * @param height
	 *            the texture height
	 * @param border
	 *            the texture border width
	 * @param format
	 *            the texel data format. One of:<br>
	 *            {@link #GL_STENCIL_INDEX STENCIL_INDEX},
	 *            {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT},
	 *            {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED
	 *            RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE},
	 *            {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB
	 *            RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR},
	 *            {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE},
	 *            {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA},
	 *            {@link GL30#GL_RED_INTEGER RED_INTEGER},
	 *            {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER},
	 *            {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER},
	 *            {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER},
	 *            {@link GL30#GL_RG_INTEGER RG_INTEGER},
	 *            {@link GL30#GL_RGB_INTEGER RGB_INTEGER},
	 *            {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER},
	 *            {@link GL30#GL_BGR_INTEGER BGR_INTEGER},
	 *            {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type
	 *            the texel data type. One of:<br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}
	 *            , {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT
	 *            SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT
	 *            INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT
	 *            FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2
	 *            UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV
	 *            UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5
	 *            UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV
	 *            UNSIGNED_SHORT_5_6_5_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV
	 *            UNSIGNED_SHORT_4_4_4_4_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1},
	 *            {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV
	 *            UNSIGNED_SHORT_1_5_5_5_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV
	 *            UNSIGNED_INT_8_8_8_8_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_10_10_10_2
	 *            UNSIGNED_INT_10_10_10_2},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8
	 *            UNSIGNED_INT_24_8},
	 *            {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV
	 *            UNSIGNED_INT_10F_11F_11F_REV},
	 *            {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV
	 *            UNSIGNED_INT_5_9_9_9_REV},
	 *            {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV
	 *            FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels
	 *            the texel data
	 */
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, ByteBuffer pixels);

	/** Buffer object offset version of: {@link #glTexImage2D TexImage2D} */
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, long pixelsOffset);

	/** ShortBuffer version of: {@link #glTexImage2D TexImage2D} */
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, ShortBuffer pixels);

	/** IntBuffer version of: {@link #glTexImage2D TexImage2D} */
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, IntBuffer pixels);

	/** FloatBuffer version of: {@link #glTexImage2D TexImage2D} */
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, FloatBuffer pixels);

	/** DoubleBuffer version of: {@link #glTexImage2D TexImage2D} */
	public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format,
			int type, DoubleBuffer pixels);

	// --- [ glTexImage1D ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexImage1D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * One-dimensional version of {@link #glTexImage2D TexImage2D}}.
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_PROXY_TEXTURE_1D
	 *            PROXY_TEXTURE_1D}
	 * @param level
	 *            the level-of-detail number
	 * @param internalformat
	 *            the texture internal format
	 * @param width
	 *            the texture width
	 * @param border
	 *            the texture border width
	 * @param format
	 *            the texel data format
	 * @param type
	 *            the texel data type
	 * @param pixels
	 *            the texel data
	 */
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			ByteBuffer pixels);

	/** Buffer object offset version of: {@link #glTexImage1D TexImage1D} */
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			long pixelsOffset);

	/** ShortBuffer version of: {@link #glTexImage1D TexImage1D} */
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			ShortBuffer pixels);

	/** IntBuffer version of: {@link #glTexImage1D TexImage1D} */
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			IntBuffer pixels);

	/** FloatBuffer version of: {@link #glTexImage1D TexImage1D} */
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			FloatBuffer pixels);

	/** DoubleBuffer version of: {@link #glTexImage1D TexImage1D} */
	public void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type,
			DoubleBuffer pixels);

	// --- [ glCopyTexImage2D ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glCopyTexImage2D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Defines a two-dimensional texel array in exactly the manner of
	 * {@link #glTexImage2D TexImage2D}, except that the image data are taken
	 * from the framebuffer rather than from client memory.
	 * 
	 * <p>
	 * {@code x}, {@code y}, {@code width}, and {@code height} correspond
	 * precisely to the corresponding arguments to {@link #glReadPixels
	 * ReadPixels}; they specify the image's width and height, and the lower
	 * left (x, y) coordinates of the framebuffer region to be copied.
	 * </p>
	 * 
	 * <p>
	 * The image is taken from the framebuffer exactly as if these arguments
	 * were passed to {@link #glCopyPixels CopyPixels} with argument type set to
	 * {@link #GL_COLOR COLOR}, {@link #GL_DEPTH DEPTH}, or
	 * {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, depending on
	 * {@code internalformat}. RGBA data is taken from the current color buffer,
	 * while depth component and stencil index data are taken from the depth and
	 * stencil buffers, respectively.
	 * </p>
	 * 
	 * <p>
	 * Subsequent processing is identical to that described for
	 * {@link #glTexImage2D TexImage2D}, beginning with clamping of the R, G, B,
	 * A, or depth values, and masking of the stencil index values from the
	 * resulting pixel groups. Parameters {@code level}, {@code internalformat},
	 * and {@code border} are specified using the same values, with the same
	 * meanings, as the corresponding arguments of {@link #glTexImage2D
	 * TexImage2D}.
	 * </p>
	 * 
	 * <p>
	 * The constraints on width, height, and border are exactly those for the
	 * corresponding arguments of {@link #glTexImage2D TexImage2D}.
	 * </p>
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_2D TEXTURE_2D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level
	 *            the level-of-detail number
	 * @param internalFormat
	 *            the texture internal format. See {@link #glTexImage2D
	 *            TexImage2D} for a list of supported formats.
	 * @param x
	 *            the left framebuffer pixel coordinate
	 * @param y
	 *            the lower framebuffer pixel coordinate
	 * @param width
	 *            the texture width
	 * @param height
	 *            the texture height
	 * @param border
	 *            the texture border width
	 */
	public void glCopyTexImage2D(int target, int level, int internalFormat, int x, int y, int width, int height,
			int border);

	// --- [ glCopyTexImage1D ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glCopyTexImage1D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Defines a one-dimensional texel array in exactly the manner of
	 * {@link #glTexImage1D TexImage1D}, except that the image data are taken
	 * from the framebuffer rather than from client memory. For the purposes of
	 * decoding the texture image, {@code CopyTexImage1D} is equivalent to
	 * calling {@link #glCopyTexImage2D CopyTexImage2D} with corresponding
	 * arguments and height of 1, except that the height of the image is always
	 * 1, regardless of the value of border. level, internalformat, and border
	 * are specified using the same values, with the same meanings, as the
	 * corresponding arguments of {@link #glTexImage1D TexImage1D}. The
	 * constraints on width and border are exactly those of the corresponding
	 * arguments of {@link #glTexImage1D TexImage1D}.
	 *
	 * @param target
	 *            the texture target. Must be:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}
	 * @param level
	 *            the level-of-detail number
	 * @param internalFormat
	 *            the texture internal format. See {@link #glTexImage2D
	 *            TexImage2D} for a list of supported formats.
	 * @param x
	 *            the left framebuffer pixel coordinate
	 * @param y
	 *            the lower framebuffer pixel coordinate
	 * @param width
	 *            the texture width
	 * @param border
	 *            the texture border width
	 */
	public void glCopyTexImage1D(int target, int level, int internalFormat, int x, int y, int width, int border);

	// --- [ glCopyTexSubImage1D ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glCopyTexSubImage1D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change
	 * is made to the {@code internalformat}, {@code width} or {@code border}
	 * parameters of the specified texel array, nor is any change made to texel
	 * values outside the specified subregion. See {@link #glCopyTexImage1D
	 * CopyTexImage1D} for more details.
	 *
	 * @param target
	 *            the texture target. Must be:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}
	 * @param level
	 *            the level-of-detail number
	 * @param xoffset
	 *            the left texel coordinate of the texture subregion to update
	 * @param x
	 *            the left framebuffer pixel coordinate
	 * @param y
	 *            the lower framebuffer pixel coordinate
	 * @param width
	 *            the texture subregion width
	 */
	public void glCopyTexSubImage1D(int target, int level, int xoffset, int x, int y, int width);

	// --- [ glCopyTexSubImage2D ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man/html/glCopyTexSubImage2D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change
	 * is made to the {@code internalformat}, {@code width}, {@code height}, or
	 * {@code border} parameters of the specified texel array, nor is any change
	 * made to texel values outside the specified subregion. See
	 * {@link #glCopyTexImage2D CopyTexImage2D} for more details.
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_2D TEXTURE_2D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level
	 *            the level-of-detail number
	 * @param xoffset
	 *            the left texel coordinate of the texture subregion to update
	 * @param yoffset
	 *            the lower texel coordinate of the texture subregion to update
	 * @param x
	 *            the left framebuffer pixel coordinate
	 * @param y
	 *            the lower framebuffer pixel coordinate
	 * @param width
	 *            the texture subregion width
	 * @param height
	 *            the texture subregion height
	 */
	public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width,
			int height);

	// --- [ glTexParameteri ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexParameteri.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Sets the integer value of a texture parameter, which controls how the
	 * texel array is treated when specified or changed, and when applied to a
	 * fragment.
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}, {@link #GL_TEXTURE_2D
	 *            TEXTURE_2D}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP},
	 *            {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE},
	 *            {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY
	 *            TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param pname
	 *            the parameter to set. One of:<br>
	 *            {@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL},
	 *            {@link #GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR},
	 *            {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE},
	 *            {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC},
	 *            {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS},
	 *            {@link #GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER},
	 *            {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL},
	 *            {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD},
	 *            {@link #GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER},
	 *            {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD},
	 *            {@link #GL_TEXTURE_PRIORITY TEXTURE_PRIORITY},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A},
	 *            {@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA},
	 *            {@link #GL_TEXTURE_WRAP_S TEXTURE_WRAP_S},
	 *            {@link #GL_TEXTURE_WRAP_T TEXTURE_WRAP_T},
	 *            {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R},
	 *            {@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE},
	 *            {@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}
	 * @param param
	 *            the parameter value
	 */
	public void glTexParameteri(int target, int pname, int param);

	// --- [ glTexParameteriv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexParameter.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexParameteri TexParameteri}.
	 *
	 * @param target
	 *            the texture target
	 * @param pname
	 *            the parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glTexParameteriv(int target, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexParameteriv TexParameteriv} */
	public void glTexParameteriv(int target, int pname, IntBuffer params);

	// --- [ glTexParameterf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexParameterf.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Float version of {@link #glTexParameteri TexParameteri}.
	 *
	 * @param target
	 *            the texture target
	 * @param pname
	 *            the parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glTexParameterf(int target, int pname, float param);

	// --- [ glTexParameterfv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexParameter.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexParameterf TexParameterf}.
	 *
	 * @param target
	 *            the texture target
	 * @param pname
	 *            the parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glTexParameterfv(int target, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexParameterfv TexParameterfv} */
	public void glTexParameterfv(int target, int pname, FloatBuffer params);

	// --- [ glTexSubImage1D ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexSubImage1D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * One-dimensional version of {@link #glTexSubImage2D TexSubImage2D}.
	 *
	 * @param target
	 *            the texture target. Must be:<br>
	 *            {@link #GL_TEXTURE_1D TEXTURE_1D}
	 * @param level
	 *            the level-of-detail-number
	 * @param xoffset
	 *            the left coordinate of the texel subregion
	 * @param width
	 *            the subregion width
	 * @param format
	 *            the pixel data format. One of:<br>
	 *            {@link #GL_STENCIL_INDEX STENCIL_INDEX},
	 *            {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT},
	 *            {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED
	 *            RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE},
	 *            {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB
	 *            RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR},
	 *            {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE},
	 *            {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA},
	 *            {@link GL30#GL_RED_INTEGER RED_INTEGER},
	 *            {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER},
	 *            {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER},
	 *            {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER},
	 *            {@link GL30#GL_RG_INTEGER RG_INTEGER},
	 *            {@link GL30#GL_RGB_INTEGER RGB_INTEGER},
	 *            {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER},
	 *            {@link GL30#GL_BGR_INTEGER BGR_INTEGER},
	 *            {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type
	 *            the pixel data type. One of:<br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}
	 *            , {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT
	 *            SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT
	 *            INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT
	 *            FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2
	 *            UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV
	 *            UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5
	 *            UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV
	 *            UNSIGNED_SHORT_5_6_5_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV
	 *            UNSIGNED_SHORT_4_4_4_4_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1},
	 *            {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV
	 *            UNSIGNED_SHORT_1_5_5_5_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV
	 *            UNSIGNED_INT_8_8_8_8_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_10_10_10_2
	 *            UNSIGNED_INT_10_10_10_2},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8
	 *            UNSIGNED_INT_24_8},
	 *            {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV
	 *            UNSIGNED_INT_10F_11F_11F_REV},
	 *            {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV
	 *            UNSIGNED_INT_5_9_9_9_REV},
	 *            {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV
	 *            FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels
	 *            the pixel data
	 */
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			ByteBuffer pixels);

	/**
	 * Buffer object offset version of: {@link #glTexSubImage1D TexSubImage1D}
	 */
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			long pixelsOffset);

	/** ShortBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			ShortBuffer pixels);

	/** IntBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, IntBuffer pixels);

	/** FloatBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			FloatBuffer pixels);

	/** DoubleBuffer version of: {@link #glTexSubImage1D TexSubImage1D} */
	public void glTexSubImage1D(int target, int level, int xoffset, int width, int format, int type,
			DoubleBuffer pixels);

	// --- [ glTexSubImage2D ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexSubImage2D.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Respecifies a rectangular subregion of an existing texel array. No change
	 * is made to the internalformat, width, height, depth, or border parameters
	 * of the specified texel array, nor is any change made to texel values
	 * outside the specified subregion.
	 *
	 * @param target
	 *            the texture target. One of:<br>
	 *            {@link #GL_TEXTURE_2D TEXTURE_2D},
	 *            {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY},
	 *            {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE},
	 *            {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}
	 * @param level
	 *            the level-of-detail-number
	 * @param xoffset
	 *            the left coordinate of the texel subregion
	 * @param yoffset
	 *            the bottom coordinate of the texel subregion
	 * @param width
	 *            the subregion width
	 * @param height
	 *            the subregion height
	 * @param format
	 *            the pixel data format. One of:<br>
	 *            {@link #GL_STENCIL_INDEX STENCIL_INDEX},
	 *            {@link #GL_DEPTH_COMPONENT DEPTH_COMPONENT},
	 *            {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link #GL_RED
	 *            RED}, {@link #GL_GREEN GREEN}, {@link #GL_BLUE BLUE},
	 *            {@link #GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link #GL_RGB
	 *            RGB}, {@link #GL_RGBA RGBA}, {@link GL12#GL_BGR BGR},
	 *            {@link GL12#GL_BGRA BGRA}, {@link #GL_LUMINANCE LUMINANCE},
	 *            {@link #GL_LUMINANCE_ALPHA LUMINANCE_ALPHA},
	 *            {@link GL30#GL_RED_INTEGER RED_INTEGER},
	 *            {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER},
	 *            {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER},
	 *            {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER},
	 *            {@link GL30#GL_RG_INTEGER RG_INTEGER},
	 *            {@link GL30#GL_RGB_INTEGER RGB_INTEGER},
	 *            {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER},
	 *            {@link GL30#GL_BGR_INTEGER BGR_INTEGER},
	 *            {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type
	 *            the pixel data type. One of:<br>
	 *            {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link #GL_BYTE BYTE}
	 *            , {@link #GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link #GL_SHORT
	 *            SHORT}, {@link #GL_UNSIGNED_INT UNSIGNED_INT}, {@link #GL_INT
	 *            INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT
	 *            FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2
	 *            UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV
	 *            UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5
	 *            UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV
	 *            UNSIGNED_SHORT_5_6_5_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4},
	 *            {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV
	 *            UNSIGNED_SHORT_4_4_4_4_REV},
	 *            {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1},
	 *            {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV
	 *            UNSIGNED_SHORT_1_5_5_5_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8},
	 *            {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV
	 *            UNSIGNED_INT_8_8_8_8_REV},
	 *            {@link GL12#GL_UNSIGNED_INT_10_10_10_2
	 *            UNSIGNED_INT_10_10_10_2},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8
	 *            UNSIGNED_INT_24_8},
	 *            {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV
	 *            UNSIGNED_INT_10F_11F_11F_REV},
	 *            {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV
	 *            UNSIGNED_INT_5_9_9_9_REV},
	 *            {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV
	 *            FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link #GL_BITMAP BITMAP}
	 * @param pixels
	 *            the pixel data
	 */
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, ByteBuffer pixels);

	/**
	 * Buffer object offset version of: {@link #glTexSubImage2D TexSubImage2D}
	 */
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, long pixelsOffset);

	/** ShortBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, ShortBuffer pixels);

	/** IntBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, IntBuffer pixels);

	/** FloatBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, FloatBuffer pixels);

	/** DoubleBuffer version of: {@link #glTexSubImage2D TexSubImage2D} */
	public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format,
			int type, DoubleBuffer pixels);

	// --- [ glViewport ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glViewport.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Specifies the viewport transformation parameters for all viewports.
	 * 
	 * <p>
	 * The location of the viewport's bottom-left corner, given by
	 * {@code (x, y)}, are clamped to be within the implementation-dependent
	 * viewport bounds range. The viewport bounds range {@code [min, max]} tuple
	 * may be determined by calling {@link #glGetFloat GetFloat} with the
	 * symbolic constant {@link GL41#GL_VIEWPORT_BOUNDS_RANGE
	 * VIEWPORT_BOUNDS_RANGE}. Viewport width and height are clamped to
	 * implementation-dependent maximums when specified. The maximum width and
	 * height may be found by calling {@link #glGetFloat GetFloat} with the
	 * symbolic constant {@link #GL_MAX_VIEWPORT_DIMS MAX_VIEWPORT_DIMS}. The
	 * maximum viewport dimensions must be greater than or equal to the larger
	 * of the visible dimensions of the display being rendered to (if a display
	 * exists), and the largest renderbuffer image which can be successfully
	 * created and attached to a framebuffer object.
	 * </p>
	 * 
	 * <p>
	 * In the initial state, {@code w} and {@code h} for each viewport are set
	 * to the width and height, respectively, of the window into which the GL is
	 * to do its rendering. If the default framebuffer is bound but no default
	 * framebuffer is associated with the GL context, then {@code w} and
	 * {@code h} are initially set to zero.
	 * </p>
	 *
	 * @param x
	 *            the left viewport coordinate
	 * @param y
	 *            the bottom viewport coordinate
	 * @param w
	 *            the viewport width
	 * @param h
	 *            the viewport height
	 */
	public void glViewport(int x, int y, int w, int h);
}