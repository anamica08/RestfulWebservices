package com.rest.webservices.somebean;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("somefilter")
public class Somebean {

	private String feild1;
	private String feild2;
	private String feild3;
	public Somebean(String feild1, String feild2, String feild3) {
		super();
		this.feild1 = feild1;
		this.feild2 = feild2;
		this.feild3 = feild3;
	}
	/**
	 * @return the feild1
	 */
	public String getFeild1() {
		return feild1;
	}
	/**
	 * @param feild1 the feild1 to set
	 */
	public void setFeild1(String feild1) {
		this.feild1 = feild1;
	}
	/**
	 * @return the feild2
	 */
	public String getFeild2() {
		return feild2;
	}
	/**
	 * @param feild2 the feild2 to set
	 */
	public void setFeild2(String feild2) {
		this.feild2 = feild2;
	}
	/**
	 * @return the feild3
	 */
	public String getFeild3() {
		return feild3;
	}
	/**
	 * @param feild3 the feild3 to set
	 */
	public void setFeild3(String feild3) {
		this.feild3 = feild3;
	}
	
	
}
