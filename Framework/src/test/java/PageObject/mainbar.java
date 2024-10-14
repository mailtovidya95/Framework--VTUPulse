package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class mainbar extends Basepage
{
    public mainbar(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath="//div/ul[@id=\"primary-menu\"]/li")
    List<WebElement> list;

    @FindBy(xpath="//a[normalize-space()='Tutorial']")
    WebElement tutorial;

    @FindBy(xpath="//a[normalize-space()='Projects']")
    WebElement projects;


    @FindBy(xpath="//a[normalize-space()='1st Year']")
    WebElement firstyear;


    @FindBy(xpath="//a[normalize-space()='CSE Notes']")
    WebElement cSENotes;
    @FindBy(xpath="//a[normalize-space()='ECE Notes']")
    WebElement eCENotes;
    @FindBy(xpath="//a[normalize-space()='ME Notes']")
    WebElement mENotes;
    @FindBy(xpath="//a[normalize-space()='EE & CV Notes']")
    WebElement eECVNotes;
    @FindBy(xpath="//a[normalize-space()='QPs']")
    WebElement qPs;

    public void mainbaritemlist()
    {
        String[] expectedTitles = {"Tutorial", "Projects", "1st Year", "CSE Notes", "ECE Notes", "ME Notes", "EE & CV Notes", "QPs"};
        int i;
        for( i=1;i<=list.size();i++)
        {
            String name=driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li["+i+"]")).getText();
            if(name.equals(expectedTitles[i-1]))
                  System.out.println("text " +name+ " is same");
        }

    }

    public void setTutorial() throws Throwable
    {
        Actions action=new Actions(driver);
        action.moveToElement(tutorial).perform();
        Thread.sleep(3000);
        action.moveToElement(projects).perform();
        Thread.sleep(3000);
        action.moveToElement(firstyear).perform();
        Thread.sleep(3000);
        action.moveToElement(cSENotes).perform();
        Thread.sleep(3000);
        action.moveToElement(eCENotes).perform();
        Thread.sleep(3000);
        action.moveToElement(mENotes).perform();
        Thread.sleep(3000);
        action.moveToElement(eECVNotes).perform();
        Thread.sleep(3000);
        action.moveToElement(qPs).perform();
    }

}
