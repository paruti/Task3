package org.list;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedList extends EmpDet {
	public static void main(String[] args) {
		List<EmpDet> li = new ArrayList();
		EmpDet  e = new EmpDet();
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
		
		li.add(e);
		li.add(e1);
		li.add(e2);
		
		for (EmpDet x : li) {
			System.out.println(x.getEmpName()+"               "+x.getPhno()+"               "+x.getSal());
		}
		
		
	}

}
