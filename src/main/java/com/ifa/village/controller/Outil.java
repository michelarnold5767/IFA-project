package com.ifa.village.controller;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "outil")
@EntityListeners(AuditingEntityListener.class)
public class Outil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private boolean estDispo;
	private String urlImage;
	@ManyToOne
	private Utilisateur utilisateur;
	@JsonIgnore
	@ManyToOne
	private CategorieOutil categorieOutil;
	
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
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public boolean isEstDispo() {
		return estDispo;
	}
	public void setEstDispo(boolean estDispo) {
		this.estDispo = estDispo;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public CategorieOutil getCategorieOutil() {
		return categorieOutil;
	}
	public void setCategorieOutil(CategorieOutil categorieOutil) {
		this.categorieOutil = categorieOutil;
	}
}
