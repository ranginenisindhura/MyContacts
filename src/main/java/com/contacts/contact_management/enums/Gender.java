/**
 * This source code is property of MyContacts Project Team.
 */
package com.contacts.contact_management.enums;

/**
 * @author Sandeep
 */
public enum Gender {

	Male("male"), Female("female");

	private final String gender;

	private Gender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

}
