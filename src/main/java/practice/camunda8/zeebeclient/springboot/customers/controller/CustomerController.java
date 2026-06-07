package practice.camunda8.zeebeclient.springboot.customers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import practice.camunda8.zeebeclient.springboot.customers.dto.CustomerDTO;
import practice.camunda8.zeebeclient.springboot.customers.service.CustomerService;
import practice.camunda8.zeebeclient.springboot.database.entity.CustomerData;
import practice.camunda8.zeebeclient.springboot.zeebeclient.CamundaProcessUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CamundaProcessUtils camundaProcessUtils;

    @PostMapping("/customers")
    public void createCustomer(@RequestBody CustomerDTO customerDTO) {


        Map<String, Object> variables = new HashMap<>();
        variables.put("zipCode",customerDTO.getZipCode());
        Long processInstanceId = camundaProcessUtils.startProcess("Process_0fre91a", variables);
        customerService.createRecord(processInstanceId, customerDTO.getFirstName(), customerDTO.getLastName(), customerDTO.getZipCode());
    }

    @GetMapping("/fetchAllCustomers")
    public List<CustomerData> fetchAllCustomers() {
        return customerService.fetchAllCustomers();
    }

}