package Hotel.Management.Shubhdev.Hotel.Management.repo;

import Hotel.Management.Shubhdev.Hotel.Management.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
