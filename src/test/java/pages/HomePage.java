package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage  {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//*[@class='fa fa-envelope-o']")
    public WebElement navbar_emailElement;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div[2]/ul/li[1]/div")
    public WebElement navbar_phoneNumber;


    @FindBy(xpath = "//*[@class='sub-title']")
    public WebElement navbar_schoolAddress;


    @FindBy(xpath = "//*[@class=\"he-text\"]")
    public WebElement call_us;












}
