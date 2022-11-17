package cl.bci.palma.infrastructure.inbound.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserSimpleVo implements Serializable {
    private UUID id;
    private String name;
    private String email;
    private boolean enable;
}
