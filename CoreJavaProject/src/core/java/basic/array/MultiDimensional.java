package core.java.basic.array;

public class MultiDimensional {
	
	public static void main(String[] args) {
		
		int[][] a= new int[3][2]; //two dimensional array with 3*2 row*column
		
		
		int count=0;
		for(int i=0;i<3;i++) {
			
			for(int j=i;j<2;j++) {
				a[i][j]=count+1;
				count++;
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=i;j<2;j++) {
				
				System.out.println(a[i][j]);
			}
		}
		
		
		
	}

}
