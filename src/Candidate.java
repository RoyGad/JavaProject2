
public class Candidate {
	
	private String Name;
	private int Age;
	
	public Candidate(String name, int age)
	{
		Name=name;
		Age=age;
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
	
	public String GotInterview()
	{
		return ("Yes and got hired");
	
	}
 
	

}
