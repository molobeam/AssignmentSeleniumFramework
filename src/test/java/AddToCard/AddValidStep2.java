package AddToCard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddValidStep2 {
    WebDriver driver;
    @FindBy(id="add-to-cart-btn")
    WebElement addToCartButton_id;
    public AddValidStep2(WebDriver driver) {
        this.driver = driver;
    }
    public void addCardItem1() {
        addToCartButton_id.click();


    }
}
