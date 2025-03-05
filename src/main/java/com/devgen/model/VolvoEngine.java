package com.devgen.model;

public class VolvoEngine extends Engine{
    @Override
    public void startEngine() {
        System.out.println("Volvo Engine Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Volvo Engine Stopped");
    }
}
