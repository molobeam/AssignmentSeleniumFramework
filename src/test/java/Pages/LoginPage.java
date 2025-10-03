package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginPageTitle_id;
    @FindBy(id = "login-email")
    WebElement emailField_id;
    @FindBy(id = "login-password")
    WebElement password_id;
    @FindBy(id = "login-submit")
    WebElement loginButton_id;
    @FindBy(id = "practice-heading")
    WebElement welcomeMessage_id;
    @FindBy(id="tab-btn-web")
    WebElement webAutomationTab_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed() {
        loginPageTitle_id.isDisplayed();
    }

    public void clearEmailField() {
        emailField_id.clear();
    }

    public void enterEmailAddress(String email) {
        emailField_id.sendKeys(email);

    }

    public void enterPassword(String password) {
        password_id.sendKeys(password);


    }

    public void clickLogin() {
        loginButton_id.click();

    }

    public void waitForWelcomeMessage() {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(welcomeMessage_id));
    }

    public void verifyWelcomeMessageIsDisplayed() {
        welcomeMessage_id.isDisplayed();
    }

    public void clickWebAutomationTab() {
        webAutomationTab_id.click();

    }
}

