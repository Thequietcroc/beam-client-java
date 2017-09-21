package com.mixer.api.resource.interactive;

import java.io.Serializable;

public class InteractiveConnectionInfo implements Serializable {
	public String				address;
	public String				key;
	public Number				influence;
	public InteractiveVersion	version;
}
