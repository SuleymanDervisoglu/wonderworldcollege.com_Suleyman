package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ParentStudentPage {
    public ParentStudentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //admin login >email
    @FindBy(xpath = "//input[@name='login']")
    public WebElement eMail;

    // admin login >sing in
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signinButton;

    // Adress Box On The New Adress Page
    @FindBy (xpath = "//input[@id='Address']")
    public WebElement adressBoxOnTheNewAdressPage;

    // PhoneNumber Box On The New Adress Page
    @FindBy (xpath = "//input[@id='customer_phn']")
    public WebElement phoneNumberBoxOntheNewAdressPage;

    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement student_userName;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement student_userPassword;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement student_SignIn;


    @FindBy (xpath = "//*[@id=\"sibe-box\"]/li[2]/a/span")
    public WebElement student_MyProfileOnMenu;


    @FindBy (xpath = "//h3[@class='widget-user-username']")
    public WebElement student_MyProfile_studentName;


    @FindBy (xpath = "//h5[@class='widget-user-desc mb5']")
    public WebElement student_MyProfile_admissionName;

    @FindBy (xpath = "//*[@class='list-group-item border0']")
    public WebElement student_MyProfile_ClassName;

    @FindBy (xpath = "(//*[@class='list-group-item'])[1]")
    public WebElement student_MyProfile_SectionName;


    @FindBy (xpath = "(//*[@class='list-group-item'])[2]")
    public WebElement student_MyProfile_GenderInfo;

    @FindBy (xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[1]/a")
    public WebElement student_MyProfile_profileSection;

    @FindBy (xpath = "//*[@id=\"activity\"]/div[1]/div/table/tbody/tr[6]/td[2]")
    public WebElement student_MyProfile_profileSection_email;

    @FindBy (xpath = "//*[@href='#exam']")
    public WebElement student_MyProfile_profileSection_Exam;


    @FindBy (xpath = "//*[@id=\"exam\"]/div[2]/h4")
    public WebElement student_MyProfile_profileSection_Exam_Date;


    @FindBy (xpath = "//*[@href='#documents']")
    public WebElement student_MyProfile_profileSection_Documents;

    @FindBy (xpath = "//*[@class='table-responsive']")
    public WebElement student_MyProfile_profileSection_Documents_info;

    //*[@id="email"]
    @FindBy (xpath = "//*[@id=\"email\"]")
    public WebElement parentLogIn_userName;


    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement parentLogIn_userPassword;


    @FindBy (xpath = "//*[@type='submit']")
    public WebElement parentLogIn_SubmitButton;

    @FindBy (xpath = "//*[@class='topuser-image']")
    public WebElement parentProfile_Image_Button;


    @FindBy (xpath = "(//nav//ul/li[5]//a[1])[3]")
    public WebElement parentProfile_ChangePassword_Button;

    @FindBy (xpath = "//*[@name='current_pass']")
    public WebElement parentProfile_CurrentPassword_Box;


    @FindBy (xpath = "//*[@name='new_pass']")
    public WebElement parentProfile_NewPassword_Box;


    @FindBy (xpath = "//*[@name='confirm_pass']")
    public WebElement parentProfile_ConfirmPassword_Box;


    @FindBy (xpath = "//*[@id=\"passwordform\"]/div[4]/div/div/button")
    public WebElement parentProfile_PasswordSave_Button;



}
