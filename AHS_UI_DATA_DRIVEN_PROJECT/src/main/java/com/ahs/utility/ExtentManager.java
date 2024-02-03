package com.ahs.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
/**
 *  ExtentManager class is used for Extent Report
 *  
 */
public class ExtentManager {
	
	public static ExtentHtmlReporter htmlReporter;  //create html file
	public static ExtentReports extent;  //Build the report
	public static ExtentTest test;  //define the test--add log,snapshot
	
	public static void setExtent() {
		//creating object and providing path of report where report will be generate
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport.html");
		
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
				
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "AHS_UI_DATA_DRIVEN_PROJECT");
		extent.setSystemInfo("Tester", "Shikha");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	public static void endReport() {
		extent.flush();
	}
}
