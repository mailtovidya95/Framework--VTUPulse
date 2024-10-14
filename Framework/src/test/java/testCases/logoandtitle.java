package testCases;

import PageObject.homepage;
import org.testng.annotations.Test;
import testBase.basetest;

public class logoandtitle extends basetest {

    @Test(groups = {"sanity","master"})
    public void logotitlecheck(){
        homepage hm=new homepage(driver);
        hm.logo();
        hm.title();

    }

}
