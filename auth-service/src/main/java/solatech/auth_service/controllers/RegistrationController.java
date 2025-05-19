package solatech.auth_service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solatech.auth_service.services.RegistrationService;

@RestController
@RequestMapping("/api/auth")
public class RegistrationController {

    private final RegistrationService registrationService;
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    @RequestMapping("/register")
    public ResponseEntity<?> register()
    {
        return ResponseEntity.status(HttpStatus.CREATED).body("user is created");
    }



}
