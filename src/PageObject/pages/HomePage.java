public class HomePage {
    WebDriver driver;
    By store_url = "https://rozetka.com.ua";
    By searchField = By.xpath("//input[@name='search']");


}

public HomePage(WebDriver driver){
    this.driver = driver;
}