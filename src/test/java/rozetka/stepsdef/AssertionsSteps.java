package rozetka.stepsdef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import rozetka.config.Config;
import rozetka.pages.HomePage;
import rozetka.pages.SearchPage;

import static org.junit.Assert.*;

public class AssertionsSteps {

    private final WebDriver driver = Config.getDriver();
    HomePage homePage = new HomePage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @Then("Button is displayed")
    public void buttonIsDisplayed() {
        assertEquals(homePage.getButtonIsDisplayed(), true);
    }

    @Then("Sorting items from expensive to cheap is displayed")
    public boolean sortingItemsFromExpensiveToCheapIsDisplayed() {
        searchPage.getSortingItemsFromExpensiveToCheap();
        return true;
    }

    @Then("Sorting items from cheap to expensive is displayed")
    public boolean sortingItemsFromCheapToExpensiveIsDisplayed() {
        searchPage.getSortingItemsFromCheapToExpensive();
        return true;
    }

    @Then("The error that you need to enter the email is displayed")
    public void theErrorThatYouNeedToEnterTheEmailIsDisplayed() {
        assertEquals(homePage.getAnErrorIsDisplayed(), true);
    }

    @Then("The error is that nothing was found for the request")
    public void theErrorIsThatNothingWasFoundForTheRequest() {
        assertEquals(homePage.getErrorIsDisplayed(), true);
    }

    @Then("Reverse the display of the cart")
    public void reverseTheDisplayOfTheCart() {
        assertEquals(homePage.getReverseTheDisplayOfTheCart(), true);
    }
}