package rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.INSERT;

public class HomePage {
    By searchField = By.xpath("//input[@name='search']");
    By premium = By.xpath("//*[@class='premium-button__label']");
    By personalAccount = By.xpath("/html/body/app-root/div/div[1]/rz-header/header/div/div/ul/li[3]/rz-user/button");
    By registration = By.xpath("//a[@class='auth-modal__register-link ng-star-inserted']");
    By firstname = By.xpath("//input[@formcontrolname='name']");
    By lastname = By.xpath("//input[@formcontrolname='surname']");
    By phone = By.xpath("//input[@formcontrolname='phone']");
    By pass = By.xpath("//input[@formcontrolname='password']");
    By registrationAfterDataEntry = By.xpath("//button[@class='button button--large button--green auth-modal__submit']");
    By searchEmpty = By.xpath("//input[@name='search']");
    By buttonSubscribe = By.xpath("//*[contains(text(),'Оформить подписку')]");
    By errorIsDisplayed = By.xpath("//*[contains(text(),'Введите свою эл. почту')]");
    By errorRequestEmpty = By.xpath("//*[contains(text(),'По вашему запросу ничего не найдено.')]");
    By buttonCart = By.xpath("//button[contains(@class, 'header__button ng-star-inserted header__button--active')]");
    By itemInCart = By.xpath("//a[contains(@class, 'cart-product__title')]");

    private final WebDriver driver;
    private static final Logger log = Logger.getLogger(String.valueOf(HomePage.class));

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInTheSearchField(String text) {
        text = "iPhone 12 Pro Max 256GB";
    driver.findElement(searchField).sendKeys(text, ENTER);
        log.info("Starting entering query");
    }

    public void pressOnTheButtonPremium() {
        driver.findElement(premium).click();
        log.info("Opening Premium page");
    }

    public void enterToPersonalAccount() {
        driver.findElement(personalAccount).click();
        log.info("Entering to personal account");
    }

    public void pressOnTheButtonRegistration() {
       driver.findElement(registration).click();
       log.info("Starting to registration");
    }

    public void enterToName(String name) {
        driver.findElement(firstname).sendKeys(name, INSERT);
        log.info("Cyrillic name input");
    }

    public void enterToLastName(String surname) {
        driver.findElement(lastname).sendKeys(surname, INSERT);
        log.info("Cyrillic surname input");
    }

    public void enterToPhoneNumber(String number) {
        driver.findElement(phone).sendKeys(number, INSERT);
        log.info("Number input mask +38");
    }

    public void enterToPassword(String password) {
        driver.findElement(pass).sendKeys(password, INSERT);
        log.info("The password must be at least 6 characters long," +
                " contain numbers and Latin letters, including capital letters," +
                " and must not coincide with the name and e-mail");
    }


    public void clickOnRegistrationAfterDataEntry() {
        driver.findElement(registrationAfterDataEntry).click();
        log.info("Registration after filling in the fields");
    }

    public void enterTextOnTheSearchField(String text) {
        driver.findElement(searchEmpty).sendKeys(text, INSERT);
        log.info("Entering data into the search field");
    }

    public boolean getButtonIsDisplayed(){
        boolean bool = driver.findElement(buttonSubscribe).isDisplayed();
        log.info("Displaying the Subscribe button");
        return bool;
    }

    public boolean getAnErrorIsDisplayed() {
        boolean errorMistake = driver.findElement(errorIsDisplayed).isDisplayed();
        log.info("Email field is not filled");
        return errorMistake;
    }

    public boolean getErrorIsDisplayed() {
        boolean errorErrorEmpty = driver.findElement(errorRequestEmpty).isDisplayed();
        log.info("Displaying a message stating that nothing was found for the request");
        return errorErrorEmpty;
    }

    public void getClickOnTheCartButton() {
        driver.findElement(buttonCart).click();
        log.info("Displaying the cart window");
    }

    public boolean getReverseTheDisplayOfTheCart() {
        boolean itemIsDisplayed = driver.findElement(itemInCart).isDisplayed();
        log.info("Displaying an item in the cart");
        return itemIsDisplayed;
    }
}