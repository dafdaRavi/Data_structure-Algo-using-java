package Binary_Trees;

 

public class Traversal_in_Binary_Tree {

	
	static class Node{

		  int data;
		  Node left, right;
		  
		  public Node(int data) {
			  
			  this.data = data;
			  left = null;
			  right = null;
		  }		
	}

	       static Node root;
	       static Node temp = root;
	       
	       static void inOrder(Node temp) {
	    	   
	    	   if(temp == null) return;
	    	   
	    	   inOrder(temp.left);
	    	   
	    	   System.out.print(+temp.data+ " ");
	    	
	    	   inOrder(temp.right); 

	       }

	
	public static void main(String[] args) {


		
		
		root = new Node(33);
		
		root.left = new Node(66);
		root.left.left = new Node(60);
		root.left.left.left = new Node(63);
		
		root.right = new Node(77);
		root.right.right = new Node (70);
		root.right.right.right = new Node (777);
		
	  // System.out.print("Inorder traversal before insertion: \n");
	   
		System.out.print("Binary Tree in INORDER:-> ");
	    inOrder(root);
		
		
		
		
		
	}

}
