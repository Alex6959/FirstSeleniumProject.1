package HomeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestHome extends TestBaseHome{
   @Test
    public void loginPositiveTestHome(){
       click();
       type(By.name("email"), "stepanenko6288@yandex.com");
       type(By.name("password"), "6969Sasha#%");
       click(By.name("Registration"));
       Assert.assertTrue(isAlertDisplayed());
   }
}
