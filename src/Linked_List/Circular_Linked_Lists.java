package Linked_List;


class cNode {
	
	int data;
	cNode next;
}

class CirclularLinkedList{
	
	cNode head;

    
// Push Operation For Add Node in Circular-Linked-List 	
	public void push(int data) {
	
    	cNode ptr = new cNode();
	
    	cNode temp = head;
	
	ptr.data = data;
	ptr.next = head;
	
	if(head != null) {
		
		while(temp.next != head)
			
			temp = temp.next;
		    temp.next = ptr;
	}
	else {
		
		ptr.next = ptr;
		head = ptr;		
	}
	
}

// Delete Node From Circular-Linked-List
	public void deleteNode(int key) {
		
		cNode deal = new cNode();
		
		cNode ptr = head;
		
		while(ptr.data != key) {
			
			if(head == null ) {
				
				System.out.println("Your Given Node Is Not Found ");
				
				break;
			}
			
			deal = ptr;
			ptr = ptr.next;
		}
		
// if list have a only one node so doing this 		
		if(ptr == head && ptr.next == head) {
			head = null; 	
		}
		
		 // If more than one node, check if
        // it is first node		
		if(ptr == head) {
			
			deal = head;  // for delete value store in deal variable
			
			while(deal.next != head) {
				
				deal = deal.next;
				
				head = ptr.next;
				
				deal.next = head;
				
			}
		}
		else if(ptr.next == head) {
		
			deal.next = head;
			
		}
		else {
		
			deal.next = ptr.next;
		}
		
		
	}
	
	
	
	
	
	
	
    public void printClist() {
    	
	      cNode temp = head;
	
	      if(head != null) {
		
      // This logic is Using For Circular-List		
		 do {          
			
			 System.out.print(+temp.data+", ");
			temp = temp.next;
		 }
		  
		 while(temp != head);
	     }	
	      
	      else {
	    	  
	    	  System.out.println("Your Circular Linked List Is EMPTY...");
	      }
     }
    
}



public class Circular_Linked_Lists {

	public static void main(String[] args) {


		CirclularLinkedList clist =  new CirclularLinkedList();

		clist.push(33);
		clist.push(45);
		clist.push(56);
		clist.push(76);
		
		
		
		clist.deleteNode(33);
	
		
		clist.printClist();
	}

}
