package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class InteractiveScene implements Serializable {
	public String sceneID;
	public List<Control> controls;
}
