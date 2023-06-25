package expression;

import java.util.Stack;

public class ExpressionMain {

	public static int pri(char operator) {
		switch (operator) {
		case '$':
			return 5;
		case '*':
			return 4;
		case '/':
			return 4;
		case '+':
			return 3;
		case '-':
			return 3;
		case '%':
			return 4;

		}
		return 0;
	}

	public static String infixToPostfix(String exp) {

		Stack<Character> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		// 1. traverse infix exp from left to right
		for (int i = 0; i < exp.length(); i++) {
			char sym = exp.charAt(i);
			// 2.if operand is found,append to postfix
			if (Character.isDigit(sym))
				sb.append(sym);
			else if (sym == '(') // 4.if opening ( is found,then push it on stack
				s.push(sym);
			else if (sym == ')') // 5.id ) is found
			// pop all operators from stack one by one and append to postfix
			// until opening ( is found
			{
				while (s.peek() != '(') {
					sb.append(s.pop());

				}
				s.pop();
			} else { // 3. if "operator" found push it on stack
						// if priority of topmost operator from stack >= priority of current operator

				while (!s.isEmpty() && pri(s.peek()) >= pri(sym)) {
					// pop operator from stack and append to postfix

					sb.append(s.pop());
				}
				s.push(sym);

			}

		}
		while (!s.isEmpty()) {
			sb.append(s.pop());
		}
		return sb.toString();
	}

	public static String infixToPrefix(String exp) {

		Stack<Character> s = new Stack<>();
		StringBuilder pre = new StringBuilder();
		// 1. traverse infix exp from left to right
		for (int i = exp.length()-1;i>=0; i--) {
			char sym = exp.charAt(i);
			// 2.if operand is found,append to postfix
			if (Character.isDigit(sym))
				pre.append(sym);
			else if (sym == ')') // 4.if opening ( is found,then push it on stack
				s.push(sym);
			else if (sym == '(') // 5.id ) is found
			// pop all operators from stack one by one and append to postfix
			// until opening ( is found
			{
				while (s.peek() != ')') {
					pre.append(s.pop());

				}
				s.pop();
			} else { // 3. if "operator" found push it on stack
						// if priority of topmost operator from stack >= priority of current operator

				while (!s.isEmpty() && pri(s.peek()) >= pri(sym)) {
					// pop operator from stack and append to postfix

					pre.append(s.pop());
				}
				s.push(sym);

			}

		}
		while (!s.isEmpty()) {
			pre.append(s.pop());
		}
		return (pre.reverse()).toString();
	}

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = "";
		String prefix = "";
		postfix = infixToPostfix(infix);
		prefix=infixToPrefix(infix);
		System.out.println("postfix: "+postfix);
		System.out.println("prefix: "+prefix);

	}

}
