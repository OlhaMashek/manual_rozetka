package rozetka.stepsdef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import rozetka.config.Config;

import java.util.List;

import static org.junit.Assert.*;
import static org.openqa.selenium.By.xpath;

public class AssertionsSteps extends BaseStep {

    @Then("The item with title {string} displayed in the cart")
    public void theItemWithTitleDisplayedInTheCart(String arg0) {
        String actualProductsCountInCart =
                Config.getDriver().findElement(xpath("//button[@class='header__button header__button--active']")).getText();
        assertEquals(actualProductsCountInCart, "1");

    }

    @Then("Button {string} is displayed")
    public void buttonIsDisplayed(String arg0) {
        boolean textFound = false;
        try {
            Config.getDriver().findElement(xpath("//*[contains(text(),'Оформить подписку')]"));
            textFound = true;
        } catch (Exception e) {
            textFound = false;
        }
    }

    @Then("An error {string} is displayed")
    public void anErrorIsDisplayed(String arg0) {
        boolean text = false;
        try {
            Config.getDriver().findElement(xpath("//*[contains(text(),'Введите свою эл. почту')]"));
            text = true;
        } catch (Exception e) {
            text = false;
        }
    }

    @Then("Error is displayed {string}")
    public void errorIsDisplayed(String arg0) {
        boolean message = false;
        try {
            Config.getDriver().findElement(xpath("//*[contains(text(),'По вашему запросу ничего не найдено. Уточните свой запрос')]"));
            message = true;
        } catch (Exception e) {
            message = false;
        }
    }

    @Then("Sorting items from expensive to cheap is displayed")
    public void sortingItemsFromExpensiveToCheapIsDisplayed() {
        List<WebElement> expensiveToCheapList = Config.getDriver().findElements(xpath("//p[@class='goods-tile__price-value']"));
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i+1).getText());
            assert(firstItemPrice>=secondItemPrice);
        }
    }

    @Then("Sorting items from cheap to expensive is displayed")
    public void sortingItemsFromCheapToExpensiveIsDisplayed() {
        List<WebElement> expensiveToCheapList = Config.getDriver().findElements(xpath("//p[@class='goods-tile__price-value']"));
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i-1).getText());
            assert(firstItemPrice>=secondItemPrice);
        }
    }
}