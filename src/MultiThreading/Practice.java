package MultiThreading;

import java.util.HashMap;
import java.util.Map;



public class Practice {

	public Practice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<String,Integer> a = new HashMap<>();
		a.put("ABC",10);
		a.put(new String("ABC"),20);
		System.out.println(a.get("ABC"));
	}

}

class Thread21 implements Runnable{
	public void run() {
		System.out.println("Run.");
		throw new RuntimeException("Problem");
	}
     
}
