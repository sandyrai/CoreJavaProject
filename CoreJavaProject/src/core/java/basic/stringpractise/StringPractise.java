package core.java.basic.stringpractise;

public class StringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello     ";
		System.out.println(a.length());
		
		String str="ABCDEFG";
		String extarcted = str.substring(3);
		
		System.out.println(extarcted);
		
		String extr1=str.substring(3,7);
		String extr2=str.substring(0,3);
		
		System.out.println("first part :"+ extr2 +" =====> "+ " second part : " +extr1);
		
		//compare string best pratcise using equals becuse string is aobject
		
		String aa="helloworld";
		String bb="hello";
		
		if(aa.equals(bb)) {
			System.out.println("equals");
		}
		else {
			System.out.println("Not equals");
		}
	
		//character at particulr index value of  string
		 System.out.println(a.charAt(3));  
		
		 String str1="Hello there world";
		 System.out.println(str1.indexOf("Hello"));
		 System.out.println(str1.indexOf("world",13)); //case when index not found 13 ---> means start begin from this index
		 System.out.println(str1.indexOf("world",7));
		 
		 int b =str1.lastIndexOf("there");
		 System.out.println(b);
		 
		 
	}

}
