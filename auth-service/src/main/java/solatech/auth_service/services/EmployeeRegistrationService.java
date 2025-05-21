package solatech.auth_service.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import solatech.auth_service.DTO.EmployeesDTO;
import solatech.auth_service.entities.EmployeeEntity;
import solatech.auth_service.repository.EmployeeRegistrationRepository;

@Service
public class EmployeeRegistrationService {

    private final EmployeeRegistrationRepository employeeRepo;
    private EmployeeEntity employeeEntity;

    public EmployeeRegistrationService(EmployeeRegistrationRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    private EmployeesDTO employeesDTOMapper(String fullName, String email, String message)
    {
        return new EmployeesDTO(fullName, email, message);
    }

    public EmployeesDTO registerEmployee(EmployeeEntity employeeEntity) {
        String fullName = employeeEntity.getFirstName() + " " + employeeEntity.getLastName();
        String email = employeeEntity.getEmail();
        String message;
        if(employeeRepo.existsByEmail(employeeEntity.getEmail())) {
            message = "Email already exists!";
            return employeesDTOMapper(fullName, email, message);
        }
        employeeRepo.save(employeeEntity);
        message = "You have successfully registered!";
        return employeesDTOMapper(fullName, email, message);

    }
}
