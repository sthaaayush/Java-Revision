package day5;

import java.util.LinkedHashSet;

public class LinkedHashSetExample{
	public static void main(String[] args) {
		LinkedHashSet<Character> chars=new LinkedHashSet<>();
		
		chars.add('A');
		chars.add('C');
		chars.add('B');
		chars.add('E');
		chars.add('D');
		
		for(Character a: chars) {
			System.out.println(a);
		}
	}
}