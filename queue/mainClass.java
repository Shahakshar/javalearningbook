package queue;

public class mainClass {

	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>();
//		
//		q.add(12);
//		q.add(24);
//		q.add(34);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());

		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(23);
		mq.enqueue(33);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
	}

}
