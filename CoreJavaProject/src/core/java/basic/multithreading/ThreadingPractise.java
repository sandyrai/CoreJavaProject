package core.java.basic.multithreading;

public class ThreadingPractise {
	
	public static void main(String args[]) {
		
		System.out.println("starting thread 1");
		Task taskruner = new Task("Thread-A");
		taskruner.start();
		System.out.println("starting thread 2");
		//taskruner.start(); illegal thread status
		Task taskruner2 = new Task("Thread-B");
		taskruner2.start();// uncomment and oberserve the output
	}

}

class Task extends Thread{
	
	String name;
	public Task(String name) {
		this.name=name;
	}
	
	public void run() {
		Thread.currentThread().setName(name);
		for(int i=0;i<1000;i++){
			System.out.println("Number: "+i +" - "+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
