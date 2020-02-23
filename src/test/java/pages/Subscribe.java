package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscribe {

    WebDriver _driver;

    public Subscribe(WebDriver driver) {
        this._driver=driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(xpath = "//div[@class='position-r']//a[@data-btn-index='1']")
    private  WebElement subscribePackageButton;

    @FindBy(xpath = "//span[contains(@class, 'price fz-14 fw-bold text-center') and text() = '฿99']")
    private  WebElement packagePrice;

    public  void subscribePackageButtonClick() {
        Actions actions = new Actions(_driver);
        actions.moveToElement(subscribePackageButton).click().perform();
    }

    public  String foundPackagePrice() {
        return  packagePrice.getText();
    }
}
