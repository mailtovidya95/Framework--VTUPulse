package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Click_here_to_download {
	public static WebDriver driver;
    public Properties p;

    @SuppressWarnings("deprecation")
    @Parameters({"os" ,"browser"})
	@BeforeClass(groups = {"sanity","regression","master","datadriven"})    
    
    public void openurl(String os,String br)throws Throwable
    {
        FileReader file=new FileReader(".//src//test//resources//config.properties");
        p=new Properties();
        p.load(file);

        switch (br.toLowerCase())
        {
            case "chrome":driver=new ChromeDriver();break;
            case "firefox" :driver=new FirefoxDriver();break;
            case "edge" :driver=new EdgeDriver();break;
            default:System.out.println("invalide browser"); return;
        }


        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://vtupulse.com/");
        driver.get(p.getProperty("url"));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"post-13617\"]/div/figure/table/tbody/tr[1]/td[2]/a/strong")).click();
    }

    public String captureScreen(String tname) throws IOException
    {
        String timeStamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        TakesScreenshot takesScreenshot=(TakesScreenshot)  driver;
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" +tname+ "_" +timeStamp+ ".png";
        File targetFile=new File(targetFilePath);
        sourceFile.renameTo(targetFile);
        return targetFilePath;
    }
    
    @AfterClass
    
    public void close()
    {
    	driver.quit();
    }

}
