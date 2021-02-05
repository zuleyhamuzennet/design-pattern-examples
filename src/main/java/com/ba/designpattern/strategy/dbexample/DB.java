package com.ba.designpattern.strategy.dbexample;

public interface DB {
    void select();

    void update();

    void delete();

    void insert();
}
