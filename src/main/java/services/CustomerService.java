package services;

import models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerService extends MongoRepository<Customer, Long> {

}

