package com.oswaldweenie.ex08_TestNG_Examples;

import org.testng.annotations.*;

public class APITesting009_TestNG_AllAnnotations {

    @BeforeSuite
    public void testdemo1(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void testdemo2(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void testdemo3(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void testdemo4(){
        System.out.println("Before Method");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
    }

}
