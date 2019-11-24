package com.aerolinea.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Clase que define una entidad para el mapeo O/R de la tabla Trayecto.
 */
@Entity
@Table(name = "trayecto")
public class Trayecto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trayecto_id")
	private Long id;

	@Size(max = 80)
	@Column(name = "origen", nullable = false, length = 80)
	private String originCity;

	@Size(max = 80)
	@Column(name = "destino", nullable = false, length = 80)
	private String destinationCity;

	@Column(name = "hora_salida", nullable = false)
	private Date dateExit;

	@Column(name = "hora_llegada", nullable = false)
	private Date dateArrival;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getDateExit() {
		return dateExit;
	}

	public void setDateExit(Date dateExit) {
		this.dateExit = dateExit;
	}

	public Date getDateArrival() {
		return dateArrival;
	}

	public void setDateArrival(Date dateArrival) {
		this.dateArrival = dateArrival;
	}

	@Override
	public String toString() {
		return "Trayecto [id=" + id + ", originCity=" + originCity + ", destinationCity=" + destinationCity
				+ ", dateExit=" + dateExit + ", dateArrival=" + dateArrival + "]";
	}

}