package Test;

import com.Base.TestBase;
import com.facebookPages.HomePage;
import com.facebookPages.LoginPage;
import com.facebookPages.RegisterPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest  extends TestBase {
    RegisterPage registerPage;
    LoginPage loginPage;
    HomePage homePage;

    public RegisterPageTest(){
        super();
    }


    @BeforeMethod
    public void setUp() {
        intialization();

    }
    /* @Test(priority = 1)
     public void RegisterPageTitleTest {
         registerPage = new RegisterPage();
         String RegisterPageTitle = registerPage.validateRegisterPageTitle();
         Assert.assertEquals(RegisterPageTitle, "Facebook – log in or sign up", RegisterPageTitle);
     }*/
    @Test
    public void RegisterTest() {
        registerPage=new RegisterPage();
        registerPage.Register(properties.getProperty("firstname"), properties.getProperty("lastname"),
                properties.getProperty("birthday_day"));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
