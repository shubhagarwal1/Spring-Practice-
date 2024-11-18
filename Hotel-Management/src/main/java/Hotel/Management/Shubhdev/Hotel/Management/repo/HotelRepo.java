package Hotel.Management.Shubhdev.Hotel.Management.repo;

import Hotel.Management.Shubhdev.Hotel.Management.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {
    Hotel getByHotelId(Integer id);
}
