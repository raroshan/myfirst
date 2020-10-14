/**
 * 
 */
package SimpleExamples;

/**
 * @author 212684099
 *
 */
public class AbstractClass {
	
	public AbstractClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class A{
	
	public void print() {
		System.out.println(" Print A");
	};
}

class B extends A{
	
	public void view() {
		super.print();
		System.out.println(" print B");
	}
}
