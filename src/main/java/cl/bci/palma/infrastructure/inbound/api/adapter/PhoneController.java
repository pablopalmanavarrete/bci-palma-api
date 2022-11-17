package cl.bci.palma.infrastructure.inbound.api.adapter;

import cl.bci.palma.domain.service.PhoneService;
import cl.bci.palma.infrastructure.inbound.api.model.PhoneVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users/{userId}/phones")
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @GetMapping
    public ResponseEntity<List<PhoneVo>> getPhones(@PathVariable final UUID userId) {
        return ResponseEntity.ok().body(phoneService.getPhones(userId));
    }
}
