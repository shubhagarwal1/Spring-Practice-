package Hotel.Management.Shubhdev.Hotel.Management.controller;

import Hotel.Management.Shubhdev.Hotel.Management.dto.request.RoomRequestDto;
import Hotel.Management.Shubhdev.Hotel.Management.dto.response.RoomResponseDto;
import Hotel.Management.Shubhdev.Hotel.Management.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/room")
@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/create")
    public String createRoom(@RequestBody RoomRequestDto roomRequestDto){
        return roomService.createRoom(roomRequestDto);
    }

    @GetMapping("/get-room")
    public RoomResponseDto getRoom(@RequestParam Integer id){
        return roomService.getRoom(id);
    }

}
