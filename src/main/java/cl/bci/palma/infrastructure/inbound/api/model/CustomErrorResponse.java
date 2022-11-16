package cl.bci.palma.infrastructure.inbound.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CustomErrorResponse {
    private String mensaje;
}
