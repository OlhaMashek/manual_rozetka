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

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enterInTheSearchFieldClickENTER(String text) {
        text = "iPhone 12 Pro Max 256GB";
    driver.findElement(searchField).sendKeys(text, ENTER);
      return this;
    }

    public HomePage pressOnTheButton() {
        driver.findElement(premium).click();
        return this;
    }

    public HomePage clickOnTheIcon() {
        driver.findElement(personalAccount).click();
        return this;
    }

    public HomePage click() {
        driver.findElement(registration).click();
        return this;
    }

    public HomePage enterToNameField(String name) {
        driver.findElement(firstname).sendKeys(name, INSERT);
        return this;
    }

    public HomePage enterToLastNameField(String surname) {
        driver.findElement(lastname).sendKeys(surname, INSERT);
        return this;
    }

    public HomePage enterToPhoneNumberField(String number) {
        driver.findElement(phone).sendKeys(number, INSERT);
        return this;
    }

    public HomePage enterToPasswordField(String password) {
        driver.findElement(pass).sendKeys(password, INSERT);
        return this;
    }

    public HomePage clickOnIcon() {
        driver.findElement(registrationAfterDataEntry).click();
        return this;
    }
}

