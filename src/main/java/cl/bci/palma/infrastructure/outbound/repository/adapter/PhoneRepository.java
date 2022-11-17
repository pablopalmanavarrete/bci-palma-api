package cl.bci.palma.infrastructure.outbound.repository.adapter;

import cl.bci.palma.infrastructure.outbound.repository.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    @Query(value = "select * from phone where user_id= :userId", nativeQuery = true)
    List<Phone> findByUserId(@Param("userId") UUID userId);
}
