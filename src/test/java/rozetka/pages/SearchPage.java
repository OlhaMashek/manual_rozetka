package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Collections;
import java.util.List;

public class SearchPage {

    By firstItem = By.xpath("/html/body/app-root/div/div[1]/rz-search/rz-catalog/div/div[2]/section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]");
    By sortingExpensiveToCheep = By.xpath("/html/body/app-root/div/div[1]/rz-search/rz-catalog/div/div[1]/div/rz-sort/select");
    By sortingCheepToExpensive = By.xpath("/html/body/app-root/div/div[1]/rz-search/rz-catalog/div/div[1]/div/rz-sort/select");
    By displayedSorting = By.xpath("//p[@class='goods-tile__price-value']");

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstProduct() {
        List<WebElement> elementsList = Collections.singletonList(driver.findElement(firstItem));
        WebDriverWait wait = new WebDriverWait(driver, 5000000);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsList));
        elementsList.get(0).click();
    }

    public void clickExpensiveToCheep(String q) {
        q = "От дорогих к дешевым";
        WebElement selectElem = driver.findElement(sortingExpensiveToCheep);
        Select select = new Select(selectElem);
        select.selectByVisibleText("От дорогих к дешевым");
        select.selectByIndex(2);
    }

    public void clickCheepToExpensive(String y) {
        y = "От дорогих к дешевым";
        WebElement selectElem = driver.findElement(sortingCheepToExpensive);
        Select select = new Select(selectElem);
        select.selectByVisibleText("От дешевых к дорогим");
        select.selectByIndex(1);
    }

    public void getSortingItemsFromExpensiveToCheap() {
        boolean result = false;
        List<WebElement> expensiveToCheapList = driver.findElements(displayedSorting);
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i + 1).getText());
            if (firstItemPrice >= secondItemPrice) {
                result = true;
                return;
            }
        }
        assert (result);
    }

    public void getSortingItemsFromCheapToExpensive() {
        boolean res = false;
        List<WebElement> expensiveToCheapList = driver.findElements(displayedSorting);
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i - 1).getText());
            if (firstItemPrice >= secondItemPrice) {
                res = true;
                return;
            }
        }
        assert (res);
    }
}