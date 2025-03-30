package QA46_HomeWork_Phonebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTestsHomeWork extends TestBaseHomeWork{
    @Test(enabled = false)
    public void newUserRegistrationPositiveTest(){

        clickOnLoginLink();
        fillRegisterLoginForm(new UserHomeWork().setMail("stepanenko6288@yandex.com").setPassword("6969Sasha#%"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());

    }


}
