package com.java.psl.training.inventory;

public class StockItem {
	int itemNumber;
	String itemDescription;
	double itemPrice;
	private int quantity;
	enum Unit {
		Kg(4),Gallons(20),Numbers(60),Grams(1500);
		private int value;
		private Unit( int value) {
		this.value = value;}
		}
	
	public StockItem(int itemNumber, String itemDescription, double itemPrice) {
		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;

	}
	
	public String getUnit(StockItem s) {
		if(s.itemDescription.equals("Milk"))
			return "Gallons";
		else if(s.itemDescription.equals("Egg"))
			return "Numbers";
		else if(s.itemDescription.equals("Apples")||s.itemDescription.equals("Orange"))
			return "Grams";
		else if(s.itemDescription.equals("Chicken"))
			return "Kg";
		return null;
	}
	
	public void validate(StockItem s) throws InsufficientDataException {
		if((s.itemDescription.equals("Milk") && s.getQuantity()<Unit.Gallons.value)
				|| (s.itemDescription.equals("Egg")&&s.getQuantity()<Unit.Numbers.value)
				|| (s.itemDescription.equals("Apples") && s.getQuantity()<Unit.Grams.value)
				|| (s.itemDescription.equals("Orange") && s.getQuantity()<Unit.Grams.value)
				|| (s.itemDescription.equals("Chicken") && s.getQuantity()<Unit.Kg.value)) {
			throw new InsufficientDataException("Quantity Insufficient");
		}
		else if(s.itemDescription=="" ) {
			throw new InsufficientDataException("Insufficent Stock Data");
		}

	}
}
