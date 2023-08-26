package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport {
	public static void main(String[] args) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/AdvanceProject");
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setTheme(Theme.STANDARD);
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform","windows");
		report.setSystemInfo("author", "aarun");
		ExtentTest logger = report.createTest("sample test");
		logger.log(Status.FAIL, "this is failed");
		logger.log(Status.INFO, "this is information");
		logger.log(Status.PASS, "this is passed");
	//	logger.addScreenCaptureFromPath("file:///C:/Section-II/suresh1/reports/selenium.html");
		ExtentTest logger1 = report.createTest("demo test");
		logger1.log(Status.FAIL, "this is failed");
		logger1.log(Status.INFO, "this is information");
		logger1.log(Status.PASS, "this is passed");
		report.flush();
	}

}
