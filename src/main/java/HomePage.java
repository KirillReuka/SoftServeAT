import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    private By userIcon = By.xpath("//rz-user/button");
    private By searchField = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[text()=' Найти ']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String email, String password) {
        driver.findElement(userIcon).click();
        SignInPage signInPage = new SignInPage(driver);
        return signInPage.login(email, password);
    }

    public SearchResultsPage search(String searchQuery) {
        driver.findElement(searchField).sendKeys(searchQuery);
        driver.findElement(searchButton).click();
        return new SearchResultsPage(driver);
    }
}
