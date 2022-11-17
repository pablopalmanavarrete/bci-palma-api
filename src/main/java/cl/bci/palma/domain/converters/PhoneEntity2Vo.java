package cl.bci.palma.domain.converters;

import cl.bci.palma.infrastructure.inbound.api.model.PhoneVo;
import cl.bci.palma.infrastructure.outbound.repository.model.Phone;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PhoneEntity2Vo implements Converter<Phone, PhoneVo> {
    @Override
    public PhoneVo convert(Phone phone) {
        PhoneVo phoneVo = new PhoneVo();
        phoneVo.setNumber(phone.getNumber());
        phoneVo.setCountryCode(phone.getCountryCode());
        phoneVo.setCityCode(phone.getCityCode());
        return phoneVo;
    }
}
