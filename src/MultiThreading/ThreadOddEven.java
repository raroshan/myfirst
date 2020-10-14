package MultiThreading;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadOddEven {

	public static void main(String[] args) {
    int max = 10;
    System.out.println("Main Thread Start");
    final OddEven oddEven = new OddEven(10);
    Thread evenThread = new Thread(() -> {
    	oddEven.printEven();
    },"EvenThread");
    
    Thread oddThread = new Thread(() -> {
    	oddEven.printOdd();
    },"OddThread");

    evenThread.start();
    oddThread.start();
    
		/*
		 * try { evenThread.join(); oddThread.join(); }catch(InterruptedException ie) {
		 * System.out.println(ie.getMessage()); }
		 */
   
	}

}

class OddEven{
	
	int value = 0;
	int max;
	boolean isEven = true;
	
	OddEven(int max){
		this.max = max;
	}
	
	public void printEven() {
		while(value <= max) {
			synchronized (this) {
				while (!isEven) {
					try {
						wait();
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println(Thread.currentThread().getName() + "-" + value);
				value++;
				isEven = false;
				notifyAll();
			}
		}
		
	}
	public void printOdd() {
		while (value <= max) {
			synchronized (this) {
				while (isEven) {
					try {
						wait();
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println(Thread.currentThread().getName() + "-" + value);
				value++;
				isEven = true;
				notifyAll();
			}
		} 
		
	}
}
