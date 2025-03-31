import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;


    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login_button")
    private WebElement loginButton;
    
    @FindBy(xpath = "//h1[text='Dashboard']")
    private WebElement headerText;

    // Constructor initializes elements with PageFactory
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Enter username
    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    // Click on login button
    public void clickLogin() {
        loginButton.click();
    }
    public void isHeaderDisplayed() {
    	headerText.isDisplayed();
    }
}


