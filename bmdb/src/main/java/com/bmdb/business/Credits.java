package com.bmdb.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Credits {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	@ManyToOne
	@JoinColumn(name="actorID")
	private Actor actor;
	@ManyToOne
	@JoinColumn(name="movieID")
	private Movie movie;
	private String characterName;
	
	public Credits(int iD, Actor actor, Movie movie, String characterName) {
		super();
		this.ID = iD;
		this.actor = actor;
		this.movie = movie;
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

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	@Override
	public String toString() {
		return "Credits [ID=" + ID + ", actor=" + actor + ", movie=" + movie + ", characterName="
				+ characterName + "]";
	}
	
	
	
	

}
