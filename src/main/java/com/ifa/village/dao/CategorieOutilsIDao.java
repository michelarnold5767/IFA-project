package com.ifa.village.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifa.village.controller.CategorieOutil;

@Repository
public interface CategorieOutilsIDao extends JpaRepository<CategorieOutil,Integer> {
}
