package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	 private static ExtentReports extent;
	    private static ExtentTest test;

	    public static void initReports() {
	        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("reports/extent-report.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    }

	    public static ExtentTest createTest(String testName) {
	        test = extent.createTest(testName);
	        return test;
	    }

	    public static void flushReports() {
	        extent.flush();
	    }
}
