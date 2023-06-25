package CircularQueue;

public class CircularQueue {

	private int[] arr;
	private int rear, front;

	public CircularQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;

	}

	public boolean isFull() {
		return (front == -1 && rear == arr.length - 1) || (front == rear && front != -1);
	}

	public boolean isEmpty() {
		return (front == rear && front == -1);

	}

	public void eqQueue(int data) {
		if (isFull())
			throw new RuntimeException("Queue is full!!");
		else {
			rear = (rear + 1) % arr.length;
			arr[rear] = data;

		}
	}

	public void dqEueue() {

		if (isEmpty())
			throw new RuntimeException("Queue is empty!!");
		else {
			front = (front + 1) % arr.length;
			if (front == rear) {
				rear = -1;
				front = -1;

			}

		}

	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("queue is Empty!!");

		int index = (front + 1) % arr.length;

		return arr[index];
	}

}
