package GenericUtility;

//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ListnerImplementation implements ITestListener{
//	public static ExtentTest logger;
//	public ExtentReports report;
//	@Override
//	public void onStart(ITestContext context) {
//		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/AdvanceProject");
//		reporter.config().setDocumentTitle("sample report");
//		reporter.config().setTheme(Theme.STANDARD);
//		ExtentReports report=new ExtentReports();
//		report.attachReporter(reporter);
//		report.setSystemInfo("platform","windows");
//		report.setSystemInfo("author", "aarun");
//			}
//
//	
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		logger=report.createTest(result.getName());
//
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//logger.log(Status.PASS, "this test case"+result.getName()+"is success")	;
//
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//logger.log(Status.FAIL, "this test case"+result.getName()+"is failed");
////logger.addScreenCaptureFromBase64String("file:///D:/arun/Eclipse_workspace/AdvanceProject/errorShot/ARUNvjfjjv%202023-08-07T11-23-49.247912800.png");
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		System.out.println("on test skipped"+result.getName());		
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	@Override
//	public void onFinish(ITestContext context) {
//	//	System.out.println("on finish"+context.getName());	
//		this.report.flush();
//		
//	}
//	
//
//}
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import jdk.jfr.internal.Logger;

public abstract class ListenerImplementation implements ITestListener {
	public static ExtentTest logger;
	public static ExtentReports report;


	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/AdvanceProject/report.html");
		reporter.config().setDocumentTitle("Sample Report");
		reporter.config().setTheme(Theme.STANDARD);
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform", "windows");
		report.setSystemInfo("author", "anusha");
	}

	public void onTestStart(ITestResult result) {
		//    	Logger.log(Status.FAIL,"This test case"+result.getName()+"is failed");
		//       ScreenShotUtility utility = new ScreenShotUtility();
		logger = report.createTest(result.getName());
	}


	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,"this testcase"+result.getName()+"is success");
	}


	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "This test case '" + result.getName() + "is failed");
		ScreenShotUtility utility = new ScreenShotUtility();
		logger.addScreenCaptureFromPath(utility.takinngScreenShot(result.getName()));
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " + result.getName());
	}


	public void onFinish(ITestContext context) {
		this.report.flush();
	}

	//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	//		// TODO Auto-generated method stub
	//		
	//	}
}

