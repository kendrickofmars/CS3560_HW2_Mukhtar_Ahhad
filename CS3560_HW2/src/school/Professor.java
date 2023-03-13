package school;
//Q5e
public class Professor {
	
	private String field;
	
	
	/**
	 * 
	 * @param field
	 */
	public Professor(String field) {
		this.field = field;
	}
	
	public double calculateSalary(int hours) {
		return hours * 30;
	}
}
