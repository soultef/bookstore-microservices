package solatech.auth_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solatech.auth_service.entities.UserEntity;

public interface RegistrationRepository extends JpaRepository<UserEntity, Long> {
}
