package org.example.backend.controller;

import org.example.backend.model.TestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<String> helloWorld(@RequestParam("text") String text) {
        return ResponseEntity.ok("Hello World!1" + text);
    }

    @GetMapping("/test-entity")
    public ResponseEntity<TestEntity> testEntity(@RequestParam("text") String text) {
        return ResponseEntity.ok(new TestEntity(text, "1", "irgendeinText", 1, true));
    }

}
