package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.List;

public class Joystick implements Serializable {
	public int id;
	public List<Blueprint> blueprint;
	public InteractiveJoyStickAnalysis analysis;

	class InteractiveJoyStickAnalysis implements Serializable {
		public Coords coords;

		class Coords implements Serializable {
			public boolean mean;
			public boolean stdDev;
		}
	}
}
