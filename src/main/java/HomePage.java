import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    private By userIcon = By.xpath("//rz-user/button");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String email, String password) {
        driver.findElement(userIcon).click();
        SignInPage signInPage = new SignInPage(driver);
        return signInPage.login(email, password);
    }

    public SearchResultsPage search(String searchQuery) {
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        return searchResultsPage.search(searchQuery);
    }
}
