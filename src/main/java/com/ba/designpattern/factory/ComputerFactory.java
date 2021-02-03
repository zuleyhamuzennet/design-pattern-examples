package com.ba.designpattern.factory;

public class ComputerFactory {
    public static Computer createComputer(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Computer) aClass.newInstance();
    }
}
