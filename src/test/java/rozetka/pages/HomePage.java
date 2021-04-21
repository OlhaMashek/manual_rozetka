package rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.INSERT;

public class HomePage {
    By searchFieldLocator = By.xpath("//input[@name='search']");
    By premiumLocator = By.xpath("//*[@class='premium-button__label']");
    By personalAccountLocator = By.xpath("//*[@href='#icon-user-simple']");
    By registrationLocator = By.xpath("//a[@class='auth-modal__register-link']");
    By nameLocator = By.xpath("//input[@formcontrolname='name']");
    By surnameLocator = By.xpath("//input[@formcontrolname='surname']");
    By phoneLocator = By.xpath("//input[@formcontrolname='phone']");
    By passwordLocator = By.xpath("//input[@formcontrolname='password']");
    By registrationAfterDataEntryLocator = By.xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enterInTheSearchFieldClickENTER(String arg0) {
        driver.findElement(searchFieldLocator).sendKeys("iPhone 12 Pro Max 256GB", ENTER);
        return this;
    }

    public HomePage pressOnTheButton(String arg0) {
        driver.findElement(premiumLocator).click();
        return this;
    }

    public HomePage clickOnTheIcon(String arg0) {
        driver.findElement(personalAccountLocator).click();
        return this;
    }

    public HomePage click(String arg0) {
        driver.findElement(registrationLocator).click();
        return this;
    }

    public HomePage enterToNameField(String name) {
        driver.findElement(nameLocator).sendKeys(name, INSERT);
        return this;
    }

    public HomePage enterToLastNameField(String surname) {
        driver.findElement(surnameLocator).sendKeys(surname, INSERT);
        return this;
    }

    public HomePage enterToPhoneNumberField(String number) {
        driver.findElement(phoneLocator).sendKeys(number, INSERT);
        return this;
    }

    public HomePage enterToPasswordField(String password) {
        driver.findElement(passwordLocator).sendKeys(password, INSERT);
        return this;
    }

    public HomePage clickOnIcon(String arg0) {
        driver.findElement(registrationAfterDataEntryLocator).click();
        return this;
    }
}

