package PricingPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DiscountCodes {
    WebDriver driver;
    @FindBy(id="discount-code")
    WebElement discountCodeInput_id;
    @FindBy(id="apply-discount-btn")
    WebElement applyDiscountButton_id;
    @FindBy(id="discount-feedback")
    WebElement discountFeedback_id;

    public DiscountCodes(WebDriver driver) {
        this.driver = driver;
    }
    public void enterDiscountCode() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(discountCodeInput_id));

       // discountCodeInput_id.clear();
        discountCodeInput_id.sendKeys("SAVE10");
        applyDiscountButton_id.click();

    }
    //public void verifyFeedbackMessage() {
        //new WebDriverWait(driver, Duration.ofSeconds(3)).
    // until(ExpectedConditions.visibilityOf(discountFeedback_id));
    //discountFeedback_id.isDisplayed();

       //}

   /* public void enterDiscountCode() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(discountCodeInput_id));
        discountCodeInput_id.clear();
        discountCodeInput_id.sendKeys("SAVE10");
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(applyDiscountButton_id));
        applyDiscountButton_id.click();

    }*/


}
