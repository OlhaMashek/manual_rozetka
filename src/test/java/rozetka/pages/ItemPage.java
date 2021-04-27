package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {

    By buyButton = By.xpath("//button[contains(@class, 'button_color_green button_size_large')]");
    By closePopUpWithBuyButton = By.xpath("//button[@class='modal__close ng-star-inserted']"); //modal__close ng-star-inserted

    private final WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBuyFirstItem() {

        driver.findElement(buyButton).click();
    }

    public void closePopUp() {
        driver.findElement(closePopUpWithBuyButton).click();
    }
}