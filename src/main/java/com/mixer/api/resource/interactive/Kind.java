package com.mixer.api.resource.interactive;

import com.google.gson.annotations.SerializedName;

public enum Kind {
	@SerializedName("button")
	BUTTON, @SerializedName("joystick")
	JOYSTICK,
}