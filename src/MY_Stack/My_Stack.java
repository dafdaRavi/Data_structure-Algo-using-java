
package MY_Stack;

//import java.util.Stack;


class myStack {
	
	int capacity = 2;
	int stack[] = new int[capacity];  
	int top = 0;

public void push(int data) {
	
	if(size() == capacity) 
		expand();
		
	    stack[top] = data;
		top++;
	
   }


//this method for outhoMatic increment size of stack Dynamic
private void expand() {
	
	int length = size();
	
	int newstack[] = new int[capacity * 2];
	
	System.arraycopy(stack, 0, newstack, 0, length);
	
	stack = newstack;
	
	capacity *= 2;
	
}


public int pop() {
	
	int data = 0;
	
	if(isEmpty()) {
		System.out.println("Stack is Empty");
	}
	else {
			top--;
			
			data = stack[top];
			
			stack[top] = 0;
			
			shrink();
			
	}
	return data;	
	 
  }

// this method for reduce the garbage size of stack Dynamic
private void shrink() {
	
	int length = size();
	
	if(length <= (capacity / 2) /2) {
		
		capacity = capacity / 2;
	}
	
	int newstack[] = new int[capacity];
	
	System.arraycopy(stack, 0, newstack, 0, length);
	
	stack = newstack;
}

public boolean isEmpty() {
	return top <= 0;
}




public int peek() {
	
	int data;
	
	data = stack[top-1];
	
	return data;
}

public int size() {
	return top;
}


public void show() {
	
	for(int e : stack) {
		
		System.out.print(e+" ");
	}
	System.out.println();
}


public int stackTop() {
	return stack[top-1];
}
public int stackBottom() {
	return stack[0];
}














}


public class My_Stack {

	public static void main(String[] args) {


		myStack stack = new myStack();

		stack.push(33);
		stack.push(66);
	
		stack.push(77);
		stack.push(54);
	
		stack.push(76);
		
		stack.show();
		
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		
		System.out.println(stack.pop()); 
	
		
	    stack.show();
		
	//	stack.show();
		
	//	System.out.println("Push Data is: "+stack.pop());
		
		
		System.out.println("Peek in Stack: "+stack.peek()+" ");
		
		
		System.out.println("the stack size is: "+stack.size());
		
		
		
		System.out.println("Stack Top Most Value Is: "+stack.stackTop());
		System.out.println("Stack Bottom Most Value Is: "+stack.stackBottom());
		
	//	System.out.println("Check Stack: "+stack.isEmpty());
		
	//	stack.show(); 
		
		
	
	}

}
