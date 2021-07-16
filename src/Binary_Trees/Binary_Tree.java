package Binary_Trees;


	/*            tree
				  ----
				   RMD  <--------- root
				  /   \  <--------- edge
				The   World  
			    /   \      \
			  dot  live    null <-- leaves  
	*/


class bNode{
	
	int data;
	bNode left;
	bNode right;
	

	public bNode(int item) {
		
		this.data = item;
		
		left = right = null;
	}
	
}

class Binarytree{
	
    bNode root;
    
	Binarytree(int key){
		
		root = new bNode(key);
	}
	
	Binarytree(){
		
		root = null;
  }
		
	
	
}


public class Binary_Tree {

	public static void main(String[] args) {



		Binarytree tree = new Binarytree();
		
		
		tree.root = new bNode(3);
		
		
/* following is the tree after above statement
					 
			        1
			      /   \
			    null  null     */
		
		tree.root.left = new bNode(6);
		
		tree.root.right = new bNode(7);
		
/* 6 and 7 become left and right children of 3
				        3
				     /     \
				   6        7
				 /   \     /  \
				null null null null  */
		
		tree.root.left.left = new bNode(66);
		
					
/* 66 becomes left child of 6
			        3
			    /       \
			   6          7
			 /   \       /  \
			66    null  null  null
			/   \
		  null null                       */
		
		
		tree.root.right.right = new bNode(70);
		
		tree.root.right.left = new bNode(77);
		
		tree.root.right.right.left = new bNode(700);
		
/* 77 becomes right child of 7
		        3
		    /       \
		   6          7
		 /   \       /  \
		66    null  70  77
	   /   \        /
	 null null    700                  */

		
		
	//	tree.print(tree.root.right);
	
		
		
	
		
		
		
		
		
		
	}

}
