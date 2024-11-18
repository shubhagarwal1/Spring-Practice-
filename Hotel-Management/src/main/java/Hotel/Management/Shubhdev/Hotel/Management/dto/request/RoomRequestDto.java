package Hotel.Management.Shubhdev.Hotel.Management.dto.request;

import Hotel.Management.Shubhdev.Hotel.Management.enums.RoomType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomRequestDto {
    RoomType roomType;
    Boolean status;
    Integer maxOccupancy;
}
