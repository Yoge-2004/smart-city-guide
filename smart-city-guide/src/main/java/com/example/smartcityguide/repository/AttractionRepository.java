package com.example.smartcityguide.repository;

import com.example.smartcityguide.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
    List<Attraction> findByCity(String city);
    List<Attraction> findByCategory(String category);
}
