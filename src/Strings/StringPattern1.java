package Strings;

import java.util.Scanner;

public class StringPattern1 {

	public StringPattern1() {
		
	}

	public static void main(String[] args) {
      Scanner sin = new Scanner(System.in);
      while(sin.hasNext()) {
    	  String input = sin.next();
    	  int i;
    	  boolean printrev = false;
    	  boolean printsame = false;
    	  
    	  for(i = 0; i< input.length(); i++) {
    		  if(input.charAt(i)=='t' && i%2!=0) {
    			  printrev = true;
    			  break;
    		  }else if((input.charAt(i)=='t' && i%2==0)) {
    			  printsame = true;
    			  break;
    		  }
    	  }
    	  if(i == input.length()) {
    		  System.out.println("NONE");
    	  }
    	  if(printrev) {
    		  System.out.println(new StringBuilder(input).reverse());
    	  }
    	  if(printsame) {
    		  System.out.println(input);
    	  }
    	  
      }

	}

}
