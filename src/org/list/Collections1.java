package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections1 {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(20);
		li.add(70);
		li.add(80);
		//size of list
		int size = li.size();
		System.out.println("Size of the list is "+size);
		//list will print in insertion order
		System.out.println("Insertion Order"+li);
		//value
		System.out.println("The given index of value is "+li.get(2));
		//adding values through index
		li.add(2, 90);
		System.out.println("Adding value in second index "+li);
		//to remove the second index value
		li.remove(2);
		System.out.println("Remove second index Value "+li);
		//to get the first index
		int fiin = li.indexOf(20);
		System.out.println("First Index of 20 is "+fiin);
		int lastIndexOf = li.lastIndexOf(20);
		System.out.println("Last Index of 20 is "+lastIndexOf);
		for (int i = 0; i < li.size(); i++) {
			System.out.println("Iterating Values "+li.get(i));
			
		}
		
		List l = new LinkedList();
		l.add(10);
		l.add(100);
		l.add(60);
		l.add(110);
		l.add(120);
		l.addAll(li);
		System.out.println("Add ALL "+l);
		//remove the common terms
		l.removeAll(li);
		System.out.println("Remove ALL "+l);
		//remove the uncommon terms
		l.retainAll(li);
		System.out.println(l);
		
			
		}
		
	}


