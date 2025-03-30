package QA46_HomeWork_Phonebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestsHomeWork extends TestBaseHomeWork{
    @Test
    public void loginPositiveTests(){
        clickOnLoginLink();
        fillRegisterLoginForm(new UserHomeWork().setMail("stepanenko6288@yandex.com").setPassword("6969Sasha#%"));
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());

    }

}