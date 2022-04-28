package com.web.baf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class Personne {
	
	@Id
	@GeneratedValue
	@Column(name = "personne_id")
	protected Long id;
	@Column(nullable = false)
	protected int isEnabled;
	@Column()
	protected String nom;
	@Column(nullable = false)
	protected String prenom;
	@Column(nullable = false)
	protected int numeroSociete;
	@Column(nullable = false)
	protected String nomSociete;
	@Column(nullable = false)
	protected String email;
	@Column(nullable = false)
	protected int codeActivation;
	@Column(nullable = false)
	protected String localisation;
	@Column(nullable = false)
	protected int numeroTelephone;
	@Column(nullable = false)
	protected int honoraires;
	
	



	public Personne(Long id, int isEnabled, String nom, String prenom, int numeroSociete, String nomSociete,
			String email, int codeActivation, String localisation, int numeroTelephone, int honoraires) {
		super();
		this.id = id;
		this.isEnabled = isEnabled;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroSociete = numeroSociete;
		this.nomSociete = nomSociete;
		this.email = email;
		this.codeActivation = codeActivation;
		this.localisation = localisation;
		this.numeroTelephone = numeroTelephone;
		this.honoraires = honoraires;
	}




	public Personne() {
		super();
	}






	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}

	public int getIsEnabled() {
		return isEnabled;
	}




	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}



	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public int getNumeroSociete() {
		return numeroSociete;
	}




	public void setNumeroSociete(int numeroSociete) {
		this.numeroSociete = numeroSociete;
	}




	public String getNomSociete() {
		return nomSociete;
	}




	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getLocalisation() {
		return localisation;
	}




	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}




	public int getNumeroTelephone() {
		return numeroTelephone;
	}




	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}




	public int getHonoraires() {
		return honoraires;
	}




	public void setHonoraires(int honoraires) {
		this.honoraires = honoraires;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




	@Override
	public String toString() {
		return "Personne [id=" + id + ", isEnabled=" + isEnabled + ", nom=" + nom + ", prenom=" + prenom
				+ ", numeroSociete=" + numeroSociete + ", nomSociete=" + nomSociete + ", email=" + email
				+ ", codeActivation=" + codeActivation + ", localisation=" + localisation + ", numeroTelephone="
				+ numeroTelephone + ", honoraires=" + honoraires + "]";
	}




	
	
	

}
