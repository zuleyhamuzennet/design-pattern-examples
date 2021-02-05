package com.ba.designpattern.factory;


public class FactoryPatternDemo {
    public static void main(String[] args) {
        try {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1234);
            asus.name();
            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
