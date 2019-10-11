package org.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection3 {
public static void main(String[] args) {
	Map<String,Integer> m = new HashMap();
	m.put("roadways", 150);
	m.put("railways", 120);
	m.put("airways", 600);
	m.put("seaways", 50);
	
	Set<String> key = m.keySet();
	System.out.println("To print the key "+key);
	Collection<Integer> values = m.values();
	System.out.println("To prin the Value "+values);
	Set<Entry<String,Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		System.out.println("To print both key and value "+entry);
		System.out.println("print key "+entry.getKey());
		System.out.println("print value "+entry.getValue());

	
	
		
	}
	
}
}
