package com.web.baf.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@Column(name = "vehicle_licence_plate", unique=true,columnDefinition="VARCHAR(64)")
	private String vehicle_licence_plate;
	@Column(nullable = false)
	private String type;
	@Column(nullable = false)
	private String marque;
	@Column(nullable = false)
	private String lieu;
	@Column(nullable = false)
	private boolean available;
	@Column(nullable = false)
	private int volumeDisponible;
	@Column(nullable = false)
	private int nbPalettesDisponibles;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
	private List<Fret> frets; 
	
	
	
	public Vehicle(String vehicle_licence_plate, String type, String marque, String lieu, boolean available,
			int volumeDisponible, int nbPalettesDisponibles) {
		super();
		this.vehicle_licence_plate = vehicle_licence_plate;
		this.type = type;
		this.marque = marque;
		this.lieu = lieu;
		this.available = available;
		this.volumeDisponible = volumeDisponible;
		this.nbPalettesDisponibles = nbPalettesDisponibles;
	}
	
	

	public boolean isAvailable() {
		return available;
	}



	public void setAvailable(boolean available) {
		this.available = available;
	}



	public Vehicle() {
		super();
	}

	public String getVehicle_licence_plate() {
		return vehicle_licence_plate;
	}

	public void setVehicle_licence_plate(String vehicle_licence_plate) {
		this.vehicle_licence_plate = vehicle_licence_plate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public int getVolumeDisponible() {
		return volumeDisponible;
	}

	public void setVolumeDisponible(int volumeDisponible) {
		this.volumeDisponible = volumeDisponible;
	}

	public int getNbPalettesDisponibles() {
		return nbPalettesDisponibles;
	}

	public void setNbPalettesDisponibles(int nbPalettesDisponibles) {
		this.nbPalettesDisponibles = nbPalettesDisponibles;
	}



	@Override
	public String toString() {
		return "Vehicle [vehicle_licence_plate=" + vehicle_licence_plate + ", type=" + type + ", marque=" + marque
				+ ", lieu=" + lieu + ", available=" + available + ", volumeDisponible=" + volumeDisponible
				+ ", nbPalettesDisponibles=" + nbPalettesDisponibles + "]";
	}



}
