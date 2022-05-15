package com.greatlearning.Assignment2.Q2;

public class BSTToSkewedModel {
	
	// Inner class to represent a Node, which is made static so that main() can access it
	static class Node {
		int key;
		Node leftNode;
		Node rightNode;
		
		// Constructor to allocate a new node with given key and NULL left and right pointers
		Node(int key) {
			this.key = key;
			leftNode = null;
			rightNode = null;
		}
	}
	
	public Node node;
    static Node tempNode = null; // To store the current node value during traversal
    static Node headNode = null; // To store the head node value of skewed tree
        
    // InOrder traversal of BST to get the ascending order of the node values
    static void traversal(Node root) {
    	
    	// Base or default condition
    	if(root == null)
    		return;
    	
    	// Recursive call to traverse left nodes
    	traversal(root.leftNode);
    	
    	// Condition to check if the root node of the skewed tree is defined
    	// If not then to define it and set all left nodes of new tree as NULL
        if(headNode == null) {
            headNode = root;
            root.leftNode = null;
            tempNode = root;
        }
        
        else {
            tempNode.rightNode = root;
            root.leftNode = null;
            tempNode = root;
        }
        
        // Recursive call to traverse right nodes
        traversal(root.rightNode);
    }
    
    // Method to traverse and print the new right-skewed tree
    static void traverseSkewed(Node root) {
        if(root == null)
            return;
   
        System.out.print(root.key + " ");
        traverseSkewed(root.rightNode);       
    }

}
