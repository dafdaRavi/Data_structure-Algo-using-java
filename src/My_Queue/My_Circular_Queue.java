package My_Queue;


class circularQueue{
	
	int arr[];
	
	int size;
	
	int rear, front;
	
	
	circularQueue(int size){
		
		this.size = size;
		
		rear = front = 0;
		
		this.arr = new int[this.size];
	}
	
	
public void enQueue(circularQueue q, int data) {
	
	
	 if(isFull(q)) {
		System.out.println("Circular Queue is full...... ");
	return;
	}
	 
	 q.rear = (q.rear + 1) % q.size;
	
	 q.arr[q.rear] = data;
	     
	 System.out.print(data+", ");
 }
	
public boolean isFull(circularQueue q) {
	
	return ((q.rear + 1) % q.size == q.front);
}



public int deQueue(circularQueue c) {
	
	int x = -1;
	
	if(c.rear == c.front) {   // Empty Define Here
		
		System.out.println("\nCircular Queue is Empty......");
	}
	else {
		
		c.front = (front + 1 ) % c.size;
		
		x = c.arr[c.front];
	}
	
	System.out.println("\nDelete Element is "+x+" ");
	
	return x;	
}



public void print() {
	
	for(int Q : arr) {
		System.out.print(Q+", ");
	}
	
}


	
	
}


public class My_Circular_Queue {

	public static void main(String[] args) {
		
		
		circularQueue cQ = new circularQueue(3);
		
		cQ.enQueue(cQ, 10);
		cQ.enQueue(cQ, 3);
		cQ.enQueue(cQ, 66);
		
		
		cQ.deQueue(cQ);
		cQ.deQueue(cQ);
		
		
		cQ.enQueue(cQ, 66);
	
		
		System.out.println(cQ.isFull(cQ));  // its Check The Circular Queue is Full or Not
		
		cQ.print();
		
		
	}

}
