package com.devgen.model;

import org.springframework.beans.factory.annotation.Value;

public class Car {

    // Dependency injection
    public String brand;
    public String model;

//    private Engin engin = new Engin(); // this is not good way design this tightly coupled we con not make change directly
    private Engine engine;

    public Car(String model) {
        this.model = model;  // constructor injection
        System.out.println("This is constructor");
    }

    public void drive() {
        engine.startEngine();
        System.out.println(" Driving ");
        engine.stopEngine();
    }

    // Setter injection
    public void setBrand(String brand) {
        System.out.println("Setter method calling for brand");
        this.brand = brand;
    }

    public void setEngine(Engine engine) {
        System.out.println("Engine setter method called");
        this.engine = engine;

        System.out.println("Setter Engine " );
    }
}
