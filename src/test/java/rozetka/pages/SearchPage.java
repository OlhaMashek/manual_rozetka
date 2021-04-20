package rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    By firstItem = By.xpath("//a[@class='goods-tile__picture']");
    By sortingExpensiveToCheep = By.xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']");
    By sortingCheepToExpensive = By.xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']");

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

}