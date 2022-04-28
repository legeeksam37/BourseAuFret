package com.web.baf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
	
	@Id
	@GeneratedValue
	@Column(name = "reservation_id")
	private Long idReservation;
	@Column(nullable = false)
	private Long idFret;
	@Column(nullable = false)
	private String vehicleLicencePlate;
	
	public Reservation(Long idReservation, Long idFret, String vehicleLicencePlate) {
		super();
		this.idReservation = idReservation;
		this.idFret = idFret;
		this.vehicleLicencePlate = vehicleLicencePlate;
	}

	public Reservation() {
		super();
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Long getIdFret() {
		return idFret;
	}

	public void setIdFret(Long idFret) {
		this.idFret = idFret;
	}

	public String getVehicleLicencePlate() {
		return vehicleLicencePlate;
	}

	public void setVehicleLicencePlate(String vehicleLicencePlate) {
		this.vehicleLicencePlate = vehicleLicencePlate;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", idFret=" + idFret + ", vehicleLicencePlate="
				+ vehicleLicencePlate + "]";
	}
	

	
	
	
}
