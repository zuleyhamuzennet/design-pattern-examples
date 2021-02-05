package com.ba.designpattern.template;

public class TemplatePatternDemo {
    private static void main(String[] args){
        HouseTemplate houseType= new GlassHouse();
        houseType.buildHouse();

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
