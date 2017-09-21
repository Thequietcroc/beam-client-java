package com.mixer.api.resource.interactive;

import com.google.gson.annotations.SerializedName;

public enum VersionState {
	@SerializedName("draft")
	DRAFT, @SerializedName("pending")
	PENDING, @SerializedName("published")
	PUBLISHED,
}