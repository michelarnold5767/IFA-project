package com.ifa.village.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifa.village.controller.Utilisateur;

@Repository
public interface UtilisateursIDao extends JpaRepository<Utilisateur, Integer> {
}
