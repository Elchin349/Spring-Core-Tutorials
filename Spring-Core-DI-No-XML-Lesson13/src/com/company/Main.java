package com.company;

import com.company.controller.CustomerController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.company.*")  // com.company paketi adi altinda hamsini taniya bilmesi ucun
public class Main {


    public static void main(String[] args) {

        /**
         * Biz xml fay lari ile isleyende 1 ci sefer tam xml den istifade etdik
         * 2 ci merhelede xml faylinda kodu azaldtiq Annotation lar ile hell etdik
         * 3 cu merhelede yeni bu dersde ise biz xml den istifade etmeden konfiqurasiyamizi edeceyik
         *
         * Indi ise xml faylini temamile pozuruq, ve Main clasinin basinda configuration ve
         * componentscan yazaraq xml faylinda gormus oldugumuz isi hell edirik
         * Artiq bu formada yazaraq biz saf spring Annotation larini tetbiq etmis oluruq
         *
         * Main classndan basinda yazmis oldugumuz ComponentScan hansi paketleri scan etmek lazim oldugunu arasdirir, meselen
         * biz com.company.springdemo paketini yazsaq bu zamans service classlari isleymeyecek,
         * Configuration ise  bundan once ClassPathXml deye bir obyekt yaradirdiq ve xml faylimizi verirdikki konfiqurasiya etsin
         * indi ise bu isi avtomatik edir.Yeni Annotation lar ile
         *
         * Ve Artiq bize burda AnnotationConfigApplicationContext  class i na ehtiyac vardir
         *
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        CustomerController customerController1 = context.getBean("customerController", CustomerController.class);
        customerController1.getCustomerInfo();


    }
}
