// FACTORY PATTERN

// Calculate Electricity bill a real world example

package com.interswitch.springapp.designpatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan{
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units * rate);
    }
} // End of plan class

// We are going to create a concrete class that extends abs class Plan

class DomesticPlan extends Plan{
    //@override
    public void getRate(){
        rate = 3.50;
    }
} // end of domestic plan

    class CommercialPlan extends Plan{
    //@override
    public void getRate(){
        rate = 7.50;
    }
} // end of commercial plan

     class InstitutionalPlan extends Plan{
    //@override
    public void getRate(){
        rate = 5.50;
    }
} // end of institutional plan

// Step 3

// Create a GetPlanFactory to generate object of concrete classes based on given info

class GetPlanFactory{
    // use getPlan method to get object of type plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

class GenerateBill {

    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        // get an object of DomesticPlan and call its getPlan() method. But we want to
        // calculate the bill for one plan at a time not all for this we IO concept.


        System.out.println("Enter the name of plan for which the bill will be generated:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.println("Enter the number of units tat would be calculated");

        int units  =  Integer.parseInt(br.readLine());

        Plan  p  =  planFactory.getPlan(planName);

        // call getRate() method and calculateBill() method of Domestic plan

        System.out.println("Bill amount for " + planName + " of " +units +  " units is:");
        p.getRate();
        p.calculateBill(units);
    }

} // end of generateBill class