package day5;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> animal=new HashMap<Integer, String>();
		
		animal.put(1, "Cow");
		animal.put(2, "Dog");
		animal.put(3, "Hen");
		animal.put(4, "Tiger");
		animal.put(5, "Rihno");
		
		System.out.println("Original Map:");
		printMap(animal);
		
		System.out.println("Set of keys"+ animal.keySet());
		System.out.println("Set of keyValue pairs"+ animal.entrySet());
		System.out.println("Set of values"+ animal.values());
		
	}
	
	public static void printMap(HashMap<Integer, String> objMap) {
		for(Map.Entry<Integer, String> maps: objMap.entrySet()) {
			System.out.println(maps.getKey() + " => " +maps.getValue());
		}
	}
}
