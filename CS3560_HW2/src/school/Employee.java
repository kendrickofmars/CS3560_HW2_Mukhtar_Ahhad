package school;
//Q5e
public class Employee {
	private String name;
	private int hours;
	Professor employee1 = new Professor("Computer Science");
	/**
	 * 
	 * @param name
	 * @param hours
	 */
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	/**
	 * 
	 * @return hours*20
	 */
	public double calculateSalary() {
		return (hours*20);
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ",Salary= " + employee1.calculateSalary(hours) + "]";
	}
	
	
	
	
}
