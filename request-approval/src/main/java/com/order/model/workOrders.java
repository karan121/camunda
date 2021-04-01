package com.order.model;

import java.util.Date;

public class workOrders { 
	public Object businessInteractionMemos;
	public businessInteractionPartyRoles businessInteractionPartyRoles;
	public String businessInteractionType;
	public String businessInteractionUsageTypeCode;
	public int id;
	public String orderSourceChannel;
	public double sourceSystemId;
	public String requestTypeCode;
	public Date actualCompletionDateTime;
	public int codAmount;
	public String commentValue;
	public int depositAmount;
	public Date earliestPossibleCompletionDateTime;
	public int sequenceNumber;
	public int serviceAddressId;
	public int sourceSystemJobNumber;
	public int sourcesystemTechId;
	public int totalWorkUnitsScheduledQuantity;
	public workOrderCancels workOrderCancels;
	public String workOrderClassCode;
	public Object workOrderCompletions;
	public Date workOrderCreateDateTime;
	public workOrderDispatch workOrderDispatch;
	public workOrderItems workOrderItems;
	public workOrderSchedule workOrderSchedule;
	public workOrderStatus workOrderStatus;
	public String workOrderTypeCode;
}
