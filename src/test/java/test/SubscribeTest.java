package test;

import base.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SubscribeTest extends BasePage {

    @And("^Click Subscribe button$")
    @Test(priority = 1)
    public void subscribeButtonClick() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.subscribeButtonClick();
        Thread.sleep(3000);
    }

    @And("^Validate package price and Monthly Pass with One Week Free Trial package click$")
    @Test(priority = 2)
    public void subscribe() throws InterruptedException {
        Subscribe subscribe = new Subscribe(driver);
        Assert.assertEquals(subscribe.foundPackagePrice(), "฿99", "package price is wrong");
        System.out.println("Package Price :" + subscribe.foundPackagePrice());
        Thread.sleep(3000);
        subscribe.subscribePackageButtonClick();
        Thread.sleep(3000);
    }

    @And("^Create Account$")
    @Test(priority = 3)
    public void createAccount() throws InterruptedException {
        CreateAccount createAccount = new CreateAccount(driver);
        createAccount.addFirstName("ahmet");
        createAccount.addLastName("yasar");
        createAccount.addEmailOrPhone("yasar123@gmail.com");
        createAccount.addPassword("Abc123-");
        Thread.sleep(3000);
        createAccount.checkbox();
        Thread.sleep(3000);
        createAccount.createAccountButtonClick();
    }

    @And("^Ignore email verification alert by clicking$")
    @Test(priority = 4)
    public void emailVerificationClick() throws InterruptedException {
        Basket basket = new Basket(driver);
        basket.verificationAlertClick();
        Thread.sleep(3000);
    }

    @And("^Make Payment with Credit Card$")
    @Test(priority = 5)
    public void basket() throws InterruptedException {
        Basket basket = new Basket(driver);
        basket.checkboxTermConfirmClick();
        basket.payNowButtonClick();
       Thread.sleep(3000);
    }

    @Then("^$Total charge control, confirm payment and Expect for a error text and finish test with success")
    @Test(priority = 7)
    public void createRecurringPayment() {
        RecurringPayment recurringPayment = new RecurringPayment(driver);
        Assert.assertEquals(recurringPayment.getTotalCharge(), "1.00 THB");
        System.out.println("TotalCharge :" + recurringPayment.getTotalCharge());
        recurringPayment.setCardholderName("cemal");
        recurringPayment.setcardNumber("8171 9999 2766 0000");
        recurringPayment.setExpiryDateMonth("05");
        recurringPayment.setExpiryDateYear("2027");
        recurringPayment.setCardVerificationCode("127");
        recurringPayment.confirmMyPaymentButtonClick();
        Assert.assertEquals(recurringPayment.getCardNumberIncorrect(), "Card number incorrect or incompatible");
        System.out.println("Card Number Incorrect or incompatible :" + recurringPayment.getCardNumberIncorrect());
    }
}


