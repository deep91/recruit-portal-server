package org.pk.recruitportalserver.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionType;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private Date registered_on;

	public User(Long id, String first_name, String last_name, String email, String password, Date registered_on) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.registered_on = registered_on;
	}

	public User() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique = true,nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "first_name",nullable = false)
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Column(name = "last_name",nullable = false)
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Column (name="email" ,nullable=false, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="password",nullable =false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="registered_on")
	@Temporal (TemporalType.TIMESTAMP)
	public Date getRegistered_on() {
		return registered_on;
	}

	public void setRegistered_on(Date registered_on) {
		this.registered_on = registered_on;
	}
	
	

}
