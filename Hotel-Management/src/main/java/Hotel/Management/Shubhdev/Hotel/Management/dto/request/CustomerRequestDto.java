package Hotel.Management.Shubhdev.Hotel.Management.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequestDto {
    String name;
    String phone;
    String email;
}
