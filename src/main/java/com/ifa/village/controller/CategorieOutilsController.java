package com.ifa.village.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ifa.village.dao.CategorieOutilsIDao;

@RestController
@CrossOrigin
public class CategorieOutilsController {

	CategorieOutilsIDao categorieOutilsIDao;
	
	@Autowired
	public CategorieOutilsController(CategorieOutilsIDao categorieOutilsIDao ) {
		this.categorieOutilsIDao = categorieOutilsIDao;
	}
	
	@GetMapping("/categorieoutils")
	public List<CategorieOutil> getCategorieOutil(){
		return categorieOutilsIDao.findAll();
	}

	@GetMapping("/categorieoutils/{id}")
	public CategorieOutil getCategorieOutil(@PathVariable int id){
		return categorieOutilsIDao.findById(id).orElse(null);
	}

	@PutMapping("/categorieoutils")
	public CategorieOutil saveCategorieOutil(@RequestBody CategorieOutil id){
		return categorieOutilsIDao.save(id);
	}
	
}
