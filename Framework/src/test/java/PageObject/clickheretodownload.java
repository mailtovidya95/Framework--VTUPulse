package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clickheretodownload extends Basepage {
	public clickheretodownload(WebDriver driver)
    {
        super(driver);
    }
	
	public void img()
	{
		List<WebElement> num_of_downloads = driver.findElements(By.xpath("//figure[@class=\"wp-block-table\"]/table/tbody/tr/td[2]"));
        System.out.println("size is " + num_of_downloads.size());
        for(int i=1;i<=num_of_downloads.size();i=i++) {
            driver.findElement(By.xpath("//figure[@class=\"wp-block-table\"]/table/tbody/tr[" + i + "]/td[2]")).click();
            continue;
	}

}
}
