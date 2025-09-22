package com.example.smartcityguide.service;

import com.example.smartcityguide.model.Attraction;
import com.example.smartcityguide.repository.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionService {
    private final AttractionRepository repository;

    public AttractionService(AttractionRepository repository) {
        this.repository = repository;
    }

    public List<Attraction> getAll() {
        return repository.findAll();
    }

    public List<Attraction> getByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Attraction> getByCategory(String category) {
        return repository.findByCategory(category);
    }

    public Attraction addAttraction(Attraction attraction) {
        return repository.save(attraction);
    }
}
