package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {
    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Teacher --> UserName TextBox
    @FindBy(xpath = "//*[@name='username']")
    public WebElement teacherUserName;


    // Teacher --> Password TexBox
    @FindBy(xpath = "//*[@name='password']")
    public WebElement teacherPassword;


    // Teacher --> SingIn Button
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement teacherSingIn;


    @FindBy(xpath = "//*[span='Attendance']")
    public WebElement teacherAttendance;
    @FindBy(xpath = "(//a[text() = 'Period Attendance'])[2]")
    public WebElement periodAttendance;
    @FindBy(xpath = "(//*[@class='form-group'])[1]")
    public WebElement classAttendance;
    @FindBy(xpath = "(//*[@class='form-group'])[2]")
    public WebElement sectionAttendace;
    @FindBy(xpath = "(//*[@class='form-group'])[3]")
    public WebElement dateAttendance;
    @FindBy(xpath = "(//*[@class='form-group'])[4]")
    public WebElement subjectAttendance;

    @FindBy(xpath = "//*[@id='class_id']")
    public WebElement attendance_Class_id;

    @FindBy(xpath = "//*[@id=\"class_id\"]/option[2]")
    public WebElement attendance_Class_1;

    @FindBy (xpath = "//*[@id=\"section_id\"]/option[2]")
    public WebElement attendance_Section_id;

    @FindBy (xpath = "(//*[@name='date'])[1]")
    public WebElement attendance_Date_box;

    @FindBy (xpath = "/html/body/div[6]/div[1]/table/tbody/tr[3]/td[4]")
    public WebElement attendance_Choosen_date;

    @FindBy (xpath = "//*[@id=\"subject_timetable_id\"]")
    public WebElement attendance_SubjectBox;
    @FindBy (xpath = "//*[@id=\"subject_timetable_id\"]/option[2]")
    public WebElement attendance_Subject1;

    @FindBy (xpath = "//*[@id=\"form1\"]/div/div/div[5]/div/button")
    public WebElement attendance_Search_button;

    @FindBy (xpath = "(//h3)[2]")
    public WebElement attendance_Student_list;

    @FindBy (xpath = "//*[@id=\"attendencetype33-1\"]")
    public WebElement attendance_Student_1_late;

    @FindBy (xpath = "//*[@id=\"attendencetype38-2\"]")
    public WebElement attendance_Student_2_absent;
    @FindBy (xpath = "//*[@id=\"attendencetype49-3\"]")
    public WebElement attendance_Student_3_halfDay;

    @FindBy (xpath = "//*[@value='saveattendence']")
    public WebElement attendance_SaveButton;


    @FindBy (xpath = "//*[@name='remark33']")
    public WebElement attendance_Student_1_noteBox;

    @FindBy (xpath = "//*[@name='remark38']")
    public WebElement attendance_Student_2_noteBox;

    @FindBy (xpath = "//*[@name='remark49']")
    public WebElement attendance_Student_3_noteBox;

    @FindBy (xpath = "(//*[@type='button'])[2]")
    public WebElement attendance_HolidayButton;

    @FindBy (xpath = "(//a[text() = 'Period Attendance By Date'])[2]")
    public WebElement attendance_PeriodByDate;

    @FindBy (xpath = "//*[@id=\"section_id\"]")
    public WebElement periodByDate_Section_id;

    @FindBy (xpath = "//*[@name='date']")
    public WebElement periodByDate_date;


    @FindBy (xpath = "//*[@class='table table-hover table stripped']")
    public WebElement periodByDate_StudentTable;

    @FindBy (xpath = "//*[contains(text(), 'Search')]")
    public WebElement periodByDate_SearchButton;


    @FindBy (xpath = "//*[@id=\"form-username\"]")
    public WebElement teacher_UserName;

    @FindBy (xpath = "//*[@id=\"form-password\"]")
    public WebElement teacher_UserPassword;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement teacher_SignButton;

    @FindBy (xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[6]/a/span")
    public WebElement teacher_HumanResource_menu;

    @FindBy (xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[6]/ul/li[2]/a")
    public WebElement teacher_HumanResource_Apply;


    @FindBy (xpath = "//*[@onclick='addLeave()']")
    public WebElement teacher_HumanResource_ApplyLeaveButton;


    @FindBy (xpath = "//*[@id='applieddate']")
    public WebElement applyLeaveDateBox;

    @FindBy (xpath = "/html/body/div[6]/div[1]/table/tbody/tr[3]/td[3]")
    public WebElement applyLeaveDateChoosen;

    @FindBy (xpath = "(//*[@id=\"leave_type\"])[2]")
    public WebElement applyLeaveAvailable_box;

    @FindBy (xpath = "//div[3]//form//select//option[2]")
    public WebElement LeaveAvailable_Choosen;

    @FindBy (xpath = "(//div[3]//form//input[@type='text'])[2]")
    public WebElement leaveFromDateBox;

    @FindBy (xpath = "/html/body/div[6]/div[1]/table/tbody/tr[2]/td[2]")
    public WebElement leaveFromDateBox_Choosen;
    @FindBy (xpath = "(//div[3]//form//input[@type='text'])[3]")
    public WebElement leaveToDateBox;

    @FindBy (xpath = "(/html/body/div[6]/div[1]/table/tbody/tr[2]/td[2])")
    public WebElement leaveToDateBox_Choosen;

    //*[@id="reason"]
    @FindBy (xpath = "//*[@id=\"reason\"]")
    public WebElement leaveReasonBox;

    @FindBy (xpath = "(//div[3]//form//button[1])[2]")
    public WebElement leaveSaveButton;

    @FindBy (xpath = "//section[2]//table//tr//td[6]//small")
    public WebElement leavePendingStatus1;

    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[7]/a[2]/i")
    public WebElement leaveDeleteButton;






}
