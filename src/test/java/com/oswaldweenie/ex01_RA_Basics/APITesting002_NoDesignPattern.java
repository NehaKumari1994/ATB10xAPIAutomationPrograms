package com.oswaldweenie.ex01_RA_Basics;

public class APITesting002_NoDesignPattern {
    //No Design Pattern
    // We use the ref and call it one by one
    public void step1(){
        System.out.println("Step 1");
    }
    public void step2(){
        System.out.println("Step 2");
    }
    public void step3(String param1){
        System.out.println("Step 3");
    }
    public static void main(String[] args) {
        APITesting002_NoDesignPattern np = new APITesting002_NoDesignPattern();
        np.step1();
        np.step2();
        np.step3("Daisy");

    }
}
