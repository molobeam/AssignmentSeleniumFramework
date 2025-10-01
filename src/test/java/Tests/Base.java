package Tests;

import Pages.HomePage;
import Pages.LoginPage;
//import Pages.SignUpPage;
import Pages.Step1PricingPanel;
import Pages.WizardStep1Validation;
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
    Step1PricingPanel step1PricingPanel= PageFactory.initElements(driver, Step1PricingPanel.class);

    TakesScreenshots takesScreenshots = new TakesScreenshots();
}
