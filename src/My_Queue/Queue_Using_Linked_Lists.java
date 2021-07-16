package My_Queue;


class QNode{
	
	int data;
	QNode next;
	
	QNode(int data){
		
		this.data = data;
		this.next = null;	
	}
}

class Queuell{
	
	QNode rear, front;
	
	Queuell(){
		this.rear = this.front = null;
	}
	
public void enqueue(int data) {
	
	QNode x = new QNode(data);
	
	if(this.rear == null) {  // if Not Element is Exist in top 
		
		this.rear = this.front = x;
	}
	
	this.rear.next = x;
	this.rear =  x;
}
	
	
boolean isEmpty() {
	return this.front == null;
}


public void dequeue() {
	
	if(isEmpty()) {
		System.out.println("Queue With Linked List is Empty ");
	}

	QNode x = this.front;
	
	this.front = front.next;
	
	if(this.front == null) {
	   
		this.rear = null;
	}
	
}


public void print() {
	
	QNode x = front;
	
	while(x != null) {
		
		System.out.print(x.data+", ");
          x = x.next;		
	 }
	
  }
	
	
}





public class Queue_Using_Linked_Lists {

	public static void main(String[] args) {
		
		
		Queuell q = new Queuell();
		
		q.enqueue(44);
		q.enqueue(66);
		q.enqueue(55);
		q.enqueue(99);
		
	    q.dequeue();
	    
		System.out.println("Queue Front : " + q.front.data);
	    System.out.println("Queue Rear : " + q.rear.data);
	    
		q.print();

	}

}
