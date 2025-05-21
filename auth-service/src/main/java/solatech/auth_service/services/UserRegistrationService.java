package solatech.auth_service.services;

import org.springframework.stereotype.Service;
import solatech.auth_service.entities.UserEntity;
import solatech.auth_service.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {

    private final UserRegistrationRepository userRegistrationRepository;

    public UserRegistrationService(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
    }

    public String registerUser(UserEntity user) {
       if(userRegistrationRepository.existsByEmail(user.getEmail()))
            return "Email already exists";
        userRegistrationRepository.save(user);
        return "User registered successfully";
    }

}
