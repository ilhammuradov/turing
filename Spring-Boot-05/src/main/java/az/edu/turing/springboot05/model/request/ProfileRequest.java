package az.edu.turing.springboot05.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record ProfileRequest(
        @NotBlank
        String name,
        @NotNull
        Integer age,
        @NotBlank
        String image
) {
}
