package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

import testBase.basetest;

import java.util.List;

public class T004_Tutorialsubnames extends basetest {

    @Test(groups = "datadriven",priority = 1)
    public void tutorial()throws Throwable
  

    {
        driver.findElement(By.xpath("//*[@id=\"menu-item-4309\"]/a")).click();
        List<WebElement> name = driver.findElements(By.xpath("//li/ul/li/a"));
        String[] expectedTitles = {"C++ Programs", "Computer Graphics", "Python Tutorial", "Julia Tutorial", "Big Data Analytics Tutorial", "Machine Learning", "Artificial Intelligence", "PERL"};
        for (int i = 1; i <= 8; i++) {
            String list = driver.findElement(By.xpath("(//li/ul/li/a)["+i+"]")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);
            System.out.println( list);
        }
    }
   

    @Test(priority = 2)
    public void project() throws Throwable {
        
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[2]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[2]/ul/li"));
        String[] expectedTitles = {"Computer Graphics Mini Project", "Download Final Year Projects", "Web DBMS Mini Project"};
        for (i = 1; i <= 3; i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[2]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i - 1], list);

            {
                System.out.println(list);
            }


        }


    }

    @Test(priority = 3)
    public void firstyear() throws Throwable {
       
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[3]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[3]/ul/li"));
        String[] expectedTitles = {"2021 Scheme First Year VTU Notes", "2018 Scheme P-Cycle Notes", "2018 Scheme C-Cycle Notes"};
        for (i = 1; i <= name.size(); i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[3]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);

            {
                System.out.println(list);
            }

        }
   }

    @Test(priority = 4)
    public void CSE_notes() throws Throwable {
       
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[4]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[4]/ul/li"));
        String[] expectedTitles = {"2017 & 2015 Scheme CSE Notes", "2018 Scheme CSE Notes"};
        for (i = 1; i <= name.size(); i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[4]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);

            {
                System.out.println(list);
            }

        }
    }
    @Test(priority = 5)
    public void ECE_notes() throws Throwable {
        
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[5]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[5]/ul/li"));
        String[] expectedTitles = {"2017 & 2015 Scheme ECE Notes", "2018 Scheme ECE Notes"};
        for (i = 1; i <= name.size(); i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[5]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);

            {
                System.out.println(list);
            }

        }
    }

    @Test(priority = 6)
    public void ME_notes() throws Throwable {
       
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[6]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[6]/ul/li"));
        String[] expectedTitles = {"2015 & 2017 Scheme ME Notes", "2018 Scheme ME Notes"};
        for (i = 1; i <= name.size(); i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[6]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);

            {
                System.out.println(list);
            }

        }
    }


    @Test(priority = 7)
    public void EE_notes() throws Throwable {
       
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[7]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[7]/ul/li"));
        String[] expectedTitles = {"2017 & 2015 Scheme EEE Notes", "2018 Scheme EEE Notes","2017 & 20115 Scheme Civil Notes","2018 Scheme Civil Notes",};
        for (i = 1; i <= name.size(); i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[7]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);

            {
                System.out.println(list);
            }

        }
    }

    @Test(priority = 8)
    public void QPS() throws Throwable {
        
        int i;
        driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[8]")).click();
        List<WebElement> name = driver.findElements(By.xpath("//div/ul[@id=\"primary-menu\"]/li[8]/ul/li"));
        String[] expectedTitles = {"First Year VTU Question Papers", "CSE VTU Question Papers","EEE VTU Question Papers","ECE VTU Question Papers","ME VTU Question Papers","Civil VTU Question Papers",};
        for (i = 1; i <= name.size(); i++) {


            String list = driver.findElement(By.xpath("//div/ul[@id=\"primary-menu\"]/li[8]/ul/li[" + i + "]/a")).getText();
            Assert.assertEquals(expectedTitles[i-1],list);

            {
                System.out.println(list);
            }

        }
    }

}
