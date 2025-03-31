import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        // Ensure the path to chromedriver is correctly set in your environment
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open the login page
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        // Fill in dummy credentials
        loginPage.enterUsername("test_user");
        loginPage.enterPassword("Test@123");
        loginPage.clickLogin();
        loginPage.isHeaderDisplayed();
        
     
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
