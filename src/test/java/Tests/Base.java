package Tests;

import Pages.HomePage;
import Pages.LoginPage;
//import Pages.SignUpPage;
//import PricingPanel.Step1PricingPanel;
import PricingPanel.DiscountCodes;
import PricingPanel.Step2ExtrasPricing;
import PricingPanel.WizardStep1Validation;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);
    //SignUpPage signUpPage= PageFactory.initElements(driver, SignUpPage.class);
    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    WizardStep1Validation wizardStep1Validation= PageFactory.initElements(driver, WizardStep1Validation.class);
    //Step1PricingPanel step1PricingPanel= PageFactory.initElements(driver, Step1PricingPanel.class);
    Step2ExtrasPricing step2ExtrasPricing= PageFactory.initElements(driver, Step2ExtrasPricing.class);
    DiscountCodes discountCodes= PageFactory.initElements(driver, DiscountCodes.class);

    TakesScreenshots takesScreenshots = new TakesScreenshots();
}
