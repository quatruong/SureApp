package com.sure.pages;

import com.sure.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildingMaterial_Page {

    public BuildingMaterial_Page(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@value='straw']")
    public WebElement strawsOption;

    @FindBy(xpath = "//input[@value='sticks']")
    public WebElement sticksOption;

    @FindBy(xpath = "//input[@value='bricks']")
    public WebElement bricksOption;

    @FindBy(xpath = "//span[@class='MuiButton-label']")
    public WebElement nextButton;


}
