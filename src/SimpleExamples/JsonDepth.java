package SimpleExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JsonDepth {

	public JsonDepth() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			String input = sc.nextLine();

			Stack<Character> symbol = new Stack<Character>();
			List<Integer> counter = new ArrayList<Integer>();

			for(int i =0; i< input.length(); i++) {
				Character char1 = input.charAt(i);
				if(char1 == '{' || char1 == '[') {
					symbol.push(char1);
				}else if(char1 == '}' || char1 == ']') {
					counter.add(symbol.size());
					symbol.pop();
				}
			}
			int max = counter.get(0);
			for(Integer val : counter) {
				if(val > max) {
					max = val;
				}
			}

			System.out.println(max);
			
		}
		
		sc.close();
	}

}
