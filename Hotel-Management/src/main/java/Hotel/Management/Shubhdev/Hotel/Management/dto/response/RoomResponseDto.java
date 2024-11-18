package Hotel.Management.Shubhdev.Hotel.Management.dto.response;

import Hotel.Management.Shubhdev.Hotel.Management.enums.RoomType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomResponseDto {
    RoomType roomType;
    Boolean status;
    Integer maxOccupancy;
}
