package solatech.auth_service.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name  = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "Email address must not be blank")
    private String email;

    @NotBlank(message = "Password field must not empty or blank")
    private String password;

    @NotBlank(message = "Password field must not empty or blank")
    private String confirmPassword;

    @NotBlank
    private String userType;
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

    public void setUserType(@NotBlank String userType) {
        this.userType = userType;
    }

    public @NotNull Boolean getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(@NotNull Boolean accountStatus) {
        AccountStatus = accountStatus;
    }
}
