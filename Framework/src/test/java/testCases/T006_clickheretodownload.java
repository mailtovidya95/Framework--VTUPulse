package testCases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.Click_here_to_download;
import testBase.basetest;

public class T006_clickheretodownload extends Click_here_to_download {
	
	 @Test
	    public void download()
	    {
	       
	        //driver.findElement(By.xpath("//*[@id=\"post-13617\"]/div/figure/table/tbody/tr[1]/td[2]/a/strong")).click();
	        String name =driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div/div/div/nav/div")).getText();
	        System.out.println(name);
	        Assert.assertEquals(name,"HomeProductsPlant leaf Disease detection Project Source Code");
	    }

}
