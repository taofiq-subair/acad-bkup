package com.interswitch.springapp.designpatterns;

public class VegFood implements Food{

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public Double foodPrice() {
        return 50.0;
    }
}
