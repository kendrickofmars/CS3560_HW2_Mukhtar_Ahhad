package school;

public class Student2 {
	private String name;
	Transcript transcript = new Transcript("Biology", 88.4);
	
	public Student2(String name, Transcript transcript) {
		super();
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void  setName(String name) {
		this.name = name;
	}
}
