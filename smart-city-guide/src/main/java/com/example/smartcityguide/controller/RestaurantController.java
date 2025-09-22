package com.example.smartcityguide.controller;

import com.example.smartcityguide.model.Restaurant;
import com.example.smartcityguide.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    // ✅ REST API endpoints
    @ResponseBody
    @GetMapping("/api")
    public List<Restaurant> getAllRestaurants() {
        return service.getAll();
    }

    @ResponseBody
    @GetMapping("/api/city/{city}")
    public List<Restaurant> getRestaurantsByCity(@PathVariable String city) {
        return service.getByCity(city);
    }

    // ✅ Thymeleaf UI
    @GetMapping
    public String viewRestaurants(Model model) {
        model.addAttribute("restaurants", service.getAll());
        return "restaurants";
    }
}
