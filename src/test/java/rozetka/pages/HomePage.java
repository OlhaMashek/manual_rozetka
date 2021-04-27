package rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;
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
    By registrationAfterDataEntry = By.xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']");
    By searchEmpty = By.xpath("//input[@name='search']");
    By counter = By.xpath("//span[@class='counter counter--green ng-star-inserted']");
    By buttonSubscribe = By.xpath("//*[contains(text(),'Оформить подписку')]");
    By errorIsDisplayed = By.xpath("//*[contains(text(),'Введите свою эл. почту')]");
    By errorRequestEmpty = By.xpath("//*[contains(text(),'По вашему запросу ничего не найдено.')]");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInTheSearchField(String text) {
        text = "iPhone 12 Pro Max 256GB";
    driver.findElement(searchField).sendKeys(text, ENTER);
    }

    public void pressOnTheButtonPremium(String s) {
        s = "Попробуйте PREMIUM";
        driver.findElement(premium).click();
    }

    public void enterToPersonalAccount(String a) {
        a = "Войти в личный кабинет";
        driver.findElement(personalAccount).click();
    }

    public void pressOnTheButtonRegistration(String b) {
        b = "Зарегистрироваться";
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

    public void clickOnRegistrationAfterDataEntry(String p) {
        p = "Зарегистрироваться";
        driver.findElement(registrationAfterDataEntry).click();
    }

    public void enterTextOnTheSearchField(String text) {
        driver.findElement(searchEmpty).sendKeys(text, INSERT);
    }

    public String getActualProductsCountInCart() {
        WebElement countElement = driver.findElement(counter);
        return countElement.getText();
    }

    public boolean getButtonIsDisplayed(){
        WebElement web = driver.findElement(buttonSubscribe);
        boolean bool = web.isDisplayed();
        return bool;
    }

    public boolean getAnErrorIsDisplayed() {
        WebElement error = driver.findElement(errorIsDisplayed);
        boolean errorMistake = error.isDisplayed();
        return errorMistake;
    }

    public boolean getErrorIsDisplayed() {
        WebElement requestEmpty = driver.findElement(errorRequestEmpty);
        boolean errorErrorEmpty = requestEmpty.isDisplayed();
        return errorErrorEmpty;
    }
}

