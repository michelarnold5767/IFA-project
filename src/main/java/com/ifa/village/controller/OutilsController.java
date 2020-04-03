package com.ifa.village.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ifa.village.dao.OutilsIDao;

@RestController
@CrossOrigin
public class OutilsController {

	OutilsIDao outilsIDao;
	
	@Autowired
	public OutilsController(OutilsIDao outilsIDao ) {
		this.outilsIDao = outilsIDao;
	}
	
	@GetMapping("/outils")
	public List<Outil> getOutil(){
		return outilsIDao.findAll();
	}

	@GetMapping("/outils/{id}")
	public Outil getOutil(@PathVariable int id){
		return outilsIDao.findById(id).orElse(null);
	}

	@PutMapping("/outils")
	public Outil saveOutil(@RequestBody Outil id){
		return outilsIDao.save(id);
	}
	
}
