package com.examples.framework.report; 

import com.examples.framework.data.FooterSectionData;
import com.examples.framework.data.HeaderSectionData;
import com.examples.framework.data.ReportBodyData;
import com.examples.framework.exception.EmptyReportException;
import com.examples.framework.exception.UnableToSaveReportException;

public interface ReportGeneratorInterface {
	public void generateReport();
	public HeaderSectionData fetchHeaderSectionData();
	public ReportBodyData fetchReportBodyData() throws EmptyReportException;
	public FooterSectionData fetchFooterSectionData();
	public void writeDataToFile(HeaderSectionData header,ReportBodyData body, FooterSectionData footer ) throws UnableToSaveReportException ;
}