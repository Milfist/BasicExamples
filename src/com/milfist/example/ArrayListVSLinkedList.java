package mik;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
			
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		arrayListTest();
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		
		time_start = System.currentTimeMillis();
		linkedListTest();
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
	
	}
	
	public static void arrayListTest () {
		List<Integer> m = new ArrayList<Integer>();
		
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(0, 0);
		m.add(4);
		m.add(5);
		m.add(6);
		m.add(7, 0);
		m.add(8);
		m.add(9);
		m.add(10);
		m.add(11, 0);
		m.add(12);
		m.add(13);
		m.add(14);
		m.add(15, 0);
		
		
		for (Integer i : m) {
			System.out.println(i);
		}
	}
	
	public static void linkedListTest() {
		List<Integer> p = new LinkedList<Integer>();
		
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(0, 0);
		p.add(4);
		p.add(5);
		p.add(6);
		p.add(7, 0);
		p.add(8);
		p.add(9);
		p.add(10);
		p.add(11, 0);
		p.add(12);
		p.add(13);
		p.add(14);
		p.add(15, 0);

		for (Integer i : p) {
			System.out.println(i);
		}
	}

}
