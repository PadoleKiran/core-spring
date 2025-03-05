package com.devgen;

import com.devgen.model.Car;
import com.devgen.model.Engine;
import com.devgen.model.Engine;
import com.devgen.model.TataEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car car = (Car) context.getBean("car");

        car.drive();

        Engine engin = (Engine) context.getBean(TataEngine.class);
        engin.startEngine();
        engin.stopEngine();

    }
}