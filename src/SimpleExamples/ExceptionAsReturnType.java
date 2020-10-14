package SimpleExamples;

public class ExceptionAsReturnType {

	public static void main(String args[]) {
		System.out.println(print(1));
		System.out.println(print(0));
	}
	
	private static Exception print(int i) {
		if(i>0) {
			return new Exception();
		}
		else {
			return new RuntimeException();
		}
	}
}
