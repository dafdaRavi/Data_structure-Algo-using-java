package Binary_Trees;


class TestNode {
	
	int data;
	TestNode left; 
	TestNode right ;
	
	public TestNode(int data) {
		
		this.data = data;
		
		left = null;
		right = null;
	}
	
}

class testbTree{
		
	    TestNode  root;
		
	 // TestNode temp = root;

	// IN_ORDER In Binary Tree
		public void inorder(TestNode temp) {
			
			if(temp == null) return;
			
			inorder(temp.left);
			
			System.out.print(temp.data+", ");
			
			inorder(temp.right);
		}
		
		
	// PRE_ORDER In Binary Tree
		public void preorder(TestNode temp) {
			
			if(temp == null) return;
			
			System.out.print(temp.data+", ");
			
			preorder(temp.left);
			preorder(temp.right);
		}
		
		
	// POST_ORDER in Binary Tree
		public void postorder(TestNode temp) {
			
			if(temp == null) return ;
			
			postorder(temp.left);
			postorder(temp.right);
			
			System.out.print(temp.data+", ");	
		}
		
		
		
		
}


public class Test_Traversal_Binary_Tree {

	public static void main(String[] args) {
		
		
		testbTree bt = new testbTree();
		
     // Binary Tree In Root Element
		bt.root = new TestNode(300);
		
	// Binary Tree In Left Side.......	
		bt.root.left = new TestNode(6);

		bt.root.left.left = new TestNode(60);
		bt.root.left.right = new TestNode(66);		
		
		bt.root.left.left.left = new TestNode(63);
		bt.root.left.left.right = new TestNode(67);
		
	// Binary Tree In Right Side.......	
		bt.root.right = new TestNode(7);
		bt.root.right.right = new TestNode(70);
		
		bt.root.right.right.left = new TestNode(73);
		bt.root.right.right.right = new TestNode(77);
		
		
		
		
		
/* Binary Tree Become Look Like This
		    
		     [ 300 ]
		   /         \
		  6           7
		/   \          \ 
	   60   66          70 
	 /   \            /    \
    63   67          77    73                 

*/				
		
		
		System.out.print("\nBinaryTree preOrder -> ");
		bt.preorder(bt.root);

		System.out.print("\nBinaryTree inOrder -> ");
		bt.inorder(bt.root);
		
		System.out.print("\nBinaryTree postOrder -> ");
		bt.postorder(bt.root);
		
		

// Second Example For Sort and Binary Search Tree	
		
		testbTree bt1 = new testbTree();
		
	 // Binary Tree In Root Element
		bt1.root = new TestNode(9);
				
	// Binary Tree In Left Side.......	
		bt1.root.left = new TestNode(4);

		bt1.root.left.left = new TestNode(2);
		bt1.root.left.right = new TestNode(7);		
				
		bt1.root.left.right.left = new TestNode(5);
		bt1.root.left.right.right = new TestNode(8);
				
	// Binary Tree In Right Side.......	
		bt1.root.right = new TestNode(11);
		bt1.root.right.right = new TestNode(15);
				
		bt1.root.right.right.left = new TestNode(14);
		
		System.out.print("\n\nFor BST inOrder -> ");
		bt1.inorder(bt1.root);
		
		
/* Binary Tree Become Look Like This
			    
			     [ 9 ]
			   /       \
			  4         11
			/   \        \ 
		   2    7         15 
		      /   \       /   
       		 5     8     14                 

*/		
		
		
		
		
		
		
		
		
		
		
	}

}
