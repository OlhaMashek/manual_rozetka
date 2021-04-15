package rozetka.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.hooks.TestContext;

import javax.naming.Context;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
          // String btnIsDisplayed =
                   // TestContext.getDriver().findElement(xpath("//div[@class='premium-cta']")).getText();
           // assertEquals(btnIsDisplayed, "Оформить подписку");
       // Assert.assertTrue(TestContext.getDriver().findElement(By.xpath("//div[@class='premium-cta']")).getText().contains("Оформить подписку"));
      WebElement btnIsDisplayed = TestContext.getDriver().findElement(xpath("//div[@class='premium-cta']"));
        assertEquals(btnIsDisplayed.getText(), "Оформить подписку");
    }

}
