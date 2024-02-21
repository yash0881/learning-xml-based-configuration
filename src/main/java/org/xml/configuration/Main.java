package org.xml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s1 = context.getBean("student1", Student.class);
        System.out.println(s1.toString());

        Student s2 = context.getBean("student2", Student.class);
        System.out.println(s2.toString());

    }
}