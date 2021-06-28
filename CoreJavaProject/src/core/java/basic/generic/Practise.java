package core.java.basic.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Container<Integer,String>container1 = new Container(12, "hello");
		//int myvar = cont.getItem1();
		int val=container1.getItem1();
		String val2=container1.getItem2();
		
		System.out.println(val +" <--------------> "+ val2);
		
		Set<String>myset1 = new HashSet<String>();
		myset1.add("first");
		myset1.add("second");
		myset1.add("third");
		
		Set<String>myset2 =new HashSet<String>();
		myset2.add("first");
		myset2.add("fourth");
		myset2.add("third");
		
		Set<String>resultset= union(myset1, myset2);
		
       Iterator<String>itr = resultset.iterator();
       while(itr.hasNext()) {
    	   String var= itr.next();
    	   System.out.println(var);
       }
	}
	
	public static <E> Set<E> union(Set<E> set1,Set<E> set2) {
		
		Set result= new HashSet(set1);
		result.addAll(set2);
		return result;
		
	}

}
