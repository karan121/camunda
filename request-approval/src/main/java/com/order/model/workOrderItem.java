package com.order.model;

import java.util.Date;
import java.util.List;

public class workOrderItem { 
	public Date billerCreatedDate;
	public String businessInteractionItemTypeCode;
	public int id;
	public int productOfferingId;
	public int sourceSystemBillId;
	public double sourceSystemId;
	public int sourceSystemParentServiceId;
	public int sourceSystemServiceId;
	public int accountId;
	public int afterItemQuantity;
	public int beforeItemQuantity;
	public double billedAmount;
	public String impactedLineOfBusinessCode;
	public String itemCompleteFlag;
	public String lineOfBusinessImpact;
	public int monthlyChargeAmount;
	public int numberOfInstallments;
	public String packageBillingProductCode;
	public int sequenceNumber;
	public String serviceBillingProductCode;
	public workOrderItemStatus workOrderItemStatus;
	public double itemReference;
	public String nativeInCode;
	public String portingStatusCode;
	public List<workOrderItemParameters> workOrderItemParameters;
	public String discountCode;
	public Date discountStartDate;
}
