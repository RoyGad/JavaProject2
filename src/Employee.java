import java.time.LocalDateTime;

public class Employee extends Candidate{
	
	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public void setHiringDate(LocalDateTime hiringDate) {
		HiringDate = hiringDate;
	}

	private LocalDateTime HiringDate;
	private float Salary;

	public Employee(String name, int age, float salary) {
		super(name, age);
		// TODO Auto-generated constructor stub
		HiringDate = Registration.Registar();
		Salary = salary;
	}
	public Employee()
	{
		super("",0);
		HiringDate = LocalDateTime.now();
	}

	public LocalDateTime getHiringDate() {
		return HiringDate;
	}
	
	public boolean CheckAge()
	{
		return this.getAge()>40;
	}

	/*
	 * public float getSalary() { return Salary; }
	 * 
	 * public void setSalary(float salary) { Salary = salary; }
	 */
}
