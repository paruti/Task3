package org.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections2 {
	public static void main(String[] args) {
		Set li = new HashSet();//Hash set random order
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(20);
		li.add(70);
		li.add(80);
		System.out.println(li);
		
		Set s = new TreeSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		System.out.println(s);
		Set l = new LinkedHashSet();
		l.addAll(li);
		l.add(20);
		l.add(100);
		l.add(110);
		l.add(120);
		l.add(90);
		System.out.println(l);
		for (Object x : l) {
			System.out.println("Iterate Value "+x);
				}
		l.remove(90);
		System.out.println(l);
		l.retainAll(li);
		System.out.println(l);
		l.removeAll(li);
		System.out.println("Remove All "+l);
		
	}
	}
	
