package Hotel.Management.Shubhdev.Hotel.Management.service;

import Hotel.Management.Shubhdev.Hotel.Management.dto.request.HotelRequestDto;
import Hotel.Management.Shubhdev.Hotel.Management.dto.response.HotelResponseDto;
import Hotel.Management.Shubhdev.Hotel.Management.entity.Hotel;
import Hotel.Management.Shubhdev.Hotel.Management.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepo hotelrepo;

    public String createHotel(HotelRequestDto hotelRequestDto) {

        Hotel hotel = ConvertHotelRequestDtoToHotel(hotelRequestDto);
        hotelrepo.save(hotel);
        return "success";
    }
    public HotelResponseDto getHotel(Integer id) {
//        Hotel hotel = hotelrepo.getById(id);
        Hotel hotel = hotelrepo.getByHotelId(id);
        return convertHotelToHotelResponseDto(hotel);
    }
    public List<HotelResponseDto> getAll() {
        List <Hotel> hotelList = hotelrepo.findAll();
        List <HotelResponseDto> hotelResponseDtoList = new ArrayList<>();
        for (int i =0; i <hotelList.size(); i++){
            hotelResponseDtoList.add(convertHotelToHotelResponseDto(hotelList.get(i)));
        }
        return hotelResponseDtoList;
    }


    //comman methods
    private HotelResponseDto convertHotelToHotelResponseDto(Hotel hotel) {

        HotelResponseDto hotelResponseDto = HotelResponseDto.builder().
                name(hotel.getName()).
                contactNumber((hotel.getContactNumber())).
                location(hotel.getLocation()).
                status(hotel.getStatus())
                .build();

        return  hotelResponseDto;
    }
    private Hotel ConvertHotelRequestDtoToHotel(HotelRequestDto hotelRequestDto) {
            Hotel hotel = new Hotel();
            hotel.setName(hotelRequestDto.getName());
            hotel.setHotelId(hotelRequestDto.getHotelId());
            hotel.setLocation(hotelRequestDto.getLocation());
            hotel.setContactNumber(hotelRequestDto.getContactNumber());
            hotel.setStatus(hotelRequestDto.getStatus());
            return hotel;
    }



}
