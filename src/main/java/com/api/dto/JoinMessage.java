package com.api.dto;

public class JoinMessage implements Message {

	  	private String type;
	    private String gameId;
	    private String player;
	    private String content;
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGameId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
