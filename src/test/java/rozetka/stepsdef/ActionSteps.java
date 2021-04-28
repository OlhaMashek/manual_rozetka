package rozetka.stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import rozetka.config.Config;
import rozetka.pages.HomePage;
import rozetka.pages.ItemPage;
import rozetka.pages.SearchPage;
import static org.junit.Assert.assertTrue;

public class ActionSteps {

    private final WebDriver driver = Config.getDriver();

    HomePage homePage = new HomePage(driver);
    ItemPage itemPage = new ItemPage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @When("Enter in the search field {string}")
    public void enterInTheSearchField(String text) {
        homePage.enterInTheSearchField(text);
    }

    @And("Click on the first product found")
    public void clickOnTheFirstProductFound() {
        searchPage.clickFirstProduct();
    }

    @And("Check that url contains {string}")
    public void checkThatUrlContains(String arg) {
        assertTrue("FAIL: Url not contains " + arg, driver.getCurrentUrl().contains(arg));
    }

    @And("Close the displayed pop-up")
    public void closeTheDisplayedPopUp() {
        itemPage.closePopUp();
    }


    @And("Enter {string} to Name field")
    public void enterToNameField(String name) {
        homePage.enterToName(name);
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

    @When("Enter {string} in search field")
    public void enterInSearchField(String text) {
        homePage.enterTextOnTheSearchField(text);
    }

    @And("Click on the Buy button")
    public void clickOnTheBuyButton() {
        itemPage.clickBuyFirstItem();
    }

    @When("Press on the button {string}")
    public void pressOnTheButton(String s) {
        homePage.pressOnTheButtonPremium(s);
    }

    @When("Click on the icon {string}")
    public void clickOnTheIcon(String a) {
        homePage.enterToPersonalAccount(a);
    }

    @And("Click {string}")
    public void click(String b) {
        homePage.pressOnTheButtonRegistration(b);
    }

    @And("Click on icon {string}")
    public void clickOnIcon(String p) {
        homePage.clickOnRegistrationAfterDataEntry(p);
    }

    @And("Click by the checkbox {string}")
    public void clickByTheCheckbox(String q) {
        searchPage.clickExpensiveToCheep(q);
    }

    @And("Press on the checkbox {string}")
    public void pressOnTheCheckbox(String y) {
        searchPage.clickCheepToExpensive(y);
    }
}