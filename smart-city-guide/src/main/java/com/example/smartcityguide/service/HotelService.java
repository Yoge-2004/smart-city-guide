package com.example.smartcityguide.service;

import com.example.smartcityguide.model.Hotel;
import com.example.smartcityguide.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    private final HotelRepository repository;

    public HotelService(HotelRepository repository) {
        this.repository = repository;
    }

    public List<Hotel> getAll() {
        return repository.findAll();
    }

    public List<Hotel> getByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Hotel> getByStars(Integer stars) {
        return repository.findByStars(stars);
    }

    public Hotel addHotel(Hotel hotel) {
        return repository.save(hotel);
    }
}
