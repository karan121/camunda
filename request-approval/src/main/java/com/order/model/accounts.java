package com.order.model;

import java.util.Date;
import java.util.List;

public class accounts { 
	public accountAddresses accountAddresses;
	public accountAuth accountAuth;
	public accountBalances accountBalances;
	public accountBillInformation accountBillInformation;
	public Date accountCloseDate;
	public Date accountConnectDate;
	public Date accountCreateDate;
	public accountCustom accountCustom;
	public Date accountLastUpdatedDate;
	public String accountLastUpdatedUser;
	public List<accountLineOfBusiness> accountLineOfBusiness;
	public Object accountMemos;
	public String accountName;
	public double accountNumber;
	public Date accountOpenDate;
	public String accountPaymentHistory;
	public String accountPurposeSubTypeCode;
	public Object accountRelated;
	public accountStatuses accountStatuses;
	public String accountTypeCode;
	public String disconnectReasonCode;
	public int dunningGroupCode;
	public int id;
	public double lastPaymentAmount;
	public Date lastPaymentDate;
	public partyAccounts partyAccounts;
	public boolean subaccountIndicator;
	public double ucan;
}
