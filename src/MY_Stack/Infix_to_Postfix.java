package MY_Stack;

import java.util.Scanner;

import java.util.Stack;

public class Infix_to_Postfix {

	
	
public static int precedence(char ch) {
	
	if(ch == '+' || ch == '-') return 1;
	
	else if(ch == '*' || ch == '/') return 2;
	
	return 0;
}
	
public static String convertTopostfix(String exp) {
	
	Stack<Character> operators = new Stack<>();
	Stack <String> postFix = new Stack<>();
	
	for(int i = 0; i < exp.length(); i++) {
		
		char ch = exp.charAt(i);
		
		if(ch == '(')
			operators.push(ch);
		
		else if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
			postFix.push(ch+"");
		}
		
		else if(ch == ')') {
			
			while(operators.peek() != '(') {
				
				char op = operators.pop();
				
				String f = postFix.pop();
				String s = postFix.pop();
				
				String new_postFix = s + f + op;
				
				postFix.push(new_postFix);
				
			}
			operators.pop();
		}
		
		else if(ch == '+' || ch == '-' || ch =='*' || ch == '/') {
			
			while(operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= operators.peek() ) {
				
				
				char op = operators.pop();
				
				String f = postFix.pop();
				String s = postFix.pop();
				
				String new_fix = s + f + op;
				
				postFix.push(new_fix);
			}
			
			operators.push(ch);
		}
		
		
	}
	
	
	
	while(operators.size() > 0) {
		
		
		char op = operators.pop();
		
		String f = postFix.pop();
		String s = postFix.pop();
		
		String new_fix = s + f + op;
		
		postFix.push(new_fix);
		
	}

	
	return postFix.pop();
}
	

	
	public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
		
		
		int t = 4;
		
		while(t-- > 0) {
			
			
			String inFixExpression = s.next();
		System.out.println("The Infix Expression is: "+inFixExpression);
		
		String result = convertTopostfix(inFixExpression);
		
		
		
		System.out.println("The Postfix Expression is: "+result);
		}
		
		
		
		
		
		
		
		
		
	}

}
