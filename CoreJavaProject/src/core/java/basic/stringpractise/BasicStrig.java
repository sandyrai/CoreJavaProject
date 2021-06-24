package core.java.basic.stringpractise;

public class BasicStrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicComparision();
		Concatenation_1();
		Substring_1();
		ChangeWordCase();
		trim_1();
		start_end_with();
	}
	
	public static void BasicComparision() {
		String a="Ramesh";
		String b="Ramesh";
		String c = new String();
		String d="Sachin";
		if(a.equals(b)) {
			System.out.println("Equls");    //true because both refer to same instance
		}
		
		if(a.equals(c)) {
			System.out.println("Equls"); //not equls because c refer to instance 
		}
		else {
			System.out.println("Not equals");
		}
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(d));
		
	}
	
	public static void Concatenation_1() {
		System.out.println("\n****  string concatention program");
		String firstname ="sandeep";
		String lastname="kumar";
		
		System.out.println(firstname + lastname);
		System.out.println(firstname.concat(lastname));
	}
	
	public static void Substring_1() {
		
		System.out.println("\n**** substring program");
		
		String a="Hello world";
		
		System.out.println(a.substring(5));
		System.out.println(a.substring(0,5));
		System.out.println(a.substring(6));
		
	}
	
	public static void ChangeWordCase() {
		System.out.println("\n**** change to uppercase lowercase program");
		String a = "ramesh";
		String b="SANDEEP";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
				
	}
	
	public static void trim_1() {
		System.out.println("\n**** trim program");
		String s="  sachin  ";
		System.out.println(s);
		System.out.println(s.trim());
	}

	public static void start_end_with() {
		System.out.println("\n**** to check string starting and ending char/substring program");
		String aa="sandeep";
		System.out.println(aa.startsWith("sa"));
		System.out.println(aa.endsWith("eep"));
		System.out.println(aa.startsWith("SA"));
	} 
}
