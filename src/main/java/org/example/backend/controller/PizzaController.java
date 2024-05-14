package org.example.backend.controller;

import org.example.backend.model.Pizza;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/pizza")
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class PizzaController {

    @GetMapping()
    public List<Pizza> getPizza() {
        return List.of(
                new Pizza("Magaritha", 12.0),
                new Pizza("Tuna", 16.0)
        );
    }
}
