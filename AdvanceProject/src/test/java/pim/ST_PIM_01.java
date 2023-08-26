package pim;

import org.apache.poi.sl.draw.BitmapImageRenderer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class ST_PIM_01  extends BaseClass{
	@Test
 public void Creating_an_employee_with_valid_details() throws InterruptedException {
	 pimpage.getPimButton().click();
	 pimpage.getAddEmployeeButton().click();
	addemployeepage.getFirstNameTextField().sendKeys("selenium");
	addemployeepage.getLastnameTextField().sendKeys("hebbal");
	addemployeepage.getEmployeeIdTextField().sendKeys("2365");
	addemployeepage.getSaveButton().click();
	pimpage.getAddEmployeeButton().click();
	Thread.sleep(2000);
 }
}
   