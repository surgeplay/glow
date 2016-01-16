package com.surgeplay.glow.gl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import org.lwjgl.PointerBuffer;

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

	// --- [ glAccum ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glAccum.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Each portion of a pixel in the accumulation buffer consists of four
	 * values: one for each of R, G, B, and A. The accumulation buffer is
	 * controlled exclusively through the use of this method (except for
	 * clearing it).
	 *
	 * @param op
	 *            a symbolic constant indicating an accumulation buffer
	 *            operation
	 * @param value
	 *            a floating-point value to be used in that operation. One of:
	 *            <br>
	 *            {@link #GL_ACCUM ACCUM}, {@link #GL_LOAD LOAD},
	 *            {@link #GL_RETURN RETURN}, {@link #GL_MULT MULT},
	 *            {@link #GL_ADD ADD}
	 */
	public void glAccum(int op, float value);

	// --- [ glAlphaFunc ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glAlphaFunc.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * The alpha test discards a fragment conditionally based on the outcome of
	 * a comparison between the incoming fragment’s alpha value and a constant
	 * value. The comparison is enabled or disabled with the generic
	 * {@link #glEnable Enable} and {@link #glDisable Disable} commands using
	 * the symbolic constant {@link #GL_ALPHA_TEST ALPHA_TEST}. When disabled,
	 * it is as if the comparison always passes. The test is controlled with
	 * this method.
	 *
	 * @param func
	 *            a symbolic constant indicating the alpha test function. One
	 *            of:<br>
	 *            {@link #GL_NEVER NEVER}, {@link #GL_ALWAYS ALWAYS},
	 *            {@link #GL_LESS LESS}, {@link #GL_LEQUAL LEQUAL},
	 *            {@link #GL_EQUAL EQUAL}, {@link #GL_GEQUAL GEQUAL},
	 *            {@link #GL_GREATER GREATER}, {@link #GL_NOTEQUAL NOTEQUAL}
	 * @param ref
	 *            a reference value clamped to the range [0, 1]. When performing
	 *            the alpha test, the GL will convert the reference value to the
	 *            same representation as the fragment's alpha value
	 *            (floating-point or fixed-point).
	 */
	public void glAlphaFunc(int func, float ref);

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

	// --- [ glBegin ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glBegin.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Begins the definition of vertex attributes of a sequence of primitives to
	 * be transferred to the GL.
	 *
	 * @param mode
	 *            the primitive type being defined. One of:<br>
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
	 */
	public void glBegin(int mode);

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

	// --- [ glBitmap ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glBitmap.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sents a bitmap to the GL. Bitmaps are rectangles of zeros and ones
	 * specifying a particular pattern of fragments to be produced. Each of
	 * these fragments has the same associated data. These data are those
	 * associated with the current raster position.
	 *
	 * @param w
	 *            the bitmap width
	 * @param h
	 *            the bitmap width
	 * @param xOrig
	 *            the bitmap origin x coordinate
	 * @param yOrig
	 *            the bitmap origin y coordinate
	 * @param xInc
	 *            the x increment added to the raster position
	 * @param yInc
	 *            the y increment added to the raster position
	 * @param data
	 *            the buffer containing the bitmap data.
	 */
	public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, ByteBuffer data);

	/** Buffer object offset version of: {@link #glBitmap Bitmap} */
	public void glBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long dataOffset);

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

	// --- [ glCallList ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glCallList.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Executes a display list. Causes the commands saved in the display list to
	 * be executed, in order, just as if they were issued without using a
	 * display list.
	 *
	 * @param list
	 *            the index of the display list to be called
	 */
	public void glCallList(int list);

	// --- [ glCallLists ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glCallLists.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Provides an efficient means for executing a number of display lists.
	 *
	 * @param n
	 *            the number of display lists to be called
	 * @param type
	 *            the data type of each element in {@code lists}. One of:<br>
	 *            {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}
	 *            , {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_SHORT
	 *            UNSIGNED_SHORT}, {@link #GL_INT INT}, {@link #GL_UNSIGNED_INT
	 *            UNSIGNED_INT}, {@link #GL_FLOAT FLOAT}, {@link #GL_2_BYTES
	 *            2_BYTES}, {@link #GL_3_BYTES 3_BYTES}, {@link #GL_4_BYTES
	 *            4_BYTES}
	 * @param lists
	 *            an array of offsets. Each offset is added to the display list
	 *            base to obtain the display list number.
	 */
	public void glCallLists(int n, int type, ByteBuffer lists);

	/** Alternative version of: {@link #glCallLists CallLists} */
	public void glCallLists(int type, ByteBuffer lists);

	/** GL_UNSIGNED_BYTE version of: {@link #glCallLists CallLists} */
	public void glCallLists(ByteBuffer lists);

	/** GL_UNSIGNED_SHORT version of: {@link #glCallLists CallLists} */
	public void glCallLists(ShortBuffer lists);

	/** GL_UNSIGNED_INT version of: {@link #glCallLists CallLists} */
	public void glCallLists(IntBuffer lists);

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

	// --- [ glClearAccum ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glClearAccum.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the clear values for the accumulation buffer. These values are
	 * clamped to the range [-1,1] when they are specified.
	 *
	 * @param red
	 *            the value to which to clear the R values of the accumulation
	 *            buffer
	 * @param green
	 *            the value to which to clear the G values of the accumulation
	 *            buffer
	 * @param blue
	 *            the value to which to clear the B values of the accumulation
	 *            buffer
	 * @param alpha
	 *            the value to which to clear the A values of the accumulation
	 *            buffer
	 */
	public void glClearAccum(float red, float green, float blue, float alpha);

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

	// --- [ glClearIndex ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glClearIndex.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * sets the clear color index. index is converted to a fixed-point value
	 * with unspecified precision to the left of the binary point; the integer
	 * part of this value is then masked with
	 * <code style="font-family: monospace">2<sup>m</sup> &ndash; 1</code>,
	 * where {@code m} is the number of bits in a color index value stored in
	 * the framebuffer.
	 *
	 * @param index
	 *            the value to which to clear the color buffer in color index
	 *            mode
	 */
	public void glClearIndex(float index);

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

	// --- [ glClipPlane ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glClipPlane.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Specifies a client-defined clip plane.
	 * 
	 * <p>
	 * The value of the first argument, {@code plane}, is a symbolic constant,
	 * CLIP_PLANEi, where i is an integer between 0 and n &ndash; 1, indicating
	 * one of n client-defined clip planes. {@code equation} is an array of four
	 * double-precision floating-point values. These are the coefficients of a
	 * plane equation in object coordinates: p1, p2, p3, and p4 (in that order).
	 * </p>
	 *
	 * @param plane
	 *            the clip plane to define
	 * @param equation
	 *            the clip plane coefficients
	 */
	public void glClipPlane(int plane, ByteBuffer equation);

	/** Alternative version of: {@link #glClipPlane ClipPlane} */
	public void glClipPlane(int plane, DoubleBuffer equation);

	// --- [ glColor3b ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3b.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the R, G, and B components of the current color. The alpha component
	 * is set to 1.0.
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3b(byte red, byte green, byte blue);

	// --- [ glColor3s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3s.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3s(short red, short green, short blue);

	// --- [ glColor3i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3i.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3i(int red, int green, int blue);

	// --- [ glColor3f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3f.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3f(float red, float green, float blue);

	// --- [ glColor3d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3d.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3d(double red, double green, double blue);

	// --- [ glColor3ub ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3ub.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3ub(byte red, byte green, byte blue);

	// --- [ glColor3us ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3us.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned short version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3us(short red, short green, short blue);

	// --- [ glColor3ui ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3ui.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned int version of {@link #glColor3b Color3b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 */
	public void glColor3ui(int red, int green, int blue);

	// --- [ glColor3bv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3b.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Byte pointer version of {@link #glColor3b Color3b}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3bv(ByteBuffer v);

	// --- [ glColor3sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3s Color3s}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3sv(ByteBuffer v);

	/** Alternative version of: {@link #glColor3sv Color3sv} */
	public void glColor3sv(ShortBuffer v);

	// --- [ glColor3iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3i Color3i}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3iv(ByteBuffer v);

	/** Alternative version of: {@link #glColor3iv Color3iv} */
	public void glColor3iv(IntBuffer v);

	// --- [ glColor3fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3f Color3f}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3fv(ByteBuffer v);

	/** Alternative version of: {@link #glColor3fv Color3fv} */
	public void glColor3fv(FloatBuffer v);

	// --- [ glColor3dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3d Color3d}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3dv(ByteBuffer v);

	/** Alternative version of: {@link #glColor3dv Color3dv} */
	public void glColor3dv(DoubleBuffer v);

	// --- [ glColor3ubv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3ub.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3ub Color3ub}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3ubv(ByteBuffer v);

	// --- [ glColor3usv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3us Color3us}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3usv(ByteBuffer v);

	/** Alternative version of: {@link #glColor3usv Color3usv} */
	public void glColor3usv(ShortBuffer v);

	// --- [ glColor3uiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor3ui Color3ui}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor3uiv(ByteBuffer v);

	/** Alternative version of: {@link #glColor3uiv Color3uiv} */
	public void glColor3uiv(IntBuffer v);

	// --- [ glColor4b ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4b.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current color.
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4b(byte red, byte green, byte blue, byte alpha);

	// --- [ glColor4s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4s.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4s(short red, short green, short blue, short alpha);

	// --- [ glColor4i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4i.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4i(int red, int green, int blue, int alpha);

	// --- [ glColor4f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4f.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4f(float red, float green, float blue, float alpha);

	// --- [ glColor4d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4d.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4d(double red, double green, double blue, double alpha);

	// --- [ glColor4ub ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4ub.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4ub(byte red, byte green, byte blue, byte alpha);

	// --- [ glColor4us ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4us.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned short version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4us(short red, short green, short blue, short alpha);

	// --- [ glColor4ui ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4ui.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned int version of {@link #glColor4b Color4b}
	 *
	 * @param red
	 *            the red component of the current color
	 * @param green
	 *            the green component of the current color
	 * @param blue
	 *            the blue component of the current color
	 * @param alpha
	 *            the alpha component of the current color
	 */
	public void glColor4ui(int red, int green, int blue, int alpha);

	// --- [ glColor4bv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4b.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4b Color4b}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4bv(ByteBuffer v);

	// --- [ glColor4sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4s Color4s}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4sv(ByteBuffer v);

	/** Alternative version of: {@link #glColor4sv Color4sv} */
	public void glColor4sv(ShortBuffer v);

	// --- [ glColor4iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4i Color4i}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4iv(ByteBuffer v);

	/** Alternative version of: {@link #glColor4iv Color4iv} */
	public void glColor4iv(IntBuffer v);

	// --- [ glColor4fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4f Color4f}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4fv(ByteBuffer v);

	/** Alternative version of: {@link #glColor4fv Color4fv} */
	public void glColor4fv(FloatBuffer v);

	// --- [ glColor4dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4d Color4d}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4dv(ByteBuffer v);

	/** Alternative version of: {@link #glColor4dv Color4dv} */
	public void glColor4dv(DoubleBuffer v);

	// --- [ glColor4ubv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4ub.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4ub Color4ub}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4ubv(ByteBuffer v);

	// --- [ glColor4usv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4us Color4us}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4usv(ByteBuffer v);

	/** Alternative version of: {@link #glColor4usv Color4usv} */
	public void glColor4usv(ShortBuffer v);

	// --- [ glColor4uiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColor4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glColor4ui Color4ui}.
	 *
	 * @param v
	 *            the color buffer
	 */
	public void glColor4uiv(ByteBuffer v);

	/** Alternative version of: {@link #glColor4uiv Color4uiv} */
	public void glColor4uiv(IntBuffer v);

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

	// --- [ glColorMaterial ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColorMaterial.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * It is possible to attach one or more material properties to the current
	 * color, so that they continuously track its component values. This
	 * behavior is enabled and disabled by calling {@link #glEnable Enable} or
	 * {@link #glDisable Disable} with the symbolic value
	 * {@link #GL_COLOR_MATERIAL COLOR_MATERIAL}. This function controls which
	 * of these modes is selected.
	 *
	 * @param face
	 *            specifies which material face is affected by the current
	 *            color. One of:<br>
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK},
	 *            {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param mode
	 *            specifies which material property or properties track the
	 *            current color. One of:<br>
	 *            {@link #GL_EMISSION EMISSION}, {@link #GL_AMBIENT AMBIENT},
	 *            {@link #GL_DIFFUSE DIFFUSE}, {@link #GL_SPECULAR SPECULAR},
	 *            {@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE}
	 */
	public void glColorMaterial(int face, int mode);

	// --- [ glColorPointer ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glColorPointer.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies the location and organization of a color array.
	 *
	 * @param size
	 *            the number of values per vertex that are stored in the array,
	 *            as well as their component ordering. One of:<br>
	 *            3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type
	 *            the data type of the values stored in the array. One of:<br>
	 *            {@link #GL_BYTE BYTE}, {@link #GL_UNSIGNED_BYTE UNSIGNED_BYTE}
	 *            , {@link #GL_SHORT SHORT}, {@link #GL_UNSIGNED_SHORT
	 *            UNSIGNED_SHORT}, {@link #GL_INT INT}, {@link #GL_UNSIGNED_INT
	 *            UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT},
	 *            {@link #GL_FLOAT FLOAT}, {@link #GL_DOUBLE DOUBLE},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV},
	 *            {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the color array data
	 */
	public void glColorPointer(int size, int type, int stride, ByteBuffer pointer);

	/** Buffer object offset version of: {@link #glColorPointer ColorPointer} */
	public void glColorPointer(int size, int type, int stride, long pointerOffset);

	/** ShortBuffer version of: {@link #glColorPointer ColorPointer} */
	public void glColorPointer(int size, int type, int stride, ShortBuffer pointer);

	/** IntBuffer version of: {@link #glColorPointer ColorPointer} */
	public void glColorPointer(int size, int type, int stride, IntBuffer pointer);

	/** FloatBuffer version of: {@link #glColorPointer ColorPointer} */
	public void glColorPointer(int size, int type, int stride, FloatBuffer pointer);

	// --- [ glCopyPixels ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glCopyPixels.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Transfers a rectangle of pixel values from one region of the read
	 * framebuffer to another in the draw framebuffer
	 *
	 * @param x
	 *            the left framebuffer pixel coordinate
	 * @param y
	 *            the lower framebuffer pixel coordinate
	 * @param width
	 *            the rectangle width
	 * @param height
	 *            the rectangle height
	 * @param type
	 *            Indicates the type of values to be transfered. One of:<br>
	 *            {@link #GL_COLOR COLOR}, {@link #GL_STENCIL STENCIL},
	 *            {@link #GL_DEPTH DEPTH}, {@link GL30#GL_DEPTH_STENCIL
	 *            DEPTH_STENCIL}
	 */
	public void glCopyPixels(int x, int y, int width, int height, int type);

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

	// --- [ glDeleteLists ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glDeleteLists.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Deletes a contiguous group of display lists. All information about the
	 * display lists is lost, and the indices become unused. Indices to which no
	 * display list corresponds are ignored. If {@code range} is zero, nothing
	 * happens.
	 *
	 * @param list
	 *            the index of the first display list to be deleted
	 * @param range
	 *            the number of display lists to be deleted
	 */
	public void glDeleteLists(int list, int range);

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

	// --- [ glDrawPixels ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glDrawPixels.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Draws a pixel rectangle to the active draw buffers.
	 *
	 * @param width
	 *            the pixel rectangle width
	 * @param height
	 *            the pixel rectangle height
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
	public void glDrawPixels(int width, int height, int format, int type, ByteBuffer pixels);

	/** Buffer object offset version of: {@link #glDrawPixels DrawPixels} */
	public void glDrawPixels(int width, int height, int format, int type, long pixelsOffset);

	/** ShortBuffer version of: {@link #glDrawPixels DrawPixels} */
	public void glDrawPixels(int width, int height, int format, int type, ShortBuffer pixels);

	/** IntBuffer version of: {@link #glDrawPixels DrawPixels} */
	public void glDrawPixels(int width, int height, int format, int type, IntBuffer pixels);

	/** FloatBuffer version of: {@link #glDrawPixels DrawPixels} */
	public void glDrawPixels(int width, int height, int format, int type, FloatBuffer pixels);

	// --- [ glEdgeFlag ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEdgeFlag.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Each edge of each polygon primitive generated is flagged as either
	 * boundary or non-boundary. These classifications are used during polygon
	 * rasterization; some modes affect the interpretation of polygon boundary
	 * edges. By default, all edges are boundary edges, but the flagging of
	 * polygons, separate triangles, or separate quadrilaterals may be altered
	 * by calling this function.
	 * 
	 * <p>
	 * When a primitive of type {@link #GL_POLYGON POLYGON},
	 * {@link #GL_TRIANGLES TRIANGLES}, or {@link #GL_QUADS QUADS} is drawn,
	 * each vertex transferred begins an edge. If the edge flag bit is TRUE,
	 * then each specified vertex begins an edge that is flagged as boundary. If
	 * the bit is FALSE, then induced edges are flagged as non-boundary.
	 * </p>
	 *
	 * @param flag
	 *            the edge flag bit
	 */
	public void glEdgeFlag(boolean flag);

	// --- [ glEdgeFlagv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEdgeFlag.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glEdgeFlag EdgeFlag}.
	 *
	 * @param flag
	 *            the edge flag buffer
	 */
	public void glEdgeFlagv(ByteBuffer flag);

	// --- [ glEdgeFlagPointer ] ---



	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glEdgeFlagPointer.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies the location and organization of an edge flag array.
	 *
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the edge flag array data
	 */
	public void glEdgeFlagPointer(int stride, ByteBuffer pointer);

	/**
	 * Buffer object offset version of: {@link #glEdgeFlagPointer
	 * EdgeFlagPointer}
	 */
	public void glEdgeFlagPointer(int stride, long pointerOffset);

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

	// --- [ glEnd ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEnd.xhtml">OpenGL SDK
	 * Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Ends the definition of vertex attributes of a sequence of primitives to
	 * be transferred to the GL.
	 */
	public void glEnd();

	// --- [ glEvalCoord1f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Causes evaluation of the enabled one-dimensional evaluator maps.
	 *
	 * @param u
	 *            the domain coordinate u
	 */
	public void glEvalCoord1f(float u);

	// --- [ glEvalCoord1fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glEvalCoord1f EvalCoord1f}.
	 *
	 * @param u
	 *            the domain coordinate buffer
	 */
	public void glEvalCoord1fv(ByteBuffer u);

	/** Alternative version of: {@link #glEvalCoord1fv EvalCoord1fv} */
	public void glEvalCoord1fv(FloatBuffer u);

	// --- [ glEvalCoord1d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glEvalCoord1f EvalCoord1f}.
	 *
	 * @param u
	 *            the domain coordinate u
	 */
	public void glEvalCoord1d(double u);

	// --- [ glEvalCoord1dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glEvalCoord1d EvalCoord1d}.
	 *
	 * @param u
	 *            the domain coordinate buffer
	 */
	public void glEvalCoord1dv(ByteBuffer u);

	/** Alternative version of: {@link #glEvalCoord1dv EvalCoord1dv} */
	public void glEvalCoord1dv(DoubleBuffer u);

	// --- [ glEvalCoord2f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Causes evaluation of the enabled two-dimensional evaluator maps.
	 *
	 * @param u
	 *            the domain coordinate u
	 * @param v
	 *            the domain coordinate v
	 */
	public void glEvalCoord2f(float u, float v);

	// --- [ glEvalCoord2fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glEvalCoord2f EvalCoord2f}.
	 *
	 * @param u
	 *            the domain coordinate buffer
	 */
	public void glEvalCoord2fv(ByteBuffer u);

	/** Alternative version of: {@link #glEvalCoord2fv EvalCoord2fv} */
	public void glEvalCoord2fv(FloatBuffer u);

	// --- [ glEvalCoord2d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glEvalCoord2f EvalCoord2f}.
	 *
	 * @param u
	 *            the domain coordinate u
	 * @param v
	 *            the domain coordinate v
	 */
	public void glEvalCoord2d(double u, double v);

	// --- [ glEvalCoord2dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalCoord2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glEvalCoord2d EvalCoord2d}.
	 *
	 * @param u
	 *            the domain coordinate buffer
	 */
	public void glEvalCoord2dv(ByteBuffer u);

	/** Alternative version of: {@link #glEvalCoord2dv EvalCoord2dv} */
	public void glEvalCoord2dv(DoubleBuffer u);

	// --- [ glEvalMesh1 ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalMesh1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Carries out an evaluation on a subset of the one-dimensional map grid.
	 *
	 * @param mode
	 *            the mesh type. One of:<br>
	 *            {@link #GL_POINT POINT}, {@link #GL_LINE LINE}
	 * @param i1
	 *            the start index
	 * @param i2
	 *            the end index
	 */
	public void glEvalMesh1(int mode, int i1, int i2);

	// --- [ glEvalMesh2 ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalMesh2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Carries out an evaluation on a rectangular subset of the two-dimensional
	 * map grid.
	 *
	 * @param mode
	 *            the mesh type. One of:<br>
	 *            {@link #GL_FILL FILL}, {@link #GL_LINE LINE}, {@link #GL_POINT
	 *            POINT}
	 * @param i1
	 *            the u-dimension start index
	 * @param i2
	 *            the u-dimension end index
	 * @param j1
	 *            the v-dimension start index
	 * @param j2
	 *            the v-dimension end index
	 */
	public void glEvalMesh2(int mode, int i1, int i2, int j1, int j2);

	// --- [ glEvalPoint1 ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalPoint1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Carries out an evalutation of a single point on the one-dimensional map
	 * grid.
	 *
	 * @param i
	 *            the grid index
	 */
	public void glEvalPoint1(int i);

	// --- [ glEvalPoint2 ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEvalPoint2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Carries out an evalutation of a single point on the two-dimensional map
	 * grid.
	 *
	 * @param i
	 *            the u-dimension grid index
	 * @param j
	 *            the v-dimension grid index
	 */
	public void glEvalPoint2(int i, int j);

	// --- [ glFeedbackBuffer ] ---



	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glFeedbackBuffer.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns information about primitives when the GL is in feedback mode.
	 *
	 * @param size
	 *            the maximum number of values that can be written to
	 *            {@code buffer}
	 * @param type
	 *            the type of information to feed back for each vertex. One of:
	 *            <br>
	 *            {@link #GL_2D 2D}, {@link #GL_3D 3D}, {@link #GL_3D_COLOR
	 *            3D_COLOR}, {@link #GL_3D_COLOR_TEXTURE 3D_COLOR_TEXTURE},
	 *            {@link #GL_4D_COLOR_TEXTURE 4D_COLOR_TEXTURE}
	 * @param buffer
	 *            an array of floating-point values into which feedback
	 *            information will be placed
	 */
	public void glFeedbackBuffer(int size, int type, ByteBuffer buffer);

	/** Alternative version of: {@link #glFeedbackBuffer FeedbackBuffer} */
	public void glFeedbackBuffer(int type, FloatBuffer buffer);

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

	// --- [ glFogi ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glFogi.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the integer value of a fog parameter.
	 *
	 * @param pname
	 *            the fog parameter. One of:<br>
	 *            {@link #GL_FOG_MODE FOG_MODE}, {@link GL15#GL_FOG_COORD_SRC
	 *            FOG_COORD_SRC}
	 * @param param
	 *            the fog parameter value. One of:<br>
	 *            {@link #GL_EXP EXP}, {@link #GL_EXP2 EXP2}, {@link #GL_LINEAR
	 *            LINEAR}, {@link GL14#GL_FRAGMENT_DEPTH FRAGMENT_DEPTH},
	 *            {@link GL15#GL_FOG_COORD FOG_COORD}
	 */
	public void glFogi(int pname, int param);

	// --- [ glFogiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glFog.xhtml">OpenGL SDK
	 * Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glFogi Fogi}.
	 *
	 * @param pname
	 *            the fog parameter. One of:<br>
	 *            {@link #GL_FOG_MODE FOG_MODE}, {@link GL15#GL_FOG_COORD_SRC
	 *            FOG_COORD_SRC}
	 * @param params
	 *            the fog parameter buffer
	 */
	public void glFogiv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glFogiv Fogiv} */
	public void glFogiv(int pname, IntBuffer params);

	// --- [ glFogf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glFogf.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the float value of a fog parameter.
	 *
	 * @param pname
	 *            the fog parameter. One of:<br>
	 *            {@link #GL_FOG_DENSITY FOG_DENSITY}, {@link #GL_FOG_START
	 *            FOG_START}, {@link #GL_FOG_END FOG_END}
	 * @param param
	 *            the fog parameter value
	 */
	public void glFogf(int pname, float param);

	// --- [ glFogfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glFog.xhtml">OpenGL SDK
	 * Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glFogf Fogf}.
	 *
	 * @param pname
	 *            the fog parameter. One of:<br>
	 *            {@link #GL_FOG_DENSITY FOG_DENSITY}, {@link #GL_FOG_START
	 *            FOG_START}, {@link #GL_FOG_END FOG_END}
	 * @param params
	 *            the fog parameter buffer
	 */
	public void glFogfv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glFogfv Fogfv} */
	public void glFogfv(int pname, FloatBuffer params);

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

	// --- [ glGenLists ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGenLists.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns an integer n such that the indices {@code n,..., n + s - 1} are
	 * previously unused (i.e. there are {@code s} previously unused display
	 * list indices starting at n). {@code GenLists} also has the effect of
	 * creating an empty display list for each of the indices
	 * {@code n,..., n + s - 1}, so that these indices all become used.
	 * {@code GenLists} returns zero if there is no group of {@code s}
	 * contiguous previously unused display list indices, or if {@code s = 0}.
	 *
	 * @param s
	 *            the number of display lists to create
	 */
	public int glGenLists(int s);

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

	// --- [ glGetClipPlane ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGetClipPlane.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Returns four double-precision values in {@code equation}; these are the
	 * coefficients of the plane equation of plane in eye coordinates (these
	 * coordinates are those that were computed when the plane was specified).
	 *
	 * @param plane
	 *            the clip plane
	 * @param equation
	 *            a buffer in which to place the returned values
	 */
	public void glGetClipPlane(int plane, ByteBuffer equation);

	/** Alternative version of: {@link #glGetClipPlane GetClipPlane} */
	public void glGetClipPlane(int plane, DoubleBuffer equation);

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

	// --- [ glGetLightiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetLight.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns integer information about light parameter {@code pname} for
	 * {@code light} in {@code data}.
	 *
	 * @param light
	 *            the light for which to return information. One of:<br>
	 *            {@link #GL_LIGHT0 LIGHT0}, GL_LIGHT[1-7]
	 * @param pname
	 *            the light parameter to query. One of:<br>
	 *            {@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE},
	 *            {@link #GL_SPECULAR SPECULAR}, {@link #GL_POSITION POSITION},
	 *            {@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION},
	 *            {@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION},
	 *            {@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION},
	 *            {@link #GL_SPOT_DIRECTION SPOT_DIRECTION},
	 *            {@link #GL_SPOT_EXPONENT SPOT_EXPONENT},
	 *            {@link #GL_SPOT_CUTOFF SPOT_CUTOFF}
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetLightiv(int light, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetLightiv GetLightiv} */
	public void glGetLightiv(int light, int pname, IntBuffer data);

	/** Single return value version of: {@link #glGetLightiv GetLightiv} */
	public int glGetLighti(int light, int pname);

	// --- [ glGetLightfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetLight.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glGetLightiv GetLightiv}.
	 *
	 * @param light
	 *            the light for which to return information
	 * @param pname
	 *            the light parameter to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetLightfv(int light, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetLightfv GetLightfv} */
	public void glGetLightfv(int light, int pname, FloatBuffer data);

	/** Single return value version of: {@link #glGetLightfv GetLightfv} */
	public float glGetLightf(int light, int pname);

	// --- [ glGetMapiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetMap.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns integer information about {@code query} for evaluator map
	 * {@code target} in {@code data}.
	 *
	 * @param target
	 *            the evaluator target. One of:<br>
	 *            {@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3},
	 *            {@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4},
	 *            {@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}, {@link #GL_MAP1_NORMAL
	 *            MAP1_NORMAL}, {@link #GL_MAP1_TEXTURE_COORD_1
	 *            MAP1_TEXTURE_COORD_1}, {@link #GL_MAP1_TEXTURE_COORD_2
	 *            MAP1_TEXTURE_COORD_2}, {@link #GL_MAP1_TEXTURE_COORD_3
	 *            MAP1_TEXTURE_COORD_3}, {@link #GL_MAP1_TEXTURE_COORD_4
	 *            MAP1_TEXTURE_COORD_4}, {@link #GL_MAP2_VERTEX_3 MAP2_VERTEX_3}
	 *            , {@link #GL_MAP2_VERTEX_4 MAP2_VERTEX_4},
	 *            {@link #GL_MAP2_COLOR_4 MAP2_COLOR_4}, {@link #GL_MAP2_NORMAL
	 *            MAP2_NORMAL}, {@link #GL_MAP2_TEXTURE_COORD_1
	 *            MAP2_TEXTURE_COORD_1}, {@link #GL_MAP2_TEXTURE_COORD_2
	 *            MAP2_TEXTURE_COORD_2}, {@link #GL_MAP2_TEXTURE_COORD_3
	 *            MAP2_TEXTURE_COORD_3}, {@link #GL_MAP2_TEXTURE_COORD_4
	 *            MAP2_TEXTURE_COORD_4}
	 * @param query
	 *            the information to query. One of:<br>
	 *            {@link #GL_ORDER ORDER}, {@link #GL_COEFF COEFF},
	 *            {@link #GL_DOMAIN DOMAIN}
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetMapiv(int target, int query, ByteBuffer data);

	/** Alternative version of: {@link #glGetMapiv GetMapiv} */
	public void glGetMapiv(int target, int query, IntBuffer data);

	/** Single return value version of: {@link #glGetMapiv GetMapiv} */
	public int glGetMapi(int target, int query);

	// --- [ glGetMapfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetMap.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target
	 *            the evaluator map
	 * @param query
	 *            the information to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetMapfv(int target, int query, ByteBuffer data);

	/** Alternative version of: {@link #glGetMapfv GetMapfv} */
	public void glGetMapfv(int target, int query, FloatBuffer data);

	/** Single return value version of: {@link #glGetMapfv GetMapfv} */
	public float glGetMapf(int target, int query);

	// --- [ glGetMapdv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetMap.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glGetMapiv GetMapiv}.
	 *
	 * @param target
	 *            the evaluator map
	 * @param query
	 *            the information to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetMapdv(int target, int query, ByteBuffer data);

	/** Alternative version of: {@link #glGetMapdv GetMapdv} */
	public void glGetMapdv(int target, int query, DoubleBuffer data);

	/** Single return value version of: {@link #glGetMapdv GetMapdv} */
	public double glGetMapd(int target, int query);

	// --- [ glGetMaterialiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetMaterial.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns integer information about material property {@code pname} for
	 * {@code face} in {@code data}.
	 *
	 * @param face
	 *            the material face for which to return information. One of:<br>
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK}
	 * @param pname
	 *            the information to query. One of:<br>
	 *            {@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE},
	 *            {@link #GL_SPECULAR SPECULAR}, {@link #GL_EMISSION EMISSION},
	 *            {@link #GL_SHININESS SHININESS}
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetMaterialiv(int face, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetMaterialiv GetMaterialiv} */
	public void glGetMaterialiv(int face, int pname, IntBuffer data);

	// --- [ glGetMaterialfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetMaterial.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glGetMaterialiv GetMaterialiv}.
	 *
	 * @param face
	 *            the material face for which to return information
	 * @param pname
	 *            the information to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetMaterialfv(int face, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetMaterialfv GetMaterialfv} */
	public void glGetMaterialfv(int face, int pname, FloatBuffer data);

	// --- [ glGetPixelMapfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetPixelMap.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns all float values in the pixel map {@code map} in {@code data}.
	 *
	 * @param map
	 *            the pixel map parameter to query. One of:<br>
	 *            {@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I},
	 *            {@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S},
	 *            {@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R},
	 *            {@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G},
	 *            {@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B},
	 *            {@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A},
	 *            {@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R},
	 *            {@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G},
	 *            {@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B},
	 *            {@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}
	 * @param data
	 *            a buffer in which to place the returned data
	 */
	public void glGetPixelMapfv(int map, ByteBuffer data);

	/**
	 * Buffer object offset version of: {@link #glGetPixelMapfv GetPixelMapfv}
	 */
	public void glGetPixelMapfv(int map, long dataOffset);

	/** Alternative version of: {@link #glGetPixelMapfv GetPixelMapfv} */
	public void glGetPixelMapfv(int map, FloatBuffer data);

	// --- [ glGetPixelMapusv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetPixelMap.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned short version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map
	 *            the pixel map parameter to query
	 * @param data
	 *            a buffer in which to place the returned data
	 */
	public void glGetPixelMapusv(int map, ByteBuffer data);

	/**
	 * Buffer object offset version of: {@link #glGetPixelMapusv GetPixelMapusv}
	 */
	public void glGetPixelMapusv(int map, long dataOffset);

	/** Alternative version of: {@link #glGetPixelMapusv GetPixelMapusv} */
	public void glGetPixelMapusv(int map, ShortBuffer data);

	// --- [ glGetPixelMapuiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetPixelMap.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned integer version of {@link #glGetPixelMapfv GetPixelMapfv}.
	 *
	 * @param map
	 *            the pixel map parameter to query
	 * @param data
	 *            a buffer in which to place the returned data
	 */
	public void glGetPixelMapuiv(int map, ByteBuffer data);

	/**
	 * Buffer object offset version of: {@link #glGetPixelMapuiv GetPixelMapuiv}
	 */
	public void glGetPixelMapuiv(int map, long dataOffset);

	/** Alternative version of: {@link #glGetPixelMapuiv GetPixelMapuiv} */
	public void glGetPixelMapuiv(int map, IntBuffer data);

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

	// --- [ glGetPolygonStipple ] ---



	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glGetPolygonStipple.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Obtains the polygon stipple.
	 *
	 * @param pattern
	 *            a buffer in which to place the returned data
	 */
	public void glGetPolygonStipple(ByteBuffer pattern);

	/**
	 * Buffer object offset version of: {@link #glGetPolygonStipple
	 * GetPolygonStipple}
	 */
	public void glGetPolygonStipple(long patternOffset);

	// --- [ glGetString ] ---

	public String glGetString(int name);

	// --- [ glGetTexEnviv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGetTexEnv.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Returns integer information about {@code pname} for {@code env} in
	 * {@code data}.
	 *
	 * @param env
	 *            the texture environment to query. One of:<br>
	 *            {@link GL20#GL_POINT_SPRITE POINT_SPRITE},
	 *            {@link #GL_TEXTURE_ENV TEXTURE_ENV},
	 *            {@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL}
	 * @param pname
	 *            the parameter to query. One of:<br>
	 *            {@link GL20#GL_COORD_REPLACE COORD_REPLACE},
	 *            {@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE},
	 *            {@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR},
	 *            {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS},
	 *            {@link GL13#GL_COMBINE_RGB COMBINE_RGB},
	 *            {@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA},
	 *            {@link GL15#GL_SRC0_RGB SRC0_RGB}, {@link GL15#GL_SRC1_RGB
	 *            SRC1_RGB}, {@link GL15#GL_SRC2_RGB SRC2_RGB},
	 *            {@link GL15#GL_SRC0_ALPHA SRC0_ALPHA},
	 *            {@link GL15#GL_SRC1_ALPHA SRC1_ALPHA},
	 *            {@link GL15#GL_SRC2_ALPHA SRC2_ALPHA},
	 *            {@link GL13#GL_OPERAND0_RGB OPERAND0_RGB},
	 *            {@link GL13#GL_OPERAND1_RGB OPERAND1_RGB},
	 *            {@link GL13#GL_OPERAND2_RGB OPERAND2_RGB},
	 *            {@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA},
	 *            {@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA},
	 *            {@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA},
	 *            {@link GL13#GL_RGB_SCALE RGB_SCALE}, {@link #GL_ALPHA_SCALE
	 *            ALPHA_SCALE}
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexEnviv(int env, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetTexEnviv GetTexEnviv} */
	public void glGetTexEnviv(int env, int pname, IntBuffer data);

	/** Single return value version of: {@link #glGetTexEnviv GetTexEnviv} */
	public int glGetTexEnvi(int env, int pname);

	// --- [ glGetTexEnvfv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glGetTexEnv.xhtml">
	 * OpenGL SDK Reference</a>
	 * </p>
	 * 
	 * Float version of {@link #glGetTexEnviv GetTexEnviv}.
	 *
	 * @param env
	 *            the texture environment to query
	 * @param pname
	 *            the parameter to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexEnvfv(int env, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetTexEnvfv GetTexEnvfv} */
	public void glGetTexEnvfv(int env, int pname, FloatBuffer data);

	/** Single return value version of: {@link #glGetTexEnvfv GetTexEnvfv} */
	public float glGetTexEnvf(int env, int pname);

	// --- [ glGetTexGeniv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetTexGen.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns integer information about {@code pname} for {@code coord} in
	 * {@code data}.
	 *
	 * @param coord
	 *            the coord to query. One of:<br>
	 *            {@link #GL_S S}, {@link #GL_T T}, {@link #GL_R R},
	 *            {@link #GL_Q Q}
	 * @param pname
	 *            the parameter to query. One of:<br>
	 *            {@link #GL_EYE_PLANE EYE_PLANE}, {@link #GL_OBJECT_PLANE
	 *            OBJECT_PLANE}, {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexGeniv(int coord, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetTexGeniv GetTexGeniv} */
	public void glGetTexGeniv(int coord, int pname, IntBuffer data);

	/** Single return value version of: {@link #glGetTexGeniv GetTexGeniv} */
	public int glGetTexGeni(int coord, int pname);

	// --- [ glGetTexGenfv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetTexGen.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord
	 *            the coord to query
	 * @param pname
	 *            the parameter to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexGenfv(int coord, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetTexGenfv GetTexGenfv} */
	public void glGetTexGenfv(int coord, int pname, FloatBuffer data);

	/** Single return value version of: {@link #glGetTexGenfv GetTexGenfv} */
	public float glGetTexGenf(int coord, int pname);

	// --- [ glGetTexGendv ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glGetTexGen.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glGetTexGeniv GetTexGeniv}.
	 *
	 * @param coord
	 *            the coord to query
	 * @param pname
	 *            the parameter to query
	 * @param data
	 *            a scalar or buffer in which to place the returned data
	 */
	public void glGetTexGendv(int coord, int pname, ByteBuffer data);

	/** Alternative version of: {@link #glGetTexGendv GetTexGendv} */
	public void glGetTexGendv(int coord, int pname, DoubleBuffer data);

	/** Single return value version of: {@link #glGetTexGendv GetTexGendv} */
	public double glGetTexGend(int coord, int pname);

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

	// --- [ glIndexi ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexi.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Updates the current (single-valued) color index.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexi(int index);

	// --- [ glIndexub ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexub.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned byte version of {@link #glIndexi Indexi}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexub(byte index);

	// --- [ glIndexs ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexs.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glIndexi Indexi}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexs(short index);

	// --- [ glIndexf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexf.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glIndexi Indexi}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexf(float index);

	// --- [ glIndexd ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexd.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glIndexi Indexi}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexd(double index);

	// --- [ glIndexiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glIndexi Indexi}
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexiv(ByteBuffer index);

	/** Alternative version of: {@link #glIndexiv Indexiv} */
	public void glIndexiv(IntBuffer index);

	// --- [ glIndexubv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexub.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glIndexub Indexub}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexubv(ByteBuffer index);

	// --- [ glIndexsv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glIndexs Indexs}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexsv(ByteBuffer index);

	/** Alternative version of: {@link #glIndexsv Indexsv} */
	public void glIndexsv(ShortBuffer index);

	// --- [ glIndexfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glIndexf Indexf}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexfv(ByteBuffer index);

	/** Alternative version of: {@link #glIndexfv Indexfv} */
	public void glIndexfv(FloatBuffer index);

	// --- [ glIndexdv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndex.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glIndexd Indexd}.
	 *
	 * @param index
	 *            the value to which the current color index should be set
	 */
	public void glIndexdv(ByteBuffer index);

	/** Alternative version of: {@link #glIndexdv Indexdv} */
	public void glIndexdv(DoubleBuffer index);

	// --- [ glIndexMask ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIndexMask.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * The least significant n bits of mask, where n is the number of bits in a
	 * color index buffer, specify a mask. Where a 1 appears in this mask, the
	 * corresponding bit in the color index buffer (or buffers) is written;
	 * where a 0 appears, the bit is not written. This mask applies only in
	 * color index mode.
	 *
	 * @param mask
	 *            the color index mask value
	 */
	public void glIndexMask(int mask);

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

	// --- [ glInitNames ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glInitNames.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Clears the selection name stack.
	 */
	public void glInitNames();

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

	// --- [ glIsList ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glIsList.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Returns true if the {@code list} is the index of some display list.
	 *
	 * @param list
	 *            the list index to query
	 */
	public boolean glIsList(int list);

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

	// --- [ glLightModeli ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLightModeli.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Set the integer value of a lighting model parameter.
	 *
	 * @param pname
	 *            the lighting model parameter to set. One of:<br>
	 *            {@link #GL_LIGHT_MODEL_AMBIENT LIGHT_MODEL_AMBIENT},
	 *            {@link #GL_LIGHT_MODEL_LOCAL_VIEWER LIGHT_MODEL_LOCAL_VIEWER},
	 *            {@link #GL_LIGHT_MODEL_TWO_SIDE LIGHT_MODEL_TWO_SIDE},
	 *            {@link GL12#GL_LIGHT_MODEL_COLOR_CONTROL
	 *            LIGHT_MODEL_COLOR_CONTROL}
	 * @param param
	 *            the parameter value
	 */
	public void glLightModeli(int pname, int param);

	// --- [ glLightModelf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLightModelf.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glLightModeli LightModeli}.
	 *
	 * @param pname
	 *            the lighting model parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glLightModelf(int pname, float param);

	// --- [ glLightModeliv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLightModel.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glLightModeli LightModeli}.
	 *
	 * @param pname
	 *            the lighting model parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glLightModeliv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glLightModeliv LightModeliv} */
	public void glLightModeliv(int pname, IntBuffer params);

	// --- [ glLightModelfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLightModel.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glLightModelf LightModelf}.
	 *
	 * @param pname
	 *            the lighting model parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glLightModelfv(int pname, ByteBuffer params);

	/** Alternative version of: {@link #glLightModelfv LightModelfv} */
	public void glLightModelfv(int pname, FloatBuffer params);

	// --- [ glLighti ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLighti.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the integer value of a light parameter.
	 *
	 * @param light
	 *            the light for which to set the parameter. One of:<br>
	 *            {@link #GL_LIGHT0 LIGHT0}, GL_LIGHT[1-7]
	 * @param pname
	 *            the parameter to set. One of:<br>
	 *            {@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE},
	 *            {@link #GL_SPECULAR SPECULAR}, {@link #GL_POSITION POSITION},
	 *            {@link #GL_CONSTANT_ATTENUATION CONSTANT_ATTENUATION},
	 *            {@link #GL_LINEAR_ATTENUATION LINEAR_ATTENUATION},
	 *            {@link #GL_QUADRATIC_ATTENUATION QUADRATIC_ATTENUATION},
	 *            {@link #GL_SPOT_DIRECTION SPOT_DIRECTION},
	 *            {@link #GL_SPOT_EXPONENT SPOT_EXPONENT},
	 *            {@link #GL_SPOT_CUTOFF SPOT_CUTOFF}
	 * @param param
	 *            the parameter value
	 */
	public void glLighti(int light, int pname, int param);

	// --- [ glLightf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLightf.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glLighti Lighti}.
	 *
	 * @param light
	 *            the light for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glLightf(int light, int pname, float param);

	// --- [ glLightiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLight.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glLighti Lighti}.
	 *
	 * @param light
	 *            the light for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glLightiv(int light, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glLightiv Lightiv} */
	public void glLightiv(int light, int pname, IntBuffer params);

	// --- [ glLightfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLight.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glLightf Lightf}.
	 *
	 * @param light
	 *            the light for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glLightfv(int light, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glLightfv Lightfv} */
	public void glLightfv(int light, int pname, FloatBuffer params);

	// --- [ glLineStipple ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLineStipple.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Defines a line stipple. It determines those fragments that are to be
	 * drawn when the line is rasterized. Line stippling may be enabled or
	 * disabled using {@link #glEnable Enable} or {@link #glDisable Disable}
	 * with the constant {@link #GL_LINE_STIPPLE LINE_STIPPLE}. When disabled,
	 * it is as if the line stipple has its default value.
	 *
	 * @param factor
	 *            a count that is used to modify the effective line stipple by
	 *            causing each bit in pattern to be used {@code factor} times.
	 *            {@code factor} is clamped to the range [1, 256].
	 * @param pattern
	 *            an unsigned short integer whose 16 bits define the stipple
	 *            pattern
	 */
	public void glLineStipple(int factor, short pattern);

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

	// --- [ glListBase ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glListBase.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the display list base.
	 *
	 * @param base
	 *            the display list base offset
	 */
	public void glListBase(int base);

	// --- [ glLoadMatrixf ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLoadMatrix.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current matrix to a 4 &times; 4 matrix in column-major order.
	 * 
	 * <p>
	 * The matrix is stored as 16 consecutive values, i.e. as:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>a1</td>
	 * <td>a5</td>
	 * <td>a9</td>
	 * <td>a13</td>
	 * </tr>
	 * <tr>
	 * <td>a2</td>
	 * <td>a6</td>
	 * <td>a10</td>
	 * <td>a14</td>
	 * </tr>
	 * <tr>
	 * <td>a3</td>
	 * <td>a7</td>
	 * <td>a11</td>
	 * <td>a15</td>
	 * </tr>
	 * <tr>
	 * <td>a4</td>
	 * <td>a8</td>
	 * <td>a12</td>
	 * <td>a16</td>
	 * </tr>
	 * </table>
	 * </p>
	 * 
	 * <p>
	 * This differs from the standard row-major ordering for matrix elements. If
	 * the standard ordering is used, all of the subsequent transformation
	 * equations are transposed, and the columns representing vectors become
	 * rows.
	 * </p>
	 *
	 * @param m
	 *            the matrix data
	 */
	public void glLoadMatrixf(ByteBuffer m);

	/** Alternative version of: {@link #glLoadMatrixf LoadMatrixf} */
	public void glLoadMatrixf(FloatBuffer m);

	// --- [ glLoadMatrixd ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLoadMatrix.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glLoadMatrixf LoadMatrixf}.
	 *
	 * @param m
	 *            the matrix data
	 */
	public void glLoadMatrixd(ByteBuffer m);

	/** Alternative version of: {@link #glLoadMatrixd LoadMatrixd} */
	public void glLoadMatrixd(DoubleBuffer m);

	// --- [ glLoadIdentity ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLoadIdentity.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current matrix to the identity matrix.
	 * 
	 * <p>
	 * Calling this function is equivalent to calling {@link #glLoadMatrixf
	 * LoadMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>1</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>1</td>
	 * <td>0</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>1</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>1</td>
	 * </tr>
	 * </table>
	 * </p>
	 */
	public void glLoadIdentity();

	// --- [ glLoadName ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glLoadName.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Replaces the value on the top of the selection stack with {@code name}.
	 *
	 * @param name
	 *            the name to load
	 */
	public void glLoadName(int name);

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

	// --- [ glMap1f ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMap1.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Defines a polynomial or rational polynomial mapping to produce vertex,
	 * normal, texture coordinates and colors. The values so produced are sent
	 * on to further stages of the GL as if they had been provided directly by
	 * the client.
	 *
	 * @param target
	 *            the evaluator target. One of:<br>
	 *            {@link #GL_MAP1_VERTEX_3 MAP1_VERTEX_3},
	 *            {@link #GL_MAP1_VERTEX_4 MAP1_VERTEX_4},
	 *            {@link #GL_MAP1_COLOR_4 MAP1_COLOR_4}, {@link #GL_MAP1_NORMAL
	 *            MAP1_NORMAL}, {@link #GL_MAP1_TEXTURE_COORD_1
	 *            MAP1_TEXTURE_COORD_1}, {@link #GL_MAP1_TEXTURE_COORD_2
	 *            MAP1_TEXTURE_COORD_2}, {@link #GL_MAP1_TEXTURE_COORD_3
	 *            MAP1_TEXTURE_COORD_3}, {@link #GL_MAP1_TEXTURE_COORD_4
	 *            MAP1_TEXTURE_COORD_4}
	 * @param u1
	 *            the first endpoint of the pre-image of the map
	 * @param u2
	 *            the second endpoint of the pre-image of the map
	 * @param stride
	 *            the number of values in each block of storage
	 * @param order
	 *            the polynomial order
	 * @param points
	 *            a set of {@code order} blocks of storage containing control
	 *            points
	 */
	public void glMap1f(int target, float u1, float u2, int stride, int order, ByteBuffer points);

	/** Alternative version of: {@link #glMap1f Map1f} */
	public void glMap1f(int target, float u1, float u2, int stride, int order, FloatBuffer points);

	// --- [ glMap1d ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMap1.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glMap1f Map1f}.
	 *
	 * @param target
	 *            the evaluator target
	 * @param u1
	 *            the first endpoint of the pre-image of the map
	 * @param u2
	 *            the second endpoint of the pre-image of the map
	 * @param stride
	 *            the number of values in each block of storage
	 * @param order
	 *            the polynomial order
	 * @param points
	 *            a set of {@code order} blocks of storage containing control
	 *            points
	 */
	public void glMap1d(int target, double u1, double u2, int stride, int order, ByteBuffer points);

	/** Alternative version of: {@link #glMap1d Map1d} */
	public void glMap1d(int target, double u1, double u2, int stride, int order, DoubleBuffer points);

	// --- [ glMap2f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMap2.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Bivariate version of {@link #glMap1f Map1f}.
	 *
	 * @param target
	 *            the evaluator target
	 * @param u1
	 *            the first u-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param u2
	 *            the second u-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param ustride
	 *            the number of values in the u-dimension in each block of
	 *            storage
	 * @param uorder
	 *            the polynomial order in the u-dimension
	 * @param v1
	 *            the first v-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param v2
	 *            the second v-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param vstride
	 *            the number of values in the v-dimension in each block of
	 *            storage
	 * @param vorder
	 *            the polynomial order in the v-dimension
	 * @param points
	 *            a set of
	 *            <code style="font-family: monospace">uorder &times; vorder</code>
	 *            blocks of storage containing control points
	 */
	public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride,
			int vorder, ByteBuffer points);

	/** Alternative version of: {@link #glMap2f Map2f} */
	public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride,
			int vorder, FloatBuffer points);

	// --- [ glMap2d ] ---


	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMap2.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glMap2f Map2f}.
	 *
	 * @param target
	 *            the evaluator target
	 * @param u1
	 *            the first u-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param u2
	 *            the second u-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param ustride
	 *            the number of values in the u-dimension in each block of
	 *            storage
	 * @param uorder
	 *            the polynomial order in the u-dimension
	 * @param v1
	 *            the first v-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param v2
	 *            the second v-dimension endpoint of the pre-image rectangle of
	 *            the map
	 * @param vstride
	 *            the number of values in the v-dimension in each block of
	 *            storage
	 * @param vorder
	 *            the polynomial order in the v-dimension
	 * @param points
	 *            a set of
	 *            <code style="font-family: monospace">uorder &times; vorder</code>
	 *            blocks of storage containing control points
	 */
	public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride,
			int vorder, ByteBuffer points);

	/** Alternative version of: {@link #glMap2d Map2d} */
	public void glMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride,
			int vorder, DoubleBuffer points);

	// --- [ glMapGrid1f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid1f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Defines a one-dimensional grid in the map evaluator domain.
	 *
	 * @param n
	 *            the number of partitions of the interval
	 * @param u1
	 *            the first interval endpoint
	 * @param u2
	 *            the second interval endpoint
	 */
	public void glMapGrid1f(int n, float u1, float u2);

	// --- [ glMapGrid1d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid1d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glMapGrid1f MapGrid1f}.
	 *
	 * @param n
	 *            the number of partitions of the interval
	 * @param u1
	 *            the first interval endpoint
	 * @param u2
	 *            the second interval endpoint
	 */
	public void glMapGrid1d(int n, double u1, double u2);

	// --- [ glMapGrid2f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid2f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Defines a two-dimensional grid in the map evaluator domain.
	 *
	 * @param un
	 *            the number of partitions of the interval in the u-dimension
	 * @param u1
	 *            the first u-dimension interval endpoint
	 * @param u2
	 *            the second u-dimension interval endpoint
	 * @param vn
	 *            the number of partitions of the interval in the v-dimension
	 * @param v1
	 *            the first v-dimension interval endpoint
	 * @param v2
	 *            the second v-dimension interval endpoint
	 */
	public void glMapGrid2f(int un, float u1, float u2, int vn, float v1, float v2);

	// --- [ glMapGrid2d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMapGrid2d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glMapGrid2f MapGrid2f}.
	 *
	 * @param un
	 *            the number of partitions of the interval in the u-dimension
	 * @param u1
	 *            the first u-dimension interval endpoint
	 * @param u2
	 *            the second u-dimension interval endpoint
	 * @param vn
	 *            the number of partitions of the interval in the v-dimension
	 * @param v1
	 *            the first v-dimension interval endpoint
	 * @param v2
	 *            the second v-dimension interval endpoint
	 */
	public void glMapGrid2d(int un, double u1, double u2, int vn, double v1, double v2);

	// --- [ glMateriali ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMateriali.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the integer value of a material parameter.
	 *
	 * @param face
	 *            the material face for which to set the parameter. One of:<br>
	 *            {@link #GL_FRONT FRONT}, {@link #GL_BACK BACK},
	 *            {@link #GL_FRONT_AND_BACK FRONT_AND_BACK}
	 * @param pname
	 *            the parameter to set. Must be:<br>
	 *            {@link #GL_SHININESS SHININESS}
	 * @param param
	 *            the parameter value
	 */
	public void glMateriali(int face, int pname, int param);

	// --- [ glMaterialf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMaterialf.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glMateriali Materiali}.
	 *
	 * @param face
	 *            the material face for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glMaterialf(int face, int pname, float param);

	// --- [ glMaterialiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMaterial.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glMateriali Materiali}.
	 *
	 * @param face
	 *            the material face for which to set the parameter
	 * @param pname
	 *            the parameter to set. One of:<br>
	 *            {@link #GL_AMBIENT AMBIENT}, {@link #GL_DIFFUSE DIFFUSE},
	 *            {@link #GL_AMBIENT_AND_DIFFUSE AMBIENT_AND_DIFFUSE},
	 *            {@link #GL_SPECULAR SPECULAR}, {@link #GL_EMISSION EMISSION}
	 * @param params
	 *            the parameter value
	 */
	public void glMaterialiv(int face, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glMaterialiv Materialiv} */
	public void glMaterialiv(int face, int pname, IntBuffer params);

	// --- [ glMaterialfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMaterial.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glMaterialf Materialf}.
	 *
	 * @param face
	 *            the material face for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glMaterialfv(int face, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glMaterialfv Materialfv} */
	public void glMaterialfv(int face, int pname, FloatBuffer params);

	// --- [ glMatrixMode ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMatrixMode.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Set the current matrix mode.
	 *
	 * @param mode
	 *            the matrix mode. One of:<br>
	 *            {@link #GL_MODELVIEW MODELVIEW}, {@link #GL_PROJECTION
	 *            PROJECTION}, {@link #GL_TEXTURE TEXTURE}, {@link #GL_COLOR
	 *            COLOR}
	 */
	public void glMatrixMode(int mode);

	// --- [ glMultMatrixf ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMultMatrix.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Multiplies the current matrix with a 4 &times; 4 matrix in column-major
	 * order. See {@link #glLoadMatrixf LoadMatrixf} for details.
	 *
	 * @param m
	 *            the matrix data
	 */
	public void glMultMatrixf(ByteBuffer m);

	/** Alternative version of: {@link #glMultMatrixf MultMatrixf} */
	public void glMultMatrixf(FloatBuffer m);

	// --- [ glMultMatrixd ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glMultMatrix.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glMultMatrixf MultMatrixf}.
	 *
	 * @param m
	 *            the matrix data
	 */
	public void glMultMatrixd(ByteBuffer m);

	/** Alternative version of: {@link #glMultMatrixd MultMatrixd} */
	public void glMultMatrixd(DoubleBuffer m);

	// --- [ glFrustum ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glFrustum.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Manipulates the current matrix with a matrix that produces perspective
	 * projection, in such a way that the coordinates
	 * <code style="font-family: monospace">(lb &ndash; n)<sup>T</sup></code>
	 * and
	 * <code style="font-family: monospace">(rt &ndash; n)<sup>T</sup></code>
	 * specify the points on the near clipping plane that are mapped to the
	 * lower left and upper right corners of the window, respectively (assuming
	 * that the eye is located at
	 * <code style="font-family: monospace">(0 0 0)<sup>T</sup></code>).
	 * {@code f} gives the distance from the eye to the far clipping plane.
	 * 
	 * <p>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf
	 * MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>2n / (r - l)</td>
	 * <td>0</td>
	 * <td>(r + l) / (r - l)</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>2n / (t - b)</td>
	 * <td>(t + b) / (t - b)</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>- (f + n) / (f - n)</td>
	 * <td>- (2fn) / (f - n)</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>-1</td>
	 * <td>0</td>
	 * </tr>
	 * </table>
	 * </p>
	 *
	 * @param l
	 *            the left frustum plane
	 * @param r
	 *            the right frustum plane
	 * @param b
	 *            the bottom frustum plane
	 * @param t
	 *            the top frustum plane
	 * @param n
	 *            the near frustum plane
	 * @param f
	 *            the far frustum plane
	 */
	public void glFrustum(double l, double r, double b, double t, double n, double f);

	// --- [ glNewList ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNewList.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Begins the definition of a display list.
	 *
	 * @param n
	 *            a positive integer to which the display list that follows is
	 *            assigned
	 * @param mode
	 *            a symbolic constant that controls the behavior of the GL
	 *            during display list creation. One of:<br>
	 *            {@link #GL_COMPILE COMPILE}, {@link #GL_COMPILE_AND_EXECUTE
	 *            COMPILE_AND_EXECUTE}
	 */
	public void glNewList(int n, int mode);

	// --- [ glEndList ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glEndList.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Ends the definition of GL commands to be placed in a display list. It is
	 * only when {@code EndList} occurs that the specified display list is
	 * actually associated with the index indicated with {@link #glNewList
	 * NewList}.
	 */
	public void glEndList();

	// --- [ glNormal3f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current normal.
	 *
	 * @param nx
	 *            the x coordinate of the current normal
	 * @param ny
	 *            the y coordinate of the current normal
	 * @param nz
	 *            the z coordinate of the current normal
	 */
	public void glNormal3f(float nx, float ny, float nz);

	// --- [ glNormal3b ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3b.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Byte version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx
	 *            the x coordinate of the current normal
	 * @param ny
	 *            the y coordinate of the current normal
	 * @param nz
	 *            the z coordinate of the current normal
	 */
	public void glNormal3b(byte nx, byte ny, byte nz);

	// --- [ glNormal3s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx
	 *            the x coordinate of the current normal
	 * @param ny
	 *            the y coordinate of the current normal
	 * @param nz
	 *            the z coordinate of the current normal
	 */
	public void glNormal3s(short nx, short ny, short nz);

	// --- [ glNormal3i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx
	 *            the x coordinate of the current normal
	 * @param ny
	 *            the y coordinate of the current normal
	 * @param nz
	 *            the z coordinate of the current normal
	 */
	public void glNormal3i(int nx, int ny, int nz);

	// --- [ glNormal3d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glNormal3f Normal3f}.
	 *
	 * @param nx
	 *            the x coordinate of the current normal
	 * @param ny
	 *            the y coordinate of the current normal
	 * @param nz
	 *            the z coordinate of the current normal
	 */
	public void glNormal3d(double nx, double ny, double nz);

	// --- [ glNormal3fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glNormal3f Normal3f}.
	 *
	 * @param v
	 *            the normal buffer
	 */
	public void glNormal3fv(ByteBuffer v);

	/** Alternative version of: {@link #glNormal3fv Normal3fv} */
	public void glNormal3fv(FloatBuffer v);

	// --- [ glNormal3bv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3b.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glNormal3b Normal3b}.
	 *
	 * @param v
	 *            the normal buffer
	 */
	public void glNormal3bv(ByteBuffer v);

	// --- [ glNormal3sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glNormal3s Normal3s}.
	 *
	 * @param v
	 *            the normal buffer
	 */
	public void glNormal3sv(ByteBuffer v);

	/** Alternative version of: {@link #glNormal3sv Normal3sv} */
	public void glNormal3sv(ShortBuffer v);

	// --- [ glNormal3iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glNormal3i Normal3i}.
	 *
	 * @param v
	 *            the normal buffer
	 */
	public void glNormal3iv(ByteBuffer v);

	/** Alternative version of: {@link #glNormal3iv Normal3iv} */
	public void glNormal3iv(IntBuffer v);

	// --- [ glNormal3dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormal3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glNormal3d Normal3d}.
	 *
	 * @param v
	 *            the normal buffer
	 */
	public void glNormal3dv(ByteBuffer v);

	/** Alternative version of: {@link #glNormal3dv Normal3dv} */
	public void glNormal3dv(DoubleBuffer v);

	// --- [ glNormalPointer ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glNormalPointer.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies the location and organization of a normal array.
	 *
	 * @param type
	 *            the data type of the values stored in the array. One of:<br>
	 *            {@link #GL_BYTE BYTE}, {@link #GL_SHORT SHORT}, {@link #GL_INT
	 *            INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT
	 *            FLOAT}, {@link #GL_DOUBLE DOUBLE},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV},
	 *            {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the normal array data
	 */
	public void glNormalPointer(int type, int stride, ByteBuffer pointer);

	/**
	 * Buffer object offset version of: {@link #glNormalPointer NormalPointer}
	 */
	public void glNormalPointer(int type, int stride, long pointerOffset);

	/** ShortBuffer version of: {@link #glNormalPointer NormalPointer} */
	public void glNormalPointer(int type, int stride, ShortBuffer pointer);

	/** IntBuffer version of: {@link #glNormalPointer NormalPointer} */
	public void glNormalPointer(int type, int stride, IntBuffer pointer);

	/** FloatBuffer version of: {@link #glNormalPointer NormalPointer} */
	public void glNormalPointer(int type, int stride, FloatBuffer pointer);

	// --- [ glOrtho ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glOrtho.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Manipulates the current matrix with a matrix that produces parallel
	 * projection, in such a way that the coordinates
	 * <code style="font-family: monospace">(lb &ndash; n)<sup>T</sup></code>
	 * and
	 * <code style="font-family: monospace">(rt &ndash; n)<sup>T</sup></code>
	 * specify the points on the near clipping plane that are mapped to the
	 * lower left and upper right corners of the window, respectively (assuming
	 * that the eye is located at
	 * <code style="font-family: monospace">(0 0 0)<sup>T</sup></code>).
	 * {@code f} gives the distance from the eye to the far clipping plane.
	 * 
	 * <p>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf
	 * MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>2 / (r - l)</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>- (r + l) / (r - l)</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>2 / (t - b)</td>
	 * <td>0</td>
	 * <td>- (t + b) / (t - b)</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>- 2 / (f - n)</td>
	 * <td>- (f + n) / (f - n)</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>1</td>
	 * </tr>
	 * </table>
	 * </p>
	 *
	 * @param l
	 *            the left frustum plane
	 * @param r
	 *            the right frustum plane
	 * @param b
	 *            the bottom frustum plane
	 * @param t
	 *            the top frustum plane
	 * @param n
	 *            the near frustum plane
	 * @param f
	 *            the far frustum plane
	 */
	public void glOrtho(double l, double r, double b, double t, double n, double f);

	// --- [ glPassThrough ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPassThrough.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Inserts a marker when the GL is in feeback mode. {@code token} is
	 * returned as if it were a primitive; it is indicated with its own unique
	 * identifying value. The ordering of any {@code PassThrough} commands with
	 * respect to primitive specification is maintained by feedback.
	 * {@code PassThrough} may not occur between {@link #glBegin Begin} and
	 * {@link #glEnd End}.
	 *
	 * @param token
	 *            the marker value to insert
	 */
	public void glPassThrough(float token);

	// --- [ glPixelMapfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPixelMap.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets a pixel map lookup table.
	 *
	 * @param map
	 *            the map to set. One of:<br>
	 *            {@link #GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I},
	 *            {@link #GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S},
	 *            {@link #GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R},
	 *            {@link #GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G},
	 *            {@link #GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B},
	 *            {@link #GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A},
	 *            {@link #GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R},
	 *            {@link #GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G},
	 *            {@link #GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B},
	 *            {@link #GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}
	 * @param size
	 *            the map size
	 * @param values
	 *            the map values
	 */
	public void glPixelMapfv(int map, int size, ByteBuffer values);

	/** Buffer object offset version of: {@link #glPixelMapfv PixelMapfv} */
	public void glPixelMapfv(int map, int size, long valuesOffset);

	/** Alternative version of: {@link #glPixelMapfv PixelMapfv} */
	public void glPixelMapfv(int map, FloatBuffer values);

	// --- [ glPixelMapusv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPixelMap.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned short version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map
	 *            the map to set
	 * @param size
	 *            the map size
	 * @param values
	 *            the map values
	 */
	public void glPixelMapusv(int map, int size, ByteBuffer values);

	/** Buffer object offset version of: {@link #glPixelMapusv PixelMapusv} */
	public void glPixelMapusv(int map, int size, long valuesOffset);

	/** Alternative version of: {@link #glPixelMapusv PixelMapusv} */
	public void glPixelMapusv(int map, ShortBuffer values);

	// --- [ glPixelMapuiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPixelMap.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Unsigned integer version of {@link #glPixelMapfv PixelMapfv}.
	 *
	 * @param map
	 *            the map to set
	 * @param size
	 *            the map size
	 * @param values
	 *            the map values
	 */
	public void glPixelMapuiv(int map, int size, ByteBuffer values);

	/** Buffer object offset version of: {@link #glPixelMapuiv PixelMapuiv} */
	public void glPixelMapuiv(int map, int size, long valuesOffset);

	/** Alternative version of: {@link #glPixelMapuiv PixelMapuiv} */
	public void glPixelMapuiv(int map, IntBuffer values);

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

	// --- [ glPixelTransferi ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glPixelTransferi.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the integer value of a pixel transfer parameter.
	 *
	 * @param pname
	 *            the pixel transfer parameter to set. One of:<br>
	 *            {@link #GL_MAP_COLOR MAP_COLOR}, {@link #GL_MAP_STENCIL
	 *            MAP_STENCIL}, {@link #GL_INDEX_SHIFT INDEX_SHIFT},
	 *            {@link #GL_INDEX_OFFSET INDEX_OFFSET}, {@link #GL_RED_SCALE
	 *            RED_SCALE}, {@link #GL_GREEN_SCALE GREEN_SCALE},
	 *            {@link #GL_BLUE_SCALE BLUE_SCALE}, {@link #GL_ALPHA_SCALE
	 *            ALPHA_SCALE}, {@link #GL_DEPTH_SCALE DEPTH_SCALE},
	 *            {@link #GL_RED_BIAS RED_BIAS}, {@link #GL_GREEN_BIAS
	 *            GREEN_BIAS}, {@link #GL_BLUE_BIAS BLUE_BIAS},
	 *            {@link #GL_ALPHA_BIAS ALPHA_BIAS}, {@link #GL_DEPTH_BIAS
	 *            DEPTH_BIAS}, {@link ARBImaging#GL_POST_CONVOLUTION_RED_SCALE
	 *            POST_CONVOLUTION_RED_SCALE},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_RED_BIAS
	 *            POST_CONVOLUTION_RED_BIAS},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_RED_SCALE
	 *            POST_COLOR_MATRIX_RED_SCALE},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_RED_BIAS
	 *            POST_COLOR_MATRIX_RED_BIAS},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_GREEN_SCALE
	 *            POST_CONVOLUTION_GREEN_SCALE},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_GREEN_BIAS
	 *            POST_CONVOLUTION_GREEN_BIAS},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_SCALE
	 *            POST_COLOR_MATRIX_GREEN_SCALE},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_GREEN_BIAS
	 *            POST_COLOR_MATRIX_GREEN_BIAS},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_BLUE_SCALE
	 *            POST_CONVOLUTION_BLUE_SCALE},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_BLUE_BIAS
	 *            POST_CONVOLUTION_BLUE_BIAS},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_SCALE
	 *            POST_COLOR_MATRIX_BLUE_SCALE},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_BLUE_BIAS
	 *            POST_COLOR_MATRIX_BLUE_BIAS},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_SCALE
	 *            POST_CONVOLUTION_ALPHA_SCALE},
	 *            {@link ARBImaging#GL_POST_CONVOLUTION_ALPHA_BIAS
	 *            POST_CONVOLUTION_ALPHA_BIAS},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_SCALE
	 *            POST_COLOR_MATRIX_ALPHA_SCALE},
	 *            {@link ARBImaging#GL_POST_COLOR_MATRIX_ALPHA_BIAS
	 *            POST_COLOR_MATRIX_ALPHA_BIAS}
	 * @param param
	 *            the parameter value
	 */
	public void glPixelTransferi(int pname, int param);

	// --- [ glPixelTransferf ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glPixelTransferf.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glPixelTransferi PixelTransferi}.
	 *
	 * @param pname
	 *            the pixel transfer parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glPixelTransferf(int pname, float param);

	// --- [ glPixelZoom ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPixelZoom.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Controls the conversion of a group of fragments.
	 * 
	 * <p>
	 * Let (x<sub>rp</sub>, y<sub>rp</sub>) be the current raster position. If a
	 * particular group is the n<sup>th</sup> in a row and belongs to the m
	 * <sup>th</sup> row, consider the region in window coordinates bounded by
	 * the rectangle with corners
	 * </p>
	 * 
	 * <p>
	 * (x<sub>rp</sub> + z<sub>x</sub>n, y<sub>rp</sub> + z<sub>y</sub>m) and (x
	 * <sub>rp</sub> + z<sub>x</sub>(n + 1), y<sub>rp</sub> + z<sub>y</sub>(m +
	 * 1))
	 * </p>
	 * 
	 * <p>
	 * (either z<sub>x</sub> or z<sub>y</sub> may be negative). A fragment
	 * representing group {@code (n, m)} is produced for each framebuffer pixel
	 * inside, or on the bottom or left boundary, of this rectangle.
	 * </p>
	 *
	 * @param xfactor
	 *            the z<sub>x</sub> factor
	 * @param yfactor
	 *            the z<sub>y</sub> factor
	 */
	public void glPixelZoom(float xfactor, float yfactor);

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

	// --- [ glPolygonStipple ] ---



	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glPolygonStipple.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Defines a polygon stipple. It works much the same way as
	 * {@link #glLineStipple LineStipple}, masking out certain fragments
	 * produced by rasterization so that they are not sent to the next stage of
	 * the GL. This is the case regardless of the state of polygon antialiasing.
	 * 
	 * <p>
	 * If x<sub>w</sub> and y<sub>w</sub> are the window coordinates of a
	 * rasterized polygon fragment, then that fragment is sent to the next stage
	 * of the GL if and only if the bit of the pattern (x<sub>w</sub> mod 32, y
	 * <sub>w</sub> mod 32) is 1.
	 * </p>
	 * 
	 * <p>
	 * Polygon stippling may be enabled or disabled with {@link #glEnable
	 * Enable} or {@link #glDisable Disable} using the constant
	 * {@link #GL_POLYGON_STIPPLE POLYGON_STIPPLE}. When disabled, it is as if
	 * the stipple pattern were all ones.
	 * </p>
	 *
	 * @param pattern
	 *            a pointer to memory into which a 32 &times; 32 pattern is
	 *            packed
	 */
	public void glPolygonStipple(ByteBuffer pattern);

	/**
	 * Buffer object offset version of: {@link #glPolygonStipple PolygonStipple}
	 */
	public void glPolygonStipple(long patternOffset);

	// --- [ glPushAttrib ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPushAttrib.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Takes a bitwise OR of symbolic constants indicating which groups of state
	 * variables to push onto the server attribute stack. Each constant refers
	 * to a group of state variables.
	 * 
	 * <p>
	 * Bits set in mask that do not correspond to an attribute group are
	 * ignored. The special mask value {@link #GL_ALL_ATTRIB_BITS
	 * ALL_ATTRIB_BITS} may be used to push all stackable server state.
	 * </p>
	 * 
	 * <p>
	 * A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if
	 * {@code PushAttrib} is called and the attribute stack depth is equal to
	 * the value of {@link #GL_MAX_ATTRIB_STACK_DEPTH MAX_ATTRIB_STACK_DEPTH}.
	 * </p>
	 *
	 * @param mask
	 *            the state variables to push. One or more of:<br>
	 *            {@link #GL_ACCUM_BUFFER_BIT ACCUM_BUFFER_BIT},
	 *            {@link #GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT},
	 *            {@link #GL_CURRENT_BIT CURRENT_BIT},
	 *            {@link #GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT},
	 *            {@link #GL_ENABLE_BIT ENABLE_BIT}, {@link #GL_EVAL_BIT
	 *            EVAL_BIT}, {@link #GL_FOG_BIT FOG_BIT}, {@link #GL_HINT_BIT
	 *            HINT_BIT}, {@link #GL_LIGHTING_BIT LIGHTING_BIT},
	 *            {@link #GL_LINE_BIT LINE_BIT}, {@link #GL_LIST_BIT LIST_BIT},
	 *            {@link GL13#GL_MULTISAMPLE_BIT MULTISAMPLE_BIT},
	 *            {@link #GL_PIXEL_MODE_BIT PIXEL_MODE_BIT},
	 *            {@link #GL_POINT_BIT POINT_BIT}, {@link #GL_POLYGON_BIT
	 *            POLYGON_BIT}, {@link #GL_POLYGON_STIPPLE_BIT
	 *            POLYGON_STIPPLE_BIT}, {@link #GL_SCISSOR_BIT SCISSOR_BIT},
	 *            {@link #GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT},
	 *            {@link #GL_TEXTURE_BIT TEXTURE_BIT}, {@link #GL_TRANSFORM_BIT
	 *            TRANSFORM_BIT}, {@link #GL_VIEWPORT_BIT VIEWPORT_BIT},
	 *            {@link #GL_ALL_ATTRIB_BITS ALL_ATTRIB_BITS}
	 */
	public void glPushAttrib(int mask);

	// --- [ glPushClientAttrib ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glPushClientAttrib.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Takes a bitwise OR of symbolic constants indicating which groups of state
	 * variables to push onto the client attribute stack. Each constant refers
	 * to a group of state variables.
	 * 
	 * <p>
	 * Bits set in mask that do not correspond to an attribute group are
	 * ignored. The special mask value {@link #GL_CLIENT_ALL_ATTRIB_BITS
	 * CLIENT_ALL_ATTRIB_BITS} may be used to push all stackable client state.
	 * </p>
	 * 
	 * <p>
	 * A {@link #GL_STACK_OVERFLOW STACK_OVERFLOW} error is generated if
	 * {@code PushAttrib} is called and the client attribute stack depth is
	 * equal to the value of {@link #GL_MAX_CLIENT_ATTRIB_STACK_DEPTH
	 * MAX_CLIENT_ATTRIB_STACK_DEPTH}.
	 * </p>
	 *
	 * @param mask
	 *            the state variables to push. One or more of:<br>
	 *            {@link #GL_CLIENT_VERTEX_ARRAY_BIT CLIENT_VERTEX_ARRAY_BIT},
	 *            {@link #GL_CLIENT_PIXEL_STORE_BIT CLIENT_PIXEL_STORE_BIT},
	 *            {@link #GL_CLIENT_ALL_ATTRIB_BITS CLIENT_ALL_ATTRIB_BITS}
	 */
	public void glPushClientAttrib(int mask);

	// --- [ glPopAttrib ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPopAttrib.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Resets the values of those state variables that were saved with the last
	 * {@link #glPushAttrib PushAttrib}. Those not saved remain unchanged.
	 */
	public void glPopAttrib();

	// --- [ glPopClientAttrib ] ---

	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glPopClientAttrib.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Resets the values of those state variables that were saved with the last
	 * {@link #glPushClientAttrib PushClientAttrib}. Those not saved remain
	 * unchanged.
	 */
	public void glPopClientAttrib();

	// --- [ glPopMatrix ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPopMatrix.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pops the top entry off the current matrix stack, replacing the current
	 * matrix with the matrix that was the second entry in the stack.
	 */
	public void glPopMatrix();

	// --- [ glPopName ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPopName.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pops one name off the top of the selection name stack.
	 */
	public void glPopName();

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

	// --- [ glPushMatrix ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPushMatrix.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pushes the current matrix stack down by one, duplicating the current
	 * matrix in both the top of the stack and the entry below it.
	 */
	public void glPushMatrix();

	// --- [ glPushName ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glPushName.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Causes {@code name} to be pushed onto the selection name stack.
	 *
	 * @param name
	 *            the name to push
	 */
	public void glPushName(int name);

	// --- [ glRasterPos2i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the two-dimensional current raster position. {@code z} is implicitly
	 * set to 0 and {@code w} implicitly set to 1.
	 * 
	 * <p>
	 * The coordinates are treated as if they were specified in a Vertex
	 * command. If a vertex shader is active, this vertex shader is executed
	 * using the x, y, z, and w coordinates as the object coordinates of the
	 * vertex. Otherwise, the x, y, z, and w coordinates are transformed by the
	 * current model-view and projection matrices. These coordinates, along with
	 * current values, are used to generate primary and secondary colors and
	 * texture coordinates just as is done for a vertex. The colors and texture
	 * coordinates so produced replace the colors and texture coordinates stored
	 * in the current raster position's associated data.
	 * </p>
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 */
	public void glRasterPos2i(int x, int y);

	// --- [ glRasterPos2s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 */
	public void glRasterPos2s(short x, short y);

	// --- [ glRasterPos2f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 */
	public void glRasterPos2f(float x, float y);

	// --- [ glRasterPos2d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 */
	public void glRasterPos2d(double x, double y);

	// --- [ glRasterPos2iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos2i RasterPos2i}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos2iv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos2iv RasterPos2iv} */
	public void glRasterPos2iv(IntBuffer coords);

	// --- [ glRasterPos2sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos2s RasterPos2s}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos2sv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos2sv RasterPos2sv} */
	public void glRasterPos2sv(ShortBuffer coords);

	// --- [ glRasterPos2fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos2f RasterPos2f}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos2fv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos2fv RasterPos2fv} */
	public void glRasterPos2fv(FloatBuffer coords);

	// --- [ glRasterPos2dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos2d RasterPos2d}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos2dv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos2dv RasterPos2dv} */
	public void glRasterPos2dv(DoubleBuffer coords);

	// --- [ glRasterPos3i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the three-dimensional current raster position. {@code w} is
	 * implicitly set to 1. See {@link #glRasterPos2i RasterPos2i} for more
	 * details.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 */
	public void glRasterPos3i(int x, int y, int z);

	// --- [ glRasterPos3s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 */
	public void glRasterPos3s(short x, short y, short z);

	// --- [ glRasterPos3f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 */
	public void glRasterPos3f(float x, float y, float z);

	// --- [ glRasterPos3d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 */
	public void glRasterPos3d(double x, double y, double z);

	// --- [ glRasterPos3iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos3i RasterPos3i}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos3iv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos3iv RasterPos3iv} */
	public void glRasterPos3iv(IntBuffer coords);

	// --- [ glRasterPos3sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos3s RasterPos3s}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos3sv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos3sv RasterPos3sv} */
	public void glRasterPos3sv(ShortBuffer coords);

	// --- [ glRasterPos3fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos3f RasterPos3f}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos3fv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos3fv RasterPos3fv} */
	public void glRasterPos3fv(FloatBuffer coords);

	// --- [ glRasterPos3dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos3d RasterPos3d}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos3dv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos3dv RasterPos3dv} */
	public void glRasterPos3dv(DoubleBuffer coords);

	// --- [ glRasterPos4i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the four-dimensional current raster position. See
	 * {@link #glRasterPos2i RasterPos2i} for more details.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 * @param w
	 *            the {@code w} raster coordinate
	 */
	public void glRasterPos4i(int x, int y, int z, int w);

	// --- [ glRasterPos4s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 * @param w
	 *            the {@code w} raster coordinate
	 */
	public void glRasterPos4s(short x, short y, short z, short w);

	// --- [ glRasterPos4f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of RasterPos4i.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 * @param w
	 *            the {@code w} raster coordinate
	 */
	public void glRasterPos4f(float x, float y, float z, float w);

	// --- [ glRasterPos4d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param x
	 *            the {@code x} raster coordinate
	 * @param y
	 *            the {@code y} raster coordinate
	 * @param z
	 *            the {@code z} raster coordinate
	 * @param w
	 *            the {@code w} raster coordinate
	 */
	public void glRasterPos4d(double x, double y, double z, double w);

	// --- [ glRasterPos4iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos4i RasterPos4i}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos4iv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos4iv RasterPos4iv} */
	public void glRasterPos4iv(IntBuffer coords);

	// --- [ glRasterPos4sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos4s RasterPos4s}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos4sv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos4sv RasterPos4sv} */
	public void glRasterPos4sv(ShortBuffer coords);

	// --- [ glRasterPos4fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos4f RasterPos4f}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos4fv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos4fv RasterPos4fv} */
	public void glRasterPos4fv(FloatBuffer coords);

	// --- [ glRasterPos4dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRasterPos4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRasterPos4d RasterPos4d}.
	 *
	 * @param coords
	 *            the raster position buffer
	 */
	public void glRasterPos4dv(ByteBuffer coords);

	/** Alternative version of: {@link #glRasterPos4dv RasterPos4dv} */
	public void glRasterPos4dv(DoubleBuffer coords);

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

	// --- [ glRecti ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRecti.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies a rectangle as two corner vertices. The effect of the Rect
	 * command
	 * 
	 * <p>
	 * {@code Rect(x1, y1, x2, y2);}
	 * </p>
	 * 
	 * <p>
	 * is exactly the same as the following sequence of commands: {@code
	 * Begin(POLYGON);
	 * Vertex2(x1, y1);
	 * Vertex2(x2, y1);
	 * Vertex2(x2, y2);
	 * Vertex2(x1, y2);
	 * End();}
	 * </p>
	 * 
	 * <p>
	 * The appropriate Vertex2 command would be invoked depending on which of
	 * the Rect commands is issued.
	 * </p>
	 *
	 * @param x1
	 *            the x coordinate of the first corner vertex
	 * @param y1
	 *            the y coordinate of the first corner vertex
	 * @param x2
	 *            the x coordinate of the second corner vertex
	 * @param y2
	 *            the y coordinate of the second corner vertex
	 */
	public void glRecti(int x1, int y1, int x2, int y2);

	// --- [ glRects ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRects.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glRecti Recti}.
	 *
	 * @param x1
	 *            the x coordinate of the first corner vertex
	 * @param y1
	 *            the y coordinate of the first corner vertex
	 * @param x2
	 *            the x coordinate of the second corner vertex
	 * @param y2
	 *            the y coordinate of the second corner vertex
	 */
	public void glRects(short x1, short y1, short x2, short y2);

	// --- [ glRectf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRectf.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glRecti Recti}.
	 *
	 * @param x1
	 *            the x coordinate of the first corner vertex
	 * @param y1
	 *            the y coordinate of the first corner vertex
	 * @param x2
	 *            the x coordinate of the second corner vertex
	 * @param y2
	 *            the y coordinate of the second corner vertex
	 */
	public void glRectf(float x1, float y1, float x2, float y2);

	// --- [ glRectd ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRectd.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glRecti Recti}.
	 *
	 * @param x1
	 *            the x coordinate of the first corner vertex
	 * @param y1
	 *            the y coordinate of the first corner vertex
	 * @param x2
	 *            the x coordinate of the second corner vertex
	 * @param y2
	 *            the y coordinate of the second corner vertex
	 */
	public void glRectd(double x1, double y1, double x2, double y2);

	// --- [ glRectiv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRecti Recti}.
	 *
	 * @param v1
	 *            the first vertex buffer
	 * @param v2
	 *            the second vertex buffer
	 */
	public void glRectiv(ByteBuffer v1, ByteBuffer v2);

	/** Alternative version of: {@link #glRectiv Rectiv} */
	public void glRectiv(IntBuffer v1, IntBuffer v2);

	// --- [ glRectsv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRects Rects}.
	 *
	 * @param v1
	 *            the first vertex buffer
	 * @param v2
	 *            the second vertex buffer
	 */
	public void glRectsv(ByteBuffer v1, ByteBuffer v2);

	/** Alternative version of: {@link #glRectsv Rectsv} */
	public void glRectsv(ShortBuffer v1, ShortBuffer v2);

	// --- [ glRectfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRectf Rectf}.
	 *
	 * @param v1
	 *            the first vertex buffer
	 * @param v2
	 *            the second vertex buffer
	 */
	public void glRectfv(ByteBuffer v1, ByteBuffer v2);

	/** Alternative version of: {@link #glRectfv Rectfv} */
	public void glRectfv(FloatBuffer v1, FloatBuffer v2);

	// --- [ glRectdv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRect.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glRectd Rectd}.
	 *
	 * @param v1
	 *            the first vertex buffer
	 * @param v2
	 *            the second vertex buffer
	 */
	public void glRectdv(ByteBuffer v1, ByteBuffer v2);

	/** Alternative version of: {@link #glRectdv Rectdv} */
	public void glRectdv(DoubleBuffer v1, DoubleBuffer v2);

	// --- [ glRenderMode ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRenderMode.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current render mode. The default is {@link #GL_RENDER RENDER}.
	 *
	 * @param mode
	 *            the render mode. One of:<br>
	 *            {@link #GL_RENDER RENDER}, {@link #GL_SELECT SELECT},
	 *            {@link #GL_FEEDBACK FEEDBACK}
	 */
	public int glRenderMode(int mode);

	// --- [ glRotatef ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRotatef.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Manipulates the current matrix with a rotation matrix.
	 * 
	 * <p>
	 * {@code angle} gives an angle of rotation in degrees; the coordinates of a
	 * vector v are given by
	 * <code style="font-family: monospace">v = (x y z)<sup>T</sup></code>. The
	 * computed matrix is a counter-clockwise rotation about the line through
	 * the origin with the specified axis when that axis is pointing up (i.e.
	 * the right-hand rule determines the sense of the rotation angle). The
	 * matrix is thus
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td colspan=3 rowspan=3><b>R</b></td><td>0</td></tr> <tr><td>0</td></tr>
	 * <tr><td>0</td></tr> <tr><td>0</td><td>0</td><td>0</td><td>1</td></tr>
	 * </table></p>
	 * 
	 * <p>Let <code>u = v / ||v|| = (x' y' z')<sup>T</sup></code>. If <b>S</b> =
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>0</td>
	 * <td>-z'</td>
	 * <td>y'</td>
	 * </tr>
	 * <tr>
	 * <td>z'</td>
	 * <td>0</td>
	 * <td>-x'</td>
	 * </tr>
	 * <tr>
	 * <td>-y'</td>
	 * <td>x'</td>
	 * <td>0</td>
	 * </tr>
	 * </table>
	 * </p>
	 * 
	 * <p>
	 * then
	 * <code style="font-family: monospace"><b>R</b> = uu<sup>T</sup> + cos(angle)(I - uu<sup>T</sup>) + sin(angle)<b>S</b></code>
	 * </p>
	 *
	 * @param angle
	 *            the angle of rotation in degrees
	 * @param x
	 *            the x coordinate of the rotation vector
	 * @param y
	 *            the y coordinate of the rotation vector
	 * @param z
	 *            the z coordinate of the rotation vector
	 */
	public void glRotatef(float angle, float x, float y, float z);

	// --- [ glRotated ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glRotated.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glRotatef Rotatef}.
	 *
	 * @param angle
	 *            the angle of rotation in degrees
	 * @param x
	 *            the x coordinate of the rotation vector
	 * @param y
	 *            the y coordinate of the rotation vector
	 * @param z
	 *            the z coordinate of the rotation vector
	 */
	public void glRotated(double angle, double x, double y, double z);

	// --- [ glScalef ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glScalef.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Manipulates the current matrix with a general scaling matrix along the
	 * x-, y- and z- axes.
	 * 
	 * <p>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf
	 * MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>x</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>y</td>
	 * <td>0</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>z</td>
	 * <td>0</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>1</td>
	 * </tr>
	 * </table>
	 * </p>
	 *
	 * @param x
	 *            the x-axis scaling factor
	 * @param y
	 *            the y-axis scaling factor
	 * @param z
	 *            the z-axis scaling factor
	 */
	public void glScalef(float x, float y, float z);

	// --- [ glScaled ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glScaled.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glScalef Scalef}.
	 *
	 * @param x
	 *            the x-axis scaling factor
	 * @param y
	 *            the y-axis scaling factor
	 * @param z
	 *            the z-axis scaling factor
	 */
	public void glScaled(double x, double y, double z);

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

	// --- [ glShadeModel ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glShadeModel.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current shade mode. The initial value of the shade mode is
	 * {@link #GL_SMOOTH SMOOTH}.
	 * 
	 * <p>
	 * If mode is {@link #GL_SMOOTH SMOOTH}, vertex colors are treated
	 * individually. If mode is {@link #GL_FLAT FLAT}, flatshading is enabled
	 * and colors are taken from the provoking vertex of the primitive. The
	 * colors selected are those derived from current values, generated by
	 * lighting, or generated by vertex shading, if lighting is disabled,
	 * enabled, or a vertex shader is in use, respectively.
	 * </p>
	 *
	 * @param mode
	 *            the shade mode. One of:<br>
	 *            {@link #GL_SMOOTH SMOOTH}, {@link #GL_FLAT FLAT}
	 */
	public void glShadeModel(int mode);

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

	// --- [ glTexCoord1f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current one-dimensional texture coordinate. {@code t} and
	 * {@code r} are implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 */
	public void glTexCoord1f(float s);

	// --- [ glTexCoord1s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 */
	public void glTexCoord1s(short s);

	// --- [ glTexCoord1i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 */
	public void glTexCoord1i(int s);

	// --- [ glTexCoord1d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 */
	public void glTexCoord1d(double s);

	// --- [ glTexCoord1fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord1f TexCoord1f}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord1fv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord1fv TexCoord1fv} */
	public void glTexCoord1fv(FloatBuffer v);

	// --- [ glTexCoord1sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord1s TexCoord1s}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord1sv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord1sv TexCoord1sv} */
	public void glTexCoord1sv(ShortBuffer v);

	// --- [ glTexCoord1iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord1i TexCoord1i}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord1iv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord1iv TexCoord1iv} */
	public void glTexCoord1iv(IntBuffer v);

	// --- [ glTexCoord1dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord1.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord1d TexCoord1d}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord1dv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord1dv TexCoord1dv} */
	public void glTexCoord1dv(DoubleBuffer v);

	// --- [ glTexCoord2f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current two-dimensional texture coordinate. {@code r} is
	 * implicitly set to 0 and {@code q} to 1.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 */
	public void glTexCoord2f(float s, float t);

	// --- [ glTexCoord2s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 */
	public void glTexCoord2s(short s, short t);

	// --- [ glTexCoord2i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 */
	public void glTexCoord2i(int s, int t);

	// --- [ glTexCoord2d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 */
	public void glTexCoord2d(double s, double t);

	// --- [ glTexCoord2fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord2f TexCoord2f}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord2fv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord2fv TexCoord2fv} */
	public void glTexCoord2fv(FloatBuffer v);

	// --- [ glTexCoord2sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord2s TexCoord2s}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord2sv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord2sv TexCoord2sv} */
	public void glTexCoord2sv(ShortBuffer v);

	// --- [ glTexCoord2iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord2i TexCoord2i}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord2iv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord2iv TexCoord2iv} */
	public void glTexCoord2iv(IntBuffer v);

	// --- [ glTexCoord2dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord2.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord2d TexCoord2d}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord2dv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord2dv TexCoord2dv} */
	public void glTexCoord2dv(DoubleBuffer v);

	// --- [ glTexCoord3f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current three-dimensional texture coordinate. {@code q} is
	 * implicitly set to 1.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 */
	public void glTexCoord3f(float s, float t, float r);

	// --- [ glTexCoord3s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 */
	public void glTexCoord3s(short s, short t, short r);

	// --- [ glTexCoord3i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 */
	public void glTexCoord3i(int s, int t, int r);

	// --- [ glTexCoord3d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 */
	public void glTexCoord3d(double s, double t, double r);

	// --- [ glTexCoord3fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord3f TexCoord3f}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord3fv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord3fv TexCoord3fv} */
	public void glTexCoord3fv(FloatBuffer v);

	// --- [ glTexCoord3sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord3s TexCoord3s}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord3sv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord3sv TexCoord3sv} */
	public void glTexCoord3sv(ShortBuffer v);

	// --- [ glTexCoord3iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord3i TexCoord3i}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord3iv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord3iv TexCoord3iv} */
	public void glTexCoord3iv(IntBuffer v);

	// --- [ glTexCoord3dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord3.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord3d TexCoord3d}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord3dv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord3dv TexCoord3dv} */
	public void glTexCoord3dv(DoubleBuffer v);

	// --- [ glTexCoord4f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets the current four-dimensional texture coordinate.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 * @param q
	 *            the q component of the current texture coordinates
	 */
	public void glTexCoord4f(float s, float t, float r, float q);

	// --- [ glTexCoord4s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 * @param q
	 *            the q component of the current texture coordinates
	 */
	public void glTexCoord4s(short s, short t, short r, short q);

	// --- [ glTexCoord4i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 * @param q
	 *            the q component of the current texture coordinates
	 */
	public void glTexCoord4i(int s, int t, int r, int q);

	// --- [ glTexCoord4d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param s
	 *            the s component of the current texture coordinates
	 * @param t
	 *            the t component of the current texture coordinates
	 * @param r
	 *            the r component of the current texture coordinates
	 * @param q
	 *            the q component of the current texture coordinates
	 */
	public void glTexCoord4d(double s, double t, double r, double q);

	// --- [ glTexCoord4fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord4f TexCoord4f}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord4fv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord4fv TexCoord4fv} */
	public void glTexCoord4fv(FloatBuffer v);

	// --- [ glTexCoord4sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord4s TexCoord4s}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord4sv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord4sv TexCoord4sv} */
	public void glTexCoord4sv(ShortBuffer v);

	// --- [ glTexCoord4iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord4i TexCoord4i}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord4iv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord4iv TexCoord4iv} */
	public void glTexCoord4iv(IntBuffer v);

	// --- [ glTexCoord4dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoord4.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexCoord4d TexCoord4d}.
	 *
	 * @param v
	 *            the texture coordinate buffer
	 */
	public void glTexCoord4dv(ByteBuffer v);

	/** Alternative version of: {@link #glTexCoord4dv TexCoord4dv} */
	public void glTexCoord4dv(DoubleBuffer v);

	// --- [ glTexCoordPointer ] ---



	/**
	 * <p>
	 * <a href=
	 * "http://www.opengl.org/sdk/docs/man2/html/glTexCoordPointer.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies the location and organization of a texture coordinate array.
	 *
	 * @param size
	 *            the number of values per vertex that are stored in the array.
	 *            One of:<br>
	 *            1, 2, 3, 4
	 * @param type
	 *            the data type of the values stored in the array. One of:<br>
	 *            {@link #GL_SHORT SHORT}, {@link #GL_INT INT},
	 *            {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}
	 *            , {@link #GL_DOUBLE DOUBLE},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV},
	 *            {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the texture coordinate array data
	 */
	public void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer);

	/**
	 * Buffer object offset version of: {@link #glTexCoordPointer
	 * TexCoordPointer}
	 */
	public void glTexCoordPointer(int size, int type, int stride, long pointerOffset);

	/** ShortBuffer version of: {@link #glTexCoordPointer TexCoordPointer} */
	public void glTexCoordPointer(int size, int type, int stride, ShortBuffer pointer);

	/** IntBuffer version of: {@link #glTexCoordPointer TexCoordPointer} */
	public void glTexCoordPointer(int size, int type, int stride, IntBuffer pointer);

	/** FloatBuffer version of: {@link #glTexCoordPointer TexCoordPointer} */
	public void glTexCoordPointer(int size, int type, int stride, FloatBuffer pointer);

	// --- [ glTexEnvi ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexEnvi.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Sets parameters of the texture environment that specifies how texture
	 * values are interpreted when texturing a fragment, or sets
	 * per-texture-unit filtering parameters.
	 *
	 * @param target
	 *            the texture environment target. One of:<br>
	 *            {@link #GL_TEXTURE_ENV TEXTURE_ENV},
	 *            {@link GL14#GL_TEXTURE_FILTER_CONTROL TEXTURE_FILTER_CONTROL},
	 *            {@link GL20#GL_POINT_SPRITE POINT_SPRITE}
	 * @param pname
	 *            the parameter to set. One of:<br>
	 *            {@link GL20#GL_COORD_REPLACE COORD_REPLACE},
	 *            {@link #GL_TEXTURE_ENV_MODE TEXTURE_ENV_MODE},
	 *            {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS},
	 *            {@link GL13#GL_COMBINE_RGB COMBINE_RGB},
	 *            {@link GL13#GL_COMBINE_ALPHA COMBINE_ALPHA},
	 *            {@link GL15#GL_SRC0_RGB SRC0_RGB}, {@link GL15#GL_SRC1_RGB
	 *            SRC1_RGB}, {@link GL15#GL_SRC2_RGB SRC2_RGB},
	 *            {@link GL15#GL_SRC0_ALPHA SRC0_ALPHA},
	 *            {@link GL15#GL_SRC1_ALPHA SRC1_ALPHA},
	 *            {@link GL15#GL_SRC2_ALPHA SRC2_ALPHA},
	 *            {@link GL13#GL_OPERAND0_RGB OPERAND0_RGB},
	 *            {@link GL13#GL_OPERAND1_RGB OPERAND1_RGB},
	 *            {@link GL13#GL_OPERAND2_RGB OPERAND2_RGB},
	 *            {@link GL13#GL_OPERAND0_ALPHA OPERAND0_ALPHA},
	 *            {@link GL13#GL_OPERAND1_ALPHA OPERAND1_ALPHA},
	 *            {@link GL13#GL_OPERAND2_ALPHA OPERAND2_ALPHA},
	 *            {@link GL13#GL_RGB_SCALE RGB_SCALE}, {@link #GL_ALPHA_SCALE
	 *            ALPHA_SCALE}
	 * @param param
	 *            the parameter value. Scalar value or one of:<br>
	 *            {@link #GL_REPLACE REPLACE}, {@link #GL_MODULATE MODULATE},
	 *            {@link #GL_DECAL DECAL}, {@link #GL_BLEND BLEND},
	 *            {@link #GL_ADD ADD}, {@link GL13#GL_COMBINE COMBINE},
	 *            {@link GL13#GL_ADD_SIGNED ADD_SIGNED},
	 *            {@link GL13#GL_INTERPOLATE INTERPOLATE},
	 *            {@link GL13#GL_SUBTRACT SUBTRACT}, {@link GL13#GL_DOT3_RGB
	 *            DOT3_RGB}, {@link GL13#GL_DOT3_RGBA DOT3_RGBA},
	 *            {@link #GL_TEXTURE TEXTURE}, {@link GL13#GL_TEXTURE0 TEXTURE0}
	 *            , GL13.GL_TEXTURE[1-31], {@link GL13#GL_CONSTANT CONSTANT},
	 *            {@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR},
	 *            {@link GL13#GL_PREVIOUS PREVIOUS}
	 */
	public void glTexEnvi(int target, int pname, int param);

	// --- [ glTexEnviv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexEnv.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexEnvi TexEnvi}.
	 *
	 * @param target
	 *            the texture environment target. Must be:<br>
	 *            {@link #GL_TEXTURE_ENV TEXTURE_ENV}
	 * @param pname
	 *            the parameter to set. Must be:<br>
	 *            {@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}
	 * @param params
	 *            the parameter value
	 */
	public void glTexEnviv(int target, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexEnviv TexEnviv} */
	public void glTexEnviv(int target, int pname, IntBuffer params);

	// --- [ glTexEnvf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexEnvf.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Float version of {@link #glTexEnvi TexEnvi}.
	 *
	 * @param target
	 *            the texture environment target
	 * @param pname
	 *            the parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glTexEnvf(int target, int pname, float param);

	// --- [ glTexEnvfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man/html/glTexEnv.xhtml">OpenGL
	 * SDK Reference</a>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexEnvf TexEnvf}.
	 *
	 * @param target
	 *            the texture environment target. Must be:<br>
	 *            {@link #GL_TEXTURE_ENV TEXTURE_ENV}
	 * @param pname
	 *            the parameter to set. Must be:<br>
	 *            {@link #GL_TEXTURE_ENV_COLOR TEXTURE_ENV_COLOR}
	 * @param params
	 *            the parameter value
	 */
	public void glTexEnvfv(int target, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexEnvfv TexEnvfv} */
	public void glTexEnvfv(int target, int pname, FloatBuffer params);

	// --- [ glTexGeni ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexGeni.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Sets an integer texture coordinate generation parameter.
	 * 
	 * <p>
	 * A texture coordinate generation function is enabled or disabled using
	 * {@link #glEnable Enable} and {@link #glDisable Disable} with an argument
	 * of {@link #GL_TEXTURE_GEN_S TEXTURE_GEN_S}, {@link #GL_TEXTURE_GEN_T
	 * TEXTURE_GEN_T}, {@link #GL_TEXTURE_GEN_R TEXTURE_GEN_R}, or
	 * {@link #GL_TEXTURE_GEN_Q TEXTURE_GEN_Q} (each indicates the corresponding
	 * texture coordinate). When enabled, the specified texture coordinate is
	 * computed according to the current {@link #GL_EYE_LINEAR EYE_LINEAR},
	 * {@link #GL_OBJECT_LINEAR OBJECT_LINEAR} or {@link #GL_SPHERE_MAP
	 * SPHERE_MAP} specification, depending on the current setting of
	 * {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE} for that coordinate. When
	 * disabled, subsequent vertices will take the indicated texture coordinate
	 * from the current texture coordinates.
	 * </p>
	 * 
	 * <p>
	 * The initial state has the texture generation function disabled for all
	 * texture coordinates. Initially all texture generation modes are
	 * EYE_LINEAR.
	 * </p>
	 *
	 * @param coord
	 *            the coordinate for which to set the parameter. One of:<br>
	 *            {@link #GL_S S}, {@link #GL_T T}, {@link #GL_R R},
	 *            {@link #GL_Q Q}
	 * @param pname
	 *            the parameter to set. Must be:<br>
	 *            {@link #GL_TEXTURE_GEN_MODE TEXTURE_GEN_MODE}
	 * @param param
	 *            the parameter value. One of:<br>
	 *            {@link #GL_OBJECT_LINEAR OBJECT_LINEAR}, {@link #GL_EYE_LINEAR
	 *            EYE_LINEAR}, {@link #GL_SPHERE_MAP SPHERE_MAP},
	 *            {@link GL13#GL_REFLECTION_MAP REFLECTION_MAP},
	 *            {@link GL13#GL_NORMAL_MAP NORMAL_MAP}
	 */
	public void glTexGeni(int coord, int pname, int param);

	// --- [ glTexGeniv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexGen.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord
	 *            the coordinate for which to set the parameter
	 * @param pname
	 *            the parameter to set. One of:<br>
	 *            {@link #GL_OBJECT_PLANE OBJECT_PLANE}, {@link #GL_EYE_PLANE
	 *            EYE_PLANE}
	 * @param params
	 *            the parameter value
	 */
	public void glTexGeniv(int coord, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexGeniv TexGeniv} */
	public void glTexGeniv(int coord, int pname, IntBuffer params);

	// --- [ glTexGenf ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexGenf.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Float version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord
	 *            the coordinate for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glTexGenf(int coord, int pname, float param);

	// --- [ glTexGenfv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexGen.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexGenf TexGenf}.
	 *
	 * @param coord
	 *            the coordinate for which to set the parameter
	 * @param pname
	 *            the parameter to set. One of:<br>
	 *            {@link #GL_OBJECT_PLANE OBJECT_PLANE}, {@link #GL_EYE_PLANE
	 *            EYE_PLANE}
	 * @param params
	 *            the parameter value
	 */
	public void glTexGenfv(int coord, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexGenfv TexGenfv} */
	public void glTexGenfv(int coord, int pname, FloatBuffer params);

	// --- [ glTexGend ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexGend.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glTexGeni TexGeni}.
	 *
	 * @param coord
	 *            the coordinate for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param param
	 *            the parameter value
	 */
	public void glTexGend(int coord, int pname, double param);

	// --- [ glTexGendv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTexGen.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glTexGend TexGend}.
	 *
	 * @param coord
	 *            the coordinate for which to set the parameter
	 * @param pname
	 *            the parameter to set
	 * @param params
	 *            the parameter value
	 */
	public void glTexGendv(int coord, int pname, ByteBuffer params);

	/** Alternative version of: {@link #glTexGendv TexGendv} */
	public void glTexGendv(int coord, int pname, DoubleBuffer params);

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

	// --- [ glTranslatef ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTranslatef.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Manipulates the current matrix with a translation matrix along the x-, y-
	 * and z- axes.
	 * 
	 * <p>
	 * Calling this function is equivalent to calling {@link #glMultMatrixf
	 * MultMatrixf} with the following matrix:
	 * <table border=1 cellspacing=0 cellpadding=2 class="lwjgl matrix">
	 * <tr>
	 * <td>1</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>x</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>1</td>
	 * <td>0</td>
	 * <td>y</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>1</td>
	 * <td>z</td>
	 * </tr>
	 * <tr>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>0</td>
	 * <td>1</td>
	 * </tr>
	 * </table>
	 * </p>
	 *
	 * @param x
	 *            the x-axis translation
	 * @param y
	 *            the y-axis translation
	 * @param z
	 *            the z-axis translation
	 */
	public void glTranslatef(float x, float y, float z);

	// --- [ glTranslated ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glTranslated.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glTranslatef Translatef}.
	 *
	 * @param x
	 *            the x-axis translation
	 * @param y
	 *            the y-axis translation
	 * @param z
	 *            the z-axis translation
	 */
	public void glTranslated(double x, double y, double z);

	// --- [ glVertex2f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and
	 * {@link #glEnd End} by giving its coordinates in two dimensions. The z
	 * coordinate is implicitly set to zero and the w coordinate to one.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 */
	public void glVertex2f(float x, float y);

	// --- [ glVertex2s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 */
	public void glVertex2s(short x, short y);

	// --- [ glVertex2i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 */
	public void glVertex2i(int x, int y);

	// --- [ glVertex2d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 */
	public void glVertex2d(double x, double y);

	// --- [ glVertex2fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex2f Vertex2f}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex2fv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex2fv Vertex2fv} */
	public void glVertex2fv(FloatBuffer coords);

	// --- [ glVertex2sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex2s Vertex2s}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex2sv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex2sv Vertex2sv} */
	public void glVertex2sv(ShortBuffer coords);

	// --- [ glVertex2iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex2i Vertex2i}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex2iv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex2iv Vertex2iv} */
	public void glVertex2iv(IntBuffer coords);

	// --- [ glVertex2dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex2.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex2d Vertex2d}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex2dv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex2dv Vertex2dv} */
	public void glVertex2dv(DoubleBuffer coords);

	// --- [ glVertex3f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and
	 * {@link #glEnd End} by giving its coordinates in three dimensions. The w
	 * coordinate is implicitly set to one.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 */
	public void glVertex3f(float x, float y, float z);

	// --- [ glVertex3s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 */
	public void glVertex3s(short x, short y, short z);

	// --- [ glVertex3i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 */
	public void glVertex3i(int x, int y, int z);

	// --- [ glVertex3d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 */
	public void glVertex3d(double x, double y, double z);

	// --- [ glVertex3fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex3f Vertex3f}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex3fv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex3fv Vertex3fv} */
	public void glVertex3fv(FloatBuffer coords);

	// --- [ glVertex3sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex3s Vertex3s}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex3sv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex3sv Vertex3sv} */
	public void glVertex3sv(ShortBuffer coords);

	// --- [ glVertex3iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex3i Vertex3i}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex3iv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex3iv Vertex3iv} */
	public void glVertex3iv(IntBuffer coords);

	// --- [ glVertex3dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex3.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex3d Vertex3d}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex3dv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex3dv Vertex3dv} */
	public void glVertex3dv(DoubleBuffer coords);

	// --- [ glVertex4f ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4f.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies a single vertex between {@link #glBegin Begin} and
	 * {@link #glEnd End} by giving its coordinates in four dimensions.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 * @param w
	 *            the vertex w coordinate
	 */
	public void glVertex4f(float x, float y, float z, float w);

	// --- [ glVertex4s ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4s.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Short version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 * @param w
	 *            the vertex w coordinate
	 */
	public void glVertex4s(short x, short y, short z, short w);

	// --- [ glVertex4i ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4i.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Integer version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 * @param w
	 *            the vertex w coordinate
	 */
	public void glVertex4i(int x, int y, int z, int w);

	// --- [ glVertex4d ] ---

	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4d.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Double version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param x
	 *            the vertex x coordinate
	 * @param y
	 *            the vertex y coordinate
	 * @param z
	 *            the vertex z coordinate
	 * @param w
	 *            the vertex w coordinate
	 */
	public void glVertex4d(double x, double y, double z, double w);

	// --- [ glVertex4fv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex4f Vertex4f}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex4fv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex4fv Vertex4fv} */
	public void glVertex4fv(FloatBuffer coords);

	// --- [ glVertex4sv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex4s Vertex4s}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex4sv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex4sv Vertex4sv} */
	public void glVertex4sv(ShortBuffer coords);

	// --- [ glVertex4iv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex4i Vertex4i}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex4iv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex4iv Vertex4iv} */
	public void glVertex4iv(IntBuffer coords);

	// --- [ glVertex4dv ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertex4.xhtml">OpenGL
	 * SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Pointer version of {@link #glVertex4d Vertex4d}.
	 *
	 * @param coords
	 *            the vertex buffer
	 */
	public void glVertex4dv(ByteBuffer coords);

	/** Alternative version of: {@link #glVertex4dv Vertex4dv} */
	public void glVertex4dv(DoubleBuffer coords);

	// --- [ glVertexPointer ] ---



	/**
	 * <p>
	 * <a href="http://www.opengl.org/sdk/docs/man2/html/glVertexPointer.xhtml">
	 * OpenGL SDK Reference</a> -
	 * <em>This function is deprecated and unavailable in the Core profile</em>
	 * </p>
	 * 
	 * Specifies the location and organization of a vertex array.
	 *
	 * @param size
	 *            the number of values per vertex that are stored in the array.
	 *            One of:<br>
	 *            2, 3, 4
	 * @param type
	 *            the data type of the values stored in the array. One of:<br>
	 *            {@link #GL_SHORT SHORT}, {@link #GL_INT INT},
	 *            {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link #GL_FLOAT FLOAT}
	 *            , {@link #GL_DOUBLE DOUBLE},
	 *            {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV
	 *            UNSIGNED_INT_2_10_10_10_REV},
	 *            {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride
	 *            the vertex stride in bytes. If specified as zero, then array
	 *            elements are stored sequentially
	 * @param pointer
	 *            the vertex array data
	 */
	public void glVertexPointer(int size, int type, int stride, ByteBuffer pointer);

	/**
	 * Buffer object offset version of: {@link #glVertexPointer VertexPointer}
	 */
	public void glVertexPointer(int size, int type, int stride, long pointerOffset);

	/** ShortBuffer version of: {@link #glVertexPointer VertexPointer} */
	public void glVertexPointer(int size, int type, int stride, ShortBuffer pointer);

	/** IntBuffer version of: {@link #glVertexPointer VertexPointer} */
	public void glVertexPointer(int size, int type, int stride, IntBuffer pointer);

	/** FloatBuffer version of: {@link #glVertexPointer VertexPointer} */
	public void glVertexPointer(int size, int type, int stride, FloatBuffer pointer);

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
