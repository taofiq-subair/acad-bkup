package com.interswitch.springapp.designpatterns;

abstract public class FoodDecorator implements Food {
    private Food newFood;

    public FoodDecorator(Food newFood){
        this.newFood = newFood;
    }

    @Override
    public String prepareFood(){
        return newFood.prepareFood();

    }

    public Double foodPrice(){
        return newFood.foodPrice();
    }
}
