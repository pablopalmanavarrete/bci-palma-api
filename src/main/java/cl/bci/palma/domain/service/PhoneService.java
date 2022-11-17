package cl.bci.palma.domain.service;

import cl.bci.palma.infrastructure.inbound.api.model.PhoneVo;

import java.util.List;
import java.util.UUID;

public interface PhoneService {
    List<PhoneVo> getPhones(final UUID userId);
}
