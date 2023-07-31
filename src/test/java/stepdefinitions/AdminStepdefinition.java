package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;
import java.time.Duration;

import static java.lang.reflect.Array.get;
import static utilities.Driver.driver;

public class AdminStepdefinition {

    AdminPage adminPage= new AdminPage();

    @Given("I am logged in as an admin user {string}")
    public void i_am_logged_in_as_an_admin_user(String string) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("loginURL_adm_teach"));
        adminPage.adminUserName.click();
        adminPage.adminUserName.sendKeys(ConfigReader.getProperty("admin_SuleymanDervisoglu"));
        adminPage.adminPassword.click();
        ReusableMethods.bekle(3);
        adminPage.adminPassword.sendKeys(ConfigReader.getProperty("password"));
        adminPage.adminSingIn.click();
        Thread.sleep(1000);

    }
    @Given("I click on the {string} menu in the sidebar")
    public void i_click_on_the_menu_in_the_sidebar(String string) throws InterruptedException {
        adminPage.adminFeesCollection.isDisplayed();
        adminPage.adminFeesCollection.click();
        Thread.sleep(1500);
    }
    @Given("I click on the {string} page link")
    public void i_click_on_the_page_link(String string) throws InterruptedException {
        adminPage.adminFeesType.isDisplayed();
        adminPage.adminFeesType.click();
        Thread.sleep(1000);
    }
    @Given("I should be redirected to the {string} page")
    public void i_should_be_redirected_to_the_page(String string) throws InterruptedException {
        Assert.assertTrue(adminPage.adminFeesTypeList.isDisplayed());
        Thread.sleep(1000);
    }
    @Given("I have to see {string} is available")
    public void i_have_to_see_is_available(String string) throws InterruptedException {
        Assert.assertTrue(adminPage.addFeesTypeSection.isDisplayed());
        Thread.sleep(1000);
    }
    @Given("On the Add Fees Type section {string} must be entered as the name")
    public void on_the_add_fees_type_section_must_be_entered_as_the_name(String string) {
        adminPage.adminFeesTypeNameBox.sendKeys(string);
    }
    @Given("On the Add Fees Type section {string} must be entered as the Fees Code")
    public void on_the_add_fees_type_section_must_be_entered_as_the_fees_code(String string) {
        adminPage.adminFeesTypeCodeBox.sendKeys(string);
    }
    @Given("On the Add Fees Type section {string} must be entered Description")
    public void on_the_add_fees_type_section_must_be_entered_description(String string) {
        adminPage.adminFeesTypeDescriptionBox.sendKeys(string);
    }
    @Given("On the Add Fees Type section click the save button")
    public void on_the_add_fees_type_section_click_the_save_button() throws InterruptedException {
       adminPage.adminFeesTypeSaveButton.click();
       Thread.sleep(1000);
    }
    //-----------------------//
    @Given("User find the last beam")
    public void user_find_the_last_beam() throws InterruptedException {
        WebElement lastRow = driver.findElement(By.cssSelector("table tr:last-child"));
        lastRow.click();
        Thread.sleep(1000);
    }
    @Given("User click the last beam's edit button")
    public void user_click_the_last_beam_s_edit_button() throws InterruptedException {
            adminPage.adminFeesTypeEditButton.click();

    }
    @Given("Change the in name box {string} to {string}")
    public void change_the_in_name_box_to(String string, String string2) {
        adminPage.adminFeesTypeNameBox.clear();
        adminPage.adminFeesTypeNameBox.sendKeys(string2);

    }
    @Given("Change the in Fees code box {string} to {string}")
    public void change_the_in_fees_code_box_to(String string, String string2) {
        adminPage.adminFeesTypeCodeBox.clear();
        adminPage.adminFeesTypeCodeBox.sendKeys(string2);
    }
    @Given("Change the in Description box {string} to {string}")
    public void change_the_in_description_box_to(String string, String string2) throws InterruptedException {
        adminPage.adminFeesTypeDescriptionBox.clear();
        adminPage.adminFeesTypeDescriptionBox.sendKeys(string2);
        Thread.sleep(1000);
    }
    @Given("Make sure edit is done")
    public void make_sure_edit_is_done() throws InterruptedException {
        Assert.assertTrue(adminPage.recordSuccess.isDisplayed());
        String actual_recordSuccess=adminPage.recordSuccess.getText();
        String expected_recordSuccess="Record Updated Successfully";
        Assert.assertTrue(actual_recordSuccess.contains(expected_recordSuccess));
        Thread.sleep(1000);

    }
    @Then("the last record should be removed from the list")
    public void the_last_record_should_be_removed_from_the_list() throws InterruptedException {
        adminPage.adminFeesTypeDeleteButton.click();
        Thread.sleep(1000);
    }
    @Then("Given I wait for and press Enter key")
    public void given_i_wait_for_and_press_enter_key() throws InterruptedException {

        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }
    @Then("Confirm the delete procedures")
    public void confirm_the_delete_procedures() throws InterruptedException {
        WebElement lastRow = driver.findElement(By.cssSelector("table tr:last-child"));
        lastRow.click();
        Thread.sleep(1000);
    }



}
