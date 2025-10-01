package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AnnaTests extends Base {

//Verify Homepage
    @Test
    public void verifyHomePageIsDisplayedTests() {
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }

    @Test(priority = 1)
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
    }
   // @Test(priority = 2)
   // public void signPageTests() {
     // signUpPage.verifySignUpPageIsDisplayed();
    //}
//    @Test(priority = 3)
//    public void enterFirstNameTests() {
//        signUpPage.enterFirstName("Molobe");
//    }


    @Test(priority = 2)
    public void verifyLoginPageIsDisplayedTests() {
        loginPage.verifyLoginPageIsDisplayed();
    }
    /*@Test(priority = 4)
    public void clearEmail() {
        loginPage.clearEmailField();
    }*/
//LoginWith your details
    @Test(priority = 5)
    public void enterEmailAddressTests() {
        loginPage.enterEmailAddress("molobea@gmail.com    ");

    }
    @Test(priority = 6)
    public void enterPasswordTests() {
        loginPage.enterPassword("ANna@123   ");
    }
@Test(priority = 7)
    public void clickLoginTests() {
        loginPage.clickLogin();
    }
    @Test(priority = 8)
    public void waitForWelcomeMessageTests() {
        loginPage.waitForWelcomeMessage();
    }

    @Test(priority = 9)
    public void verifyWelcomeMessageIsDisplayedTests() {

        loginPage.verifyWelcomeMessageIsDisplayed();
    }
    @Test(priority = 10)
    public void clickWebAutomationTabTests() {
        loginPage.clickWebAutomationTab();
    }
    //WizardStep1Validation
    @Test(priority = 11)
    public void selectDeviceTypeTests(){
        wizardStep1Validation.selectDeviceType();
    }
    @Test(priority = 12)
    public void selectBrandTests() {
        wizardStep1Validation.selectBrand();
    }
    @Test(priority = 13)
    public void selectStorageSizeTests() {
         wizardStep1Validation.selectStorageSize();
    }
    @Test(priority = 14)
    public void selectColorTests(){
        wizardStep1Validation.selectColor();
    }
@Test(priority = 15)
public void quantityBlankTests() {
    wizardStep1Validation.quantityBlank();
}
/*@Test(priority = 16)
public void quantity11Tests() {
    wizardStep1Validation.quantity11();
}*/
@Test(priority = 16)
public void deliveryAddressTests(){
    wizardStep1Validation.deliveryAddress();
    }
    @Test(priority = 17)
    public void clickNextButtonTests(){
        wizardStep1Validation.clickNextButton();
    }
    //Step1PricingPanel
    @Test(priority = 18)
    public void waitForNextButtonTests(){
        step1PricingPanel.waitForNextButton();
    }

    @Test(priority = 19)
    public void clickBackButtonTests1(){
        step1PricingPanel.clickBackButton();
    }
    @Test(priority = 19)
    public void waitDeviceTypeTests() {
        step1PricingPanel.waitDeviceType();
    }

    @Test(priority = 20)
    public void clearDeviceTypeTests(){
        step1PricingPanel.clearDeviceType();

    }
    @Test(priority = 21)
    public void selectDeviceTypeTests1(){
        step1PricingPanel.selectDeviceType();
    }




    @AfterTest
    public void closeBrowser() {
        //driver.quit();
    }
}