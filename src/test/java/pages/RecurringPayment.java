package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecurringPayment {

    WebDriver _driver;

    public RecurringPayment(WebDriver driver) {
        this._driver=driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(xpath = "//td[@class='ncoltxtr']//small[contains(text(),'1.00 THB')]")
    private  WebElement totalCharge;

    @FindBy(xpath = "//input[@id='Ecom_Payment_Card_Name']")
    private  WebElement cardholderName;

    @FindBy(xpath = "//input[@id='Ecom_Payment_Card_Number']")
    private  WebElement cardNumber;

    @FindBy(id = "Ecom_Payment_Card_ExpDate_Month")
    private  WebElement expiryDateMonth;

    @FindBy(id = "Ecom_Payment_Card_ExpDate_Year")
    private  WebElement expiryDateYear;

    @FindBy(id = "Ecom_Payment_Card_Verification")
    private  WebElement cardVerificationCode;

    @FindBy(xpath = "//input[@name='payment']")
    private  WebElement confirmMyPaymentButton;

    @FindBy(xpath = "//td[@class='ncoltxtc']")
    private  WebElement cardNumberIncorrect ;

    public  String getTotalCharge() {
        return  totalCharge.getText().trim();
    }

    public void setCardholderName(String CardholderNames) {
        cardholderName.sendKeys(CardholderNames);
    }

    public void setcardNumber(String CardNumber) {
        cardNumber.sendKeys(CardNumber);
    }

    public void setExpiryDateMonth(String ExpiryDateMonth) {
        Select drop = new Select(expiryDateMonth);
        drop.selectByValue(ExpiryDateMonth);
    }

    public void setExpiryDateYear(String ExpiryDateYear ) {
        Select drop = new Select(expiryDateYear);
        drop.selectByValue(ExpiryDateYear);
    }

    public void setCardVerificationCode(String CardNumber) {
        cardVerificationCode.sendKeys(CardNumber);
    }

    public  void confirmMyPaymentButtonClick() {
        confirmMyPaymentButton.click();
    }

    public  String getCardNumberIncorrect() {
        return  cardNumberIncorrect.getText();
    }
}
