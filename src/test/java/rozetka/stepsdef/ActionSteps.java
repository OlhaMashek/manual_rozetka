package rozetka.stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.config.Config;
import rozetka.pages.HomePage;
import rozetka.pages.ItemPage;
import rozetka.pages.SearchPage;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.xpath;

public class ActionSteps {

    private WebDriver driver = Config.getDriver();

    HomePage homePage = new HomePage(driver);
    ItemPage itemPage = new ItemPage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @When("Enter in the search field {string} click ENTER")
    public void enterInTheSearchFieldClickENTER(String text) {
        homePage.enterInTheSearchField(text);
    }

    @And("Click on the first product found")
    public void clickOnTheFirstProductFound() {
        List<WebElement> elementsList = driver.findElements(xpath("//a[@class='goods-tile__picture']"));
        WebDriverWait wait = new WebDriverWait(driver, 5000000);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementsList));
        elementsList.get(0).click();
    }

    @And("Check that url contains {string}")
    public void checkThatUrlContains(String arg) {
        assertTrue("FAIL: Url not contains " + arg, driver.getCurrentUrl().contains(arg));
    }

    @And("Click on the button {string}")
    public void clickOnTheButton() {
        driver.findElement(xpath("//*[@class='product__buy']")).click();
    }

    @And("Close the displayed pop-up")
    public void closeTheDisplayedPopUp() {
        itemPage.closePopUp();
    }


    @And("Enter {string} to Name field")
    public void enterToNameField(String name) {
        homePage.enterToName(name);
    }

    @When("Press on the button {string}")
    public void pressOnTheButton() {
        homePage.pressOnTheButtonPremium();
    }

    @When("Click on the icon {string}")
    public void clickOnTheIcon() {
        homePage.enterToPersonalAccount();
    }

    @And("Click {string}")
    public void click() {
        homePage.pressOnTheButtonRegistration();
    }

    @And("Enter {string} to Last name field")
    public void enterToLastNameField(String surname) {
        homePage.enterToLastName(surname);
    }

    @And("Enter {string} to Phone number field")
    public void enterToPhoneNumberField(String number) {
        homePage.enterToPhoneNumber(number);
    }

    @And("Enter {string} to password field")
    public void enterToPasswordField(String password) {
        homePage.enterToPassword(password);
    }

    @And("Click on icon {string}")
    public void clickOnIcon() {
        homePage.clickOnRegistrationAfterDataEntry();
    }

    @When("Enter {string} in search field")
    public void enterInSearchField(String text) {
        homePage.enterTextOnTheSearchField(text);
    }

    @And("Click by the checkbox {string}")
    public void clickByTheCheckbox() {
        searchPage.clickExpensiveToCheep();
    }

    @And("Press on the checkbox {string}")
    public void pressOnTheCheckbox() {
        searchPage.clickCheepToExpensive();
    }

    @And("Click on the Buy button")
    public void clickOnTheBuyButton() {
        itemPage.clickBuyFirstItem();
    }

    @And("Click on the cart button")
    public void clickOnTheCartButton() {
        driver.findElement(xpath("")).click();
    }
}