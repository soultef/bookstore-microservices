package solatech.auth_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import solatech.auth_service.entities.EmployeeEntity;

public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeEntity, Long>,
        JpaSpecificationExecutor<EmployeeEntity> {

    boolean existsByEmail(String email);
}
