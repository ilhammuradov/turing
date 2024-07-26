package az.edu.turing.springboot05.model.response;

import lombok.Builder;

@Builder
public record ErrorResponse(
        Integer errorCode,
        String errorMessage
) {
}
