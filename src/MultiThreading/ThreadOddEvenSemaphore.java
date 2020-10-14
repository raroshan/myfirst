package MultiThreading;
import java.util.concurrent.Semaphore;

/**
 * 
 */

/**
 * @author 212684099
 *
 */
public class ThreadOddEvenSemaphore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OddEvenSemaphore oddEvenSem = new OddEvenSemaphore();

		new Thread(() ->  {
			oddEvenSem.printOdd();
		},"Odd Thread").start();

		new Thread(() ->  {
			oddEvenSem.printEven();
		},"Even Thread").start();

	}

}

class OddEvenSemaphore{
	
	int value = 0;
	int max = 10;
	Semaphore evenSemaphore = new Semaphore(1);
	Semaphore oddSemaphore = new Semaphore(0);
	
	public void printOdd() {
		while(value < max) {
			try {
				oddSemaphore.acquire();
				System.out.println(Thread.currentThread().getName()+" - "+value++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			evenSemaphore.release();
		}
	}
	public void printEven() {
		while(value < max) {
			try {
				evenSemaphore.acquire();
				System.out.println(Thread.currentThread().getName()+" - "+value++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			oddSemaphore.release();
		}
	}
}
