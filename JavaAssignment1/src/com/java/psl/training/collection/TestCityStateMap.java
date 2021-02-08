package com.java.psl.training.collection;

import java.util.HashMap;
import java.util.Set;

public class TestCityStateMap {

	public static void main(String[] args) {
		CityStateMap csm = new CityStateMap();
		csm.read();
		Set<String> setCities = csm.getAllCities();
		int i=1;
		System.out.println("n City");
		System.out.println("------");
		for (String string : setCities) {
			System.out.println((i)+" "+string);
			i++;
		}
		System.out.println("======");
		i=1;
		System.out.println("n State");
		System.out.println("-------");
		Set<String> setStates = csm.getAllStates();
		for (String string : setStates) {
			System.out.println(i+" "+string);
			i++;
		}
		System.out.println("======");
		
		HashMap<String,String> mapAll = csm.getAll();
		System.out.println("City -> State");
		System.out.println("-------------");
		for (String string : mapAll.keySet()) {
			System.out.println(string+" -> "+mapAll.get(string));
		}
		System.out.println("=============");
		
		csm.addnew("Nagpur", "Maharashtra");
		csm.addnew("Nainital", "Uttarakhand");
		System.out.println("\nAdded new Pairs -:");
		mapAll = csm.getAll();
		System.out.println("City -> State");
		System.out.println("-------------");
		for (String string : mapAll.keySet()) {
			System.out.println(string+" -> "+mapAll.get(string));
		}
		System.out.println("=============");
		
		csm.deleteAllCitiesOfState("Uttarakhand");
		
		mapAll = csm.getAll();
		System.out.println("City -> State");
		System.out.println("-------------");
		for (String string : mapAll.keySet()) {
			System.out.println(string+" -> "+mapAll.get(string));
		}
		System.out.println("=============");
		
	}

}
