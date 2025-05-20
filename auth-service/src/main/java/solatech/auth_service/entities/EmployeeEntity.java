package solatech.auth_service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @NotBlank(message = "First name must not be blank")
    private String firstName;

    @NotBlank(message = "Lastname must not be blank")
    private String lastName;

    @NotBlank(message = "email must not be blank")
    @Email(message = "Email must be valid.")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@solatech\\.com$", message = "Email must be a solatech.com address")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Social security must not be blank")
    @Pattern(regexp = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$", message = "Invalid SSN format")
    private String ssn;

    private String SSN;

    @NotBlank(message = "Employee role must be defined")
    private String role;

    @NotBlank(message = "Employee department must be assigned")
    private String department;

    public @NotBlank(message = "First name must not be blank") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "First name must not be blank") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Lastname must not be blank") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Lastname must not be blank") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "email must not be blank") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "email must not be blank") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Social security must not be blank") String getSSN() {
        return SSN;
    }

    public void setSSN(@NotBlank(message = "Social security must not be blank") String SSN) {
        this.SSN = SSN;
    }

    public @NotBlank(message = "Employee role must be defined") String getRole() {
        return role;
    }

    public void setRole(@NotBlank(message = "Employee role must be defined") String role) {
        this.role = role;
    }

    public @NotBlank(message = "Employee department must be assigned") String getDepartment() {
        return department;
    }

    public void setDepartment(@NotBlank(message = "Employee department must be assigned") String department) {
        this.department = department;
    }
}
