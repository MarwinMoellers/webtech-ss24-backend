package org.example.backend.service;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Pizza;
import org.example.backend.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public List<Pizza> getAll() {
        return pizzaRepository.findAll();
    }
}
