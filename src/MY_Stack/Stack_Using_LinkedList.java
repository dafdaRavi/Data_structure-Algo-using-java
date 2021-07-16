package MY_Stack;


class Node{
	
	int data;
	Node next;
}

class StackWithLinkedList{
	
	Node Top;
	
public Node push(int x) {
	
	   Node p = new Node();
				
	   p.data = x;
			
	   p.next = Top;
			
	   Top = p;
			
	return Top;	
}


public int isFull() {
	Node f = new Node();
	if(f == null) {
		return 1;
	}else {
		return 0;
	}
	
}


public int pop(){
     
	Node n = Top;
	
//	if(isEmpty(Top)){
  //      System.out.print("Stack Underflow\n");
    //}
	
	Top = Top.next;
	
	int x = n.data;
	
	n = null;
	
	return x;
	
}

// Current time its Not Working Properly
int isEmpty(Node top){
    if (top==null){
        return 1;
    }
    else{
        return 0;
    }
}


public int peek(int pos) {
	Node ptr = Top;
	
	for(int i = 0; (i <pos-1 && ptr != null); i++) {
		
		ptr = ptr.next;	
	}
	if(ptr != null) {
		return ptr.data;
	}
	else {
		return -1;
	}
}


public int StackTop() {
	
	Node t = Top;
	
	return Top.data;
	
}

// Not Work Properly  TRY It
public int stackBottom() {
	
	Node t1 = Top;
	
	while(t1 == Top ) {
		
		t1 = t1.next;
	}
	return t1.data;
}






public void show() {
	
	Node n = Top;
	
	if(n == null) {
		System.out.println("\nStack is Empty ");
	}
	while(n != null) {
		
		System.out.print(n.data+", ");
		n = n.next;    
	}
	System.out.println();
  }
	
}


public class Stack_Using_LinkedList {

	public static void main(String[] args) {
		
		
		
		StackWithLinkedList s = new StackWithLinkedList() ;
		
		
		s.push(66);
		s.push(33);
		s.push(77);
		s.push(666);
		
		int element = s.pop();
		System.out.printf("The Poping %d From Stack. \n",element);
		
		for(int i = 1; i <= 2; i++) {
		System.out.printf("Value at position is: %d.\n",  s.peek(i));
		}
		
		System.out.println("Stack in Top Element "+s.StackTop());
		
		System.out.println("Stack in Bottom Element is: "+s.stackBottom());
		
		s.show();
		
		
		
		

	}

}
