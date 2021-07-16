package My_Queue;



class DEQueue{
	
	
	int size;
	
	int arr[];
	
	int rear, front;
	
	DEQueue(int size){
		
		this.size = size;
		
		rear = front = -1;
		
		arr = new int[size];
		
	}
	
	
public void enqueueR(int data) {
		
	if(rear == size -1) {
		System.out.println("Enqueue-R is Full ");
	}
	
	 rear++;
	
     this.arr[this.rear] = data;    
     
     System.out.print(data+", ");
	
	
 }

	
public int dequeueR() {
		
	if(this.rear == this.front) {
		
		System.out.println("DeQueue is Empty ");
	}
	
    int data;
	
	
	data = arr[this.rear];
	
	rear--;
	
	return data;
	
	
	
 }


public void enqueueF(int data) {
	
	if(this.front == size-1) {
		System.out.println("This enqueueF Is Full ");
	}
	data = 0;
	front--;
	arr[this.front] = data;
	
	System.out.print(data+", ");
	
}
	
	
public int dequeueF() {
	
    int data = -1;
	
    if(this.rear == this.front ) {
    	System.out.println("The dequeueF is Empty ");
    }
    
    front++;
    
    data = arr[this.front];
    
	return data;
	
}	
	
	
}




public class Double_Ended_Queue {

	public static void main(String[] args) {

		DEQueue deQ = new DEQueue(6);
	
		deQ.enqueueR(44);
		deQ.enqueueR(77);
		deQ.enqueueR(55);
		
		//deQ.enqueueF(763);
		
		
		
		System.out.println("\nDEQueue From dequeueR: "+deQ.dequeueR()+", "+deQ.dequeueR());
				
		
		System.out.println("DEQueue From dequeueF: " +deQ.dequeueF()+" "+deQ.dequeueF());
	
		
		
	
		

		
	}

}
