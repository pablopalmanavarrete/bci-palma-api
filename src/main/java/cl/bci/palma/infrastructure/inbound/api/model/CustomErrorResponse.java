package cl.bci.palma.infrastructure.inbound.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CustomErrorResponse implements Serializable {
    private String mensaje;
}
