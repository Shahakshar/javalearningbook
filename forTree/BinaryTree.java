package forTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private treeNode root;
	
	public class treeNode{
		private int data;
		private treeNode left;
		private treeNode right;
		
		public treeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		treeNode first = new treeNode(1);
		treeNode second = new treeNode(2);
		treeNode third = new treeNode(3);
		treeNode fourth = new treeNode(4);
		treeNode fifth = new treeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
//	public void preOrder(treeNode root) {
//		if(root == null) {
//			return;
//		}
//		System.out.print(root.data + "-->");
//		preOrder(root.left);
//		preOrder(root.right);
//
//	}
	
//	public void inOrder(treeNode root) {
//		if(root == null) {
//			return;
//		}
//		inOrder(root.left);
//		System.out.print(root.data + " ");
//		inOrder(root.right);
//	}
	
//	public void postOrder(treeNode root) {
//		if(root == null) {
//			return;
//		}
//		postOrder(root.left);
//		postOrder(root.right);
//		System.out.print(root.data + " ");
//	}
	
	public void preOrder(treeNode root) {
		if(root == null) {
			return;
		}
		System.out.print("this is pre_Order traversal : ");
		Stack<treeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			treeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
	
	public void inOrder(treeNode root) {
		if(root == null) {
			return;
		}
		System.out.print("this is in_Order traversal : ");
		Stack<treeNode> stack = new Stack<>();
		treeNode temp = root;
		while(!stack.isEmpty() || temp != null) {
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;
			}else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		Queue<treeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			treeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
		System.out.println();
//		System.out.print("this is in_order traversal : ");
		bt.inOrder(bt.root);
//		System.out.println();
//		System.out.print("this is post_order traversal : ");
//		bt.postOrder(bt.root);
		System.out.println();
		bt.levelOrder();
	}

}
