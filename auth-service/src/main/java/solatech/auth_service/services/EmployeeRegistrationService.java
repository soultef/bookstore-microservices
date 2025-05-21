package solatech.auth_service.services;

import org.springframework.stereotype.Service;
import solatech.auth_service.DTO.EmployeesDTO;
import solatech.auth_service.entities.EmployeeEntity;
import solatech.auth_service.repository.EmployeeRegistrationRepository;

@Service
public class EmployeeRegistrationService {

    private final EmployeeRegistrationRepository employeeRepo;


    public EmployeeRegistrationService(EmployeeRegistrationRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    private EmployeesDTO mapToEmployeesDTO(String fullName, String email, String message)
    {
        return new EmployeesDTO(fullName, email, message);
    }

    public EmployeesDTO registerEmployee(EmployeeEntity employeeEntity) {
        String fullName = employeeEntity.getFirstName() + " " + employeeEntity.getLastName();
        String email = employeeEntity.getEmail();
        if(employeeRepo.existsByEmail(employeeEntity.getEmail())) {
            return mapToEmployeesDTO(fullName, email, "Email already exists!");
        }
        employeeRepo.save(employeeEntity);
        EmployeesDTO employeesDTO = mapToEmployeesDTO(fullName, email, "You have successfully registered!");
        employeesDTO.setRegistered(true);
        return employeesDTO;
    }
}
