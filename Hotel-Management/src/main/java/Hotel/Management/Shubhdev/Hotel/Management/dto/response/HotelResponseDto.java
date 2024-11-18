package Hotel.Management.Shubhdev.Hotel.Management.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelResponseDto {
    String name;
    String location;
    Boolean status;
    String contactNumber;
}
