package az.edu.turing.springboot03.exception;

import az.edu.turing.springboot03.model.ErrorView;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorView studentNotFoundException(StudentNotFoundException ex) {
        return ErrorView.builder().errorMessage(ex.getMessage()).errorCode(HttpStatus.NOT_FOUND.value()).build();
    }
}
