package practice.camunda8.zeebeclient.springboot.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import practice.camunda8.zeebeclient.springboot.customers.dto.CustomerDTO;
import practice.camunda8.zeebeclient.springboot.customers.service.CustomerService;
import practice.camunda8.zeebeclient.springboot.database.entity.CustomerData;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public void createCustomer(@RequestBody CustomerDTO customerDTO) {
        Long processInstanceId = 1234567891L;
        customerService.createRecord(processInstanceId, customerDTO.getFirstName(), customerDTO.getLastName(), customerDTO.getZipCode());
    }

    @GetMapping("/fetchAllCustomers")
    public List<CustomerData> fetchAllCustomers() {
        return customerService.fetchAllCustomers();
    }

}