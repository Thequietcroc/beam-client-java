package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.List;

public class Tactile implements Serializable {
	public int id;
	public List<Blueprint> blueprint;
	public int key;
	public String text;
	public Cost cost;
	public Cooldown cooldown;
	public InteractiveTactileAnalysis analysis;

	class Cost implements Serializable {
		public Press press;

		class Press implements Serializable {
			public int cost;
		}
	}

	class Cooldown implements Serializable {
		public int press;
	}

	class InteractiveTactileAnalysis implements Serializable {
		public boolean holding;
		public boolean frequency;
	}
}
