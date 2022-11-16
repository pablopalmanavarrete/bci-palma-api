package cl.bci.palma.infrastructure.outbound.repository.adapter;

import cl.bci.palma.infrastructure.outbound.repository.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
