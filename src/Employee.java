import java.time.LocalDateTime;

public class Employee extends Candidate{
	
	private LocalDateTime HiringDate;
	private float Salary;

	public Employee(String name, int age, float salary) {
		super(name, age);
		// TODO Auto-generated constructor stub
		HiringDate = LocalDateTime.now();
		setSalary(salary);
	}

	public LocalDateTime getHiringDate() {
		return HiringDate;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
}
