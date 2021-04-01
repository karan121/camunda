package com.order.domain.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderResponse")
public class OrderResponse {
	
	@XmlElement(name = "Order")
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderResponse [order=");
		builder.append(order);
		builder.append("]");
		return builder.toString();
	}
}
