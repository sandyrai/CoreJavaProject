package core.java.basic.multithreading;

public class Sequnce {

private int value=0;	
  public synchronized int getNext() {
//	synchronized (this) { //thread safety or thread lock no one enter to allowd utill i;m done completing
//		value ++;  
//		return value;
//	}  
	  
	  value ++; 
	  return value;
  }

}
