package com.ba.designpattern.template;

public class HousingClient {
    public void housingClientRun() {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
