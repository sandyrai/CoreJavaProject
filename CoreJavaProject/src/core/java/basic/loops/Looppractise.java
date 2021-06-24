package core.java.basic.loops;

public class Looppractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "we have a large inventory of things in our warehouse failing in"
				+ "the category:apperal and the slightly "
				+"more inn demand category:makeup along with the category:furtniture and ..";
		
	    printcategory(str);

	}
	
	
	public static void printcategory(String string) {
	int i=0;
	
	while(true) {
		int found=string.indexOf("category",i);
		if(found==-1) break;
		
		int start =found+9;
		
		int end=string.indexOf(" ",start);
	    System.out.println(string.substring(start,end));
	    i=end+1;
	}
		
		
	}

}
