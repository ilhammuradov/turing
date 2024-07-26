package az.edu.turing.springboot05.exception;

import az.edu.turing.springboot05.model.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProfileNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorResponse handleProfileNotFoundException(ProfileNotFoundException e) {
        return ErrorResponse.builder().errorMessage(e.getMessage()).errorCode(HttpStatus.NOT_FOUND.value()).build();
    }
}
