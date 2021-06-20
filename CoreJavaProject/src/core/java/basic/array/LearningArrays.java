package core.java.basic.array;

import java.util.Arrays;

public class LearningArrays {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int[] values = new int[10]; //initialisation of a integer array size-->10
		
		int count=0;
		for(int i=0;i<values.length;i++) {
		   values[i]=count+1;
		   count++;
		}
		
		//traversing array
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		//traversing  method2
		
		for(int i:values) {
			System.out.println(i);
		}
		
		
		//STRING ARRAY
		
		String [] words = new String[] {"hello","world","there"};
		
		Arrays.stream(words).forEach(word -> System.out.println("\n"+word) );
		
		
	}

}
