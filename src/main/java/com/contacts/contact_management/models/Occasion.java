/**
 * This class is only for MyContacts Team.
 */
package com.contacts.contact_management.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Rangi
 *
 */
@Entity
public class Occasion extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3315674145451429947L;

	@Column(name = "OCCASION_NAME")
	private String name;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "REMINDER")
	private boolean remindMe;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the remindMe
	 */
	public boolean isRemindMe() {
		return remindMe;
	}

	/**
	 * @param remindMe
	 *            the remindMe to set
	 */
	public void setRemindMe(boolean remindMe) {
		this.remindMe = remindMe;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Occasion [name=" + name + ", date=" + date + ", remindMe=" + remindMe + "]";
	}

}
