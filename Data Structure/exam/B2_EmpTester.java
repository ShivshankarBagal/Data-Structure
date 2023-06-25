package exam;

import exam.Employee;
import exam.Node;

public class B2_EmpTester {
	public static Node head;

	public B2_EmpTester() {
		head = null;
	}

	public static void addEmpAtLast(Employee ac) {
		Node newNode = new Node(ac);

		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.getNext() != null) {

				trav = trav.getNext();

			}
			trav.setNext(newNode);

		}

	}

	public static void displayEmp() {

		if (head == null)
			throw new RuntimeException("List is empty");
		else {
			Node trav = head;
			while (trav != null) {
				System.out.println(
						trav.getdata().getEmpId() + " " + trav.getdata().getNmae() + " " + trav.getdata().getSalary());
				trav = trav.getNext();
			}

		}

	}

	public Employee highestSalaryOfEmp() {

		Node trav = head;

		double maxSal = 0;
		Employee emp = null;
		Employee emp1 = null;
		while (trav != null) {
			if (trav.getdata().getSalary() > maxSal) {
				maxSal = trav.getdata().getSalary();
				emp = trav.getdata();
			}
			trav = trav.getNext();
		}

		return emp;
	}

	public void removeEmpById(int id) {

		if (head == null)
			throw new RuntimeException("List is allready empty!!!");
		if (head.getdata().getEmpId() == id) {
			head = head.getNext();
		}

		else {
			Node trav = head;
			Node temp = null;
			while (trav != null) {

				if (trav.getdata().getEmpId() == id) {
					temp.setNext(trav.getNext());
				}
				temp=trav;
				trav=trav.getNext();

			}
		}
	}

	public static void main(String[] args) {
		B2_EmpTester b2 = new B2_EmpTester();

		Employee emp = new Employee(1, "Amit ", 556565);
		Employee emp1 = new Employee(11, "Bhagwat ", 6531);
		Employee emp2 = new Employee(21, "Chaitnya ", 5642);
		Employee emp3 = new Employee(31, "Datta ", 9856);
		Employee emp4 = new Employee(41, "Eishwar ", 9859);
		Employee emp5 = new Employee(51, "Faran ", 944999);

		try {
		addEmpAtLast(emp);
			addEmpAtLast(emp1);
			addEmpAtLast(emp2);
			addEmpAtLast(emp3);
			addEmpAtLast(emp4); 
			addEmpAtLast(emp5);
			displayEmp();
			System.out.println("Highest Salary: " + b2.highestSalaryOfEmp().toString());
			b2.removeEmpById(1);
			displayEmp();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
