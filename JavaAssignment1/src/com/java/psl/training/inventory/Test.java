package com.java.psl.training.inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

	static Customer[] customers1;
	static PurchaseOrder[] orders1;

	public static void main(String[] args) throws ParseException, InsufficientDataException {

		OrderItem[] orderItems = new OrderItem[3];
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(123, "Jamie");
		customers[1] = new Customer(124, "Bill");
		customers[2] = new Customer(125, "Joe");

		StockItem[] stockItems = new StockItem[5];
		stockItems[0] = new StockItem(101, "Milk", 30);
		stockItems[1] = new StockItem(102, "Chicken", 180);
		stockItems[2] = new StockItem(103, "Egg", 7);
		stockItems[3] = new StockItem(104, "Apple", 250);
		stockItems[4] = new StockItem(105, "Orange", 125);

		PurchaseOrder[] orders = new PurchaseOrder[3];
		orders[0] = new PurchaseOrder();
		orders[0].create(1, new SimpleDateFormat("dd/mm/yyyy").parse("01/01/2021"));
		orders[0].setShipDate(new SimpleDateFormat("dd/mm/yyyy").parse("17/01/2021"));
		orders[1] = new PurchaseOrder();
		orders[1].create(2, new SimpleDateFormat("dd/mm/yyyy").parse("01/12/2020"));
		orders[1].setShipDate(new SimpleDateFormat("dd/mm/yyyy").parse("04/12/2020"));
		orders[2] = new PurchaseOrder();
		orders[2].create(3, new SimpleDateFormat("dd/mm/yyyy").parse("10/11/2020"));
		orders[2].setShipDate(new SimpleDateFormat("dd/mm/yyyy").parse("17/11/2020"));

		orderItems[0] = new OrderItem(stockItems[0], 2);
		orderItems[1] = new OrderItem(stockItems[1], 2);
		orderItems[2] = new OrderItem(stockItems[2], 12);
		orders[0].setOrderItems(new OrderItem[] { orderItems[0], orderItems[1], orderItems[2] });

		orderItems[0] = new OrderItem(stockItems[3], 5);
		orderItems[1] = new OrderItem(stockItems[4], 10);
		orders[1].setOrderItems(new OrderItem[] { orderItems[0], orderItems[1] });

		orderItems[0] = new OrderItem(stockItems[1], 5);
		orderItems[1] = new OrderItem(stockItems[4], 10);
		orders[2].setOrderItems(new OrderItem[] { orderItems[0], orderItems[1] });

		customers[0].setPurchaseOrders(new PurchaseOrder[] { orders[0], orders[1] });
		customers[1].setPurchaseOrders(new PurchaseOrder[] { orders[2] });

		for (int i = 0; i < 3; i++) {
			if (customers[i].getPurchaseOrders() != null) {

				for (int j = 0; j < customers[i].getPurchaseOrders().length; j++) {
					if (new SimpleDateFormat("yyyy-mm-dd").parse("" + LocalDate.now())
							.compareTo(customers[i].getPurchaseOrders()[j].shipDate) == 0) {
						for (int k = 0; k < customers[i].getPurchaseOrders()[j].getItems().length; k++) {
							System.out.println(customers[i].getName() + " "
									+ customers[i].getPurchaseOrders()[j].getItems()[k].stockItem.itemDescription);
						}
						System.out.println();
					}
				}
			}
		}
		orders[0].setShipStatus(true);
		orders[2].setShipStatus(true);
		orders[1].setShipStatus(true);

		double[] totalSales = new double[3];
		System.out.println("Total Sales by:-");
		for (int i = 0; i < 3; i++) {
			if (customers[i].getPurchaseOrders() != null) {
				for (int j = 0; j < customers[i].getPurchaseOrders().length; j++) {
					for (int k = 0; k < customers[i].getPurchaseOrders()[j].getItems().length; k++) {
						totalSales[i] += customers[i].getPurchaseOrders()[j].getItems()[k].getTotal();
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(customers[i].getName() + " = " + totalSales[i]);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("\nInvoice for " + customers[i].getName());
			if (customers[i].getPurchaseOrders() != null) {
				for (int j = 0; j < customers[i].getPurchaseOrders().length; j++) {
					for (int k = 0; k < customers[i].getPurchaseOrders()[j].getItems().length; k++) {
						System.out.println(
								customers[i].getName() + " | " + customers[i].getPurchaseOrders()[j].orderDate + " | "
										+ customers[i].getPurchaseOrders()[j].getItems()[k].stockItem.itemDescription
										+ " | " + customers[i].getPurchaseOrders()[j].getItems()[k].numberOfItems
										+ " | " + customers[i].getPurchaseOrders()[j].getItems()[k].getTotal());
					}
				}
				System.out.println("total " + totalSales[i] + "\n");
			} else {
				System.out.println("total " + totalSales[i]);
			}
		}

// Data read from external file
		StockItem[] stockItems1 = readStockData();
		customers1 = readCustomersData();

		orders1 = new PurchaseOrder[3];
		orders1[0] = new PurchaseOrder();
		orders1[0].create(1, new SimpleDateFormat("dd/mm/yyyy").parse("01/01/2021"));
		orders1[0].setShipDate(new SimpleDateFormat("dd/mm/yyyy").parse("17/01/2021"));
		orders1[1] = new PurchaseOrder();
		orders1[1].create(2, new SimpleDateFormat("dd/mm/yyyy").parse("01/12/2020"));
		orders1[1].setShipDate(new SimpleDateFormat("dd/mm/yyyy").parse("04/12/2020"));
		orders1[2] = new PurchaseOrder();
		orders1[2].create(3, new SimpleDateFormat("dd/mm/yyyy").parse("10/11/2020"));
		orders1[2].setShipDate(new SimpleDateFormat("dd/mm/yyyy").parse("17/11/2020"));

		OrderItem[] orderItems1 = new OrderItem[3];

		orderItems1[0] = new OrderItem(stockItems1[0], 2);
		orderItems1[1] = new OrderItem(stockItems1[1], 2);
		orderItems1[2] = new OrderItem(stockItems1[2], 12);
		orders1[0].setOrderItems(new OrderItem[] { orderItems1[0], orderItems1[1], orderItems1[2] });

		orderItems1[0] = new OrderItem(stockItems1[3], 5);
		orderItems1[1] = new OrderItem(stockItems1[4], 10);
		orders1[1].setOrderItems(new OrderItem[] { orderItems1[0], orderItems1[1] });

		orderItems1[0] = new OrderItem(stockItems1[1], 5);
		orderItems1[1] = new OrderItem(stockItems1[4], 10);
		orders1[2].setOrderItems(new OrderItem[] { orderItems1[0], orderItems1[1] });

		customers1[0].setPurchaseOrders(new PurchaseOrder[] { orders1[0], orders1[1] });
		customers1[1].setPurchaseOrders(new PurchaseOrder[] { orders1[2] });

// Finding Orders Placed by Customers
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Customer ID to see the orders");
		int cid = Integer.parseInt(scan.nextLine());

		PurchaseOrder[] orders2 = findOrderPlacedByCustomer(cid);
		if (orders2 != null) {
			for (int i = 0; i < orders2.length; i++) {
				System.out.println((i + 1) + " order:");
				orders2[i].printItems();
			}
		} else {
			System.out.println("No Customer with that Customer ID or No orders with that customer");
		}
		
// Finding Orders to be Shipped
		
		System.out.println("Enter the OrderDate (dd-mm-yyyy) :");
		String date = scan.nextLine();
		OrderItem[][] orders3 = findOrdersToBeShipped(new SimpleDateFormat("dd-mm-yyyy").parse(date));
		System.out.println("Name | Quantity | Price");
		for (int i = 0; i < orders3.length; i++) {
			if(orders3[i]!=null) {
				System.out.println("Order "+(i+1));
				for(int j=0;j<orders3[i].length;j++) {
					System.out.println(orders3[i][j].stockItem.itemDescription+" | "
							+orders3[i][j].stockItem.getQuantity()+""
							+orders3[i][j].stockItem.getUnit(orders3[i][j].stockItem)+" | "
							+orders3[i][j].stockItem.itemPrice);
				}
			}
		}
		List<PurchaseOrder> orders4 = new ArrayList<PurchaseOrder>();
		Map<Integer,List<PurchaseOrder>> ordersByCustomer = new HashMap<Integer, List<PurchaseOrder>>();
		Map<String, Map<Integer, List<PurchaseOrder>>> ordersAsPerArea = new HashMap<String, Map<Integer,List<PurchaseOrder>>>();
		for(int i=0;i<3;i++) {
			if(customers1[i].getPurchaseOrders()!=null) {
				for(int j=0;j<customers1[i].getPurchaseOrders().length;j++) {
					if(ordersAsPerArea.containsKey(customers1[i].city)) {
						if(ordersAsPerArea.get(customers1[i].city).containsKey(customers1[i].getId())) {
							ordersAsPerArea.get(customers1[i].city).get(customers1[i].getId()).add(customers1[i].getPurchaseOrders()[j]);
						}
						else {
							orders4.add(customers1[i].getPurchaseOrders()[j]);
							ordersAsPerArea.get(customers1[i].city).put(customers1[i].getId(), orders4);
						}
					}
					else {
						orders4.add(customers[i].getPurchaseOrders()[j]);
						ordersByCustomer.put(customers1[i].getId(), orders4);
						ordersAsPerArea.put(customers1[i].city, ordersByCustomer);
					}
				}
			}
			
		}
		
		for(String area:ordersAsPerArea.keySet()) {
			System.out.println("Area is "+area);
			for(int id:ordersAsPerArea.get(area).keySet()) {
				System.out.println("ID is "+id);
				for(PurchaseOrder ord:ordersAsPerArea.get(area).get(id)) {
					System.out.print("Order is ");
					ord.printItems();
					System.out.println("\n");
				}
			}
		}
		
		System.out.println("Size of map: "+ordersAsPerArea.size());
		
	}

	public static StockItem[] readStockData() throws InsufficientDataException {
		File file = new File("C:\\Users\\SHAHNAWAZ\\OneDrive\\Desktop\\stockitem.txt");
		StockItem[] st = new StockItem[5];
		try {
			Scanner scan = new Scanner(file);
			int i = 0;
			while (scan.hasNextLine()) {
				String[] data = scan.nextLine().split(" ");
				st[i] = new StockItem(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));
				st[i].setQuantity(Integer.parseInt(data[3]));
				st[i].validate(st[i]);
				i++;
			}
			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("Stock data File Not Found!!!");
		} catch (InsufficientDataException e) {
			throw new InsufficientDataException("Data Insufficient\\\\nPlease Provide valid data in the file");
		}
		return st;
	}

	public static Customer[] readCustomersData() throws InsufficientDataException {
		File file = new File("C:\\Users\\SHAHNAWAZ\\OneDrive\\Desktop\\Customersinfo.txt");
		Customer[] cust = new Customer[3];
		try {
			Scanner scan = new Scanner(file);
			int i = 0;
			while (scan.hasNextLine()) {
				String[] data = scan.nextLine().split(" ");
				cust[i] = new Customer(Integer.parseInt(data[0]), data[1]);
				cust[i].setPhoneNumbers(data[2], data[3], data[4]);
				cust[i].setPrintingAddress(data[5], data[6], data[7], data[8]);
				cust[i].validate(cust[i]);
				i++;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			throw new InsufficientDataException("Data Insufficient\\\\nPlease Provide valid data in the file");
		} catch (InsufficientDataException e) {
			System.out.println("Data Insufficient\\nPlease Provide valid data in the file");
		}
		return cust;
	}

	public static PurchaseOrder[] findOrderPlacedByCustomer(int customerId) {
		for (int i = 0; i < customers1.length; i++) {
			if (customers1[i].getId() == customerId) {
				return customers1[i].getPurchaseOrders();
			}
		}
		return null;
	}

	public static OrderItem[][] findOrdersToBeShipped(Date date) {
		OrderItem[][] orders = new OrderItem[10][];
		int j=0;
		for (int i = 0; i < orders1.length; i++) {
			if (orders1[i].orderDate.equals(date)) {
				orders[j++] = orders1[i].getItems();
			}
		}

		return orders;
	}

}
