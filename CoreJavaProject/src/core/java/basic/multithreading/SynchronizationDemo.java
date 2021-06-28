package core.java.basic.multithreading;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequnce s = new Sequnce();
		
		Worker worker1 = new Worker(s);
		worker1.start();
		
		Worker worker2 = new Worker(s);
		worker2.start();

	}
}

class Worker extends Thread{
	Sequnce sequence=null;
	public Worker(Sequnce sequence) {
		this.sequence=sequence;
		
	}
	
	public void run() {
         for(int i=0;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+ " got value: " +sequence.getNext());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}