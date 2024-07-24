package az.edu.turing.springboot03.model;

import lombok.Builder;

@Builder
public record StudentView(
        Long id,
        String name,
        Integer age,
        Long grade
) {
}
