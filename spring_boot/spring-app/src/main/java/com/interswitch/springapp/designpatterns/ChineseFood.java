package com.interswitch.springapp.designpatterns;

public class ChineseFood extends FoodDecorator{
    public ChineseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() + " With Fried rice and Manchurian ";
    }

    public Double foodPrice(){
        return super.foodPrice() + 65.0;
    }
}
