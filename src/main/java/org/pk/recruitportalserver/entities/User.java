package org.pk.recruitportalserver.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	private Long id;
	private String firstName;
	private String LastName;
	
	public User() {
	
	}
	
	
	public User(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="first_name" )
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name ="last_name")
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	
	
	
	

}
