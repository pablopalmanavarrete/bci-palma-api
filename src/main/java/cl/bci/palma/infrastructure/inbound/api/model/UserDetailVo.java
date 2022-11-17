package cl.bci.palma.infrastructure.inbound.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserDetailVo extends UserVo implements Serializable {

    private List<PhoneVo> phones;
}
