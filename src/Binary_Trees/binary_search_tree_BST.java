package Binary_Trees;


class BSTNode{
	
	int data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(int data) {
		
		this.data = data;
		left = null;
		right = null;
	}
	
	
	
}


class BST{
	
	BSTNode root;
	
	public void inorder(BSTNode n) {
		
		if(n == null) return ;
		
		inorder(n.left);
		
		System.out.print(n.data+", ");
		
		inorder(n.right);
	}

	
// First Method Of Check BST
	boolean isBST(BSTNode temp) {
		
		if(temp == null) return true ;
		
		if(temp.left != null && temp.left.data > temp.data ) 
			
			return false;
			
		if(temp.right != null && temp.right.data < temp.data)
			
			return false;
		
		if(!isBST(temp.left) || !isBST(temp.right))
			
			return false;
		
		return true;
	}

// Second Method Of Check BST
	boolean isBST1() {
		
		return isBSTref1(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	boolean isBSTref1(BSTNode temp, int min, int max){
		
		if(temp == null) return true;
		
		// temp.data means root Main Node
		if(temp.data < min || temp.data > max) return false;
		
		
		return (isBSTref1(temp.left, min, temp.data -1)
				&& isBSTref1(temp.right, temp.data+1, max) );
	}
	
	
	
// (1) Search Element in BST
	
	int search(BSTNode temp, int key) {
		
		if(temp == null) { 
			
			System.out.print("Data Not Found ");
		return -1;
		}
		
		if(temp.data == key) {
			return key;
		}
		
		if(key < temp.data) {
			
			return search(temp.left, key);
		}else {
			
			return search(temp.right, key);
		}
	}
// (2) Iterative Search in a Binary Search Tree
	
	int IterativeSearch(BSTNode temp, int key) {
		
		while(temp != null) {
			
		if(key == temp.data) {
			
			return key;
		}
		else if(key < temp.data){
			
			temp = temp.left;
		}
		else {
			
			temp = temp.right;
		 }
		
	  }
		
		return 0;
   }
	
	
	
	
}


public class binary_search_tree_BST {

	public static void main(String[] args) {

		BST bst = new BST();
		
		
		bst.root = new BSTNode(6);
		
		bst.root.left = new BSTNode(5);
		
		bst.root.left.left = new BSTNode(3);
		bst.root.left.left.left = new BSTNode(2);
		bst.root.left.left.right = new BSTNode(4);
		
		
		bst.root.right = new BSTNode(8);
		bst.root.right.left = new BSTNode(7);
		bst.root.right.right = new BSTNode(9);
		
		
		
		System.out.print("BST inOrder: ");
		bst.inorder(bst.root);

		
//  1 Method Of Check BST
	 System.out.println("\nCheck Is BST: "+bst.isBST(bst.root)+"...");
		
//  2 Method Of Check BST
		if(bst.isBST1()) {
			System.out.println("IS BEST BST ");		
		}else {
			System.out.println("IS Not BST");
		}
		
		
	System.out.println("Exist In BST, Element Is: "+bst.search(bst.root, 5)+"\n");
	
	
	System.out.println("Iterative BST  : "+bst.IterativeSearch(bst.root, 66));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
