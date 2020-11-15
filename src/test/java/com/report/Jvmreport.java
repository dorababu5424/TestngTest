package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {


	
	public static  void generatejvmreport(String jsonFile) {
		// TODO Auto-generated method stub
		
		File reportDirectory = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Testngpr\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(reportDirectory, "Addactin Web Applicaion");
		
		configuration.addClassifications("Os", "Windows 10");
		configuration.addClassifications("Browser", "Google Chrome");
		configuration.addClassifications("Browser Version", "83.2" );
		configuration.addClassifications("sprint", "32");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
		
	}

}
