package com.interswitch.springapp.model;

public class Product{
    private String name;
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}
