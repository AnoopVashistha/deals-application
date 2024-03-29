/**
 * 
 */
package com.sg.dealProject.entity;

/**
 * @author Anoop
 *
 */
@Entity
@Table(name = "client")
public class Client {
	private String name;
	private String country;

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

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}