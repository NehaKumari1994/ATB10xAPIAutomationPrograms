package com.oswaldweenie.ex08_TestNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting007_TestNG_AlwaysRun {
    @Test(enabled = false)
    public void test01() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun= true,enabled=false)//enabled will override the alwaysRun
    public void test02(){
        Assert.assertTrue(true);
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }
}
