package com.company;

import com.company.appconfig.AppConfig;
import com.company.controller.CustomerController;
import com.company.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        /**
         *
         *       Bu defeki dersimizde annotation lar ile nece islemek olar  spring i nece konfiqurasiya etmek olar ona baxaciq
         *       Ilk once oyrenekki nedir bu java annotation lar , bu ele seydirki biz @ isari qoyaraq bir elan veririk ki
         *       meselen menim bu isimi yerine yetir ve hemin annotation da bizim yerimize xml faylinda ozu bunlari hell edir
         *       misal siz @Override ile tanis olmusduz , burdaki annotation in meqsedi metodlarin dogru sekilde ovveride etmekdir
         *       yeni biz ozumuz metodu yazacagimiza bunu bize avtomatik edir ve sehvde olmur
         *       Indi ise biz burda spring konfiqurasiyasini edeceyik.YEni xml faylinda deyil sadece classin basina @Component
         *       annotation nini qoyaraq isimizi daha suretli edeceyik
         *
         *       CustomerController classinda classin basina @Component("customerController") yazacam ve belelikle xml faylini sanki ozu duzletmis kimi
         *       olur, scan edir baxib duzeldir hamsini.Beand id dediyimiz yere istediyin adi vere bilersen problem deyil
         *
         *       Bes Componentde hec bir sey yazmasaq ne bas verer?
         *       CustomerServiceImpl classina baxaq.
         *       Bu zaman @Component default olaraq classin adini ozune id kimi goturecek ancaq
         *       classin ilk bas herifini balaca yazacaq Misal eger sadece Customer classi olsaydi adi o zaman deafult olaraq
         *       Component 'customer' kimi qebul edecekdi.Ancaq bizde class CustomerService oldugu ucun Component bunu
         *        "customerService" kimi qebul edecek
         *
         *       Bes context.getBean de adini basqa bir sey yazsaydiq ne bas vererdi.Bu zaman bean i tapa bilmeyib exception atacaq
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerController customerController = context.getBean("customerController", CustomerController.class);
        Customer customer = new Customer();

        customerController.saveCustomer(customer);
        customerController.getCustomerInfo();
    }
}
