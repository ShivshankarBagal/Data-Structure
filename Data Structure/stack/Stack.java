package stack;

class Stack {

	private int size;
	private int[] arr;
	private int top;

	public Stack() {

		size = 7;
		arr = new int[size];

		top = -1;

	}

	public Stack(int s) {
		size=s;
		arr = new int[s];
		

		top = -1;

	}

	public void push(int val) throws Exception {

		if (!isFull())
			arr[++top] = val;
		else {
			throw new Exception("Overflowwwww");
		}

	}

	public int pop() throws Exception {

		if (!isEmpty())
			return arr[top--];
		else {
			throw new Exception("underflowwww");
		}
	}

	public boolean isFull() {

		return (top == size-1);
	}

	public boolean isEmpty() {

		return (top == -1);

	}

}
