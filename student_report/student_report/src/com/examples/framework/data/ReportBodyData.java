package com.examples.framework.data;

import java.util.ArrayList;

import com.examples.framework.exception.UnableToSaveReportException;

public abstract class ReportBodyData {
	public ArrayList reportData;
	
	/**
	 * Default Constructor
	 */
	public ReportBodyData() {
		reportData = null;
	}
	
	// TODO protected getter/setter methods for reportData
	
	/**
	 * To contain the logic to sort data as per user's choice
	 * @param sortOrder - The order in which the report must be sorted
	 * @return Sorted Data
	 */
	abstract protected void sortData(int sortField, String sortOrder);
	
	/**
	 * To contain the logic to write report data to file
	 * @throws UnableToSaveReportException
	 */
	//abstract protected void writeDataToFile() throws UnableToSaveReportException ;
}
