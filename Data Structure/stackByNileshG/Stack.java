package stackByNileshG;

public class Stack {
	private int arr[];
	private int top;

	public Stack(int size) {

		arr = new int[size];
		top = -1;
	}

	public void push(int val) {

		if (isFull())
			throw new RuntimeException("stack is full!!!!!");
		else {
			top++;
			arr[top] = val;
		}

	}

	public void pop() {
		if (isEmpty())
			throw new RuntimeException("stack is Empty!!!!!");
		else
			top--;
	}

	public int peek() {
		if (isEmpty())
			throw new RuntimeException("stack is Empty!!!!!");
		else
			return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}
	public void display() {
		if(isEmpty())
			throw new RuntimeException("stack is empty");
		else {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
