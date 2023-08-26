package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Employee List")
	private WebElement EmployeeListButton;
	@FindBy(linkText = "Add Employee")
	private WebElement AddEmployeeButton;	
	@FindBy(xpath = "//a[@class=\"oxd-main-menu-item active\"]")
	private WebElement pimButton;
	public WebElement getEmployeeListButton() {
		return EmployeeListButton;
	}
	public WebElement getAddEmployeeButton() {
		return AddEmployeeButton;
	}
	public WebElement getPimButton() {
		return pimButton;
	}	

}
