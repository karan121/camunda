package com.order.domain.model;

public class ActivateServiceResponse {
	
	private String status;
	private String messagees;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessagees() {
		return messagees;
	}
	public void setMessagees(String messagees) {
		this.messagees = messagees;
	}
	@Override
	public String toString() {
		return "ActivateServiceResponse [status=" + status + ", messagees=" + messagees + "]";
	}
}
