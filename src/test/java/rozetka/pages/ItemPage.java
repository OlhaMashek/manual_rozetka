package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {

    By buyFirstItem = By.xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large']");
    By closePopUpWithBuyButton = By.xpath("//button[@class='modal__close']");

    private final WebDriver driver;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public ItemPage clickOnTheBuyButton(String arg0) {
        driver.findElement(buyFirstItem).click();
        return this;
    }

    public ItemPage closeTheDisplayedPopUp(String arg0) {
        driver.findElement(closePopUpWithBuyButton).click();
        return this;
    }

}