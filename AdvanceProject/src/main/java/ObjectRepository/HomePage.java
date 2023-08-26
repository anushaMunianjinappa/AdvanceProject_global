package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    public HomePage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
   @FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
   private WebElement adminstratorIcon;
   
   @FindBy(linkText = "Logout")
   private WebElement SignOutButton;

public WebElement getAdminstratorIcon() {
	return adminstratorIcon;
}

public WebElement getSignOutButton() {
	return SignOutButton;
}
   
   
   
}
  