import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BrowserManager.openBrowser();

        NavigationActions actions = new NavigationActions(BrowserManager.driver);
        actions.clickTicketIcon();
        Thread.sleep(2000);

        FormActions formActions = new FormActions();
        formActions.enterTextInNameField(BrowserManager.driver, "Ali Jaradah");
        Thread.sleep(2000);
        formActions.enterTextInEmailField(BrowserManager.driver, "alihyderjaradah@gmail.com");
        Thread.sleep(2000);
        formActions.enterTextInSubjectField(BrowserManager.driver, "Test Subject");
        Thread.sleep(2000);
        formActions.clickSendButton(BrowserManager.driver);
        Thread.sleep(2000);

        BrowserManager.closeBrowser();
    }
}
