package solatech.auth_service.entities;

import jakarta.persistence.*;

@Entity
@Table(name  = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String password;
    private String email;
    private String userType;
    private Boolean AccountStatus;

}
