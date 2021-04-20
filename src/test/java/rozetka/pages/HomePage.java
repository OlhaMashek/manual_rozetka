package rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    By searchField = By.xpath("//input[@name='search']");
    By premium = By.xpath("//*[@class='premium-button__label']");
    By personalAccount = By.xpath("//*[@href='#icon-user-simple']");
    By registration = By.xpath("//a[@class='auth-modal__register-link']");
    By name = By.xpath("//input[@formcontrolname='name']");
    By surname = By.xpath("//input[@formcontrolname='surname']");
    By phone = By.xpath("//input[@formcontrolname='phone']");
    By password = By.xpath("//input[@formcontrolname='password']");
    By registrationAfterDataEntry = By.xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}