package core.java.basic.method_Instance;

public class LearningMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsomeJunk("hello thr , whts you doing");
		printIntjunk(10);
	}
	
	public static void printsomeJunk(String argument) {
		System.out.println("print some junk blaah blaah .."+argument);
	}
	
	public static int printIntjunk(int arguments) {
		System.out.println("int :"+arguments);
		
		return 0;
		
	}
	
	public static void sum(int a ,int b) {
		int c=a+b;
		System.out.println("sum = "+c);
	}

}
