package com.ifa.village.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifa.village.controller.Outil;

@Repository
public interface OutilsIDao extends JpaRepository<Outil,Integer> {
}
