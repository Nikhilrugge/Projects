package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Baseclass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.ExtentReport;


public class Listeners extends Baseclass implements ITestListener {
	
		WebDriver driver=null;
		ExtentReports extentReport= ExtentReport.getExtentReport();
		ExtentTest extentTest;
		
	@Override
		public void onTestStart(ITestResult result) {
			extentTest=extentReport.createTest(result.getName());
				
		}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "test passed");
			
	}	
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.fail(result.getThrowable());
		String testName=result.getName();
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String screenshotpath;
		try {
			screenshotpath = takeScreenshot(testName,driver);
			extentTest.addScreenCaptureFromPath(screenshotpath,testName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
    }
	@Override
	public void onFinish(ITestContext Context) {
		extentReport.flush();
	}
}
