import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;

    private By emailInput = By.xpath("//input[@id='auth_email']");
    private By passwordInput = By.xpath("//input[@id='auth_pass']");
    private By signInButton = By.cssSelector(".button--green.auth-modal__submit");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        //проверка что кнопка показывается
        if (!driver.findElement(signInButton).isDisplayed()) {
            throw new IllegalStateException("Button Sign In is not displayed, current page: " + driver.getCurrentUrl());
        }
    }

    public HomePage login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signInButton).click();
        return new HomePage(driver);
    }
}
