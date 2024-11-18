package Hotel.Management.Shubhdev.Hotel.Management.repo;

import Hotel.Management.Shubhdev.Hotel.Management.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer> {
}
