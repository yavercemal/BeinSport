package base;

import connection.InternetConnection;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    @Given("^Start Driver and Navigate")
    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        System.out.println("Opening browser");
        driver.manage().window().maximize();
        driver.get("https://connect-th.beinsports.com/en");
        InternetConnection.getInternetConnection();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
}
