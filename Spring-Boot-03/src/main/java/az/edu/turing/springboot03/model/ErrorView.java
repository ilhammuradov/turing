package az.edu.turing.springboot03.model;

import lombok.Builder;

@Builder
public record ErrorView(
        Integer errorCode,
        String errorMessage
) {
}