
package com.order.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class provisioningOrderMessage { 
	public accounts accounts;
	public String billingSystem;
	public currentServices currentServices;
	public int dbInstanceId;
	public String dbRoot;
	public String legacyCorp;
	public String messageSource;
	public productOrder productOrder;
	public serviceAddressDetails serviceAddressDetails;
	public String spcDivisionId;
	public String TxRoot;
	public String version;
	public workOrders workOrders;
	@Override
	public String toString() {
		return "provisioningOrderMessage [accounts=" + accounts + ", billingSystem=" + billingSystem
				+ ", currentServices=" + currentServices + ", dbInstanceId=" + dbInstanceId + ", dbRoot=" + dbRoot
				+ ", legacyCorp=" + legacyCorp + ", messageSource=" + messageSource + ", productOrder=" + productOrder
				+ ", serviceAddressDetails=" + serviceAddressDetails + ", spcDivisionId=" + spcDivisionId + ", TxRoot="
				+ TxRoot + ", version=" + version + ", workOrders=" + workOrders + "]";
	}
	
}
