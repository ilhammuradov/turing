package az.edu.turing.springboot05.model.request;

import jakarta.validation.constraints.NotBlank;

public record ImageRequest(
        @NotBlank
        String image
) {
}
