package com.sure.step_definitions;

import com.sure.pages.LandingPage_Page;
import com.sure.utilities.BrowserUtils;
import com.sure.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.sure.utilities.Driver.getDriver;


public class LandingPage_StepDefinition {

    LandingPage_Page landingPagePage = new LandingPage_Page();

    @Given("I am on the main Hurricane Insurance website {string} landing page")
    public void i_am_on_the_main_hurricane_insurance_website_landing_page(String browser) {
        getDriver().get(browser);
    }

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
    String url = ConfigurationReader.getProperty("env");
    getDriver().get(url);

    }
    @When("I enter any {int}-digit zip code")
    public void i_enter_any_digit_zip_code(Integer zipcode) {
        landingPagePage.zipCode.sendKeys("12345");

    }
    @When("I submit the form")
    public void i_submit_the_form() {
        landingPagePage.getAQuoteButton.click();

    }
    @Then("I should be navigated to the Building Material question page")
    public void i_should_be_navigated_to_the_building_material_question_page() {

        BrowserUtils.verifyURLContains("https://sure-qa-challenge.vercel.app/building-material");

    }
    @When("I leave the zip code field empty")
    public void i_leave_the_zip_code_field_empty() {

        landingPagePage.getAQuoteButton.click();
    }
    @Then("I should see a validation message {string}")
    public void i_should_see_a_validation_message(String messageRequired) {

        String expectedMessage = landingPagePage.messageRequired.getText();
        System.out.println("expectedMessage = " + expectedMessage);

        Assert.assertEquals(messageRequired, expectedMessage);
    }

        @When("I enter {string} in the zip code field")
        public void i_enter_in_the_zip_code_field(String zipCode) {
            landingPagePage.zipCode.sendKeys(zipCode);
            landingPagePage.getAQuoteButton.click();

        }

    @Then("I should see a validation message is {string}")
    public void i_should_see_a_validation_message_is(String messageInvalidZipCode) {
        String expectedMessage = landingPagePage.messageInvalidZipCode.getText();
        System.out.println("expectedMessage = " + expectedMessage);

        Assert.assertEquals(expectedMessage,messageInvalidZipCode);

        }
        }






