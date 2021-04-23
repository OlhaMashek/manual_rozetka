package rozetka.stepsdef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.junit.Assert.*;
import static org.openqa.selenium.By.xpath;

public class AssertionsSteps {

    private final WebDriver driver;

    public AssertionsSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Then("The item with title {string} displayed in the cart")
    public void theItemWithTitleDisplayedInTheCart() {
        String actualProductsCountInCart =
                driver.findElement(xpath("//button[@class='header__button header__button--active']")).getText();
        assertEquals(actualProductsCountInCart, "1");

    }

    @Then("Button {string} is displayed")
    public void buttonIsDisplayed() {
        boolean textFound = false;
        try {
            driver.findElement(xpath("//*[contains(text(),'Оформить подписку')]"));
            textFound = true;
        } catch (Exception e) {
            textFound = false;
        }
    }

    @Then("An error {string} is displayed")
    public void anErrorIsDisplayed() {
        boolean text = false;
        try {
            driver.findElement(xpath("//*[contains(text(),'Введите свою эл. почту')]"));
            text = true;
        } catch (Exception e) {
            text = false;
        }
    }

    @Then("Error is displayed {string}")
    public void errorIsDisplayed() {
        boolean message = false;
        try {
            driver.findElement(xpath("//*[contains(text(),'По вашему запросу ничего не найдено. Уточните свой запрос')]"));
            message = true;
        } catch (Exception e) {
            message = false;
        }
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
        List<WebElement> expensiveToCheapList = driver.findElements(xpath("//p[@class='goods-tile__price-value']"));
        for (int i = 0; i >= 3; i++) {
            System.out.println(expensiveToCheapList.get(i).getText());
            int firstItemPrice = Integer.parseInt(expensiveToCheapList.get(i).getText());
            int secondItemPrice = Integer.parseInt(expensiveToCheapList.get(i-1).getText());
            assert(firstItemPrice>=secondItemPrice);
        }
    }
}