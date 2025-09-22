package com.example.smartcityguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartCityGuideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartCityGuideApplication.class, args);
        System.out.println("🚀 Smart City Guide Application is running at http://localhost:8080");
        System.out.println("➡️ Restaurants: http://localhost:8080/restaurants");
        System.out.println("➡️ Hotels: http://localhost:8080/hotels");
        System.out.println("➡️ Attractions: http://localhost:8080/attractions");
        System.out.println("➡️ H2 Database Console: http://localhost:8080/h2-console");
    }
}
