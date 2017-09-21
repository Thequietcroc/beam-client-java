package com.mixer.api.services.impl;

import com.google.common.util.concurrent.CheckedFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.mixer.api.MixerAPI;
import com.mixer.api.exceptions.MixerException;
import com.mixer.api.futures.checkers.Interactive;
import com.mixer.api.resource.channel.MixerChannel;
import com.mixer.api.resource.interactive.InteractiveConnectionInfo;
import com.mixer.api.resource.interactive.InteractiveGame;
import com.mixer.api.resource.interactive.InteractiveVersion;
import com.mixer.api.resource.interactive.RobotInfo;
import com.mixer.api.response.interactive.InteractiveGameVersionsResponse;
import com.mixer.api.response.interactive.InteractiveOwnedResponse;
import com.mixer.api.services.AbstractHTTPService;

public class InteractiveService extends AbstractHTTPService {
	public InteractiveService(MixerAPI mixer) {
		super(mixer, "interactive");
	}

	public CheckedFuture<RobotInfo, MixerException> getRobotCredentials(int channelId) {
		MixerChannel channel = new MixerChannel();
		channel.id = channelId;

		return this.getRobotCredentials(channel);
	}

	public ListenableFuture<InteractiveConnectionInfo> getInteractive(int channelId) {
		return this.get(String.format("%d", channelId), InteractiveConnectionInfo.class);
	}

	public CheckedFuture<RobotInfo, MixerException> getRobotCredentials(MixerChannel channel) {
		return new Interactive.UnsetGameChecker()
				.check(this.get(String.format("%d/robot", channel.id), RobotInfo.class));
	}

	public ListenableFuture<InteractiveGame> getInteractiveGame(int gameId) {
		return this.get(String.format("games/%d", gameId), InteractiveGame.class);
	}

	public ListenableFuture<InteractiveVersion> getInteractiveVersion(int versionId) {
		return this.get(String.format("versions/%d", versionId), InteractiveVersion.class);
	}

	public ListenableFuture<InteractiveOwnedResponse> getInteractiveGamesOwned(int userId) {
		return this.get(String.format("games/owned?user=%d", userId), InteractiveOwnedResponse.class);
	}
	
	public ListenableFuture<InteractiveGameVersionsResponse> getInteractiveGameVersions(int gameId) {
		return this.get(String.format("games/%d/versions", gameId), InteractiveGameVersionsResponse.class);
	}
}
