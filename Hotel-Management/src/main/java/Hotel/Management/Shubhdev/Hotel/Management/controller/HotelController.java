package Hotel.Management.Shubhdev.Hotel.Management.controller;

import Hotel.Management.Shubhdev.Hotel.Management.dto.request.HotelRequestDto;
import Hotel.Management.Shubhdev.Hotel.Management.dto.response.HotelResponseDto;
import Hotel.Management.Shubhdev.Hotel.Management.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/hotel")
@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/create")
    public String createHotel(@RequestBody HotelRequestDto hotelRequestDto){
        return hotelService.createHotel(hotelRequestDto);
    }

    @GetMapping("/get-hotel")
    public HotelResponseDto getHotel(@RequestParam Integer id){
        return hotelService.getHotel(id);
    }

    @GetMapping("/get-all")
    public List<HotelResponseDto> getAllHotel(){
        return hotelService.getAll();
    }

}


