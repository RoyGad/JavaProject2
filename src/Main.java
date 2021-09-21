import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Roy", 42);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		System.out.println(emp.getHiringDate().format(formatter));

	}

}
