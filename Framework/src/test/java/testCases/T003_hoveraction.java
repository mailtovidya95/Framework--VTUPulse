package testCases;

import PageObject.mainbar;
import org.testng.annotations.Test;
import testBase.basetest;

public class T003_hoveraction extends basetest {

    @Test(groups = "regression")
    public void ha()throws Throwable
    {

        mainbar hm = new mainbar(driver);
        hm.setTutorial();

   }
    }


