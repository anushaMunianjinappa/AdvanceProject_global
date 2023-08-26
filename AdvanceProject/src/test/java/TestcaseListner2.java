import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(GenericUtility.ListenerImplementation.class)

public class TestcaseListner2 {
	@Test
	public void demoForListner()
	{
		System.out.println("done from testcase");
	}
@Test
	public void demoForListner2()
	{
		System.out.println("done from testcase2");
	}
}
