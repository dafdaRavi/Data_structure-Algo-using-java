package Linked_List;

//import java.util.Objects;

class Node{
	
	int data;
	Node next;
	
// Getter Setter Method 
	public int getData() {
		return data;
	}
	public void setData(int data) {		
	   this.data = data; 
    }
}


class LinkedList{
	
	Node head;
	
// Insertion method in LinkedList	
public void add(int data) {	

	Node node = new Node();

    node.data = data;

    node.next = null;
    
    if(head == null) {
    	
    	head = node;	
    }
    
    else {
    	
    	Node n = head;
    	
    	while(n.next != null) {
    		
    		n = n.next;
    	}
    	
    	n.next = node;	
    }
    
  }


// This Method For Add node In  First Index
public void addFirst(int data) {
	
	Node node = new Node();
	
	node.data = data;
	node.next = null;
	
	node.next = head;
	
	head = node;
}


// This Method For Add node Any Index in LinkedList
public void insertAt(int index, int data) {
	
	Node node = new Node();
	
	node.data = data;
	node.next = null;
	
	
	if(index == 0) {
		
       addFirst(data);
	}
	else {
		
	Node n = head;
	
	for(int i = 0; i < index-1; i++) {
		
		n = n.next;
	}
	node.next = n.next;
	
	n.next = node;
  }

}


// Delete element in LinkeList
public void deleteAt(int index) {
	
     if(index == 0) {
		
	  	head = head.next;
	   }
    else {
		
		Node n = head;
		Node n1 = null;
		
		
		for(int i = 0; i < index -1; i++){
			
			n = n.next;
		}
		
		n1 = n.next;
		
		n.next = n1.next;
		
		System.out.println("Deleted Element Is: "+n1.data);
		
		//n1 = null;	
	}
	
}


public void print() throws Exception {
	
	
	Node n = head;

	if(n == null) {
	 throw new Exception("List is EMPTY");
	}
	
	while(n.next != null) {
		
	System.out.print(n.data+", ");
		n = n.next;
	}
	System.out.println(n.data+".");  // it for print last element
}


// This Method is get the List is EMPTY
void deleteList() {
	head = null;
}


}

public class My_LinkedList {

	public static void main(String[] args) throws Exception {
		
		
		
		LinkedList ll = new LinkedList();
		
		ll.add(33);
		ll.add(66);
		ll.add(77);
		
		ll.addFirst(44);
		
		ll.insertAt(0, 55);

		ll.deleteAt(2);
	
		ll.print();
		
		
	/*	System.out.println("List Is Deleted");
		ll.deleteList();
	*/
		
		
		
	
		
	}

}
