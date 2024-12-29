import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static WebDriver driver;
    public static void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/alijaradah/Downloads/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://help.ibtikarat.sa/index-ar");
        Thread.sleep(2000);
    }
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
