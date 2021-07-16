package MY_Stack;

import java.util.Scanner;
import java.util.Stack;



class parentheis{
	
	public boolean isParenthesis(String ptr){
		
		Stack<Character> sc = new Stack<>();
		
		for(int i = 0; i < ptr.length(); i++) {
		
		char ch = ptr.charAt(i); 
		
		  if(sc.isEmpty()) {
				return false;		
			}
		
		  if(ch == '(' || ch == '{' || ch == '['){
			  
		    sc.push(ch);
		      
            continue;
		}

		  char check;
		  
		switch(ch) {
		
		case')':
			check = sc.pop();
		    if(ch == '[' || ch == '{')
			return false;
			
		
		break;
		case '}':
			check = sc.pop();
			if(ch == '[' || ch == '(')
				return false;
			
		break;
		
		case']':
			check = sc.pop();
			if(ch == '{' || ch == '(')
				return  false;
			
		     break;
		}

		}	
		
		 return (sc.isEmpty());
		  
    } 

	
	
}



public class Parenthesis_Checking_Using_Stack {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int t = 5;
		
		while(t-- > 0) {
			
			String st = sc.next();
			
			if(new parentheis().isParenthesis(st) == true ) {
				System.out.println("It's Balanced ");
			}
			else {
				System.out.println("It's Not Balanced ");
			}
			
		}
		
		
		
		
		
		
		

	}

}
