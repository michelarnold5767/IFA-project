package com.ifa.village.controller;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "utilisateur")
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
//	@OneToMany(mappedBy="utilisateur")
//	List<Outil> listeOutil = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
//	public List<Outil> getListeOutil() {
//		return listeOutil;
//	}
//	public void setListeOutil(List<Outil> listeOutil) {
//		this.listeOutil = listeOutil;
//	}
	

}
