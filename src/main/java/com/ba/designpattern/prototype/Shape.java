package com.ba.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
