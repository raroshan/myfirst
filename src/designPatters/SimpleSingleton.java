package designPatters;
/**
 * 
 */

/**
 * @author 212684099
 *
 */
public class SimpleSingleton {

	/**
	 * 
	 */
	public SimpleSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		
		Singleton singt1 = Singleton.getSingletonInstance();
		singt1.singletonMethod();
		Singleton singt2 = Singleton.getSingletonInstance();
		singt2.singletonMethod();
	}
}

class Singleton{
	
	private Singleton(){
		System.out.println("Singleton created");
	}
	
	private static Singleton inst = null;
	public static Singleton getSingletonInstance() {
		if(inst == null) {
			inst = new Singleton();
		}
		return inst;
	}
	
	public void singletonMethod() {
		System.out.println(" iNside Singleton method");
	}
}
