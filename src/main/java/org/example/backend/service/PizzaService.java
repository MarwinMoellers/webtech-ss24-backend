package org.example.backend.service;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Pizza;
import org.example.backend.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;


    public List<Pizza> getAllPizza() {
        return pizzaRepository.findAll();
    }

}
