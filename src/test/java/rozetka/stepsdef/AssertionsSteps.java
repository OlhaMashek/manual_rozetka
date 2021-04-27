package rozetka.stepsdef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rozetka.config.Config;
import rozetka.pages.HomePage;
import rozetka.pages.ItemPage;
import rozetka.pages.SearchPage;

import java.util.List;
import static org.junit.Assert.*;
import static org.openqa.selenium.By.xpath;

public class AssertionsSteps {

    private final WebDriver driver = Config.getDriver();;
    HomePage homePage = new HomePage(driver);
    ItemPage itemPage = new ItemPage(driver);
    SearchPage searchPage = new SearchPage(driver);


    @Then("The item with count {string} displayed on the cart icon")
    public void theItemWithTitleDisplayedInTheCart(String count) {
        assertEquals(homePage.getActualProductsCountInCart(), count);

    }

    @Then("Button is displayed")
    public void buttonIsDisplayed() {
        assertEquals(homePage.getButtonIsDisplayed(), true);
    }

    @Then("An error {string} is displayed")
    public void anErrorIsDisplayed(String t) {
        t = "Введите свою эл. почту";
        assertEquals(homePage.getAnErrorIsDisplayed(), true);
    }

    @Then("Error is displayed {string}")
    public void errorIsDisplayed(String k) {
        k = "По вашему запросу ничего не найдено";
        assertEquals(homePage.getErrorIsDisplayed(), true);
    }

    @Then("Sorting items from expensive to cheap is displayed")
    public void sortingItemsFromExpensiveToCheapIsDisplayed() {
        boolean result = false;
        List<WebElement> expensiveToCheapList = driver.findElements(xpath("//p[@class='goods-tile__price-value']"));
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i+1).getText());
                    if (firstItemPrice>=secondItemPrice){
                        result = true;
                        return;
            }
        }
        assert(result);
    }

    @Then("Sorting items from cheap to expensive is displayed")
    public void sortingItemsFromCheapToExpensiveIsDisplayed() {
        boolean res = false;
        List<WebElement> expensiveToCheapList = driver.findElements(xpath("//p[@class='goods-tile__price-value']"));
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i-1).getText());
            if (firstItemPrice>=secondItemPrice){
                res = true;
                return;
            }
        }
        assert(res);
    }
}