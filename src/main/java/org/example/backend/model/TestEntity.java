package org.example.backend.model;

public record TestEntity(
        String name,
        String id,
        String someText,
        int someNumber,
        boolean isTrue
) {
}
