package az.edu.turing.springboot05.model.response;

import lombok.Builder;

@Builder
public record ProfileResponse(
        Long id,
        String name,
        Integer age,
        String image
) {
}
