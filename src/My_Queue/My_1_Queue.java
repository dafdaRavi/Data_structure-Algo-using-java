package My_Queue;

import java.util.Scanner;

class Queue2{
	
	int size;
	int rear; 
    int	front;
	int arr[];
	
	
public Queue2(int size) {  // Using Constructor
			
	this.size = size;
	
	rear = front = -1; 
	
	arr = new int[this.size];
}

	
public void enqueue(Queue2 q, int data) {
	
	if(isFull(this)) {
		System.out.println("Queue Is Full ");
	return;
	}
	
	else {
	q.rear++;
	
	q.arr[q.rear] = data;
	
	}
	
	System.out.print(data+", ");
}



public int dequeue() {
	
	int data = -1;
	
	if(isEmpty(this)) {
		System.out.println("Queue Is Empty ");
	}
	else {
		
		front++;
		
		data = arr[front];
	}
	
	return data;
}



// This Method For Queue Is Empty and Full
public boolean isFull(Queue2 q) {
	
	return (q.rear == q.size -1);
}
public boolean isEmpty(Queue2 q) {
	
	return (q.rear == q.front);
}





	
}

public class My_1_Queue {

	public static void main(String[] args) {


         Queue2 q = new Queue2(3);

         
         Scanner scan = new Scanner(System.in);
         
//         int x ;
//         
//         int t = 6;
//         
//         while(t-- > 0) {
//        	  x = scan.nextInt();
//        	  q.enqueue(q, x);
//         }
         
         q.enqueue(q, 33);
         q.enqueue(q, 66);
         q.enqueue(q, 77);
         q.enqueue(q, 88);
         
         
		System.out.println("\nDeQueue Element Is: "+q.dequeue());
		
	//	System.out.println(q);
			
		

	}

}
