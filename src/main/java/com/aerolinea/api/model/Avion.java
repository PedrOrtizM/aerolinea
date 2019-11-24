package com.aerolinea.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * Clase que define una entidad para el mapeo O/R de la tabla Avion.
 */
@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "avion_id")
	private Long id;

	@Size(max = 10)
	@Column(name = "num_serie", nullable = false, length = 10)
	private String numSerie;

	@Column(name = "num_sillas", nullable = false)
	private Integer numSillas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public Integer getNumSillas() {
		return numSillas;
	}

	public void setNumSillas(Integer numSillas) {
		this.numSillas = numSillas;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", numSerie=" + numSerie + ", numSillas=" + numSillas + "]";
	}

}