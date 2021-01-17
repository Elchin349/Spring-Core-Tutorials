package com.company;

import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        /**
         *  Bu defeki dersde biz dependency injection Annotation ile nece edirler
         *  Constructor, Setter ile injection etmeyi oyreneyecik
         *  Spring Autowiring nedir?
         *  Bu ele bir seydiki senin dependency isivi avtomatik edir
         *  Bes tam olaraq nece edir, demeli autowiring classi scan edib property lerin uygun gelib gelmediyini
         *  arasdirir,buda tipe gore olur meselen class dir yoxsa interface
         *  Ve spring bunu avtomatik edir .
         *  Autowiring 3 tipde inject edr
         *  1) Constructor
         *  2) Setter
         *  3) Field injection
         *
         *  Ilk once Contructor injection edek
         *
         *  1ci dependency interface ve ya class imizi teyin edek
         *  2ci Class mizda injection ucun constructor yazaq
         *  3cu Autowiring annotation i ilede injection i edek (@Autowired)
         *
         *  Ilk once classlairmii interface leri yaradaq elaqeni quraq ve gorekki Autowired nece scann ederek bu isi gorur
         *  bunlardan en yaxsi sayilani constructor ile i ject etmek dir ancaq Autowired de qoymaqla meqsedinize cata bilersiz
         *  =============================================
         *  Test etdikden sonra misal yoxlaya bilersizki annotation i sildikden sonra kod yene rahatliqla ise dusur bes
         *  bunu yazmagimizin menasi ne oldu.
         *  Bu Spring 4.3  versiyasinda gelen bir seydi, eger classinda bir dene konstruktor yazmisansa artiq @Autowired yazmaga
         *  ehtiyac olmur, ancaq cox olarsa gerek bunu elan edesen
         *
         *
         */


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController = context.getBean("customerController", CustomerController.class);
        Customer customer = new Customer();

        customerController.saveCustomer(customer);
        customerController.getCustomerInfo();
    }
}
