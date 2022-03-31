package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataTable_StepDefinitions {
DropDownsPage page = new DropDownsPage();
    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in the month dropdown")
    public void user_should_see_below_info_in_the_month_dropdown(List<String> expectedMonths) {
        Select select = new Select(page.monthDropDown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        List<String> actualOptions = new ArrayList<>();
        for (WebElement element : actualOptionsAsWebElement) {
            actualOptions.add(element.getText());
        }
        System.out.println("actualOptions = " + actualOptions);
        Assert.assertEquals(expectedMonths,actualOptions);

        //   System.out.println("expectedMonths = " + expectedMonths);
    }
}
