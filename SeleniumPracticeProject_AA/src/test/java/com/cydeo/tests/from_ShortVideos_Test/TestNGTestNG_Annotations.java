package com.cydeo.tests.from_ShortVideos_Test;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestNGTestNG_Annotations {

    @Test (priority = 2)
    public void testOnePlusFive() {
        assertEquals(1 + 5, 6);
        System.out.println("- testOnePlusFive is running");
    }

    @Test (priority = 1)
    public void testTenMinusFour() {
        assertEquals(10 - 4, 6);
        System.out.println("- testTenMinusFour is running");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("- BeforeClass is running");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("- AfterClass is running");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("- BeforeMethod is running");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("- AfterMethod is running");
    }


}
