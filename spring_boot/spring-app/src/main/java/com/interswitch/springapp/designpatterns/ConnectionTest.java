// SINGLETON PATTERN IMPLEMENTATION

package com.interswitch.springapp.designpatterns;

public class ConnectionTest

{

    public static void main(String[] args) {
        String result = ConnectionUtility.INSTANCE.getValue();
        System.out.println(result);
    }
}
