package solatech.auth_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import solatech.auth_service.DTO.EmployeesDTO;
import solatech.auth_service.entities.EmployeeEntity;
import solatech.auth_service.services.EmployeeRegistrationService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRegistrationController {


    private final EmployeeRegistrationService employeeRegistrationService;

    public EmployeeRegistrationController(EmployeeRegistrationService employeeRegistrationService) {
        this.employeeRegistrationService = employeeRegistrationService;
    }

  @PostMapping
  public ResponseEntity<EmployeesDTO> registerEmployee(@RequestBody EmployeeEntity employee)
  {
      EmployeesDTO employeesDTO = employeeRegistrationService.registerEmployee(employee);
      if (employeesDTO.isRegistered()){
          return ResponseEntity.ok(employeesDTO);
      }
      return ResponseEntity.status(HttpStatus.CONFLICT).body(employeesDTO);
  }

}
