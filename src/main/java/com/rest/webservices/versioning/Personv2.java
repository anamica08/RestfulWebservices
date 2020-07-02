package com.rest.webservices.versioning;

public class Personv2 {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Personv2(String name) {
		super();
		this.name = name;
	}
	
	
	

}
