package core.java.basic.class_object;

public class Human {

	String name;
	int age;
	int heightInches;
	String eyeColor;
	
	public Human() {
		
	}
	
	public void speak() {
		System.out.println("Hello ,my name is "+name);
		System.out.println("I am "+heightInches+ " inches tall");
		System.out.println("I am"+age+" years old");
		System.out.println("my eye color is "+eyeColor);
		
	}
	
	public void eat() {
		System.out.println("eating ...");
	}
	public void walk() {
		System.out.println("walking ...");
	}
	
}
	

