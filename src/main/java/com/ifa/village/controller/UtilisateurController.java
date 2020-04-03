package com.ifa.village.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ifa.village.dao.UtilisateursIDao;

@RestController
@CrossOrigin
public class UtilisateurController {

	UtilisateursIDao utilisateursIDao;
	
	@Autowired
	public UtilisateurController(UtilisateursIDao utilisateursIDao ) {
		this.utilisateursIDao = utilisateursIDao;
	}
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> getUtilisateur(){
		return utilisateursIDao.findAll();
	}

	@GetMapping("/utilisateurs/{id}")
	public Utilisateur getUtilisateur(@PathVariable int id){
		return utilisateursIDao.findById(id).orElse(null);
	}

	@PutMapping("/utilisateurs")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur id){
		return utilisateursIDao.save(id);
	}
	
}
