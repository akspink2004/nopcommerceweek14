package com.nopcommerce.steps;

import com.nopcommerce.pages.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RgisterTestPage {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
    }
    @Then("^I Should navigate to Register page$")
    public void iShouldNavigateToRegisterPage() {
        String actualMessage= new RegisterPage().verifyRegisterText();
        String expectedMessage = "Register";
        Assert.assertEquals(actualMessage,expectedMessage,"Register verfied");
    }
}
