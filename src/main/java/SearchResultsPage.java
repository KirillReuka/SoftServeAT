import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;

    private By searchField = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[text()=' Найти ']");
    private By titleFirst = By.xpath("//span[@class='goods-tile__title'][1]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage search(String searchQuery) {
        driver.findElement(searchField).sendKeys(searchQuery);
        driver.findElement(searchButton).click();
        return new SearchResultsPage(driver);
    }

    public ProductPage navigateToProduct() {
        driver.findElement(titleFirst).click();
        return new ProductPage(driver);
    }
}
