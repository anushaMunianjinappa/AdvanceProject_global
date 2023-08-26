package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
//		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	    driver.get("https://www.w3schools.com/");
		
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/Image.png"));
		driver.quit();
		 
	}

}
