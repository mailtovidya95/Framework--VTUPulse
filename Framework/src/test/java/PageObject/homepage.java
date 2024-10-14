package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class homepage extends Basepage {

    public homepage(WebDriver driver)
    {
        super(driver);
    }


    @FindBy(xpath="//img[@alt='VTUPulse']")
    WebElement vTUPulse;


    @FindBy(xpath="//h1[normalize-space()='Download Final Year Projects']")
    WebElement downloadFinalYearProjects;

    public void logo()
    {
        boolean logop=vTUPulse.isDisplayed();
        Assert.assertTrue(logop);
    }

    public void title()
    {
        String title=driver.getTitle();
        System.out.println("title is " +title);
    }
}

