package com.surgeplay.glow.capsule;

import static com.surgeplay.glow.GLConstant.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

import com.surgeplay.glow.gl.CompatibleGL;

public class ArrayBuffer {
	private ArrayList<Float> immediateData = null;
	
	private int handle = 0;
	
	public ArrayBuffer() {
		this(CompatibleGL.getInstance());
	}
	
	public ArrayBuffer(CompatibleGL gl) {
		this.handle = gl.glGenBuffers();
	}
	
	public void setData(FloatBuffer data, AccessHint access, FrequencyHint updates) {
		CompatibleGL gl = CompatibleGL.getInstance();
		gl.glBindBuffer(GL_ARRAY_BUFFER, handle);
		gl.glBufferData(GL_ARRAY_BUFFER, data, mapHint(access, updates));
	}
	
	public void setVertexStructure(String attribute, int offset, int count) {
		
	}
	
	
	/**
	 * Starts simulated immediate-mode rendering. Accumulates information in a buffer and then writes it
	 * when {@link #finishAddingData()} is called.
	 */
	public ArrayBuffer startAddingData() {
		if (immediateData==null) {
			immediateData = new ArrayList<Float>();
		} else {
			immediateData.clear();
		}
		return this;
	}
	
	/**
	 * Simulated immediate-mode rendering. Uploads buffer data accumulated since {@link #startAddingData()}
	 * was called. Data uploaded here will remove/replace anything that had been uploaded previously.
	 */
	public ArrayBuffer finishAddingData() {
		ByteBuffer buf = ByteBuffer.allocateDirect(immediateData.size()*4).order(ByteOrder.nativeOrder());
		for(int i=0; i<immediateData.size(); i++) {
			buf.putFloat(immediateData.get(i));
		}
		buf.rewind();
		immediateData.clear();
		
		CompatibleGL gl = CompatibleGL.getInstance();
		gl.glBindBuffer(GL_ARRAY_BUFFER, handle);
		gl.glBufferData(GL_ARRAY_BUFFER, buf, GL_STATIC_DRAW);
		
		return this;
	}
	
	/**
	 * Adds a single element to the local buffer.
	 * 
	 * Call {@link #startAddingData()} first!
	 * Will be uploaded when {@link #finishAddingData()} is called.
	 */
	public ArrayBuffer addData(float x) {
		immediateData.add(x);
		return this;
	}
	
	/**
	 * Adds a 2D vertex to the local buffer.
	 * 
	 * Call {@link #startAddingData()} first!
	 * Will be uploaded when {@link #finishAddingData()} is called.
	 */
	public ArrayBuffer addData(float x, float y) {
		immediateData.add(x);
		immediateData.add(y);
		return this;
	}
	
	/**
	 * Adds a 3D vertex or RGB color to the local buffer.
	 * 
	 * Call {@link #startAddingData()} first!
	 * Will be uploaded when {@link #finishAddingData()} is called.
	 */
	public ArrayBuffer addData(float x, float y, float z) {
		immediateData.add(x);
		immediateData.add(y);
		immediateData.add(z);
		return this;
	}
	
	/**
	 * Adds a 4D vertex or RGBA color to the local buffer
	 * 
	 * Call {@link #startAddingData()} first!
	 * Will be uploaded when {@link #finishAddingData()} is called.
	 */
	public ArrayBuffer addData(float x, float y, float z, float w) {
		immediateData.add(x);
		immediateData.add(y);
		immediateData.add(z);
		immediateData.add(w);
		return this;
	}
	
	private static int mapHint(AccessHint access, FrequencyHint updates) {
		if (access==AccessHint.DRAW && updates==FrequencyHint.STREAM) return GL_STREAM_DRAW;
		if (access==AccessHint.READ && updates==FrequencyHint.STREAM) return GL_STREAM_READ;
		if (access==AccessHint.COPY && updates==FrequencyHint.STREAM) return GL_STREAM_COPY;
		
		if (access==AccessHint.DRAW && updates==FrequencyHint.STATIC) return GL_STATIC_DRAW;
		if (access==AccessHint.READ && updates==FrequencyHint.STATIC) return GL_STATIC_READ;
		if (access==AccessHint.COPY && updates==FrequencyHint.STATIC) return GL_STATIC_COPY;
		
		if (access==AccessHint.DRAW && updates==FrequencyHint.DYNAMIC) return GL_DYNAMIC_DRAW;
		if (access==AccessHint.READ && updates==FrequencyHint.DYNAMIC) return GL_DYNAMIC_READ;
		if (access==AccessHint.COPY && updates==FrequencyHint.DYNAMIC) return GL_DYNAMIC_COPY;
		
		return GL_STATIC_DRAW;
	}
	
	@Override
	public void finalize() {
		if (handle!=0) CompatibleGL.getInstance().glDeleteBuffers(handle);
	}
	
	public static enum AccessHint {
		DRAW,
		READ,
		COPY;
	}
	
	public static enum FrequencyHint {
		STREAM,
		STATIC,
		DYNAMIC;
	}
	
	private static class AttributeDataAlignment {
		public int numElements;
		public int offset;
	}
}
