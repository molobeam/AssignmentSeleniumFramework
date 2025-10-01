//package Pages;
//
//import  org.openqa.selenium.Alert;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class SignUpPage {
//    WebDriver driver;
//    @FindBy(id = "signup-toggle")
//    WebElement signUpPageTitle_id;
//    @FindBy(id ="registration-heading" )
//    WebElement registrationHeading_id;
//    @FindBy(id = "register-firstName")
//    WebElement firstNameField_id;
//    @FindBy(id = "register-lastName")
//    WebElement lastNameField_id;
//    @FindBy(id = "register-email")
//    WebElement emailField_id;
//    @FindBy(id = "register-password")
//    WebElement passwordField_id;
//    @FindBy(id = "register-confirmPassword")
//    WebElement confirmPasswordField_id;
//    @FindBy(id="register-submit")
//    WebElement signUpButton_id;
//
//
//
//    public SignUpPage(WebDriver driver) {
//        this.driver = driver;
//    }
//    public void verifySignUpPageIsDisplayed() {
//        signUpPageTitle_id.isDisplayed();
//        signUpPageTitle_id.click();
//        registrationHeading_id.isDisplayed();
//        firstNameField_id.sendKeys("MolobeAM");
//        lastNameField_id.sendKeys("Monyepao");
//        emailField_id.sendKeys("molobea@gmail.com");
//        passwordField_id.sendKeys("ANna@123");
//        confirmPasswordField_id.sendKeys("ANna@123");
//        signUpButton_id.click();
//
//
//
//
//    }
//    public void acceptAlertIfPresent() {
//        try {
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//        } catch (NoAlertPresentException e) {
//            // No alert to accept
//        }
//    }
//
//
//}
