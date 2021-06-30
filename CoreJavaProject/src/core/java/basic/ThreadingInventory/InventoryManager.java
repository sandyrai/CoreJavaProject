package core.java.basic.ThreadingInventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
	
	List<Product> soldproductlist = new ArrayList<Product>();
	List<Product> purchaseproductlist = new ArrayList<Product>();
	
	public void populateSolProduct() {
		for(int i=0;i<100;i++) {
			Product prod = new Product(i,"tet_product_" +i);
			soldproductlist.add(prod);
			System.out.println("ADDED" +prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
	}
	
	
	public void display() {
		
		for(Product product:soldproductlist) {
			System.out.println("Printings sold product "+product);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
