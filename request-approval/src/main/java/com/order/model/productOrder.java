package com.order.model;

import java.util.Date;

public class productOrder { 
	public String billerCreatedBy;
	public String billerLastUpdatedBy;
	public businessInteractionCustom businessInteractionCustom;
	public Object businessInteractionMemos;
	public businessInteractionPartyRoles businessInteractionPartyRoles;
	public String businessInteractionType;
	public String businessInteractionUsageTypeCode;
	public int id;
	public String orderSourceChannel;
	public double sourceSystemId;
	public String requestTypeCode;
	public Date actualCompletionDateTime;
	public int campaignCode;
	public int codAmount;
	public int depositAmount;
	public int prePayAmount;
	public productOrderCancels productOrderCancels;
	public Object productOrderCompletions;
	public Date productOrderCreateDateTime;
	public Object productOrderItems;
	public productOrderReasons productOrderReasons;
	public productOrderStatus productOrderStatus;
	public Date requestedCompletionDate;
	public int salesRepresentativeId;
	public int serviceAddressId;
	public double totalMonthlyAmount;
}
