package GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.AddEmployeePage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.PimPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public PropertyUtility property;
	public LoginPage login;
	public HomePage home;
	public WebDriverUtility utility;
	public PimPage pimpage;
	public AddEmployeePage addemployeepage;


	@BeforeClass
	public void launchingBrowser() 
	{
		property = new PropertyUtility();
		utility = new WebDriverUtility(); 
		if(property.readingDataFromPropertyfile("browser").equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(property.readingDataFromPropertyfile("browser").equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void navigatingtoApplication() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		pimpage = new PimPage(driver);
        addemployeepage = new AddEmployeePage(driver);
        
		driver.get(property.readingDataFromPropertyfile("url"));
		login.loginToApplication(property.readingDataFromPropertyfile("username"), property.readingDataFromPropertyfile("password"));

	}

	@AfterMethod
	public void signOutFromApplication()
	{
		utility.mouseoveringOnElement(driver, home.getadminstrationIcon());
		home.getSignOutButton();
		System.out.println("signed out");
	}
	@AfterClass
	public void closingthebROWSER() {
		driver.quit();

	}

}
