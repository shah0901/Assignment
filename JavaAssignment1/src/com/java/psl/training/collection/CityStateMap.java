package com.java.psl.training.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CityStateMap {

	private HashMap<String, String> map;
	public CityStateMap() {
		map = new HashMap<String, String>();
	}
	

	public void read() {
		
		File file = new File("C:\\Users\\SHAHNAWAZ\\OneDrive\\Desktop\\CityStateMapping.txt");
		
		try (Scanner scan = new Scanner(file);) {
			while (scan.hasNext()) {
				String[] s = scan.next().split("->");
				map.put(s[0], s[1]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	public Set<String> getAllCities() {
		Set<String> set = map.keySet();

		return set;
	}

	public Set<String> getAllStates() {
		Set<String> set = new HashSet<String>(), set1;
		set1 = map.keySet();
		for (String string : set1) {
			set.add(map.get(string));
		}
		return set;
	}
	
	public HashMap<String,String> getAll(){
		return map;
	}
	
	public void addnew(String s1, String s2) {
		map.put(s1, s2);
	}
	
	public void deleteAllCitiesOfState(String state) {
		Set<String> set = new HashSet<String>();
		Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> e = iter.next();
			if(e.getValue().equals(state))
				set.add(e.getKey());
		}
		for (String string : set) {
			map.remove(string);
		}
	}
	
}
