package com.example.smartcityguide.service;

import com.example.smartcityguide.model.Restaurant;
import com.example.smartcityguide.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository repository;

    public RestaurantService(RestaurantRepository repository) {
        this.repository = repository;
    }

    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    public List<Restaurant> getByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Restaurant> getByCuisine(String cuisineType) {
        return repository.findByCuisineType(cuisineType);
    }

    public Restaurant addRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }
}