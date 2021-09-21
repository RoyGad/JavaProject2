
public class Model {
	
	private String Name;
	private int Age;
	private double Salary;
	
	public Model(String name, int age, double salary) {
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	

}
