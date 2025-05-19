package solatech.auth_service.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String firstName;
    private String lastName;
    private String role;
    private String department;
}
