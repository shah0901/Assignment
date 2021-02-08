package com.java.psl.training.inventory.product;

public class Software extends Product {
	private String os;
	private double memory_Req;
	private String license_Key;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getMemory_Req() {
		return memory_Req;
	}

	public void setMemory_Req(double memory_Req) {
		this.memory_Req = memory_Req;
	}

	public String getLicense_Key() {
		return license_Key;
	}

	public void setLicense_Key(String license_Key) {
		this.license_Key = license_Key;
	}

	public Software(String os, double memory_Req, String license_Key, int product_ID, String product_Name,
			String serial_No) {
		super(product_ID, product_Name, serial_No);
		this.os = os;
		this.memory_Req = memory_Req;
		this.license_Key = license_Key;
	}

}
