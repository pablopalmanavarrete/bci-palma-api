package cl.bci.palma.infrastructure.outbound.repository.adapter;

import cl.bci.palma.infrastructure.outbound.repository.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(@Param("email") String email);
}
