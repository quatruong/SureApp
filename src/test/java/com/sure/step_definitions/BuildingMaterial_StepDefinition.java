package com.sure.step_definitions;

import com.sure.pages.BuildingMaterial_Page;
import com.sure.utilities.BrowserUtils;
import com.sure.utilities.ConfigurationReader;
import com.sure.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BuildingMaterial_StepDefinition {

    BuildingMaterial_Page buildingMaterialPage = new BuildingMaterial_Page();

    @Given("I am on the Building Material question page")
    public void i_am_on_the_building_material_question_page() {
        Driver.getDriver().get("https://sure-qa-challenge.vercel.app/building-material");

    }

    @When("I select an option")
    public void i_select_an_option() {
        buildingMaterialPage.bricksOption.click();

    }

    @When("I click the Next button")
    public void i_click_the_next_button() {
        buildingMaterialPage.nextButton.click();

    }

    @Then("I should be navigated to the Water Proximity question page")
    public void i_should_be_navigated_to_the_water_proximity_question_page() {
        BrowserUtils.verifyURLContains("https://sure-qa-challenge.vercel.app/water-proximity");
    }

    @When("I have not selected any options")
    public void i_have_not_selected_any_options() {
        buildingMaterialPage.nextButton.click();

    }

    @Then("the Next button should be disabled")
    public void the_next_button_should_be_disabled() {
        boolean buttonIsDisabled = buildingMaterialPage.nextButton.isEnabled();
        Assert.assertTrue(buttonIsDisabled);






    }
}


