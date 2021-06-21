package core.java.basic.array;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer>clist= new ArrayList<Integer>(3);
		
		boolean emalflag=true;
		boolean phoneflag=false;
		
		if(emalflag) {
			clist.add(1);
		}
		else if(emalflag==false) {
			clist.add(2);
		}
		
		if(phoneflag) {
			clist.add(1);
		}
		else if(phoneflag==false) {
			clist.add(2);
		}
		int email=clist.get(0);
		int phone=clist.get(1);
		
		clist.forEach((e) -> {System.out.println(e);});
		
		System.out.println(email);
		System.out.println(phone);
		
	}
	
}
