package com.java.psl.training.inventory.product;

public class Electronics extends Product {
	private String dim;
	private double capacity;
	private String brand;
	private int power_Supply_Req;
	private int battery_Backup;

	public Electronics(String dim, double capacity, String brand, int power_Supply_Req, int battery_Backup,
			int product_ID, String product_Name, String serial_No) {
		super(product_ID, product_Name, serial_No);
		this.dim = dim;
		this.capacity = capacity;
		this.brand = brand;
		this.power_Supply_Req = power_Supply_Req;
		this.battery_Backup = battery_Backup;
	}

	public String getDim() {
		return dim;
	}

	public void setDim(String dim) {
		this.dim = dim;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPower_Supply_Req() {
		return power_Supply_Req;
	}

	public void setPower_Supply_Req(int power_Supply_Req) {
		this.power_Supply_Req = power_Supply_Req;
	}

	public int getBattery_Backup() {
		return battery_Backup;
	}

	public void setBattery_Backup(int battery_Backup) {
		this.battery_Backup = battery_Backup;
	}

}
