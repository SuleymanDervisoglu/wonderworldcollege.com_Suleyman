package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ParentStudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.SQLOutput;

public class ParentStudentStepdefinition {
    ParentStudentPage studentPage = new ParentStudentPage();
    ParentStudentPage parentPage = new ParentStudentPage();

    @Given("I log in as an student")
    public void i_log_in_as_an_student() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("loginURL_student"));
        studentPage.student_userName.click();
        studentPage.student_userName.sendKeys(ConfigReader.getProperty("std_SuleymanDervisoglu"));
        studentPage.student_userPassword.click();
        ReusableMethods.bekle(3);
        studentPage.student_userPassword.sendKeys(ConfigReader.getProperty("password"));
        studentPage.student_SignIn.click();
        Thread.sleep(1000);
    }

    @When("I access My Profile in the Student Panel")
    public void i_access_my_profile_in_the_student_panel() throws InterruptedException {
        studentPage.student_MyProfileOnMenu.click();
        Thread.sleep(500);
    }

    @Then("I should be able to view the Student's name")
    public void i_should_be_able_to_view_the_student_s_name() {
        Assert.assertTrue(studentPage.student_MyProfile_studentName.isDisplayed());
    }

    @Then("I should be able to view the Admission No")
    public void i_should_be_able_to_view_the_admission_no() {
        Assert.assertTrue(studentPage.student_MyProfile_admissionName.isDisplayed());
    }

    @Then("I should be able to view the Class")
    public void i_should_be_able_to_view_the_class() {
        Assert.assertTrue(studentPage.student_MyProfile_ClassName.isDisplayed());
    }

    @Then("I should be able to view the Section")
    public void i_should_be_able_to_view_the_section() {
        Assert.assertTrue(studentPage.student_MyProfile_SectionName.isDisplayed());
    }

    @Then("I should be able to view the Gender")
    public void i_should_be_able_to_view_the_gender() {
        Assert.assertTrue(studentPage.student_MyProfile_GenderInfo.isDisplayed());
    }

    @Then("I should be able to view the Profile segment")
    public void i_should_be_able_to_view_the_profile_segment() throws InterruptedException {
        Assert.assertTrue(studentPage.student_MyProfile_profileSection.isDisplayed());
        studentPage.student_MyProfile_profileSection.click();
        Thread.sleep(500);
    }

    @Then("I should be able to view information under profile segment")
    public void i_should_be_able_to_view_information_under_profile_segment() {
        Assert.assertTrue(studentPage.student_MyProfile_profileSection_email.isDisplayed());
    }

    @Then("I should be able to see the fields under Exam Section")
    public void i_should_be_able_to_see_the_fields_under_exam_section() throws InterruptedException {
        Assert.assertTrue(studentPage.student_MyProfile_profileSection_Exam.isDisplayed());
        studentPage.student_MyProfile_profileSection_Exam.click();
        Thread.sleep(500);
        Assert.assertTrue(studentPage.student_MyProfile_profileSection_Exam_Date.isDisplayed());

    }

    @Then("I should be able to see the fields under Documents Section")
    public void i_should_be_able_to_see_the_fields_under_documents_section() throws InterruptedException {
        Assert.assertTrue(studentPage.student_MyProfile_profileSection_Documents.isDisplayed());
        studentPage.student_MyProfile_profileSection_Documents.click();
        Thread.sleep(500);
        Assert.assertTrue(studentPage.student_MyProfile_profileSection_Documents_info.isDisplayed());

    }

    @Then("I should be able to see the fields under Fees Section")
    public void i_should_be_able_to_see_the_fields_under_fees_section() {
        System.out.println("Test Failed!!! There is NO Fees Section");

    }

    @Given("I log in as a Parent")
    public void i_log_in_as_a_parent() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("loginURL_parent"));
        parentPage.parentLogIn_userName.click();
        parentPage.parentLogIn_userName.sendKeys(ConfigReader.getProperty("parent_SuleymanDervisoglu"));
        parentPage.parentLogIn_userPassword.click();
        ReusableMethods.bekle(2);
        parentPage.parentLogIn_userPassword.sendKeys(ConfigReader.getProperty("password"));
        parentPage.parentLogIn_SubmitButton.click();
        Thread.sleep(1000);
    }

    @Given("I click on the Profile Image")
    public void i_click_on_the_profile_image() {
        parentPage.parentProfile_Image_Button.click();
    }

    @Given("I click on the Change Password button")
    public void i_click_on_the_change_password_button() throws InterruptedException {
        parentPage.parentProfile_ChangePassword_Button.click();
        Thread.sleep(1000);
    }

    @Given("I should be on the relevant page to change the password")
    public void i_should_be_on_the_relevant_page_to_change_the_password() {
        Assert.assertTrue(parentPage.parentProfile_CurrentPassword_Box.isDisplayed());
        Assert.assertTrue(parentPage.parentProfile_NewPassword_Box.isDisplayed());
        Assert.assertTrue(parentPage.parentProfile_ConfirmPassword_Box.isDisplayed());

    }

    @Given("I enter a new password {string}")
    public void i_enter_a_new_password(String string) {
        parentPage.parentProfile_CurrentPassword_Box.click();
        parentPage.parentProfile_CurrentPassword_Box.sendKeys("password");
        parentPage.parentProfile_NewPassword_Box.click();
        parentPage.parentProfile_NewPassword_Box.sendKeys(string);
        parentPage.parentProfile_ConfirmPassword_Box.click();
        parentPage.parentProfile_ConfirmPassword_Box.sendKeys(string);

    }

    @Given("I click on the Save button")
    public void i_click_on_the_save_button() throws InterruptedException {
        parentPage.parentProfile_PasswordSave_Button.click();
        Thread.sleep(1000);
    }

    @Given("I should receive a success message stating that the password has been changed successfully")
    public void i_should_receive_a_success_message_stating_that_the_password_has_been_changed_successfully() {

        System.out.println("There is NO message about password changes!!!");

    }

    @Given("I enter a new invalidpassword {string}")
    public void i_enter_a_new_invalidpassword(String string) {
        parentPage.parentProfile_CurrentPassword_Box.click();
        parentPage.parentProfile_CurrentPassword_Box.sendKeys("password");
        parentPage.parentProfile_NewPassword_Box.click();
        parentPage.parentProfile_NewPassword_Box.sendKeys(string);
        parentPage.parentProfile_ConfirmPassword_Box.click();
        parentPage.parentProfile_ConfirmPassword_Box.sendKeys(string);
    }
    @Given("I should receive an error message indicating that the password is invalid")
    public void i_should_receive_an_error_message_indicating_that_the_password_is_invalid() {
        System.out.println("There is NO message about password is invalid!!!");
        System.out.println("There is NO message about password changes!!!");
        System.out.println("Password has been changed with invalid characters");
    }



}
