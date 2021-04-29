package rozetka.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {

    By buyButton = By.xpath("//button[contains(@class, 'button_color_green button_size_large')]");
    By closePopUpWithBuyButton = By.xpath("//button[@class='modal__close ng-star-inserted']"); //modal__close ng-star-inserted

    private final WebDriver driver;
    private static final Logger log = Logger.getLogger(String.valueOf(ItemPage.class));

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBuyFirstItem() {
        driver.findElement(buyButton).click();
        log.info("Clicking the buy button");
    }

    public void closePopUp() {
        driver.findElement(closePopUpWithBuyButton).click();
        log.info("Closing a pop-up with information about the selected product");
    }
}