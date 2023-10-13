package com.interswitch.springapp.service.impl;

import com.interswitch.springapp.service.Greet;

public class AfternoonGreeting implements Greet {
    public void greeting(){
        System.out.println("Good afternoon.");
    }
}
