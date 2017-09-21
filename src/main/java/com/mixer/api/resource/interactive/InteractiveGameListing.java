package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.mixer.api.resource.MixerUser;

/**
 * Describes an interactive game listing.
 */
public class InteractiveGameListing extends InteractiveGame {
	public List<InteractiveVersion> versions;
}
