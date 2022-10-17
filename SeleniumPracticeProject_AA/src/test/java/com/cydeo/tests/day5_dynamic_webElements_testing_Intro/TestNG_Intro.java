package com.cydeo.tests.day5_dynamic_webElements_testing_Intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @BeforeClass
    // Method with this annotation will always run once before all of the other methods in this class
    public void setUp(){
        System.out.println("--> BeforeClass is running");
    }

    @AfterClass
    // Runs ONCE after all the methods are DONE
    public void tearDown(){
        System.out.println("--> AfterClass is running");
    }

    @BeforeMethod
    // Method with this annotation will always run once before every @Test method
    public void setUpMethod(){
        System.out.println("--> BeforeMethod is running");
    }

    @AfterMethod
    // runs once after every @Test
    public void tearDownMethod(){
        System.out.println("--> AfterMethod is running");
    }


    // Assert class methods are used to do verifications with TestNG

    @Test (priority = 2)
    public void test1() {
        System.out.println("Test 1 is running");

        // assertEquals: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test (priority = 1) // priority is optional
    public void test2(){
        System.out.println("Test 2 is running");

        // assertTrue
        String actual = "orange";
        String expected = "orange";

        Assert.assertTrue(actual.equals(expected));

    }
}
