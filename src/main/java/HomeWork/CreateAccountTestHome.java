package HomeWork;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTestHome extends TestBaseHome {


    @Test
    public void CreateAccountTestHome() {
        click();
        type(By.name("email"), "stepanenko6288@yandex.com");
        type(By.name("password"), "6969Sasha#%");
        click(By.name("Registration"));
        Assert.assertTrue(isAlertDisplayed());

    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

}
