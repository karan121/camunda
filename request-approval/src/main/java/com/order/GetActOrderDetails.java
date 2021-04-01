package com.order;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetActOrderDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetActOrderDetails implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "OrderID")
	public String OrderID;
	 }
