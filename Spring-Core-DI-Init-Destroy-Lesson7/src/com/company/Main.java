package com.company;

import com.company.appconfig.AppConfig;
import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        /**
         * Spring de lifeCycle i bu sekilde tesvir etmek olar
         * InitilizationBean ---->  Custom init method ----> Bean hazirdir ----> Container shutdown ----> DisposableBean ----> Destroy method  bu bir bean deki life cycle dir
         *
         * Scope prototype olduqda destroy ise dusmur bun ucun elave islem gormelisen DispasableBean interfaceni cagirib mexaniki sondurmelisen
         *
         * Init ve Destroy metodu haqqinda vacib meqamlar.
         * Xml fayillarinda bu metodlari qeyd etdikde nuasnsalara fikir vermek lazimdir
         * Method istenilen acces modifie ola biler
         * Return type da istenilen tipde ola biler,ancaq en cox istifade olunan void tipidir.
         * Metodun adi istenilen bir ad ola biler
         * Metod hec bir argument qebul etmemelidir
         *
         * biz indi ElectricEngineer class inda init ve destroy metodunu yaradacayiq .dediyimiz kimi adin onemi yoxdur sadece xml faylda hansinin init
         * hanisin destoy metod olacagini deyeceyik
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController = context.getBean("controller", CustomerController.class);
        Customer customer = new Customer();

        customerController.saveCustomer(customer);
        customerController.getCustomerInfo();
    }
}
