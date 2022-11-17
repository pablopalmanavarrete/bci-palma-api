package cl.bci.palma.domain.service.impl;

import cl.bci.palma.domain.converters.PhoneEntity2Vo;
import cl.bci.palma.domain.service.PhoneService;
import cl.bci.palma.infrastructure.inbound.api.model.PhoneVo;
import cl.bci.palma.infrastructure.outbound.repository.adapter.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Autowired
    PhoneEntity2Vo phoneEntity2Vo;

    @Override
    public List<PhoneVo> getPhones(final UUID userId) {
        return phoneRepository.findByUserId(userId).stream().map(phoneEntity2Vo::convert).collect(Collectors.toList());
    }
}
