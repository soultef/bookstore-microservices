package solatech.auth_service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solatech.auth_service.entities.UserEntity;
import solatech.auth_service.services.UserRegistrationService;

@RestController
@RequestMapping("/api/v1/customer")
public class UserRegistrationController {

    private final UserRegistrationService userRegistrationService;

    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @PostMapping
    public ResponseEntity<String>  registerUser(@RequestBody UserEntity user) {
        return ResponseEntity.ok(userRegistrationService.registerUser(user));
    }
}
