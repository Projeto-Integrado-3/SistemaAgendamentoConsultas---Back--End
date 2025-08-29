package br.com.clinica.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Esta anotação transforma a classe em um componente global para tratar exceções
@ControllerAdvice
public class GlobalExceptionHandler {

    // Este método será chamado especificamente quando uma EntityNotFoundException acontecer
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleEntityNotFound(EntityNotFoundException ex) {
        // Retorna a mensagem da exceção e o status HTTP 404 (NOT_FOUND)
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
