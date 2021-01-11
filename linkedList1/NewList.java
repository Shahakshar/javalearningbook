package linkedList1;

public class NewList {
	private static ListNode head;
	private static class ListNode {
		private int data;// generic type
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void Display() {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current .next;
		}
		System.out.println("null");
	}
	
	public int Length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		
		while(current != null) {
			count = count + 1;
			current = current .next;
		}
		return count;
	}
	
	public void FirstNode(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void EndNode(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public ListNode DeleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public ListNode DeleteLast() {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public boolean SearchElement(int key) {
		ListNode current = head;
		while(current != null) {
			if(current.data == key) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public ListNode reverseList(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		NewList sll = new NewList();
		sll.head = new ListNode(12);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(6);
		
		sll.head.next = second;// 12-->10
		second.next = third;//12-->10-->8
		third.next = fourth;//12-->10-->8-->6
		fourth.next = null;//12-->10-->8-->6-->null
		
		sll.Display();
		System.out.println("length is :" + sll.Length());
		
		sll.reverseList(head);
		sll.Display();
		
		sll.FirstNode(34);
		sll.Display();
		System.out.println("length is :" + sll.Length());
		
		sll.EndNode(23);
		sll.Display();
		System.out.println("length is :" + sll.Length());
				
		sll.DeleteFirst();
		sll.DeleteFirst();		
		sll.Display();
		System.out.println("length is :" + sll.Length());
		
		sll.DeleteLast();
		sll.Display();
		System.out.println("length is :" + sll.Length());
		
		System.out.println(sll.SearchElement(6));
		System.out.println(sll.SearchElement(11));
	}
}

