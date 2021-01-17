package com.company;

import com.company.controller.CustomerController;
import com.company.controller.EmployeeController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        /**
         * Bu zamana kimi biz inject edirdik ve bir dene servisimiz var idi bes indi interface e elave olaraq basqa bir classda
         * implemnet etse ve oda bir bean olsa bu zaman konflikt yaranir, cunki sen polymorphism den istifade etdiyine gore
         * hansi classi cagiracagini bilmir , buna gore bizim isimize @Qualifiers annotation i yariyir
         * ve bunu istifade etdikde konflikt yaranmir
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController = context.getBean("customerController", CustomerController.class);
        EmployeeController employeeController = context.getBean("employeeController",EmployeeController.class);
        customerController.getCustomerInfo();
        employeeController.getEmployeeInfo();

    }
}
