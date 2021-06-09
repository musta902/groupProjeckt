package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {
    @BeforeMethod
    public  void beforeMethod(){

        System.out.println("open browser");
    }
    @Test
    public void test1(){
        System.out.println("first Assertion");

        Assert.assertEquals("title","tiTle");

        System.out.println("second Assertion");

        Assert.assertEquals("url","url");
    }
        @Test
    public void test2(){
        System.out.println("second test");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Close browser");


    }

}
