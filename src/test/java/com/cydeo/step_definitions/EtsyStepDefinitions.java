package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {
 EtsySearchPage etsy = new EtsySearchPage();

 @When("user is on ets homepage")
 public void user_is_on_ets_homepage() {
  Driver.getDriver().get("https://www.etsy.com");
 }

 @Then("user should see title that Etsy is")
 public void user_should_see_title_that_etsy_is() {
  String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
  Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
 }

 @When("user types Wooden Spoon in the search box")
 public void user_types_wooden_spoon_in_the_search_box() {
  etsy.searchBox.sendKeys("Wooden Spoon");
 }
 @When("user clicks search button")
 public void user_clicks_search_button() {
  etsy.clickButton.click();
 }
 @Then("user sees Wooden Spoon is in the title")
 public void user_sees_wooden_spoon_is_in_the_title() {
  String expectedTitle = "Wooden spoon";
  Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
 }
}
