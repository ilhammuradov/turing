package az.edu.turing.springboot03.model;

import lombok.Builder;

@Builder
public record StudentRequest(
        String name,
        Integer age,
        Long grade
) {
}
