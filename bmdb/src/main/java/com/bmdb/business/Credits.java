package com.bmdb.business;

public class Credits {
	private int ID;
	private int actorID;
	private int movieID;
	private String characterName;
	
	public Credits(int iD, int actorID, int movieID, String characterName) {
		super();
		ID = iD;
		this.actorID = actorID;
		this.movieID = movieID;
		this.characterName = characterName;
	}

	public Credits() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getActorID() {
		return actorID;
	}

	public void setActorID(int actorID) {
		this.actorID = actorID;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	@Override
	public String toString() {
		return "Credits [ID=" + ID + ", actorID=" + actorID + ", movieID=" + movieID + ", characterName="
				+ characterName + "]";
	}
	
	
	
	

}
