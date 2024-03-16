package com.mapUsingXML;

import java.util.List;

public class Customer {
	
	private int cId;
	
	private String cName;
	
    private	List<Orders> orders;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Customer(int cId, String cName, List<Orders> orders) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.orders = orders;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
	
	

}
