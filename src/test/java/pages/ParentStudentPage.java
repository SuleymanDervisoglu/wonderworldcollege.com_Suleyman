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

}
