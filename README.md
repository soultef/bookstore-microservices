# 📚 Bookstore Microservices

A cloud-native, scalable, and modular **Bookstore Application** built using the **Microservices Architecture**.
Each microservice is independently deployable, loosely coupled, and designed for high availability and maintainability.

---

## 📌 Overview

This project demonstrates a real-world implementation of a microservices-based architecture using modern best practices.
It is designed for extensibility, DevOps automation, and production-readiness.

---

## 🧩 Microservices

| Service Name         | Description                                   | Port |
|----------------------|-----------------------------------------------|------|
| `api-gateway`        | Centralized API gateway for routing & auth    | 8080 |
| `auth-service`       | Handles authentication and JWT token issuing  | 8081 |
| `user-service`       | Manages user accounts and profiles            | 8082 |
| `book-service`       | Manages book catalog and metadata             | 8083 |
| `order-service`      | Handles book orders and order history         | 8084 |
| `inventory-service`  | Manages stock levels and availability         | 8085 |
| `payment-service`    | Handles payments and transaction logs         | 8086 |
| `notification-service` | Sends email/SMS notifications               | 8087 |
| `config-server`      | Centralized configuration management          | 8888 |
| `discovery-server`   | Eureka-based service discovery                | 8761 |
| `zipkin-server`      | Distributed tracing and request tracking      | 9411 |
| `gateway-aggregator` | Combines responses from multiple services     | 8090 |

> Additional services like `review-service`, `analytics-service`, and `reporting-service` can be integrated seamlessly.

---

## 🛠️ Tech Stack

- **Java 17**, **Spring Boot 3**, **Spring Cloud**
- **Spring Security**, **JWT**, **OAuth2**
- **Eureka** (Discovery), **Spring Cloud Config**, **Feign Clients**
- **RabbitMQ / Kafka** for event-driven communication
- **PostgreSQL**
- **Docker**, **Docker Compose**

---

## 📂 Project Structure

bookstore-microservices/
├── api-gateway/
├── auth-service/
├── book-service/
├── order-service/
├── inventory-service/
├── payment-service/
├── notification-service/
├── user-service/
├── config-server/
├── discovery-server/
├── zipkin-server/
└── common-lib/

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-org/bookstore-microservices.git
cd bookstore-microservices
2. Start with Docker Compose (for local development)

docker-compose up --build
This starts all core services including config-server, discovery-server, gateway, Zipkin, DBs, and each microservice.

3. Access Endpoints
Service	URL
API Gateway	http://localhost:8080
Eureka Discovery	http://localhost:8761
Config Server	http://localhost:8888

🧪 API Documentation
Each microservice exposes its own OpenAPI (Swagger UI) documentation:

http://localhost:<port>/swagger-ui/index.html
🧪 Testing
✅ Unit Tests with JUnit 5 & Mockito

✅ Integration Tests with Testcontainers

✅ Postman Collection available under docs/

🔐 Security
Token-based Authentication using JWT

Secure communication via Spring Security

Role-based access control: ADMIN, CUSTOMER, EMPLOYEE

📈 Monitoring & Observability
Distributed tracing with Zipkin
Centralized logging with ELK stack (optional)
Health checks with Spring Boot Actuator

📦 CI/CD 
CI/CD is set up, add your pipeline summary here:

GitHub Actions / GitLab CI

Docker Image Build & Push

Staging / Production Deployment

✨ Contribution Guide
Fork the repository

Create a new branch (feature/your-feature)

Commit your changes

Push to your branch

Open a Pull Request

📄 License
This project is licensed under the MIT License. See the LICENSE file for details.

👨‍💻 Maintainers
[Solomon Demisse] - Backend Lead

[solatech] - @your-org

📬 Contact
For inquiries or support, contact team@yourcompany.com.