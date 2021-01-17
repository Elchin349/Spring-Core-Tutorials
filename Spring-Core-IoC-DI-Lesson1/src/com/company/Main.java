package com.company;

import com.company.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    // spring-core-info file ini oxuyun

    /**
     *ilk once sad sekilde java proyekti yaradandan sonra Spring-Framework 5.0.2 release dist i internetden yukluyun
     * sonra proyekte elave edin ki springin claslarindan istifade ede bilesiz
     * ilk novbede burda biz web teref deyil sadece classlar arasindaki elaqe nece qurulacaq xml fayl da bean nece yaradilacaq
     * bunlara baxaceyiq sonraki steplerde web hisseden danismaq olar
     *
     * 1ci en sade sekilde xml de bean nece yaranir ve new demeden obyekti nece yaradacayiq ona baxaq
     * misal deyekki bizim Person tipinde bir interface imiz var ve bu interface implement eden claslar var
     *
     * xml fayli yaradiriq  applicationContext.xml deye bir sey yaradiriq
     * sonra bean leri yaziriq
     *
     * ve xml faylini oxuyub ise sala bilmesi ucun ClassPathXmlApplicationContext  classini cagiririq icine xml faylin adini yaziriq
     */
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Polymorphism den istifade ederek obyekti bean ler ile yaratdiq , yeni biz sanki sifaris veririk xml ise bizim ucun obyekti yaradir
        // amma bu helede tam loose coupling demek deyil novbeti proyekte constructor ile nece inject edeceyik onu baxaceyig
        Person customer = context.getBean("person",Person.class);
        customer.getInformation();

        Person employee = context.getBean("person2",Person.class);
        employee.getInformation();

    }
}
