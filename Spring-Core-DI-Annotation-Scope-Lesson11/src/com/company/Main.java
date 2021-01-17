package com.company;

import com.company.controller.CustomerController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        /**
         * Bu seferki dersde @Scope annotation ile tanis olacayiq,Bundan qabagki derslerde biz yadinizdadirsa
         * Scope yazaraaq claasimizin singleton ya prototype oldugunu teyin edirdik.indi ise bunu mexaniki deyil
         * avtomatik edeceyik yeni annotation lardan istifade ederek
         *
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController1 = context.getBean("customerController", CustomerController.class);
        CustomerController customerController2 = context.getBean("customerController", CustomerController.class);

        System.out.println("RESULT: " + (customerController1==customerController2));
        System.out.println("CUSTOMERCONTROLLER1 memory location: " + customerController1);
        System.out.println("CUSTOMERCONTROLLER2 memory location: " + customerController2);

    }
}
