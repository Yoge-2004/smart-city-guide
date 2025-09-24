package com.example.smartcityguide.controller;

import com.example.smartcityguide.model.Attraction;
import com.example.smartcityguide.service.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/attractions")
public class AttractionController {

    private final AttractionService service;

    public AttractionController(AttractionService service) {
        this.service = service;
    }

    // ✅ REST API endpoints
    @ResponseBody
    @GetMapping("/api")
    public List<Attraction> getAllAttractions() {
        return service.getAll();
    }

    @ResponseBody
    @GetMapping("/api/city/{city}")
    public List<Attraction> getAttractionsByCity(@PathVariable String city) {
        return service.getByCity(city);
    }

    // ✅ Thymeleaf UI
    @GetMapping
    public String viewAttractions(Model model) {
        model.addAttribute("attractions", service.getAll());
        return "attractions";
    }
}