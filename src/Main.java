import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Roy", 42, 46000);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		//String.format("%s is %d years old.", name, age);
		
		System.out.println(String.format("The Employee name: %s got hired on: %s with a salary of: %s", 
				emp.getName(), 
				emp.getHiringDate().format(formatter), 
				emp.getSalary()));
	}

}
