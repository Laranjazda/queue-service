package controllers;

import models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import services.CustomerService;
import java.util.List;

@RestController
public class CustomerController{
    @Autowired
    public CustomerService customerService;


    @GetMapping(value = "/find")
    public List<Customer> getAll(){
        return customerService.findAll();
    }

    @PostMapping(value = "/create")
    public String createOne(@RequestBody Customer customer){
        Customer createCustomer = customerService.insert(customer);
        return "Custumer criado." + createCustomer.getName();
    }
}
