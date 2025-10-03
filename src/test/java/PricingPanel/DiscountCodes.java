package PricingPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiscountCodes {
    WebDriver driver;
    @FindBy(id="discount-code")
    WebElement discountCodeInput_id;
    @FindBy(id="apply-discount-btn")
    WebElement applyDiscountButton_id;
    public DiscountCodes(WebDriver driver) {
        this.driver = driver;
    }
    public void enterDiscountCode() {

        discountCodeInput_id.sendKeys("S");
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(applyDiscountButton_id));

    }
    public void clickApplyDiscountCode() {
        discountCodeInput_id.submit();
    }

}
