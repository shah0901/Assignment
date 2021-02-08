package com.java.psl.training.inventory.product;

import java.util.Scanner;

public class TesterInventory {

	public static void main(String[] args) {
		Product[] prods = new Product[5];
		Scanner scan = new Scanner(System.in);
		int prod_ID;
		String prod_Name, serial_No;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the type of Product\n1 for Software\n2 for Electronics");
			byte choice = Byte.parseByte(scan.nextLine());
			System.out.println("Enter Product Id");
			prod_ID = Integer.parseInt(scan.nextLine());
			System.out.println("Enter Product Name");
			prod_Name = scan.nextLine();
			System.out.println("Enter Serial No.");
			serial_No = scan.nextLine();
			if (choice == 1) {
				System.out.println("Enter OS");
				String os = scan.nextLine();
				System.out.println("Enter the memory required");
				int mem = Integer.parseInt(scan.nextLine());
				System.out.println("Enter the License Key");
				String l_key = scan.nextLine();
				prods[i] = new Software(os, mem, l_key, prod_ID, prod_Name, serial_No);
			}
			else if(choice==2) {
				System.out.println("Enter the dimensions in L*B*H");
				String dim = scan.nextLine();
				System.out.println("Enter the capacity");
				double cap = Double.parseDouble(scan.nextLine());
				System.out.println("Enter the brand name");
				String brand = scan.nextLine();
				System.out.println("Enter power consumption req.");
				int pcr = Integer.parseInt(scan.nextLine());
				System.out.println("Enter battery backup");
				int bb = Integer.parseInt(scan.nextLine());
				prods[i] = new Electronics(dim, cap, brand, pcr, bb, prod_ID, prod_Name, serial_No);
			}
			else {
				System.out.println("Wrong Choice......Choose from [1,2]");
				i--;
			}
		}
		scan.close();
		System.out.println("------------------------------------------");
		System.out.println("-----------------INVENTORY----------------");
		System.out.println("------------------------------------------");
		for(int i=0;i<5;i++) {
			if(prods[i] instanceof Software) {
				System.out.println("Product Id   : "+prods[i].getProduct_ID());
				System.out.println("Product Name : "+prods[i].getProduct_Name());
				System.out.println("Serial No.   : "+prods[i].getSerial_No());
				System.out.println("OS           : "+((Software)(prods[i])).getOs());
				System.out.println("Memory Req.  : "+((Software)(prods[i])).getMemory_Req());
				System.out.println("License Key  : "+((Software)(prods[i])).getLicense_Key());
			}
			else if(prods[i] instanceof Electronics) {
				System.out.println("Product Id   : "+prods[i].getProduct_ID());
				System.out.println("Product Name : "+prods[i].getProduct_Name());
				System.out.println("Serial No.   : "+prods[i].getSerial_No());
				System.out.println("Dimensions   : "+((Electronics)prods[i]).getDim());
				System.out.println("Capacity     : "+((Electronics)prods[i]).getCapacity());
				System.out.println("Brand        : "+((Electronics)prods[i]).getBrand());
				System.out.println("Power Supply : "+((Electronics)prods[i]).getPower_Supply_Req());
				System.out.println("BatteryBackup: "+((Electronics)prods[i]).getBattery_Backup());
			}
			System.out.println("\n");
		}

	}

}
