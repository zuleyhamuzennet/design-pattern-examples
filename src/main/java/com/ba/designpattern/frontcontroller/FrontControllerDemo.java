package com.ba.designpattern.frontcontroller;

public class FrontControllerDemo {
    public static void main(String[] args){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Teacher");
        frontController.dispatchRequest("Student");
    }
}
