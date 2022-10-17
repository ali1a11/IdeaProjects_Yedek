package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");
    }
    @When("he eats some cucumber")
    public void he_eats_some_cucumber() {
        System.out.println("It is from When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }


    @Given("{string} is hungry")
    public void is_hungry(String name) {
        System.out.println(name + " is hungry");
        System.out.println("It is parameterized version");
    }
    @When("he eats {int} cucumber")
    public void he_eats_cucumber(Integer count) {
        System.out.println("he eats " + count + " cucumber");
        System.out.println("It is parameterized version");
    }

}
