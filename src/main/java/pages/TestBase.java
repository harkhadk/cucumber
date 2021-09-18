package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
public void takeScreenShot(WebDriver driver) throws IOException {
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	String currentDirectory=System.getProperty("user.dir");
	SimpleDateFormat fromatter =new SimpleDateFormat("MMddyy_HHmmss");
	Date date =new Date ();
	String label =fromatter.format(date);
	FileUtils.copyFile(sourceFile, new File(currentDirectory+ "/screenshot/"+ label + ".png"));
}
}
