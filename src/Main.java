import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Candidate cand = new Candidate();

		StartUp(cand, emp);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");

//		 String.format("%s is %d years old.", name, age);
		
		  System.out.println(String.
		  format("The Employee name: %s got hired on: %s with a very nice salary of: %s",
		  emp.getName(), emp.getHiringDate().format(formatter), emp.getSalary()));
		  
		  if(emp.CheckAge()) {System.out.println("Old but not obsolete, like it and I want to keep it");}
		 

	}

	static void StartUp(Candidate cand, Employee empl) {
		empl.setSalary(46000);
		empl.setAge(46);
		empl.setName("Roy");
		cand.setName("Elsayed");
		cand.setAge(48);
	}

}
