package trees;

import java.util.Scanner;

public class Tree {
	static Scanner sc = null;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
	}
	static Node createTree() {
		Node root = null;
		System.out.println("enter data");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left data" + data);
		root.left = createTree();
		
		System.out.println("Enter right data" + data);
		root.right = createTree();
		
		return root;
	}
	static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);
	}

	static void postOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");
	}
}
 
class Node{
	Node left, right;
	int data;
	
	public Node(int data) {  
		this.data = data;
	}
}