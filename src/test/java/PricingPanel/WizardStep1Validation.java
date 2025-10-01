package PricingPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WizardStep1Validation {
    WebDriver driver;
@FindBy(id="deviceType")
    WebElement deviceType_id;
@FindBy(id="brand")
    WebElement brand_id;
@FindBy(id="storage-256GB")
    WebElement storageSize_id;
@FindBy(id="color")
    WebElement color_id;
@FindBy(id="quantity")
    WebElement quantity_id;
@FindBy(id="address")
    WebElement address_id;
@FindBy(id="inventory-next-btn")
    WebElement nextButton_id;

    public WizardStep1Validation(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDeviceType() {
        deviceType_id.sendKeys("tablet");
    }
    public void selectBrand() {
       brand_id.sendKeys("apple"); ;
    }
    public void selectStorageSize() {
        storageSize_id.click();
    }
    public void selectColor(){
        color_id.sendKeys("gold");

    }
    public void quantityBlank(){
       quantity_id.clear();
        quantity_id.sendKeys("3");

    }
    /*public void quantity11(){
        quantity_id.clear();
        quantity_id.sendKeys("11");

    }*/

    public void deliveryAddress(){
     address_id.sendKeys("33 NINA AVENUE");
    }
    public void clickNextButton(){
        nextButton_id.click();
    }




}
