package com.java.psl.training.inventory;

import java.util.Date;

public class PurchaseOrder {
	int poNumber;
	Date orderDate;
	Date shipDate;
	private boolean shipStatus;
	private OrderItem[] orderitems;

	public void setShipStatus(boolean shipStatus) {
		this.shipStatus = shipStatus;
	}
	
	public boolean isShipped() {
		return shipStatus;
	}

	public double sumItems() {
		double s = 0;
		for (int i = 0;; i++) {
			if (orderitems[i] == null)
				break;
			s += orderitems[i].getTotal();
		}
		return s;
	}

	public void setShipDate(Date date) {
		this.shipDate = date;
	}

	public void create(int poNumber, Date orderDate) {
		this.poNumber = poNumber;
		this.orderDate = orderDate;
	}
	
	public void setOrderItems(OrderItem[] orderitems) {
		this.orderitems = orderitems;
	}
	
	public OrderItem[] getItems() {
		return orderitems;

	}
	public void printItems() {
		for (int i = 0; i < orderitems.length; i++) {
			System.out.println(orderitems[i].stockItem.itemDescription);
		}
	}
}
