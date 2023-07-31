package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class TeacherStepdefinition {

    TeacherPage teacherPage = new TeacherPage();

    @Given("I am logged in as an administrator")
    public void i_am_logged_in_as_an_administrator() {

        Driver.getDriver().get(ConfigReader.getProperty("loginURL_adm_teach"));
        teacherPage.teacherUserName.click();
        teacherPage.teacherUserName.sendKeys(ConfigReader.getProperty("teach_SuleymanDervisoglu"));
        teacherPage.teacherPassword.click();
        ReusableMethods.bekle(3);
        teacherPage.teacherPassword.sendKeys(ConfigReader.getProperty("password"));
        teacherPage.teacherSingIn.click();
    }
    @Given("I am on the Attendance page")
    public void i_am_on_the_attendance_page() throws InterruptedException {
        teacherPage.teacherAttendance.click();
        Thread.sleep(500);
        teacherPage.periodAttendance.click();
        Thread.sleep(500);
    }
    @When("I select the Class")
    public void i_select_the_class() throws InterruptedException {
        teacherPage.classAttendance.isDisplayed();
        teacherPage.attendance_Class_id.click();
        teacherPage.attendance_Class_1.click();
        Thread.sleep(500);
    }
    @When("I select the Section")
    public void i_select_the_section() {
        teacherPage.sectionAttendace.isDisplayed();
        teacherPage.attendance_Section_id.click();

    }
    @When("I select the Subject")
    public void i_select_the_subject() throws InterruptedException {
        teacherPage.subjectAttendance.isDisplayed();
        teacherPage.attendance_SubjectBox.click();
        teacherPage.attendance_Subject1.click();
        Thread.sleep(500);

    }
    @When("I enter the Date")
    public void i_enter_the_date() throws InterruptedException {
        teacherPage.dateAttendance.isDisplayed();
        teacherPage.attendance_Date_box.click();
        teacherPage.attendance_Choosen_date.click();
        Thread.sleep(500);
    }
    @When("I click the Search button")
    public void i_click_the_search_button() throws InterruptedException {
       teacherPage.attendance_Search_button.click();
       Thread.sleep(1000);
    }
    @Then("the Student List is displayed")
    public void the_student_list_is_displayed() throws InterruptedException {
        teacherPage.attendance_Student_list.isDisplayed();
        Thread.sleep(500);
    }
    @Then("I mark the attendance status for each student:First,Second,Third")
    public void i_mark_the_attendance_status_for_each_student_first_second_third() throws InterruptedException {

        teacherPage.attendance_Student_1_late.click();
        teacherPage.attendance_Student_2_absent.click();
        teacherPage.attendance_Student_3_halfDay.click();
        Thread.sleep(500);
    }
    @Then("I click the Save Attendance button")
    public void i_click_the_save_attendance_button() throws InterruptedException {
       teacherPage.attendance_SaveButton.click();
       Thread.sleep(500);
    }

    @Given("I write notes for three different students")
    public void i_write_notes_for_three_different_students() throws InterruptedException {
        teacherPage.attendance_Student_1_noteBox.sendKeys("123*-@.?/\\`+=-_(){}[]%$#@!^&*~;:'><");
        teacherPage.attendance_Student_2_noteBox.sendKeys("123*-@.?/\\`+=-_(){}[]%$#@!^&*~;:'><");
        teacherPage.attendance_Student_3_noteBox.sendKeys("123*-@.?/\\`+=-_(){}[]%$#@!^&*~;:'><");
        Thread.sleep(1000);
    }
    @When("I click the Mark As Holiday button")
    public void i_click_the_mark_as_holiday_button() throws InterruptedException {
        teacherPage.attendance_HolidayButton.click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();


    }
    @Then("the entire day is marked as Holiday")
    public void the_entire_day_is_marked_as_holiday() {
        boolean isClickable = teacherPage.attendance_Student_1_late.isEnabled();
        Assert.assertFalse("Element should not be clickable as it is marked as a holiday.", isClickable);
    }
    @Given("I click the Attendance on menu")
    public void i_click_the_attendance_on_menu() throws InterruptedException {
        teacherPage.teacherAttendance.click();
        Thread.sleep(500);
    }
    @Given("Click the Period Attendance By Date")
    public void click_the_period_attendance_by_date() throws InterruptedException {
        teacherPage.attendance_PeriodByDate.click();
        Thread.sleep(1000);
    }
    @Given("Class , Section and Date must be visible and active")
    public void class_section_and_date_must_be_visible_and_active() {
        teacherPage.attendance_Class_id.isDisplayed();
        teacherPage.periodByDate_Section_id.isDisplayed();
        teacherPage.periodByDate_date.isDisplayed();

    }
    @Given("I choose class , section and date criteria")
    public void i_choose_class_section_and_date_criteria() throws InterruptedException {
        teacherPage.attendance_Class_id.click();
        teacherPage.attendance_Class_1.click();
        teacherPage.attendance_Section_id.click();
        teacherPage.attendance_Date_box.click();
        teacherPage.attendance_Choosen_date.click();
        Thread.sleep(500);
        teacherPage.periodByDate_SearchButton.click();
        Thread.sleep(1000);

    }
    @Given("After selecting these section Student list must be displayed")
    public void after_selecting_these_section_student_list_must_be_displayed() {
        teacherPage.periodByDate_StudentTable.isDisplayed();
    }

}



