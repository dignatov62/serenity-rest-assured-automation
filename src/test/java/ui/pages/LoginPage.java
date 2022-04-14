package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private final By loginInput = By.xpath("//input[@id='login']");
    private final By passInput = By.xpath("//input[@id='password']");
    private final By logInButton = By.xpath("//button[@class='plain-button wide']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage enterUserName(String login) {
        WebElement element = driver.findElement(loginInput);
        element.sendKeys(login);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(passInput).sendKeys(password);
        return this;
    }

    public MainPage enterClick(){
        driver.findElement(logInButton).click();
        return new MainPage(driver);
    }
}
