import java.time.LocalDateTime;

public class Registration {
	
	static void Registar(Employee employee)
	{
		employee.setHiringDate(LocalDateTime.now());
	}
	static LocalDateTime Registar()
	{
		return LocalDateTime.now();
	}

}
