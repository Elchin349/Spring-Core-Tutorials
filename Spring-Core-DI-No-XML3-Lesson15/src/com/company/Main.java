package com.company;

import com.company.controller.CustomerController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@ComponentScan("com.company.*")  // com.company paketi adi altinda hamsini taniya bilmesi ucun
@PropertySource("classpath:application.properties")
public class Main {

    public static void main(String[] args) {


        /**
         * Value inject etmek ucun ilk once properties file yaradiram orda melumati verirem
         * Sonra AppConfig claasinda valuelarimi yazib get metodlarini qeyd edirem
         * yazdigim value larin basina @Value annotation ni yaziriq ki properties file dan oxuya bilsin
         * sonra Main classinda @PropertySource annotation i ile classpath i verib inject etmis oluruq
         * @Value lari eyni zamanda set metodlarininda uzerinde yaza bielrsiz
         * Biz CustomerService den getCompanyData metodunu cagirdiqda melumatlari avtomatik icine yazmis olacaq
         *
         *Bunu harda istifade etmek olar misal deyekki hansisa basqa proyektde olan bir servise muraciet edeceksiz ve username password lazimdi size, ve
         * ya hansia database qosulacaqsiz bunlarin porti username ve passsowrdu lazimdi size , bele seyleri proyektde saxlamamqq ucun @Value ile siz serverden lazim olan bilgileri alib
         * isinizi gorursuz, cunki heqiqetende proyektde database in ve bunun kimi bir cox seyin melumatlari saxlamaq dogru deyil, hal hazirda gsotermek ucun men properties faylinda yazdim bunlari
         * amma realda her zaman bele olmur. Ve ya basqa bir misal deyekki sirketin mailini yazacaqsiz mail ehr defe deyismir ona gorede bunu herdefe daxil etmek evezine melumati properties de saxliyib
         * @Value ile deyerleri ala bilersiz,ferqli cox numune getirmek olar buna
         * properties faylinda biz app.email ve app.companyName yazdiq , qarsisindaki app sozu her hansisa bir key dyeil ne isteseniz yaza bilersiz
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        CustomerController customerController1 = context.getBean("customerController", CustomerController.class);
        customerController1.getCustomerInfo();
        customerController1.getCompanyData();




    }
}
