public class Queue {
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		
		if(!isFull()) { 	
		queue[rear] = data;
		rear = (rear + 1) % 5;
		size++;
		}
		else { 
			System.out.println("Queue is Full");
		}		
	}
	public int deQueue() {
		int data = queue[front];
		
		if(!isEmpty()) { 
			
		front = (front + 1) % 5;
		size--;
		}
		else { 
			System.out.println("Queue is empty" );
		}
		return data;
		
	}
	public void display() { 
		System.out.print("Elements: ");
		for(int i=0; i<size; i++) {
			System.out.print(queue[(front+i)% 5] + " ");
		}

	}
	public int getSize() { 
		return size;
	}
		
	public boolean isEmpty() { 
		return getSize() == 0;
	}
	
	public boolean isFull () { 
		return getSize() == 5;
	}
	
	public void reverseQueue() { 
		if(size == 0) {
			return;
	}
		int temp = queue[front];
		deQueue();
		
		reverseQueue();
		
		enQueue(temp);	
}	

}
