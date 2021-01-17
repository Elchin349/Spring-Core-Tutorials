package com.company;

import com.company.appconfig.AppConfig;
import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        /**
         * Bean scope nedir. Bean scope (<bean></bean>)  bean in lifesycle ini izdiyir
         * Ne qeder zaman bean yasiyir
         * nece dene instance i yaradilib
         * nece share edir.
         * Default scope singleton class olur.Singleton meselesini design patternlerde oyrenmisdik
         * bir classin obyekti bir defe yaradilir ve her defe tekrar eyni obyektden istifade edilir
         * bean scope un da  scope = "singleton" yaza bilersen ancaq default olaraq onsuzda ozur edir bunu
         * ELave olaaq Scope lar ucun basqalarida var asagida baxaq
         * signleton - default scope. bir defe obyekt yaradir.
         * prototype - her request ucun obyekt yaradir
         * request - HTTP web request dir. ancaq web app lar ucun istifade olunur
         * session - HTTP web session.Ancaq web applar ucun istifade olunur
         * global-session - ele adindanda gorunduyu kimi globaldir web applar ucun istifade olunur
         * bean-scope xml faylina ve Main2 classina kecib baxaq
         *
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        // 2 dene bean yaradiriq ve bir birilerine beraber olub olmadigini yoxluyuruq  , xmlde scope da prototype qeyd etmisik
        // bu uzden 2 obyektin beraberliyi false olacaq ancaq scope singleton etsek true gosterecek
        CustomerController customerController = context.getBean("controller",CustomerController.class);
        CustomerController customerController2 = context.getBean("controller",CustomerController.class);

        System.out.println("RESULT: " + (customerController==customerController2));
    }
}
