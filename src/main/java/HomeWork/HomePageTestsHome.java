package HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestsHome extends TestBaseHome {


    @Test
    public void isHomeComponentPresentTest(){
    Assert.assertTrue(isHomeComponentPresent());

}

}
