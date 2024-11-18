package Hotel.Management.Shubhdev.Hotel.Management.controller;

import Hotel.Management.Shubhdev.Hotel.Management.dto.request.CustomerRequestDto;
import Hotel.Management.Shubhdev.Hotel.Management.dto.response.CustomerResponseDto;
import Hotel.Management.Shubhdev.Hotel.Management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public String createCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        return customerService.createCustomer(customerRequestDto);
    }

    @GetMapping("/get-customer")
    public CustomerResponseDto getCustomer(@RequestParam Integer id){
        return customerService.getCustomer(id);
    }

}
