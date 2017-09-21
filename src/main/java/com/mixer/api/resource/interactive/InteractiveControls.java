package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.List;

/**
 * Describes interactive controls. TODO (JamyDev)
 */
public class InteractiveControls implements Serializable {
	public int reportInterval;
	public List<Tactile> tactiles;
	public List<Joystick> joysticks;
	public List<Screen> screens;
	public List<InteractiveScene> scenes;
}

class Blueprint implements Serializable {
	public String state;
	public String grid;
	public int x;
	public int y;
	public int width;
	public int height;
}
