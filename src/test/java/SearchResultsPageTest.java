import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchResultsPageTest extends BaseTest{

    @DataProvider(name = "search")
    public Object[][] search() {
        return new Object[][] {
                { "Apple iPhone 11"},
                { "Xiaomi Redmi 9A"},
                { "Samsung Galaxy"},
                { "Зеркало для макияжа Xiaomi"},
                { "Набор инструментов Alloid"},
        };
    }

    @Test(dataProvider = "search")
    public void comparingTitles(String item) {
        HomePage homePage = new HomePage(driver);
        homePage.search(item);
        String titleFirst = driver.findElement(By.xpath("//span[@class='goods-tile__title'][1]")).getText();
        Assert.assertTrue(titleFirst.contains(item));
    }

    @Test(dataProvider = "search")
    public void addingToCart(String item) {
        HomePage homePage = new HomePage(driver);
        homePage.search(item);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.navigateToProduct();
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }
}
