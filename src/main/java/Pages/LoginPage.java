package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SetupManager;

import java.util.logging.Logger;

public class LoginPage {
    private WebDriver driver;
    private Logger logger = Logger.getLogger(LoginPage.class.getName());

    String title = "//*[@id='content']/div/h2";
    String usernameInput = "//input[@id='username']";
    String passwordInput = "//input[@id='password']";
    String loginButton = "//form[@id='login']/button";

    public LoginPage(){
        driver = SetupManager.getDriver();
    }
    public void getTitle(){
        String titleText = driver.findElement(By.xpath(title)).getText(); //get title
        logger.info("TITLE : " + titleText);
    }

    public void fillUsername(String username){
        driver.findElement(By.xpath(usernameInput)).sendKeys(username); //input username form field
    }

    public void fillPassword(String password){
        driver.findElement(By.xpath(passwordInput)).sendKeys(password); //input password form field
    }

    public void clickLogin(){
        driver.findElement(By.xpath(loginButton)).click(); //click login button
    }
}
