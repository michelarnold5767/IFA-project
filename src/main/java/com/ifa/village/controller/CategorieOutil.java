package com.ifa.village.controller;


import java.util.List;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "categorie_outil")
@EntityListeners(AuditingEntityListener.class)
public class CategorieOutil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="categorieOutil")
//	@JsonBackReference
	List<Outil> listeOutils; // = new ArrayList<>();
	
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
	public List<Outil> getListeOutils() {
		return listeOutils;
	}
	public void setListeOutils(List<Outil> listeOutils) {
		this.listeOutils = listeOutils;
	}
	
}
