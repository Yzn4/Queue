
public class Queue_Task3 {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(2);
		q.enQueue(4);
		q.enQueue(6);
		q.enQueue(8);
			
		System.out.println("Size: "+ q.getSize());	
		
		System.out.println("Before:");
		q.display();
			
		System.out.println("\nAfter:");
		q.reverseQueue();
		q.display();

	}

}
