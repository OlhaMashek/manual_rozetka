package rozetka.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.Log4j;
import rozetka.hooks.TestContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.INSERT;

public class ActionSteps extends BaseStep {
   // private RegistrationPage regstrationPage = new RegistrationPage(TestContext.getDriver());

    @When("Enter in the search field {string} click ENTER")
    public void enterInTheSearchFieldClickENTER(String arg0) {
        TestContext.getDriver().findElement(xpath("//input[@name='search']")).sendKeys("iPhone 12 Pro Max 256GB", ENTER);
        //sLog4j.logger.info("Searching " + arg0);s
        TestContext.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("Click on the first product found")
    public void clickOnTheFirstProductFound() {
        List<WebElement> elementsList = TestContext.getDriver().findElements(xpath("//div[@class='goods-tile__inner']"));//собрали элементы поиска в лист
        WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), 30);//ждем пока не отобразится попап с товаром добавленным в корзину
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='goods-tile__inner']")));
        elementsList.get(0).click();
        }

    @And("Check that url contains {string}")
    public void checkThatUrlContains(String arg0) {
        assertTrue("FAIL: Url not contains "+ arg0,TestContext.getDriver().getCurrentUrl().contains(arg0));
    }

    @And("Click on the button {string}")
    public void clickOnTheButton(String arg0) {
        TestContext.getDriver().findElement(xpath("//*[@class='product__buy']")).click();
        WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), 30);
    }

    @And("Close the displayed pop-up")
    public void closeTheDisplayedPopUp() {
        TestContext.getDriver().findElement(xpath("//button[@class='modal__close']")).click();
        WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), 30);
    }


    @And("Enter {string} to Name field")
    public void enterToNameField(String name) {
        TestContext.getDriver().findElement(xpath("//input[@class='ng-pristine ng-invalid ng-touched']")).sendKeys(name, INSERT);
    }

    @When("Press on the button {string}")
    public void pressOnTheButton(String arg0) {
        TestContext.getDriver().findElement(xpath("//*[@class='premium-button__label']")).click();
    }

    @When("Click on the icon {string}")
    public void clickOnTheIcon(String arg0) {
        TestContext.getDriver().findElement(xpath("/html/body/app-root/div/div[1]/rz-header/header/div/div/ul/li[3]/rz-user/button")).click();
    }

    @And("Click {string}")
    public void click(String arg0) {
        TestContext.getDriver().findElement(xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/user-identification/auth/div/form/fieldset/div[4]/a")).click();
    }

    @And("Enter {string} to Last name field")
    public void enterToLastNameField(String surname) {
        TestContext.getDriver().findElement(xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/user-identification/register/div/form/fieldset[2]/input")).sendKeys(surname, INSERT);
    }

    @And("Enter {string} to Phone number field")
    public void enterToPhoneNumberField(String number) {
        TestContext.getDriver().findElement(xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/user-identification/register/div/form/fieldset[3]/input")).sendKeys(number, INSERT);
    }

    @And("Enter {string} to password field")
    public void enterToPasswordField(String password) {
        TestContext.getDriver().findElement(xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/user-identification/register/div/form/fieldset[5]/div/input")).sendKeys(password, INSERT);
    }
}
