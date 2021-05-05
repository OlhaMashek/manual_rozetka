package rozetka.stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import rozetka.config.Config;
import rozetka.pages.HomePage;
import rozetka.pages.ItemPage;
import rozetka.pages.SearchPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
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

    @And("Check for a search query in the title")
    public void checkForASearchQueryInTheTitle() {
        assertEquals(searchPage.getProductNameIsDisplayed(), true);
    }

    @When("Click on the button Try Premium")
    public void clickOnTheButtonTryPremium() {
        homePage.pressOnTheButtonPremium();
    }

    @And("Press the sort button from expensive to cheap")
    public void pressTheSortButtonFromExpensiveToCheap() {
        searchPage.clickExpensiveToCheep();
    }

    @And("Press the sort button from cheap to expensive")
    public void pressTheSortButtonFromCheapToExpensive() {
        searchPage.clickCheepToExpensive();
    }

    @And("Click on the Register button")
    public void clickOnTheRegisterButton() {
        homePage.clickOnRegistrationAfterDataEntry();
    }

    @And("Click to register")
    public void clickToRegister() {
        homePage.pressOnTheButtonRegistration();
    }

    @When("Login to your personal account")
    public void loginToYourPersonalAccount() {
        homePage.enterToPersonalAccount();
    }

    @And("Click on the cart button")
    public void clickOnTheCartButton() {
        homePage.getClickOnTheCartButton();
    }
}