package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String ePosta;
	private String parola;
	

	public User(int id, String firstName, String lastName, String ePosta, String parola) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.parola = parola;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
	
	
}
