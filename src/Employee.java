import java.time.LocalDateTime;

public class Employee extends Candidate{
	
	private LocalDateTime HiringDate;

	public Employee(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
		HiringDate = LocalDateTime.now();
	}

	public LocalDateTime getHiringDate() {
		return HiringDate;
	}
}
