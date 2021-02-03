package com.ba.designpattern.strategy;

public interface DB {
    void select();

    void update();

    void delete();

    void insert();
}
