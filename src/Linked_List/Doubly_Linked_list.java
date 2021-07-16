package Linked_List;


class dNode{
	
	int data;
	dNode prev;
	dNode next;

 // Constructor For Node Data
	dNode(int d){
		
		d = data;
	}
	
}


class Dll{
	
	dNode head;
	
    public void push(int data) {
    	
    	dNode node = new dNode(data);
    	
    	node.next = head;
    	node.prev = null;
    	
    	if(head != null) 
    		
    		head.prev = node;
    		
    		head = node;
    	
    	
    }
	
	
    public void print(dNode node) {
    	
    	dNode last = null;
    	
    	System.out.println("Traversal in forward Direction");
    	
        while (node != null) {
        	
            System.out.print(node.data + " ");
            
            last = node;
            
            node = node.next;
        }
        System.out.println();
        
        
        
        System.out.println("Traversal in reverse direction");
        
        while (last != null) {
        	
            System.out.print(last.data + " ");
            
            last = last.prev;
        }
    	
    }
	
    
}


public class Doubly_Linked_list {

	public static void main(String[] args) {


		Dll dll = new Dll();
		
		dll.push(44);
		dll.push(64);
		dll.push(32);
		dll.push(56);
		
		dll.print(dll.head);
		
		
		
	}

}
