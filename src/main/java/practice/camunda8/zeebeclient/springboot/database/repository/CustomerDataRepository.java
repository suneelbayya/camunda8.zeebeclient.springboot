package practice.camunda8.zeebeclient.springboot.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.camunda8.zeebeclient.springboot.database.entity.CustomerData;

public interface CustomerDataRepository extends JpaRepository<CustomerData, Long> {
}
