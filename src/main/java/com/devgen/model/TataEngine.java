package com.devgen.model;

import java.util.List;

public class TataEngine  extends Engine{

    public void lastMethod() {
        System.out.println("this is last method in tata engine");
    }

    @Override
    public void startEngine() {
        System.out.println("Tata Engine Started");
        System.out.println("Engine Parts : " + enginePart);
    }

    @Override
    public void stopEngine() {
        System.out.println("Tata Engine Stopped");
    }
    private List<String> enginePart;

    public TataEngine(List<String> enginePart) {
        this.enginePart = enginePart;
    }


}
