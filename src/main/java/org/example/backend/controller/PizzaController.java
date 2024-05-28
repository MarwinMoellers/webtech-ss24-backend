package org.example.backend.controller;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Pizza;
import org.example.backend.service.PizzaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/pizza")
@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://127.0.0.1:5173", "https://webtech-ss24-frontend.onrender.com"})
@RequiredArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @GetMapping()
    public List<Pizza> getPizza() {
        return pizzaService.getAll();
    }
}
