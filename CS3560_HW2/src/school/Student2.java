package school;
//Q5a
public class Student2 {
	private String name;
	Transcript transcript = new Transcript("Biology", 88.4);
	
	/**
	 * 
	 * @param name
	 * @param transcript, @param name
	 * fully parameterized constructor
	 */
	public Student2(String name, Transcript transcript) {
		super();
		this.name = name;
	}
	/**
	 * 
	 * @param name
	 * @return name
	 */
	public String getName(String name) {
		return name;
	}
	
	
	/**
	 * 
	 * @param name
	 * updates name value 
	 */
	public void  setName(String name) {
		this.name = name;
	}
	
	/**
	 * @print @param name and @param transcript
	 */
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", transcript=" + transcript + "]";
	}
	
	
	
}
