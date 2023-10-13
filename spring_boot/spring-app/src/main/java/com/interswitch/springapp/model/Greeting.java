package com.interswitch.springapp.model;

public class Greeting {
  public String sayHello(String name){
    return String.format("Welcome to learning String Boot %s", name);

  }

  public void destroy(){
    System.out.println(this.getClass().getName()+" is being destroyed");
  }

  public void init(){
    System.out.println(this.getClass().getName() + " is being initialized");
  }

}
