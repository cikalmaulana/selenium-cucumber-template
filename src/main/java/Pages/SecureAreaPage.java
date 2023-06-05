package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SetupManager;

import java.util.logging.Logger;

public class SecureAreaPage {
    private WebDriver driver;
    private Logger logger = Logger.getLogger(SecureAreaPage.class.getName());
    String contentDiv = "//div[@id='content']";
    String logoutButton = "//div[@id='content']/div/a";

    public SecureAreaPage(){
        driver = SetupManager.getDriver();
    }

    public void checkIfLoginSuccess(){
        Assert.assertTrue(driver.findElement(By.xpath(contentDiv)).isDisplayed());
    }

    public void clickLogout(){
        driver.findElement(By.xpath(logoutButton)).click();
    }
}
