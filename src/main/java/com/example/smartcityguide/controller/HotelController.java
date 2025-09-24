package com.example.smartcityguide.controller;

import com.example.smartcityguide.model.Hotel;
import com.example.smartcityguide.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hotels")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    // ✅ REST API endpoints
    @ResponseBody
    @GetMapping("/api")
    public List<Hotel> getAllHotels() {
        return service.getAll();
    }

    @ResponseBody
    @GetMapping("/api/city/{city}")
    public List<Hotel> getHotelsByCity(@PathVariable String city) {
        return service.getByCity(city);
    }

    // ✅ Thymeleaf UI
    @GetMapping
    public String viewHotels(Model model) {
        model.addAttribute("hotels", service.getAll());
        return "hotels";
    }
}