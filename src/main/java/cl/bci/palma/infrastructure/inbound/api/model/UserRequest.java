package cl.bci.palma.infrastructure.inbound.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserRequest implements Serializable {
    private String name;

    private String email;

    private String password;

    private List<PhoneVo> phones;
}
