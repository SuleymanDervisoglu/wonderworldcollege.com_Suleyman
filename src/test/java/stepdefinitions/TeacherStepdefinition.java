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

    @Given("I am logged in as a teacher")
    public void i_am_logged_in_as_a_teacher() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("loginURL_adm_teach"));
        teacherPage.teacher_UserName.click();
        teacherPage.teacher_UserName.sendKeys(ConfigReader.getProperty("teach_SuleymanDervisoglu"));
        teacherPage.teacher_UserPassword.click();
        ReusableMethods.bekle(3);
        teacherPage.teacher_UserPassword.sendKeys(ConfigReader.getProperty("password"));
        teacherPage.teacher_SignButton.click();
        Thread.sleep(1000);
    }

    @Given("I navigate to the Human Resource menu")
    public void i_navigate_to_the_human_resource_menu() throws InterruptedException {
        teacherPage.teacher_HumanResource_menu.click();
        Thread.sleep(500);
    }

    @Given("I click on the Apply Leave on menu")
    public void i_click_on_the_apply_leave_on_menu() throws InterruptedException {
        teacherPage.teacher_HumanResource_Apply.click();
        Thread.sleep(500);
    }

    @Given("I add a new Apply Leave with click on button")
    public void i_add_a_new_apply_leave_with_click_on_button() {
        teacherPage.teacher_HumanResource_ApplyLeaveButton.click();
    }

    @Given("I fill in the following details: Apply Date, Available Leave , Leave From Date, Leave to Date and Reason")
    public void i_fill_in_the_following_details_apply_date_available_leave_leave_from_date_leave_to_date_and_reason() throws InterruptedException {
        teacherPage.applyLeaveDateBox.click();
        teacherPage.applyLeaveDateChoosen.click();
        teacherPage.applyLeaveAvailable_box.click();
        teacherPage.LeaveAvailable_Choosen.click();
        teacherPage.leaveFromDateBox.click();
        teacherPage.leaveFromDateBox_Choosen.click();
        teacherPage.leaveToDateBox.click();
        teacherPage.leaveToDateBox_Choosen.click();
        teacherPage.leaveReasonBox.sendKeys("123*-@.?/\\`+=-_(){}[]%$#@!^&*~;:'><");

    }

    @Given("I click the Save button")
    public void i_click_the_save_button() throws InterruptedException {
        teacherPage.leaveSaveButton.click();
        Thread.sleep(1000);
    }

    @Given("A new leave request should be created")
    public void a_new_leave_request_should_be_created() {
        Assert.assertTrue(teacherPage.leavePendingStatus1.isDisplayed());
    }

    @Given("I delete the newly created leave request")
    public void i_delete_the_newly_created_leave_request() throws InterruptedException {
        teacherPage.leaveDeleteButton.click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();

    }

    @Given("I confirm the delete")
    public void i_confirm_the_delete() {
        if (teacherPage.leavePendingStatus1.isDisplayed()) {
            System.out.println("Delete Confirmed");
        } else {
            System.out.println("Delete NOT Confirmed");
        }
    }



}



