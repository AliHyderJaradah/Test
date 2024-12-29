import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class NavigationActions {

    WebDriver driver;

    public NavigationActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTicketIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ticketIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='icon']/i[@class='icon-ticket-2']")));
        ticketIcon.click();
    }


}
