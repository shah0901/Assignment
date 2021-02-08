package com.java.psl.training.inventory;

public class OrderItem {
	StockItem stockItem;
	int numberOfItems;

	public OrderItem(StockItem stockItem, int numberOfItems) {
		super();
		this.stockItem = stockItem;
		this.numberOfItems = numberOfItems;
	}

	public double getTotal() {
		return stockItem.itemPrice * numberOfItems;
	}
}
