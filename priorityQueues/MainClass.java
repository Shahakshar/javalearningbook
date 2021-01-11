package priorityQueues;

import java.util.PriorityQueue;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Stack<Integer> s = new Stack<Integer>();
		pq.add(12);
		pq.add(34);
		pq.add(45);
		pq.add(1);
		pq.add(77);
		
		System.out.println(pq);
//		System.out.println(pq.size());
		for(int i : pq) {
			s.push(i);
		}
		
		int n = s.size();
		
		for(int i=0; i<n; i++) {
			System.out.println(s.pop());
		}
	}

}
