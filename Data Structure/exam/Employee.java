package exam;

public class Employee {

	private int empId;
	private String nmae;
	private double salary;
	public Employee(int empId, String nmae, double salary) {
		super();
		this.empId = empId;
		this.nmae = nmae;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getNmae() {
		return nmae;
	}
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", nmae=" + nmae + ", salary=" + salary + "]";
	}
	
	
	
}
