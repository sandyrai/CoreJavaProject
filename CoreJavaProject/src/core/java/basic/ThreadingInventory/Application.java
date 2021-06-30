package core.java.basic.ThreadingInventory;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManager inv = new InventoryManager();
		
		Thread inventorytask = new Thread(new Runnable() {
			
			@Override
			public void run() {

               inv.populateSolProduct();
				
			}
		});
		
		
		InventoryManager inv1 = new InventoryManager();
		
		Thread inventorytask1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

               inv1.display();
				
			}
		});
		
		inventorytask.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inventorytask1.start();

	}

}
