package com.bmdb.business;

public class Actor {
	private int ID;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;
	
	public Actor(int ID, String firstName, String lastName, String gender, String birthDate) {
		super();
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	public Actor() {
		super();
	}
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Actor [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", birthDate="
				+ birthDate + "]";
	}
	
	
	
	
	
}
