package Binary_Trees;


class BSTNode1{
	
	int data;
	BSTNode1 left;
	BSTNode1 right;
	 
	
	public BSTNode1() {}
	
	public BSTNode1(int data) {
		
		this.data = data;
		
		left = right = null;	
	}
	
}

class OperationBST{
	
	BSTNode1 root;
	
	public void inorder(BSTNode1 temp) {
		
		if(temp == null) return;
		
		inorder(temp.left);
		
		System.out.print(temp.data+", ");
		
		inorder(temp.right);	
	}
	
	
	
// (1) Operation of Insertion
	
	public void insertion1(BSTNode1 root, int key) {
		
		BSTNode1 prev = new BSTNode1();
		
		while(root != null) {
			
			prev = root;
	
		if(key == root.data)  {
			
			System.out.printf("\nYou can't put an element %d in root position..\n",key);
			
			return;
		}
		
		else if(key < root.data) {
			
			root = root.left; 
		}
		else {
			
			root = root.right; 
		   }	
	  }
		
	BSTNode1 add = new BSTNode1(key);
	
	
	if(key < prev.data) {
		
		prev.left = add;
		
	}
	else {
		
		prev.right = add;
	}
		
}
	
	
// (2) Operation of Insertion
      public BSTNode1 insertion2(BSTNode1 root, int key) {
	
	         if(root == null) {
		
		       return (new BSTNode1(key));
		       }
	         
	         if(key <= root.data ) {
	        	 
	        	 root.left = insertion2(root.left, key);
	         }
	         else {
	        	 root.right = insertion2(root.right, key);
	         }
	         
	         return root;
       }
	
      
// (1) Deletion Operation In BST
      
      public BSTNode1 deletion(BSTNode1 root, int value) {
    	  
    	  if(root == null) {
    		  
    		  System.out.println("Root Is Null "+ value);
    		  return root;
    	  }
    	  
    	  if(root.left == null && root.right == null) {
    		  
    		   root = null;
    		   
    		   return null;
    	  }
    	  
    	  
    	  if(value < root.data) {
    		  
    		  root.left= deletion(root.left, value);
    	  }
    	  else if(value > root.data) {
    		  
    		  root.right = deletion(root.right, value);
    	  }
    	  else {
    		  
    		  BSTNode1 ipre;
    		  
    		  ipre = inorderpredecessor(root);
    		  
    		  root.data = ipre.data;
    		  
    		  root.left = deletion(root.left, ipre.data); 
    		  
    		  root.right = deletion(root.right, ipre.data); // vimo :)
    	  }
    	  
    	  return root;
    	    
      }
      
     private BSTNode1 inorderpredecessor(BSTNode1 root) {
    	 
            while(root.left != null) {	 
      	 
	              root = root.left;
           }
      
	       while(root.right != null) {
		
		         root = root.right;
	      }
	
	      return root;
     }


     

// find minimum Element in BST 
	
	public int minFind(BSTNode1 root) {
		
		BSTNode1 find = root;
		
		if(find == null) return 1;
		
		while(find.left != null) {
			
			find = find.left;
		}
		return (find.data);
	}
// find Maximum Element in BST
	public int maxFind(BSTNode1 root) {
		
		BSTNode1 find = root;
		
		if(find == null) return 1;
		
		while(find.right != null) {
			
			find = find.right;
			
		}
		 
		return (find.data);
	}


	

}



public class BST_Operations {

	public static void main(String[] args) {
		

		
		
		OperationBST opp = new OperationBST();
		
		opp.root = new BSTNode1(7);
				
				
		opp.root.left = new BSTNode1(5);
		
		//opp.root.left.right = new BSTNode1(6);
		
		opp.root.right = new BSTNode1(9);
		
		opp.root.right.right = new BSTNode1(10);
		
		
		// insertion Operation
		opp.insertion1(opp.root, 8);
		
		opp.insertion2(opp.root,6);
		
		
		System.out.print("BST Element is -> ");
		opp.inorder(opp.root);
		
		
		System.out.println("\nMin Element in BST is: ("+opp.minFind(opp.root)+")");
		
		System.out.println("Max Element in BST is: ("+opp.maxFind(opp.root)+")");
		
		
		
		
	 // deletion Operation
		opp.deletion(opp.root, 7); 
		
		System.out.printf("|Next Root %d | ",opp.root.data); // Tree Or Root
		
		
		opp.inorder(opp.root);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
