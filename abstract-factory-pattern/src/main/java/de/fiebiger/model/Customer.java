package de.fiebiger.model;

/**
 * Created by tfiebige on 15.03.16.
 */
public abstract class Customer {
	private String email;

	public Customer(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
}
