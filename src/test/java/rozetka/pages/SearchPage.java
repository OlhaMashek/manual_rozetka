package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Collections;
import java.util.List;

public class SearchPage {

    By firstItem = By.xpath("//a[@class='goods-tile__picture']");
    By sortingExpensiveToCheep = By.xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']");
    By sortingCheepToExpensive = By.xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']");

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage clickOnTheFirstProductFound() {
        List<WebElement> elementsList = Collections.singletonList(driver.findElement(firstItem));
        WebDriverWait wait = new WebDriverWait(driver, 5000000);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsList));
        elementsList.get(0).click();
        return this;
    }

    public SearchPage clickByTheCheckbox() {
        WebElement select = driver.findElement(sortingExpensiveToCheep);
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("От дорогих к дешевым".equals(option.getText().trim()))
                option.click();
        }
        return this;
    }

    public SearchPage pressOnTheCheckbox() {
        WebElement select = driver.findElement(sortingCheepToExpensive);
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("sortingCheepToExpensiveLocator".equals(option.getText().trim()))
                option.click();
        }
        return this;
    }
}