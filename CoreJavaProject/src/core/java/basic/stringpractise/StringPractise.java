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
		
		
		
	}

}
