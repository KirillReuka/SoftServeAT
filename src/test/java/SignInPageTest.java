import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest{

    @Test
    public void test1() {
        System.out.println("Test1");
        HomePage homePage = new HomePage(driver);
        homePage.login("reuka.kirill@gmail.com", "1231231123");
    }
}
