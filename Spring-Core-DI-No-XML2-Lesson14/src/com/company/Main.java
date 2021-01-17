package com.company;

import com.company.controller.CustomerController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@ComponentScan("com.company.*")  // com.company paketi adi altinda hamsini taniya bilmesi ucun
public class Main {

    public static void main(String[] args) {

        /**
         * @Component ve @Bean annotasilayari her ikisi eyni isi gorurur.Aralarindaki ferq ise islenme yerlerine goredir
         * Deyekki iki dene ferqli A ve B proyektimiz var ve bu proyektde Mail modulu deye bir sey istifade olunur yeni servislerini isdedirik
         * A proyekti Mail modulunun butun servislerini isletdiyi ahlda B proyekti sadce 1 servisini isledir ve biz eger @Component yazib
         * inject etsek bu o demekdirki Mail modulunda lazimli lazimsiz butun servisleri import edirik, Ancaq B proyektine bunlarin hamsi lazim deyil
         * o zaman @ Bean burda ise girir,ona gorede @Bean annotasionlari 3cu dereceli obyektleri inject etmek ucun istifade olunur,Esasende isledeceyimiz servisin uzerine
         * @Bean yazarsaq daha duzgun olar
         *
         * CustomerController ve CustomerService deki @Componentleri yigisdirriq cunki configde beanlerini yaradirsizsa exception(NoUniqueBeanDefinitionException) atacaq eyni adda bean yaradildigina gore
         * ona gore @Componentleri silirik
         */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        CustomerController customerController1 = context.getBean("customerController", CustomerController.class);
        customerController1.getCustomerInfo();


    }
}
