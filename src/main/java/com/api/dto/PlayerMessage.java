package com.api.dto;

public class PlayerMessage  implements Message{

	private String type;
	private String gameId;
	private String player;
	private String content;
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String getGameId() {
		// TODO Auto-generated method stub
		return gameId;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
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
