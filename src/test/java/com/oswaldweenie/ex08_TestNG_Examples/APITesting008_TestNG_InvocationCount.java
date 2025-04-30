package com.oswaldweenie.ex08_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting008_TestNG_InvocationCount {

    @Test(invocationCount = 100)

    public void test01(){
        Assert.assertTrue(true);
    }
}
