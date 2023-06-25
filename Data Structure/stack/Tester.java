package stack;



public class Tester {
	public static void main(String[] args) {

		Stack s1 = new Stack(4);
		try {
			s1.push(12);
			s1.push(24);
			s1.push(36);
		
		

			System.out.println(s1.pop());
			System.out.println(s1.pop());
			System.out.println(s1.pop());
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
