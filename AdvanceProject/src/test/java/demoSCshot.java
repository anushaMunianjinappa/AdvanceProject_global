import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoSCshot {


	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		ScreenShotUtility util=new ScreenShotUtility();
		util.takinngScreenShot(driver, "ANUSHA");
	}
}
