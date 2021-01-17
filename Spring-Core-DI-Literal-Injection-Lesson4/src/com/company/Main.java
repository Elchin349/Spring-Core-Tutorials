package com.company;

import com.company.appconfig.AppConfig;
import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * Literal Injection nedir nece edeceyik ona baxiriq
     * Literal injection yeni hansisa variable i deyeri biz xml den inject edeceyik, misal deyekki sirketin mail ve nomresini sen ozun yazmaq istemirsen
     * isteyirsneki avtomatik gelsin bunun ucun xml de bunu inject edeceyik
     * ilk once appConfigde de 2 ve ya 3 ve ya ne ce dene isteyirsizde variable yaradiriq
     *
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

        AppConfig appConfig = context.getBean("appConfig",AppConfig.class);
        System.out.println(appConfig.getCompanyName());
        System.out.println(appConfig.getEmail());

        // her sey normal isdesede bu yazilisi yeni literal injectioni bu sekilde etmek dogru deyil buna hardcode deyilir, novbeti proyektde
        //  bir properties yaradib ordan cagiracayig

    }
}
