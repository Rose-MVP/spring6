package com.powernode.spring6.beans;

import java.util.Arrays;

public class Person {
    private String[] favariteFoods;
    public void setFavariteFoods(String[] favariteFoods){
        this.favariteFoods=favariteFoods;
    }

    @Override
    public String toString() {
        return "Person{" +
                "favariteFoods=" + Arrays.toString(favariteFoods) +
                '}';
    }
}
