package rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.INSERT;

public class HomePage {
    By searchField = By.xpath("//input[@name='search']");
    By premium = By.xpath("//*[@class='premium-button__label']");
    By personalAccount = By.xpath("//*[@href='#icon-user-simple']");
    By registration = By.xpath("//a[@class='auth-modal__register-link']");
    By firstname = By.xpath("//input[@formcontrolname='name']");
    By lastname = By.xpath("//input[@formcontrolname='surname']");
    By phone = By.xpath("//input[@formcontrolname='phone']");
    By pass = By.xpath("//input[@formcontrolname='password']");
    By registrationAfterDataEntry = By.xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']");
    By searchEmpty = By.xpath("//input[@name='search']");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInTheSearchField(String text) {
        text = "iPhone 12 Pro Max 256GB";
    driver.findElement(searchField).sendKeys(text, ENTER);
    }

    public void pressOnTheButtonPremium() {
        driver.findElement(premium).click();
    }

    public void enterToPersonalAccount() {
        driver.findElement(personalAccount).click();
    }

    public void pressOnTheButtonRegistration() {
        driver.findElement(registration).click();
    }

    public void enterToName(String name) {
        driver.findElement(firstname).sendKeys(name, INSERT);
    }

    public void enterToLastName(String surname) {
        driver.findElement(lastname).sendKeys(surname, INSERT);
    }

    public void enterToPhoneNumber(String number) {
        driver.findElement(phone).sendKeys(number, INSERT);
    }

    public void enterToPassword(String password) {
        driver.findElement(pass).sendKeys(password, INSERT);
    }

    public void clickOnRegistrationAfterDataEntry() {
        driver.findElement(registrationAfterDataEntry).click();
    }

    public void enterTextOnTheSearchField(String text) {
        driver.findElement(searchEmpty).sendKeys(text, INSERT);
    }
}

