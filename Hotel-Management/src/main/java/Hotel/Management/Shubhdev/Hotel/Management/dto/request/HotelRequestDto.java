package Hotel.Management.Shubhdev.Hotel.Management.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelRequestDto {
    Integer hotelId;
    String name;
    String location;
    Boolean status;
    String contactNumber;
}
