package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver _driver;

    public HomePage(WebDriver driver) {
        this._driver=driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(xpath = "//li[@class='subscribe']")
    private  WebElement subscribeButton;

    public  void subscribeButtonClick() {
      Actions actions = new Actions(_driver);
      actions.moveToElement(subscribeButton).click().build().perform();
    }
}
