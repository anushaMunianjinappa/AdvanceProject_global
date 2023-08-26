package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver,  this);
	}
	@FindBy(name="firstName")
	private WebElement firstNameTextField;
	@FindBy(name = "lastName")
	private WebElement lastnameTextField;
	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}
	@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	private WebElement EmployeeIdTextField;
	@FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	private WebElement saveButton;
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getEmployeeIdTextField() {
		return EmployeeIdTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}

}
