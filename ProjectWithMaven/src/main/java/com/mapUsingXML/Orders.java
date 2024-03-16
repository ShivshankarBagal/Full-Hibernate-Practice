package com.mapUsingXML;

public class Orders {
	
	private int orderId;
	
	private String orderName;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Orders(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
