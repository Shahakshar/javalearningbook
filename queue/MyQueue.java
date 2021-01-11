package queue;

import MyLinkedList.MyLinkedList.Node;

public class MyQueue<E> {

	private Node<E> rear, head;
	
	public void enqueue(E e) {
		
		Node<E> toAdd = new Node(e);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		rear.next = toAdd;
		rear = rear.next;
	}
	
	public E dequeue() {
		
		if(head == null) {
			return null;
		}
		
		Node<E> temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		
		return temp.data;
		
	}
	
}
