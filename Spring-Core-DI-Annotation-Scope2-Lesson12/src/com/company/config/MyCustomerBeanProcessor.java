package com.company.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class MyCustomerBeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

    private BeanFactory beanFactory;

    private final List<Object> prototypeBeans = new LinkedList<>();

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void destroy() throws Exception {
     synchronized (prototypeBeans){
         for(Object bean : prototypeBeans){
             if(bean instanceof DisposableBean){
                 DisposableBean disposableBean = (DisposableBean) bean;
                 try {
                     disposableBean.destroy();
                 }catch (Exception e){
                     e.printStackTrace();
                 }
             }
         }
     }
    }
}
