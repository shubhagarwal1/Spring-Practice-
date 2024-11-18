package Hotel.Management.Shubhdev.Hotel.Management.service;


import Hotel.Management.Shubhdev.Hotel.Management.dto.request.RoomRequestDto;
import Hotel.Management.Shubhdev.Hotel.Management.dto.response.RoomResponseDto;
import Hotel.Management.Shubhdev.Hotel.Management.entity.Room;
import Hotel.Management.Shubhdev.Hotel.Management.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepo roomRepo;

    public String createRoom(RoomRequestDto roomRequestDto) {
        Room room = ConvertToRoomRequestDto(roomRequestDto);
        roomRepo.save(room);
        return"success";
    }

    public RoomResponseDto getRoom(Integer id) {
        Room room = roomRepo.getById(id);
        return convertRoomToResponseDto(room);
    }

    //comman methods
    private RoomResponseDto convertRoomToResponseDto(Room room) {
        RoomResponseDto roomResponseDto = new RoomResponseDto();
        roomResponseDto.setRoomType(room.getRoomType());
        roomResponseDto.setMaxOccupancy(room.getMaxOccupancy());
        roomResponseDto.setStatus(room.getStatus());
        return roomResponseDto;
    }
    private Room ConvertToRoomRequestDto(RoomRequestDto roomRequestDto) {
        Room room = new Room();
        room.setRoomType(roomRequestDto.getRoomType());
        room.setStatus(roomRequestDto.getStatus());
        room.setMaxOccupancy(room.getMaxOccupancy());
        return room;
    }


}
