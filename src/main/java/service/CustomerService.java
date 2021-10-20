package service;

import model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerService {
    private static final Logger logger = LoggerFactory.getLogger (CustomerService.class);

    public Customer create(String name){
        logger.info ("Usuário" + name + " criado.");
        return new Customer (1, "Carlos Roberto");
    }

    public Customer getAll(){
        logger.info ("Usuário encontrado.");
        return new Customer (1,"Carlos Roberto");
    }

}

