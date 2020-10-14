package MultiThreading;
/**
 * 
 */

/**
 * @author 212684099
 *
 */
public class ThreeThreadSequence {

	public static void main(String srgs[]) {

		SharedUtil su = new SharedUtil();

		new Thread(() ->  {
           su.printFirst();
		},"Thread-1").start();

		new Thread(() ->  {
           su.printSec();
		},"Thread-2").start();

		new Thread(() ->  {
           su.printThird();
		},"Thread-3").start();
	}

}

class SharedUtil{

	int value = 0;
	int max = 10;
	boolean first = true;
	boolean sec = false;
	boolean third = false;
	
	public synchronized void printFirst() {
		
		while (value < max) {
			while (!first) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println(Thread.currentThread().getName()+" - "+value++);
			first = false;
			sec = true;
			notifyAll();
		}
	}
	
	public synchronized void printSec() {
		while (value < max) {
			while (!sec) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println(Thread.currentThread().getName()+" - "+value++);
			sec = false;
			third = true;
			notifyAll();
		}
	}
	
	public synchronized void printThird() {
		while (value < max) {
			while (!third) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println(Thread.currentThread().getName()+" - "+value++);
			third = false;
			first = true;
			notifyAll();
		}
	}
	
}
