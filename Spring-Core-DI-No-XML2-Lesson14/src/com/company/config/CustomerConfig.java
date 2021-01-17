package com.company.config;

import com.company.controller.CustomerController;
import com.company.service.CustomerService;
import com.company.service.CustomerSeviceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    /**
     * Sanki her bir seyi mexaniki edirik. CustomerConfig classinda Configuration elani ediik
     * metodlarin basinda bean annotation i ile elan veririk
     * ve diqqet edinki metod adi ile Main claassinda ki  context.getBean("customerController", CustomerController.class);  burdaki ad ile dogru olmalidir
     * eks teqdirde exception atacaq
     * Bean yazdiqdan sonra burda  , xml faylinda id yazirdiqki iki class arasinda elaqe quraq burdada metodlar bizim id isimizi gorecek
     */
    @Bean
    public CustomerService service(){
        return new CustomerSeviceImpl();
    }

    @Bean
    public CustomerController customerController(){
        return new CustomerController();
    }

    // Eger CustomerControllerde CustomerService i @Autowired ile deyilde constructor ile inject etseydik bele yazacaqdiq
//    @Bean
//    public CustomerController customerController(){
//        return new CustomerController(service());
//    }
}
