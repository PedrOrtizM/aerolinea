package com.aerolinea.api.domain;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = -4911762629965132125L;

	private Long id;

	private String name;

	private String nationality;

	private String cellphone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", nationality=" + nationality + ", cellphone=" + cellphone
				+ "]";
	}

}