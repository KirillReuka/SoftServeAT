import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        System.out.println("Before Suite");
        System.setProperty("webdriver.chrome.driver", "browserDrivers/chromedriver");
    }

    @BeforeMethod
    public void openBrowser() {
        System.out.println("Before Method");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("After Method");
        driver.quit();
    }
}
