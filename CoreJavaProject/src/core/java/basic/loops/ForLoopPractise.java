package core.java.basic.loops;

public class ForLoopPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="helloworldhowareyou";
		
		for(int i=0;i<name.length();i++) {
			System.out.println("char :"+name.charAt(i));
		}
		System.out.println("Reverse order");
		for(int i=name.length()-1;i>=0;i--) {
			
			System.out.println("char :"+name.charAt(i));
		}
		
		for(int i=0;i<=100;i+=2) {
			System.out.println(i);
		}
		
		

	}

}
