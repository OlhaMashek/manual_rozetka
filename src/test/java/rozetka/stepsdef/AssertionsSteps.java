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


    @Then("The item with count {string} displayed on the cart icon")
    public void theItemWithTitleDisplayedInTheCart(String count) {
        assertEquals(homePage.getActualProductsCountInCart(), count);

    }

    @Then("Button is displayed")
    public void buttonIsDisplayed() {
        assertEquals(homePage.getButtonIsDisplayed(), true);
    }

    @Then("An error {string} is displayed")
    public void anErrorIsDisplayed(String t) {
        t = "Введите свою эл. почту";
        assertEquals(homePage.getAnErrorIsDisplayed(), true);
    }

    @Then("Error is displayed {string}")
    public void errorIsDisplayed(String k) {
        k = "По вашему запросу ничего не найдено";
        assertEquals(homePage.getErrorIsDisplayed(), true);
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
}