package Hotel.Management.Shubhdev.Hotel.Management.service;

import Hotel.Management.Shubhdev.Hotel.Management.dto.request.CustomerRequestDto;
import Hotel.Management.Shubhdev.Hotel.Management.dto.response.CustomerResponseDto;
import Hotel.Management.Shubhdev.Hotel.Management.entity.Customer;
import Hotel.Management.Shubhdev.Hotel.Management.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public  String createCustomer(CustomerRequestDto customerRequestDto) {
        Customer custObj = ConverToCustemerRequestDto(customerRequestDto);
        customerRepo.save(custObj);
        return "success";
    }

    public CustomerResponseDto getCustomer(Integer id) {
        Customer cusObj = customerRepo.getById(id);
        return ConvertToCustomerResponseDto(cusObj);
    }

    //command methods
    private Customer ConverToCustemerRequestDto(CustomerRequestDto customerRequestDto) {
        Customer cus = new Customer();
        cus.setName(customerRequestDto.getName());
        cus.setEmail(customerRequestDto.getEmail());
        cus.setPhone(customerRequestDto.getPhone());
        return cus;
    }
    private CustomerResponseDto ConvertToCustomerResponseDto(Customer cusObj) {
        CustomerResponseDto customerResponseDto = new CustomerResponseDto();

        customerResponseDto.setName(cusObj.getName());
        customerResponseDto.setEmail(cusObj.getEmail());
        customerResponseDto.setPhone(cusObj.getPhone());
        return customerResponseDto;
    }

}
