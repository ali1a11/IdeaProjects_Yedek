package com.cydeo.tests.from_ShortVideos_Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class TestNG_Hard_Soft_Assertions {

    @Test
    public void hardAssertion() {

        Assert.assertEquals("apple", "app"); // if it fails do nNOT execute codes after this line

        System.out.println("After Assertion failed");

        assertTrue("orange".equals("oranger"));

        System.out.println("After Assertion failed");

    }

    @Test
    public void softAssertion() {

        // we have to create object for SoftAssert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");

        System.out.println("After Assertion failed");

        softAssert.assertTrue("orange".equals("oranger"));

        System.out.println("After Assertion failed");

        softAssert.assertAll(); // !!!
    }

}
