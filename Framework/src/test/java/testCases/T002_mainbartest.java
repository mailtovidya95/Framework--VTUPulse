package testCases;

import PageObject.mainbar;
import org.testng.annotations.Test;
import testBase.basetest;

public class T002_mainbartest extends basetest {
    @Test(groups = {"regression","master"})
    public void maintitlecheck ()throws  Throwable {
        mainbar hm = new mainbar(driver);
        hm.mainbaritemlist();
       // hm.setTutorial();


    }
}
