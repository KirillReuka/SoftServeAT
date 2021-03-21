import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsPageTest extends BaseTest{

    @Test
    public void test1() {
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.search("Apple iPhone 11");
        String titleFirst = driver.findElement(By.xpath("//span[@class='goods-tile__title'][1]")).getText();
        Assert.assertTrue(titleFirst.contains("Apple iPhone 11"));
    }

    @Test
    public void test2() {
        HomePage homePage = new HomePage(driver);
        homePage.search("Apple iPhone 11");
        String titleFirst = driver.findElement(By.xpath("//span[@class='goods-tile__title'][1]")).getText();
        Assert.assertTrue(titleFirst.contains("Apple iPhone 11"));
    }

    @Test
    public void test3() {
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.search("Apple iPhone 11");
        searchResultsPage.navigateToProduct();
    }
}
