package rozetka.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.Log4j;
import rozetka.hooks.TestContext;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.Keys.ENTER;

public class ActionSteps extends BaseStep {
   // private RegistrationPage regstrationPage = new RegistrationPage(TestContext.getDriver());

    @When("Enter in the search field {string} click ENTER")
    public void enterInTheSearchFieldClickENTER(String arg0) {
        TestContext.getDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone 12 Pro Max 256GB", ENTER);
        //sLog4j.logger.info("Searching " + arg0);s
        TestContext.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("Click on the first product found")
    public void clickOnTheFirstProductFound() {
        TestContext.getDriver().findElement(By.xpath("//div[@data-goods-id='245162563']")).click();
        TestContext.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("Check that url contains {string}")
    public void checkThatUrlContains(String arg0) {
        assertTrue("FAIL: Url not contains "+ arg0,TestContext.getDriver().getCurrentUrl().contains(arg0));
    }

    @And("Click on the button {string}")
    public void clickOnTheButton(String arg0) {
        TestContext.getDriver().findElement(By.xpath("//*[@class='product__buy']")).click();
        WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), 30);
    }

    @And("Close the displayed pop-up")
    public void closeTheDisplayedPopUp() {
        TestContext.getDriver().findElement(By.xpath("//button[@class='modal__close']")).click();
    }


    @And("Enter {string} to Name field")
    public void enterToNameField(String name) {
        //regstrationPage.enterValueToNameField(name)
    }
}
