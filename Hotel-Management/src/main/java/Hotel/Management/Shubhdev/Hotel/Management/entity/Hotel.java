package Hotel.Management.Shubhdev.Hotel.Management.entity;

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
@Table(name="hotel")
public class Hotel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Integer id;

    @Column(name="hotel_id")
    Integer hotelId;

    @Column(name="name")
    String name;

    @Column(name="location")
    String location;

    @Column(name="status")
    Boolean status;

    @Column(name="contact_number")
    String contactNumber;

}
