package practice.camunda8.zeebeclient.springboot.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="CUSTOMER_DATA")
public class CustomerData {

    @Id
    private Long processInstanceId;

    private String firstName;

    private String lastName;

    private String zipCode;

    private String state;

    public CustomerData() {}
    public CustomerData(Long processInstanceId, String firstName, String lastName, String zipCode) {
        this.processInstanceId = processInstanceId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }
}
