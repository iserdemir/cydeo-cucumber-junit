package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderPage {
    public SmartBearOrderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "ctl00$MainContent$username")
    public WebElement username;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement password;

    @FindBy(linkText = "Order")
    public WebElement orderPage;

    @FindBy(name = "ctl00$MainContent$fmwOrder$ddlProduct")
    public WebElement productDropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(linkText = "View all orders")
    public WebElement allOrders;

    @FindBy(xpath = "//table[@class='SampleTable']/tbody/tr[2]/td[2]")
    public WebElement verifyName;



}
