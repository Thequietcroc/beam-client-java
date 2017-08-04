package com.mixer.api.resource.interactive;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.mixer.api.resource.MixerUser;

/**
 * Describes an interactive game listing.
 */
public class InteractiveGameListing implements Serializable {
	public int id;
    public int ownerId;
    public String name;
    public String coverUrl;
    public String description;
    public boolean hasPublishedVersions;
    public String installation;
    public Date createdAt;
    public Date updatedAt;    
	public List<InteractiveVersion> versions;
}
