package practice.camunda8.zeebeclient.springboot.customers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.camunda8.zeebeclient.springboot.database.entity.CustomerData;
import practice.camunda8.zeebeclient.springboot.database.repository.CustomerDataRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDataRepository customerDataRepository;

    public void createRecord(Long processInstanceId, String firstName, String lastName, String zipCode)
    {
        CustomerData customerData = new CustomerData(processInstanceId,firstName,lastName,zipCode);
        customerDataRepository.save(customerData);
    }

    public List<CustomerData> fetchAllCustomers()
    {
         return customerDataRepository.findAll();
    }
}
