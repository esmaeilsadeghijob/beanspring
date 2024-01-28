package com.javatar.beanspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/javatar/beanspring/ConfigurationMetadata.xml");
//        Person person = (Person) context.getBean("person");
//        System.out.println(person.getId() + ":" + person.getName());

        UserService userService = context.getBean(UserService.class);
        AccountService accountService = context.getBean(AccountService.class);

    }

}