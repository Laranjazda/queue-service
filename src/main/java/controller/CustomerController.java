package controller;

import model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import service.CustomerService;

@RestController
@RequestMapping("/customer/")
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger (CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseStatus

    public Customer create(){
        try {
            logger.info ("Customer Criado.");
            return customerService.create ("Carlos Roberto");
        } catch (RuntimeException e){
            logger.info ("Erro ao criar.");
            throw new RuntimeException (e.getMessage ());
        }
    }

    public Customer findAll(){
        return customerService.getAll ();
    }




}
