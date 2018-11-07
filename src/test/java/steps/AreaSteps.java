package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FootMeter;

public class AreaSteps {

    @Given("^Open \"area\" converter from search by keyword$")
    public void userOpenLength() throws Throwable {
        FootMeter.isOpenApps();
    }

    @When("^I choose \"square meter\" to \"Hectare\"$")
    public void userClickDropdown() throws  Throwable {
        FootMeter.btnListMeter.tap();
        FootMeter.btnDropDownFoot.tap();
    }
    @When("I input \"125\" to convert$")
    public void userInputNumber() throws Throwable {
        FootMeter.btnNumber.tap();
    }
    @Then("the result should be \"0.0125$")
    public void Expectation() throws Throwable {

    }
}
