package designPatters;

public class ThreadSafeSingleton {

	public static void main(String[] args) {
		SingletonThreadSafe singThreadsafe = SingletonThreadSafe.getInstance();
		singThreadsafe.SingletonWorkerMethod();
	}

}

class SingletonThreadSafe{
	
	private static SingletonThreadSafe INSTANCE = null;
	
	private SingletonThreadSafe() {
		System.out.println("Singleton created");
	}
	
	public static SingletonThreadSafe getInstance() {
		
		if(INSTANCE == null) {
			synchronized(SingletonThreadSafe.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingletonThreadSafe();
				}
				else {
					return INSTANCE;
				}
			}
		}
		
		return INSTANCE;
	}
	
	public void SingletonWorkerMethod() {
		System.out.println(" inside SIngleton Worker method ");
	}
}
