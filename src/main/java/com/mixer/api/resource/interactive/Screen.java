package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.List;

public class Screen implements Serializable {
	public int id;
	public List<Blueprint> blueprint;
	public InteractiveScreenAnalysis analysis;

	class InteractiveScreenAnalysis implements Serializable {
		public Position position;
		public boolean clicks;

		class Position {
			public boolean mean;
			public boolean stdDev;
		}
	}
}
