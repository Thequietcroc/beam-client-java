package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Control implements Serializable {
	enum Size {
		@SerializedName("large")
		LARGE, @SerializedName("medium")
		MEDIUM, @SerializedName("small")
		SMALL,
	}

	public int sampleRate;
	public Kind kind;
	public String controlID;
	public List<Position> position;
	public String text;
	public Map<String, MetaValue<?>> meta;
	public Long cost;

	class Position implements Serializable {
		public Size size;
		public int width;
		public int height;
		public int x;
		public int y;
	}

	class MetaValue<T> implements Serializable {
		public T value;
	}
}
