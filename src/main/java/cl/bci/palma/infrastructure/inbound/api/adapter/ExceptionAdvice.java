package cl.bci.palma.infrastructure.inbound.api.adapter;

import cl.bci.palma.infrastructure.inbound.api.model.CustomErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<CustomErrorResponse> handleException(IllegalArgumentException e) {
        LOGGER.error(e.getMessage(), e);

        return ResponseEntity.badRequest()
                .body(CustomErrorResponse.builder().mensaje(e.getMessage())
                        .build());
    }
}
