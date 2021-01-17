package com.company.controller;

import com.company.model.Customer;
import com.company.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customerController")
public class CustomerController {


    // @Autowired  qoyduqda cosntructor yaratmaga ehtiyac qalmir hamsini ozu edir
    @Autowired
    private  CustomerService customerService;

    // eger bir dene constructor varsa @Autowired qoymaga ehtiyac yoxdu
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }

    public void saveCustomer(Customer customer){
        customerService.save(customer);
    }

    public void getCustomerInfo(){
        System.out.println(customerService.getCustomer());
    }

    //  Eger setter ile inject edirsizse Autowired qoymaq mutleqdir eks teqdirde bean yaradilmayacaq
//    @Autowired
//    public void setCustomerService(CustomerService customerService) {
//        this.customerService = customerService;
//    }
}
