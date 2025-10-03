package PricingPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Step2ExtrasPricing {
    WebDriver driver;
@FindBy(id="shipping-express")
WebElement shippingMethodExpress_id;
@FindBy(id="warranty-option-1yr")
WebElement warrantyOption1yr_id;
    public Step2ExtrasPricing(WebDriver driver) {
        this.driver = driver;
    }
    public void shippingMethodExpress() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(shippingMethodExpress_id));
        shippingMethodExpress_id.click();
    }
    public void warrantyOption1yr() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(warrantyOption1yr_id));
    warrantyOption1yr_id.click();
    }


}
