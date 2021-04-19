package rozetka.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import rozetka.hooks.TestContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.openqa.selenium.By.xpath;

public class AssertionsSteps extends BaseStep {

    @Then("The item with title {string} displayed in the cart")
    public void theItemWithTitleDisplayedInTheCart(String arg0) {
        String actualProductsCountInCart =
                TestContext.getDriver().findElement(xpath("//button[@class='header__button header__button--active']")).getText();
        assertEquals(actualProductsCountInCart, "1");

    }

    @Then("Button {string} is displayed")
    public void buttonIsDisplayed(String arg0) {
        boolean textFound = false;
        try {
            TestContext.getDriver().findElement(xpath("//*[contains(text(),'Оформить подписку')]"));
            textFound = true;
        } catch (Exception e) {
            textFound = false;
        }
    }

    @Then("An error {string} is displayed")
    public void anErrorIsDisplayed(String arg0) {
        boolean text = false;
        try {
            TestContext.getDriver().findElement(xpath("//*[contains(text(),'Введите свою эл. почту')]"));
            text = true;
        } catch (Exception e) {
            text = false;
        }
    }

    @Then("Error is displayed {string}")
    public void errorIsDisplayed(String arg0) {
        boolean message = false;
        try {
            TestContext.getDriver().findElement(xpath("//*[contains(text(),'По вашему запросу ничего не найдено. Уточните свой запрос')]"));
            message = true;
        } catch (Exception e) {
            message = false;
        }
    }

    @Then("Sorting items from expensive to cheap is displayed")
    public void sortingItemsFromExpensiveToCheapIsDisplayed() {
        boolean flag = false;
        List<WebElement> list = TestContext.getDriver().findElements(xpath("//*[text='От дорогих к дешевым']"));
        int size = list.size();
        String[] actual = new String[size];
        String[] sorted = new String[size];

        for (int i = 0; i < size; i++)
        {
            actual[i]=sorted[i] = TestContext.getDriver().findElement(xpath(".//[@id='paymentFormsTabl']//tbody//tr[" + i+ "")).getText();
        }

        //Sorting the array
        Arrays.sort(sorted);

        //Validating the existing with sorted array. shows no message if both are same
        for(int i = 0;i<size;i++)
        {
            if(!actual[i].equals(sorted[i]))
            {
                System.out.println("The elements the webpage are not sorted");
                System.out.println("expected "+sorted[i]+" but actual "+actual[i]+" at row "+i);
                flag = true;
            }
        }
    }
}
