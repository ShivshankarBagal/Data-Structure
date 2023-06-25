package queue;

public class LinearQueue {
	private int[] arr;
	private int rear,front;
	
	public LinearQueue(int size) {
		arr=new int[size];
		rear=-1;
		front=-1;
		
	}
	
	public boolean isFull() {
		return rear== arr.length-1;
	}
	public boolean isEmpty(){
		return rear== front;
	}
	
	public void enQueue(int data) {
		
		if(isFull())
			throw new RuntimeException("Queue is full!!");
		else {
			rear++;
			arr[rear]=data;
			
		}
	}
	public void deQueue() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty!!");
		else {
			front++;
		}
	}
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty!!");
		else {
			return arr[front +1];
		}
	}

}
