package com.oswaldweenie.ex01_RA_Basics;

public class APITesting003_BuilderDesignPattern {
    public APITesting003_BuilderDesignPattern step1(){
        System.out.println("Step 1");
        return this;
    }

    public APITesting003_BuilderDesignPattern step2(){
        System.out.println("Step 2");
        return this;
    }

    public APITesting003_BuilderDesignPattern step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting003_BuilderDesignPattern bp = new APITesting003_BuilderDesignPattern();
        bp.step1().step2().step3("pramod");

    }
}
