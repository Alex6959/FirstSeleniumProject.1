package phonebookHW;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestsHomeWork extends TestBaseHomeWork{

    @BeforeMethod
    public void ensurePrecondition(){
        if(!appHW.getUser().isLoginLinkPresent()){
            appHW.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void isHomeComponentPresentTest(){
        //driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1"));
        //System.out.println("Home component"+isHomeComponentPresent());
        Assert.assertTrue(appHW.getHome().isHomeComponentPresent());
    }

}