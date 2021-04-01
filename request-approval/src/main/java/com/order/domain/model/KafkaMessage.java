package com.order.domain.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( namespace = "http://localhost:8081/services/v1", name = "KafkaMessage")
public class KafkaMessage {
	
	private String spcdivisions;
	private String billeraccounts;
	private String zipcodes;
	private String soloaccounts;
	private String orderId;
	public String getSpcdivisions() {
		return spcdivisions;
	}
	public void setSpcdivisions(String spcdivisions) {
		this.spcdivisions = spcdivisions;
	}
	public String getBilleraccounts() {
		return billeraccounts;
	}
	public void setBilleraccounts(String billeraccounts) {
		this.billeraccounts = billeraccounts;
	}
	public String getZipcodes() {
		return zipcodes;
	}
	public void setZipcodes(String zipcodes) {
		this.zipcodes = zipcodes;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getSoloaccounts() {
		return soloaccounts;
	}
	public void setSoloaccounts(String soloaccounts) {
		this.soloaccounts = soloaccounts;
	}
	@Override
	public String toString() {
		return "KafkaMessage [spcdivisions=" + spcdivisions + ", billeraccounts=" + billeraccounts + ", zipcodes="
				+ zipcodes + ", soloaccounts=" + soloaccounts + ", orderId=" + orderId + "]";
	}
}
