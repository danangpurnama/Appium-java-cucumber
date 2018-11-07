package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import pages.FootMeter;

public class FootMeterSteps {

    @Given("^Open \"length\" converter from side menu$")
    public void userOpenLength() throws Throwable {
        FootMeter.isOpenApps();
    }

    @When("^I choose \"foot\" to \"meter\"$")
    public void userClickDropdown() throws  Throwable {
        FootMeter.btnListMeter.tap();
        FootMeter.btnDropDownFoot.tap();
    }
    @When("And I input \"7\" to convert")
    public void userInputNumber() throws Throwable {
        FootMeter.btnNumber.tap();
    }
    @Then("the result should be \"2.1336\"")
    public void Expectation() throws Throwable {

    }
}