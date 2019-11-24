package com.aerolinea.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que define una entidad para el mapeo O/R de la tabla Vuelo.
 */
@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trayecto_id")
	private Long id;

	@OneToOne
	@MapsId
	private Avion avion;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private Trayecto trayecto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Trayecto getTrayecto() {
		return trayecto;
	}

	public void setTrayecto(Trayecto trayecto) {
		this.trayecto = trayecto;
	}

	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", avion=" + avion + ", trayecto=" + trayecto + "]";
	}

}