package PricingPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Step2ExtrasPricing {
    WebDriver driver;
@FindBy(id="shipping-express")
WebElement shippingMethodExpress_id;
    public Step2ExtrasPricing(WebDriver driver) {
        this.driver = driver;
    }
    public void shippingMethodExpress(){
    shippingMethodExpress_id.click();
    }


}
