import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest{

    @DataProvider(name = "login")
    public Object[][] login() {
        return new Object[][] {
                { "test1@gmail.com", "testpassword1"},
                { "test2@gmail.com", "testpassword2"},
                { "test3@gmail.com", "testpassword3"},
        };
    }

    @Test(dataProvider = "login")
    public void test1(String email, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.login(email,password);
    }

}
