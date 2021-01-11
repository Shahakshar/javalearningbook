package queue;

import java.util.NoSuchElementException;

public class myQueue1 {
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public myQueue1() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length--;
		
		return result;
		
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		myQueue1 qm = new myQueue1();
		
		qm.enqueue(10);
		qm.enqueue(30);
		qm.enqueue(45);
		qm.enqueue(33);
		qm.print();
		qm.dequeue();
		qm.print();
		qm.dequeue();
		qm.dequeue();
		qm.print();
	}
}