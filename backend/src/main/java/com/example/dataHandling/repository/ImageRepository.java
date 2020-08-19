package com.example.dataHandling.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dataHandling.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
    
	Optional<Image> findByName(String name);
}

