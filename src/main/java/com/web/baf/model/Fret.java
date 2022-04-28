package com.web.baf.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fret")
public class Fret {
	@Id
	@GeneratedValue
	@Column(name = "fret_id")
	private Long id;
	@Column(nullable = false)
	private String type;
	@Column(nullable = false)
	private String lieuDepart;
	@Column(nullable = false)
	private String lieuArrivee;
	@Column(nullable = false)
	private String heureDepart;
	@Column(nullable = false)
	private String attendu;
	@Column(nullable = false)
	private String dimension;
	@Column(nullable = false)
	private int volume;
	@Column(nullable = false)
	private int nbPalettes;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "vehicle_plate")
	 private Vehicle vehicle;
	
	
	public Fret(Long id, String type, String lieuDepart, String lieuArrivee, String heureDepart, String attendu,
			String dimension, int volume, int nbPalettes) {
		super();
		this.id = id;
		this.type = type;
		this.lieuDepart = lieuDepart;
		this.lieuArrivee = lieuArrivee;
		this.heureDepart = heureDepart;
		this.attendu = attendu;
		this.dimension = dimension;
		this.volume = volume;
		this.nbPalettes = nbPalettes;
	}
	public Fret() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLieuDepart() {
		return lieuDepart;
	}
	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}
	public String getLieuArrivee() {
		return lieuArrivee;
	}
	public void setLieuArrivee(String lieuArrivee) {
		this.lieuArrivee = lieuArrivee;
	}
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public String getAttendu() {
		return attendu;
	}
	public void setAttendu(String attendu) {
		this.attendu = attendu;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getNbPalettes() {
		return nbPalettes;
	}
	public void setNbPalettes(int nbPalettes) {
		this.nbPalettes = nbPalettes;
	}
	@Override
	public String toString() {
		return "Fret [id=" + id + ", type=" + type + ", lieuDepart=" + lieuDepart + ", lieuArrivee=" + lieuArrivee
				+ ", heureDepart=" + heureDepart + ", attendu=" + attendu + ", dimension=" + dimension + ", volume="
				+ volume + ", nbPalettes=" + nbPalettes + "]";
	}
	
	
	
}
