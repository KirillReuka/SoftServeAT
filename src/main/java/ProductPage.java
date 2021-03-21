import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    private By addToCartButton = By.xpath("//button[@aria-label='Купить'][1]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage addToCart() {
        driver.findElement(addToCartButton).click();

        return new CartPage(driver);
    }
}
