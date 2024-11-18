package Hotel.Management.Shubhdev.Hotel.Management.entity;

import Hotel.Management.Shubhdev.Hotel.Management.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer id;

    @Column(name="room_type")
    RoomType roomType;

    @Column(name="status")
    Boolean status;

    @Column(name="max_occupancy")
    Integer maxOccupancy;
}
