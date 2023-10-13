// SINGLETON PATTERN

package com.interswitch.springapp.designpatterns;

public enum ConnectionUtility {
    INSTANCE;

    public String getValue(){
        return "This is a test value.";
    }
}
