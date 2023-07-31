package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Admin --> UserName TextBox
    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminUserName;


    // Admin --> Password TexBox
    @FindBy(xpath = "//*[@name='password']")
    public WebElement adminPassword;


    // Admin --> SingIn Button
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement adminSingIn;

    @FindBy(xpath = "//*[span='Fees Collection']")
    public WebElement adminFeesCollection;

    @FindBy(xpath = "/html/body/div[2]/aside/div/section/ul[2]/li[3]/ul/li[4]/a")
    public WebElement adminFeesType;

    @FindBy(xpath = "//*[@class='box-title titlefix']")
    public WebElement adminFeesTypeList;


    @FindBy(xpath = "//*[@class='box-title']")
    public WebElement addFeesTypeSection;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement adminFeesTypeNameBox;
    @FindBy(xpath = "//*[@id='code']")
    public WebElement adminFeesTypeCodeBox;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement adminFeesTypeDescriptionBox;

    @FindBy(xpath = "//*[@class='btn btn-info pull-right']")
    public WebElement adminFeesTypeSaveButton;


    @FindBy(xpath = "(//*[@class='fa fa-pencil'])[last()]")
    public WebElement adminFeesTypeEditButton;


    @FindBy(xpath = "//*[@class='alert alert-success text-left']")
    public WebElement recordSuccess;



    @FindBy(xpath = "(//*[@class='fa fa-remove'])[last()]")
    public WebElement adminFeesTypeDeleteButton;


}
