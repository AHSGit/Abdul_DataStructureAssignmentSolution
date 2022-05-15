package com.greatlearning.Assignment2.Q2;

public class BSTToSkewedApp extends BSTToSkewedModel {
	
	// Driver Code
		public static void main(String[] args) {
			
			// Tree is hard-coded as instructed
			BSTToSkewedModel tree = new BSTToSkewedModel();
			tree.node = new Node(50);
			tree.node.leftNode = new Node(30);
			tree.node.rightNode = new Node(60);
			tree.node.leftNode.leftNode = new Node(10);
			tree.node.rightNode.leftNode= new Node(55);
			
			/* Original Binary Search Tree
			 * 
			 * 			50
			 * 		   /  \
			 *        30   60
			 *       /    /
			 *      10   55 
			 * */
			
			traversal(tree.node);
	        traverseSkewed(headNode);
	        
	        /* Right Skewed Binary Search Tree
	         * 
	         * 		10
	         * 		 \
	         * 		  30
	         * 		   \
	         * 		    50
	         * 			 \
	         * 			  55
	         * 			   \
	         * 				60 
	         * */

		}

}
