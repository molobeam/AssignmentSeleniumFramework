package PricingPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Step1PricingPanel {
    WebDriver driver;
    @FindBy(id="inventory-back-btn")
    WebElement backButton_id;
    @FindBy(id="deviceType")
    WebElement deviceType_id;
    @FindBy(id="inventory-form")
    WebElement inventoryForm_id;

    public Step1PricingPanel(WebDriver driver) {
        this.driver = driver;


    }
    public void waitForNextButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(backButton_id));
    }
    public void clickBackButton(){
        backButton_id.click();
    }
    public void waitDeviceType(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(deviceType_id));

    }
    public void clearDeviceType() {
        deviceType_id.sendKeys("Select");
        deviceType_id.clear();

    }
    public void verifyInvertoryFormSetupIsDisplayed(){
        inventoryForm_id.isDisplayed();
    }
    //public void selectDeviceType() {
       // deviceType_id.sendKeys("laptop");
    //}
    //public void clickNextButton(){
      //  backButton_id.click();
   // }

}
