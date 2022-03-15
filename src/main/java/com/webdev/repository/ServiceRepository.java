package com.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.model.Serve;

@Repository
public interface ServiceRepository extends JpaRepository<Serve, Integer> {

}
