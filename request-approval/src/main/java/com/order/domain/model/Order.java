package com.order.domain.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Order")
public class Order {
	@XmlElement(name = "OrderID")
	private Long orderId;
	
	@XmlElement(name = "OrderState")
	private String orderState;
	
	@XmlElement(name = "OrderType")
	private String orderType;
	
	@XmlElement(name = "TaskName")
	private String taskName;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderId=");
		builder.append(orderId);
		builder.append(", orderState=");
		builder.append(orderState);
		builder.append(", orderType=");
		builder.append(orderType);
		builder.append(", taskName=");
		builder.append(taskName);
		builder.append("]");
		return builder.toString();
	}
}
