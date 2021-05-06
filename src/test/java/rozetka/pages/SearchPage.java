package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.apache.log4j.Logger;

public class SearchPage {

    By firstItem = By.xpath("//div//a[contains(@class,'goods-tile__picture')]");
    By sortingExpensiveToCheep = By.xpath("/html/body/app-root/div/div[1]/rz-search/rz-catalog/div/div[1]/div/rz-sort/select");
    By sortingCheepToExpensive = By.xpath("/html/body/app-root/div/div[1]/rz-search/rz-catalog/div/div[1]/div/rz-sort/select");
    By displayedSorting = By.xpath("//p[@class='goods-tile__price-value']");
    By productName = By.xpath("//h1[@class='product__title']");

    private final WebDriver driver;
    private static final Logger log = Logger.getLogger(String.valueOf(SearchPage.class));
    private int[] data;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstProduct() {
        List<WebElement> elementsList = driver.findElements(firstItem);
        WebDriverWait wait = new WebDriverWait(driver, 5000000);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsList));
        elementsList.get(0).click();
        log.info("Clicking on the first finding element");
    }

    public void clickExpensiveToCheep() {
        WebElement selectElem = driver.findElement(sortingExpensiveToCheep);
        Select select = new Select(selectElem);
        select.selectByIndex(2);
        log.info("Clicking on the sort button from expensive to cheep");
    }

    public void clickCheepToExpensive() {
        WebElement selectElem = driver.findElement(sortingCheepToExpensive);
        Select select = new Select(selectElem);
        select.selectByIndex(1);
        log.info("Clicking on the sort button from cheep to expensive");
    }

    public static boolean getSortingItemsFromExpensiveToCheap()
    {
        int[] data = new int[35];
        int previous = data[0];
        for(int i = 1; i < data.length; i++)
        {
            if(previous > data[i])
                return false;
            previous = data[i];
        }
        return true;
    }


    public static boolean getSortingItemsFromCheapToExpensive() {
        int[] data = new int[35];
        int previous = data[0];
        for(int i = 1; i < data.length; i++)
        {
            if(previous < data[i])
                return false;
            previous = data[i];
        }
        return true;
    }

    public boolean getProductNameIsDisplayed(){
        WebElement web = driver.findElement(productName);
        boolean bool = web.isDisplayed();
        log.info("Displaying the Subscribe button");
        return bool;
    }
}