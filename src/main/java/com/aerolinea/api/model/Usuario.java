package com.aerolinea.api.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usuario_id")
	private Long id;

	@Size(max = 80)
	@Column(name = "nombres", nullable = false, length = 80)
	private String name;

	@Size(max = 80)
	@Column(name = "nacionalidad", nullable = false, length = 80)
	private String nationality;

	@Size(max = 15)
	@Column(name = "nombres", nullable = false, length = 15)
	private String cellphone;

	@JoinTable(name = "usuario_con_reserva", joinColumns = @JoinColumn(name = "usuario_usuario_id"), inverseJoinColumns = @JoinColumn(name = "reserva_reserva_id"))
	@ManyToMany
	Set<Reserva> reserva;

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

	public Set<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(Set<Reserva> reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", nationality=" + nationality + ", cellphone=" + cellphone
				+ ", reserva=" + reserva + "]";
	}

}