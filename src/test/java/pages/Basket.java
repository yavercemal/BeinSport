package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basket {

    WebDriver _driver;

    public Basket(WebDriver driver) {
        this._driver=driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(xpath = "//a[@class='form-close']")
    private WebElement emailVerificationAlert;

    @FindBy(xpath = "//label[@for='checkTerms']")
    private WebElement checkboxTermConfirm;

    @FindBy(xpath = "//input[@class='bc-subscribe border-none show']")
    private WebElement payNowButton;

    public void verificationAlertClick() {
        Actions actions = new Actions(_driver);
        actions.moveToElement(emailVerificationAlert).click().build().perform();
    }

    public void checkboxTermConfirmClick() {
       Actions actions = new Actions(_driver);
        actions.moveToElement(checkboxTermConfirm).click().build().perform();
    }

    public void payNowButtonClick() {
        Actions actions = new Actions(_driver);
        actions.moveToElement(payNowButton).click().build().perform();
    }
}
