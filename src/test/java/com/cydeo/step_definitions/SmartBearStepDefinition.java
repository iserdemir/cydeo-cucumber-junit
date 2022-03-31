package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDefinition {
    SmartBearOrderPage bear = new SmartBearOrderPage();

    @Given("User is on the SmartBear homepage")
    public void smartBear_HomePage() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
    }

    @When("User is logged into SmartBear username {string} password {string}")
    public void userIsLoggedIntoSmartBearUsernamePassword(String arg0, String arg1) {
        bear.username.sendKeys(arg0);
        bear.password.sendKeys(arg1 + Keys.ENTER);
    }

    @When("User fills out the form")
    public void userFillsOutTheForm() {
        bear.orderPage.click();
        Select select = new Select(bear.productDropDown);
        select.selectByIndex(1);
    }

    @And("User should put in a quantity {string}")
    public void userShouldPutInAQuantity(String arg0) {
        bear.quantity.sendKeys(arg0);
    }

    @And("User should write a name {string}")
    public void userShouldWriteAName(String arg0) {
        bear.customerName.sendKeys(arg0);
    }

    @And("User should write a street {string}")
    public void userShouldWriteAStreet(String arg0) {
        bear.street.sendKeys(arg0);
    }

    @And("User should write a city {string}")
    public void userShouldWriteACity(String arg0) {
        bear.city.sendKeys(arg0);
    }

    @And("User should write a state {string}")
    public void userShouldWriteAState(String arg0) {
        bear.state.sendKeys(arg0);
    }

    @And("User should write a zipcode {string}")
    public void userShouldWriteAZipcode(String arg0) {
        bear.zip.sendKeys(arg0);
    }

    @And("user should click one of the card types")
    public void userShouldClickOneOfTheCardTypes() {
        bear.cardType.click();
    }

    @And("User should write a card number {string}")
    public void userShouldWriteACardNumber(String arg0) {
        bear.cardNumber.sendKeys(arg0);
    }

    @And("User should write an expire date {string}")
    public void userShouldWriteAnExpireDate(String arg0) {
        bear.expireDate.sendKeys(arg0);
    }

    @When("User clicks process button")
    public void userClicksProcessButton() {
        bear.processButton.click();

    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String arg0) {
        bear.allOrders.click();
        Assert.assertTrue(bear.verifyName.getText().contains(arg0));
    }
}
