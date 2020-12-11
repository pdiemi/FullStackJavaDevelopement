package com.examples.business.rules;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.examples.business.data.Student;
import com.examples.business.data.StudentData;
import com.examples.framework.data.FooterSectionData;
import com.examples.framework.data.HeaderSectionData;
import com.examples.framework.data.ReportBodyData;
import com.examples.framework.exception.EmptyReportException;
import com.examples.framework.exception.UnableToSaveReportException;
import com.examples.framework.report.ReportGeneratorInterface;

/**
 * Class that geenrates the student report 
 */
public class StudentReportGenerator implements ReportGeneratorInterface {
	/**
	 * Main method that calls the apt initial method to generate the report
	 * after storing the sort option passed via the command-line argument
	 * @param args
	 */
	public static void main(String[] args) {
		/* StudentData studData = new StudentData();
		System.out.println("size ="+studData.reportData.size());
	    for(int i=0;i<studData.reportData.size();i++)
	    {
	    	Student stud = (Student)studData.reportData.get(i);
	    	System.out.println(stud);
	    			
	    }
	    System.out.println("Sorted Record..");
	    studData.sortData(2,"D");
	    for(int i=0;i<studData.reportData.size();i++)
	    {
	    	Student stud = (Student)studData.reportData.get(i);
	    	System.out.println(stud);
	    			
	    }
	    */
		StudentReportGenerator studReport = new StudentReportGenerator();
		studReport.generateReport();
		System.out.println("Student Report generated successfully..");
	}

	/** 
	 * Method that drives the report generation
	 * Handles all application exceptions aptly 
	 */
	public void generateReport() {
		try
		{
		HeaderSectionData header = fetchHeaderSectionData();
		ReportBodyData body = fetchReportBodyData();
		FooterSectionData footer = fetchFooterSectionData();
		writeDataToFile(header, body, footer);
		}
		catch(Exception e)
		{
			System.out.println("generateReport -> exception :"+e);
		}
	}

	/**
	 * Method that creates the header data for the report
	 * @return HeaderSectionData - Header data for the report
	 */
	public HeaderSectionData fetchHeaderSectionData() {
		HeaderSectionData headerData = new HeaderSectionData();
		headerData.title = "R.No\tName\t\tMaths\tPhysics\tChemistry\tCompScience\tTotal";
		return headerData;
	}

	/**
	 * Method that creates the report data
	 * @return ReportBodyData - Report data
	 */
	public ReportBodyData fetchReportBodyData() throws EmptyReportException {
		StudentData studData = new StudentData();
		int sortField = 2;
		String sortOrder ="D";
		studData.sortData(sortField, sortOrder);
		ReportBodyData reportBody = studData;
		return reportBody;
	}

	/**
	 * Method that creates the footer data for the report
	 * @return FooterSectionData - Footer data for the report
	 */
	public FooterSectionData fetchFooterSectionData() {
		FooterSectionData footerData = new FooterSectionData();
		Date today = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		footerData.footerMSG=c.DAY_OF_MONTH +"-"+c.MONTH+"-"+c.YEAR;
		return footerData;
	}
	
	public void writeDataToFile(HeaderSectionData header,ReportBodyData body, FooterSectionData footer) throws UnableToSaveReportException 
	{
		try
		{
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("StudentReport.doc")));
		writer.write(header.title);
		writer.write("\n");
		Student s = null;
		ArrayList list = body.reportData;
		for(int i=0;i<list.size();i++)
		{
			s = (Student)list.get(i);
			writer.write(s.toString()+"\n");
		}
		writer.write(footer.footerMSG);
		writer.close();
		}
		catch(Exception e)
		{
			System.out.println("writeDataToFile -> exception :"+e);
					
		}
	}
}
