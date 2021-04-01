package com.order.model;

import java.util.Date;

public class accountBillInformation { 
	public int billCycle;
	public int billDay;
	public int billFrequencyCode;
	public String billThirdPartyIndicator;
	public int billToFormatIndicator;
	public String billToName;
	public String billToSalutationCode;
	public int btResponsibleFormatIndicator;
	public String electronicBillFlag;
	public String electronicBillPresentationPaymentIndicator;
	public int id;
	public Date lastStatementDate;
	public Date lastStatementEndDate;
	public Date lastStatementStartDate;
	public String paperlessBill;
	public Date paymentDueDate;
	public int remittanceCount;
	public String restrictCardPaymentFlag;
	public String restrictEFTPaymentFlag;
	public String statementHoldCode;
	public int taxGroup;
}
