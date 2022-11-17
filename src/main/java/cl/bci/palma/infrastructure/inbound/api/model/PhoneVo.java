package cl.bci.palma.infrastructure.inbound.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class PhoneVo implements Serializable {
    private String number;
    private String countryCode;
    private String cityCode;
}
