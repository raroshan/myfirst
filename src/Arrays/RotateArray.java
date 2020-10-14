package Arrays;

public class RotateArray {

	public RotateArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int [] inpArray  = {1,2,3,4,5,6,7,8};
		printArray(inpArray,8);
		rotateArray(inpArray, 8, 3);
		System.out.println("");
		printArray(inpArray,8);

	}
	
	private static void printArray(int[] inpArray, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(inpArray[i]);
			System.out.print(" ");
		}
	}

	private static void rotateArray(int[] arr, int n, int d) {
		int m=0;
		int k=0;
		for(int i=0;i<n;i++) {
			m= i+d;
			int temp = arr[i];
			arr[i] = arr[m];
			arr[m] = temp;
			
		}
		
		
	}

}
