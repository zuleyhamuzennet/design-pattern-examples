package com.ba.designpattern.facade;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
