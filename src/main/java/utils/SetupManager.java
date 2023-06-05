package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SetupManager {
    private static WebDriver driver;
    private static String url;

    public static void setUp() {
        url = getProperty("url");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }

    private static String getProperty(String propertyName) {
        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("src/main/resources/properties/browser.properties")) {
            properties.load(fis);
            return properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}