package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.config.Config;

import java.util.Collections;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchPage {

    By firstItemLocator = By.xpath("//a[@class='goods-tile__picture']");
    By sortingExpensiveToCheepLocator = By.xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']");
    By sortingCheepToExpensiveLocator = By.xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']");

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage clickOnTheFirstProductFound() {
        List<WebElement> elementsList = Collections.singletonList(driver.findElement(firstItemLocator)); // что-то кликнула
        WebDriverWait wait = new WebDriverWait(driver, 5000000);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsList));
        elementsList.get(0).click();
        return this;
    }

    public SearchPage clickByTheCheckbox(String arg0) {
        WebElement select = Config.getDriver().findElement(sortingExpensiveToCheepLocator);
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("От дорогих к дешевым".equals(option.getText().trim()))
                option.click();
        }
        return this;
    }

    public SearchPage pressOnTheCheckbox(String arg0) {
        WebElement select = Config.getDriver().findElement(sortingCheepToExpensiveLocator);
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("sortingCheepToExpensiveLocator".equals(option.getText().trim()))
                option.click();
        }
        return this;
    }
}