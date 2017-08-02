package com.template.ssm.providerTest;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:spring-mybatis.xml", "classpath:spring-dubbo.xml" });
        context.start();
        System.out.println("Provider service register successful.");
        try {
            System.in.read();// keep running
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
