package org.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap extends EmpDet {
	public static void main(String[] args) {
		Map<Integer,EmpDet> m = new HashMap<>();
		EmpDet e = new EmpDet();
		e.setEmpName("Parthi Rajan");
		e.setPhno(9176121746l);
		e.setSal(54287.65f);
		
		EmpDet e1 = new EmpDet();
		e1.setEmpName("Rakesh");
		e1.setPhno(9952019812l);
		e1.setSal(60128.32f);
		
		EmpDet e2 = new EmpDet();
		e2.setEmpName("Sathya Lenin");
		e2.setPhno(909224967l);
		e2.setSal(65237.44f);
		
		m.put(1,e);
		m.put(2, e1);
		m.put(3, e2);
		
		Set<Entry<Integer, EmpDet>> entrySet = m.entrySet();
		for (Entry<Integer, EmpDet> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getEmpName()+"            "+entry.getValue().getPhno()+"            "+entry.getValue().getSal());
			
		}
			
	}

}
