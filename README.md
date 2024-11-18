
---

## Database Schema

### Tables
1. **customer**
    - `id` (INT, PK)
    - `name` (VARCHAR)
    - `phone` (VARCHAR)
    - `email` (VARCHAR)

2. **hotel**
    - `id` (INT, PK)
    - `name` (VARCHAR)
    - `location` (VARCHAR)
    - `status` (ENUM)
    - `contact_number` (VARCHAR)

3. **rooms**
    - `id` (INT, PK)
    - `room_type` (ENUM)
    - `status` (ENUM)
    - `max_occupancy` (INT)

4. **pricing_inventory**
    - `id` (INT, PK)
    - `hotel_id` (FK)
    - `room_id` (FK)
    - `date` (DATE)
    - `price` (DECIMAL)
    - `hotel_room_availability` (INT)

5. **hotel_room_mapping**
    - `id` (INT, PK)
    - `hotel_id` (FK)
    - `room_id` (FK)
    - `inventory` (INT)

6. **booking**
    - `id` (INT, PK)
    - `customer_id` (FK)
    - `booking_amount` (DECIMAL)
    - `checkin_date` (DATE)
    - `checkout_date` (DATE)
    - `hotel_id` (FK)
    - `room_id` (FK)
    - `occupancy` (INT)

---

## OOP Concepts

### 1. Inheritance
- Utilized to extend common functionalities among entities.

### 2. Abstraction
- Service layer hides complex logic from controllers.

### 3. Polymorphism
- Method overloading and interface implementations are used throughout services.

---

## Annotations

- `@RestController` - Define REST API controllers.
- `@Service` - Mark classes for business logic.
- `@Repository` - For data access objects (DAOs).
- `@Entity` - Map classes to database tables.
- `@Configuration` - Configuration classes for third-party APIs.
- `@RequestMapping`, `@GetMapping`, `@PostMapping` - API route mappings.
- `@Autowired` - Dependency injection.
- `@Transactional` - Manage transactions.

---

## Running the Project

### Prerequisites
- Java 17+
- Maven
- MySQL database setup

### Steps to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/hotel-management-app.git
    ```
2. Navigate to the project directory:
    ```bash
    cd hotel-management-app
    ```
3. Build the project:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```
5. Access the application at:
    ```
    http://localhost:8080
    ```

---

## API Documentation

| Method | Endpoint                   | Description                         |
|--------|----------------------------|-------------------------------------|
| GET    | `/api/v1/customers`       | Get all customers                   |
| POST   | `/api/v1/customers`       | Create a new customer               |
| GET    | `/api/v1/hotels`          | Get all hotels                      |
| POST   | `/api/v1/hotels`          | Add a new hotel                     |
| GET    | `/api/v1/rooms`           | Get available rooms                 |
| POST   | `/api/v1/bookings`        | Create a new booking                |
| GET    | `/api/v1/bookings/{id}`   | Get booking details by ID           |

---

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

## Contact
For any queries, please reach out to **Shubh Agrawal** at [your-email@example.com](mailto:your-email@example.com).
