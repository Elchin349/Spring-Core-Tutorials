package com.company;

import com.company.controller.CustomerController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        /**
         *
         * Indi ise Init ve destroy metodlari nece yazmaq olar ona baxaq
         * Bunun ucun bize @PostConstruct ve @PreDestroy ile metodlar yaratmaq lazimdir
         * eger java 9 cu versiyada yuksek olani istifade edirsizse size kitabxana lazim olacaq
         *  javax.annotation-api-1.3.2.jar    bunu yuklmelisiz
         *
         *  Sora metodlari yaradib basinda elanlari vereceyik
         *  Bunu oncede yoxlamisdiq xml faylinda , bes prototype olduqda nece edekki destroy metodu ise dussun
         *  Bunun ucun ise bize elave bir class yaradib meseleni hell etmek lazim olacaq
         *
         *  ilk once MyCustomBeanProcessor classini yaradib desytroy metodunu hell edeceyik
         *  sonra CustomerController classinda DisposableBean interface ne implement edeceyik
         *  ve classimizda bir dene @PostConstruct elani ile metod yazacayiq ,
         *  desytroy metodunu ise ovveride edeceyik
         *  ve belelikle prototype olan clasimizin destroy metodu ise dusecek
         *
         *  Bezen Intellij de destroy metodu ise dusmur kimi gorsenir refresh edende duzelmelidi
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController1 = context.getBean("customerController", CustomerController.class);
        CustomerController customerController2 = context.getBean("customerController", CustomerController.class);

        customerController1.getCustomerInfo();
        customerController2.getCustomerInfo();

    }
}
