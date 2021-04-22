package rozetka.stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.config.Config;
import rozetka.pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.INSERT;

public class ActionSteps {


    @When("Enter in the search field {string} click ENTER")
    public void enterInTheSearchFieldClickENTER() {
      Config.getDriver().findElement(xpath("//input[@name='search']")).sendKeys("iPhone 12 Pro Max 256GB", ENTER);
      Config.getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("Click on the first product found")
    public void clickOnTheFirstProductFound() {
        //TestContext.getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        List<WebElement> elementsList = Config.getDriver().findElements(xpath("//a[@class='goods-tile__picture']"));
        WebDriverWait wait = new WebDriverWait(Config.getDriver(), 5000000);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsList));
        elementsList.get(0).click();
    }

    @And("Check that url contains {string}")
    public void checkThatUrlContains(String arg) {
        assertTrue("FAIL: Url not contains " + arg, Config.getDriver().getCurrentUrl().contains(arg));
    }

    @And("Click on the button {string}")
    public void clickOnTheButton() {
        Config.getDriver().findElement(xpath("//*[@class='product__buy']")).click();
        WebDriverWait wait = new WebDriverWait(Config.getDriver(), 30);
    }

    @And("Close the displayed pop-up")
    public void closeTheDisplayedPopUp() {
        Config.getDriver().findElement(xpath("//button[@class='modal__close']")).click();
        WebDriverWait wait = new WebDriverWait(Config.getDriver(), 30);
    }


    @And("Enter {string} to Name field")
    public void enterToNameField(String name) {
        Config.getDriver().findElement(xpath("//input[@formcontrolname='name']")).sendKeys(name, INSERT);
    }

    @When("Press on the button {string}")
    public void pressOnTheButton() {
        Config.getDriver().findElement(xpath("//*[@class='premium-button__label']")).click();
    }

    @When("Click on the icon {string}")
    public void clickOnTheIcon() {
        Config.getDriver().findElement(xpath("//*[@href='#icon-user-simple']")).click();
    }

    @And("Click {string}")
    public void click() {
        Config.getDriver().findElement(xpath("//a[@class='auth-modal__register-link']")).click();
    }

    @And("Enter {string} to Last name field")
    public void enterToLastNameField(String surname) {
        Config.getDriver().findElement(xpath("//input[@formcontrolname='surname']")).sendKeys(surname, INSERT);
    }

    @And("Enter {string} to Phone number field")
    public void enterToPhoneNumberField(String number) {
        Config.getDriver().findElement(xpath("//input[@formcontrolname='phone']")).sendKeys(number, INSERT);
    }

    @And("Enter {string} to password field")
    public void enterToPasswordField(String password) {
        Config.getDriver().findElement(xpath("//input[@formcontrolname='password']")).sendKeys(password, INSERT);
    }

    @And("Click on icon {string}")
    public void clickOnIcon() {
        Config.getDriver().findElement(xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']")).click();
    }

    @When("Enter {string} in search field")
    public void enterInSearchField(String text) {
        Config.getDriver().findElement(xpath("//input[@name='search']")).sendKeys(text, INSERT);
    }

    @And("Click by the checkbox {string}")
    public void clickByTheCheckbox() {
        WebElement select = Config.getDriver().findElement(xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("От дорогих к дешевым".equals(option.getText().trim()))
                option.click();
        }
    }

    @And("Press on the checkbox {string}")
    public void pressOnTheCheckbox() {
        WebElement select = Config.getDriver().findElement(xpath("//*[@class='select-css ng-valid ng-dirty ng-touched']"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for (WebElement option : options) {
            if ("От дешевых к дорогим".equals(option.getText().trim()))
                option.click();
        }
    }

    @And("Click on the Buy button")
    public void clickOnTheBuyButton() {
        Config.getDriver().findElement(xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large']")).click();
    }

    @And("Click on the cart button")
    public void clickOnTheCartButton() {
        Config.getDriver().findElement(xpath("")).click();
    }
}
