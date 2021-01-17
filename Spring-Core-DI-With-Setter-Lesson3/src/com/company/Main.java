package com.company;

import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * indi ise dependency injection i setter metodu ile edeceyik
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // context.getBean de xml de yazdiginzi id i qeyd etmelisiz eks teqdirde tapa bilmeyib exception atacaq
        CustomerController customerController = context.getBean("controller",CustomerController.class);

        Customer customer = new Customer();
        customer.setFirstName("Elchin");
        customer.setLastName("Akbarov");;

        customerController.saveCustomer(customer);
        customerController.getCustomerInfo();

    }
}
