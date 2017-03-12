package edu.epam.service.rs;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "ticket")

public class Ticket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String Surname;
	private String initial;
	private String destination;
	public int getId() {
		return id;
	}
	  @XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	  @XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	  @XmlElement
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getInitial() {
		return initial;
	}
	  @XmlElement
	public void setInitial(String initial) {
		this.initial = initial;
	}
	public String getDestination() {
		return destination;
	}
	  @XmlElement
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
