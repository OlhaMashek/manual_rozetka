package rozetka.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import rozetka.hooks.TestContext;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.By.xpath;

public class AssertionsSteps extends BaseStep {

    @Then("The item with title {string} displayed in the cart")
    public void theItemWithTitleDisplayedInTheCart(String arg0) {
        String actualProductsCountInCart =
                TestContext.getDriver().findElement(xpath("//button[@class='header__button header__button--active']")).getText();
        assertEquals(actualProductsCountInCart, "1");

    }
}
