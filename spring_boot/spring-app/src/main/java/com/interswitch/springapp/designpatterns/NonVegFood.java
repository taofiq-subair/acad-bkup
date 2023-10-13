package com.interswitch.springapp.designpatterns;

public class NonVegFood extends FoodDecorator{

    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() + " With Roasted Chicken and Chicken Curry ";
    }

    public Double foodPrice(){
        return super.foodPrice() + 150.0;
    }
}
