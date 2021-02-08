package com.java.psl.training.inventory.product;

public class Product {
	private int product_ID;
	private String product_Name;
	private String serial_No;

	public int getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getSerial_No() {
		return serial_No;
	}

	public void setSerial_No(String serial_No) {
		this.serial_No = serial_No;
	}

	public Product(int product_ID, String product_Name, String serial_No) {
		super();
		this.product_ID = product_ID;
		this.product_Name = product_Name;
		this.serial_No = serial_No;
	}

}
