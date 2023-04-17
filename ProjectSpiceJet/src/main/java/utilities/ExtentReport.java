package utilities;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//Code Related to linking of extent and html file
public class ExtentReport {

	public static ExtentReports getExtentReport() {
	
		String extentReportPath=System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("Spicejet Automation Report");
		reporter.config().setDocumentTitle("Spicejet Automation Testing");
		
		ExtentReports extentReport=new ExtentReports();
		extentReport.attachReporter(reporter);
		return extentReport;
	
	}

	
}
