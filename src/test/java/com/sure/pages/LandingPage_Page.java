package com.sure.pages;

import com.sure.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_Page {

    public LandingPage_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//input[@name='postalCode']")
        public WebElement zipCode;

        @FindBy(xpath = "//span[@class='MuiButton-label']")
        public WebElement getAQuoteButton;

        @FindBy(xpath = "//p[text()='Required']")
        public WebElement messageRequired;

        @FindBy(xpath = "//p[text()='Invalid zip code']")
        public WebElement messageInvalidZipCode;




}
