package com.company;

import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * Indi ise biz dependency injectioni coxnstruxtor vasitesi ile edeceyik
     * bunun ucun model service ve controller yaradacamki daha anlasiqli olsun
     *
     * Model - burda bir class yaradaceyig ad soyad falan olacaq
     * Service - burda yaratmis oldugumuz obyekti servis vasitesi ile bazaya yaziriq
     * hal hazirda bazamiz olmadigina gore sadece servis hissesinde fake melumat yazaceyiq
     * Controller - burda ise customer aid olan melumatlari qeyd edeceyik
     * @param args
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

        /**
         * Ne CustomerControllerin nede CustomerService in birbasa new deyib obyektini yaratmamisiq
         * bunu bizim evezimize xml de beanler sayesinde yaradilib
         */
    }
}
