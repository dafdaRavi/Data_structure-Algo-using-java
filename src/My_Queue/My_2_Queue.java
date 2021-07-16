package My_Queue;

class Queue{
	
	int capacity;
	
	int front, rear, size;
	
	int arr[];
	
	
	public Queue(int capacity) {
		
		this.capacity = capacity;
		
		front = this.size = 0;
		
		rear = capacity -1;
		
		arr = new int[this.capacity];
	}
	
	
	public void enqueue(int item) {
		
		
		if(isFull(this)) 
			return;
		
	   this.rear = (this.rear + 1) % this.capacity;	
		
	   this.arr[this.rear] = item;
	
	   this.size = this.size + 1;
			
	//  System.out.print(item+", ");   // This Also Print Element
		
	}
	
	
	public int dequeue() {
		
		if(isEmpty(this)) {
			System.out.println("The Queue is Empty.");
			return Integer.MIN_VALUE;
		} 
		
		else {
			
		int item = this.arr[this.front];
		
		this.front = (this.front + 1) % this.capacity;
		
		 this.size = this.size - 1;	
		 
		 return item;
		 
		}
		
	}
	
// The Full And Empty Data For Method
	boolean isFull(Queue q) { 
		
		 return (q.size == q.capacity);
	}
	boolean isEmpty(Queue q){
		
		return (q.size == 0);
	}

	
// The Method For Check Element In Front And Rear
	int rear() {

		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.arr[rear];
	}
	int front() {

		if(isEmpty(this))
		return Integer.MIN_VALUE;
		
		int x = this.arr[this.front];
		
		return x;
	}
	
	
	public void print() {
		
		System.out.print("Queue Elements: ");
		
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(arr[front+i]+", ");
			
			
		}
		
		
		
	}
	
	
	
	
	
		
}


public class My_2_Queue {

	public static void main(String[] args) {

		
		
		Queue q = new Queue(9);
		
		q.enqueue(23);
		q.enqueue(83);
		q.enqueue(57);
		q.enqueue(99);
		
		
		
	  
		
	//	System.out.println("dequeue Element is: "+q.dequeue());
		
		
        System.out.println("Element Show from Front: "+q.front());
		
		System.out.println("Element Show from Rear: "+q.rear());
		
		System.out.println("dequeue Element is: "+q.dequeue());
		  
		  
		  q.enqueue(99);
		  
		  
		  
		q.print();
		
		
		
		
	}

}
