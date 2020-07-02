package com.rest.webservices.versioning;

public class Personv1 {
	
	private Name name ;
	
	

	public Personv1(Name name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	

}
