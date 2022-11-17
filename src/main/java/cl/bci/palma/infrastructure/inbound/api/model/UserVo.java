package cl.bci.palma.infrastructure.inbound.api.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserVo implements Serializable {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private String token;

    @JsonAlias(value = "created")
    private Instant creationDate;

    @JsonAlias(value = "modified")
    private Instant lastModifiedDate;

    @JsonAlias(value = "last_login")
    private Instant lastLogin;

    @JsonAlias(value = "isactive")
    private boolean enable;
}
