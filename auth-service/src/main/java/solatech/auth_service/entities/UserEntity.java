package solatech.auth_service.entities;

import jakarta.persistence.*;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name  = "customers")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Email address must not be blank")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Password field must not empty or blank")
    @Column(name = "user_password", nullable = false, length = 255)
    private String password;

    @NotBlank(message = "Password field must not empty or blank")
    private String confirmPassword;

    @NotBlank
    private final String userType = "CUSTOMER";

    @NotNull
    private Boolean AccountStatus;

    public @NotBlank(message = "Email address must not be blank") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email address must not be blank") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password field must not empty or blank") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password field must not empty or blank") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Password field must not empty or blank") String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(@NotBlank(message = "Password field must not empty or blank") String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public @NotBlank String getUserType() {
        return userType;
    }


    public @NotNull Boolean getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(@NotNull Boolean accountStatus) {
        AccountStatus = accountStatus;
    }
}
