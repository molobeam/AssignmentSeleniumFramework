//package PricingPanel;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Step1PricingPanel {
//    WebDriver driver;
//    @FindBy(id="inventory-back-btn")
//    WebElement backButton_id;
//    @FindBy(id="deviceType")
//    WebElement deviceType_id;
//    @FindBy(id="inventory-form")
//    WebElement inventoryForm_id;
//    @FindBy(id="brand")
//    WebElement brand_id;
//    @FindBy(id="inventory-next-btn")
//    WebElement nextButton_id;
//
//
//
//    public Step1PricingPanel(WebDriver driver) {
//        this.driver = driver;
//
//
//    }
//    public void waitForNextButton(){
//        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(backButton_id));
//    }
//    public void clickBackButton(){
//        backButton_id.click();
//    }
//    public void waitDeviceType(){
//        new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOf(deviceType_id));
//
//    }
//    public void clearDeviceType() {
//        new WebDriverWait(driver, Duration.ofSeconds(1))
//                .until(ExpectedConditions.visibilityOf(deviceType_id));
//        deviceType_id.sendKeys("Select");
//        deviceType_id.clear();
//        //deviceType_id.sendKeys("laptop");
//        new WebDriverWait(driver, Duration.ofSeconds(1))
//                .until(ExpectedConditions.visibilityOf(deviceType_id));
//
//    }
//   public void verifyInvertoryFormSetupIsDisplayed(){
//        inventoryForm_id.isDisplayed();
//    }
//    public void selectDeviceType() {
//        new WebDriverWait(driver, Duration.ofSeconds(1))
//        .until(ExpectedConditions.visibilityOf(deviceType_id));
//       //deviceType_id.isSelected();
//         deviceType_id.sendKeys("laptop");
//    }
//
//
//    public void selectBrandType() {
//        new WebDriverWait(driver, Duration.ofSeconds(1))
//                .until(ExpectedConditions.visibilityOf(deviceType_id));
//        brand_id.isSelected();
//        brand_id.sendKeys("apple");
//    }
//    public void clickNextButton(){
//       nextButton_id.click();
//   }
//
//}
