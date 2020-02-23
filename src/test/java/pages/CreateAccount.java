package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
    WebDriver _driver;

    public CreateAccount(WebDriver driver) {
        this._driver=driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(name = "FirstName")
    private WebElement firstName;

    @FindBy(name = "LastName")
    private WebElement lastName;

    @FindBy(name = "EmailOrPhone")
    private WebElement emailOrPhone;

    @FindBy(name = "Password")
    private WebElement password;

    @FindBy(xpath = "//label[@for='chkAllow']")
    private WebElement checkboxConfirm;

    @FindBy(xpath = "//input[@class='border-none bc-subscribe']")
    private WebElement createAccountButton;

    public void addFirstName(String FirstName) {
        firstName.sendKeys(FirstName);
    }

    public void addLastName(String LastName) {
        lastName.sendKeys(LastName);
    }

    public void addEmailOrPhone(String EmailOrPhone) {
        emailOrPhone.sendKeys(EmailOrPhone);
    }

    public void addPassword(String Password) {
        password.sendKeys(Password);
    }

    public void checkbox() {
        Actions actions = new Actions(_driver);
        actions.moveToElement(checkboxConfirm).click().build().perform();
    }

    public void createAccountButtonClick() {
        Actions actions = new Actions(_driver);
        actions.moveToElement(createAccountButton).click().build().perform();
    }
}
