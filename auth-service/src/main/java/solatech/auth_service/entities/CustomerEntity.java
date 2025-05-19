package solatech.auth_service.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    private long userId;
    private String fullName;
    private String address;
    private String phone;
}
