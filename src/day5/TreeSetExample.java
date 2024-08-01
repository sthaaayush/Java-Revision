package day5;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> num=new TreeSet<Integer>();
		
		num.add(15);
		num.add(30);
		num.add(25);
		num.add(5);
		num.add(40);
		
		for(Integer a: num) {
			System.out.println(a);
		}
	}
}
