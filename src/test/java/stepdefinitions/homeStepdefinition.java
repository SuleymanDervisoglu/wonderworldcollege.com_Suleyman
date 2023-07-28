package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class homeStepdefinition {

    HomePage homePage = new HomePage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));
    }

    @When("I look at the navbar")
    public void i_look_at_the_navbar() {
        Assert.assertTrue(homePage.navbar_emailElement.isDisplayed());

    }

    @Then("I should see the school's email address {string} displayed")
    public void i_should_see_the_school_s_email_address_displayed(String string) {

    }

    @And("Close the browser")
    public void closeTheBrowser() {
        Driver.closeDriver();
    }


    @And("User scrolls down the page")
    public void userScrollsDownPage() throws InterruptedException {
        // Perform the scroll action using JavaScriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
    }


    @Then("I should see the school's {string} in the footer")
    public void iShouldSeeTheSchoolSInTheFooter(String arg0) {
        Assert.assertTrue(homePage.navbar_phoneNumber.isDisplayed());
    }

    @And("I should see the {string} in the footer")
    public void iShouldSeeTheInTheFooter(String arg0) {
        Assert.assertTrue(homePage.navbar_schoolAddress.isDisplayed());
    }


    @Then("I should see the school's {string} information as Call Us")
    public void iShouldSeeTheSchoolSInformationAsCallUs(String arg0) {
        Assert.assertTrue(homePage.call_us.isDisplayed());
        String actual_call_us=homePage.call_us.getText();
        String expected_call_us="+1 408 515 7290";
        Assert.assertTrue(actual_call_us.contains(expected_call_us));


    }
}
