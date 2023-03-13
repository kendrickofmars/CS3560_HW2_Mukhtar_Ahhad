package school;
//Q5b
public class Course {
	private int code;
	/**
	 * {@value}
	 * creating new book instance w/ default constructor
	 */
	Book book = new Book();
	
	
	/**
	 * 
	 * @param code
	 * fully parameterized
	 */
	public Course(int code) {
		super();
		this.code = code;
	}

	/***
	 * @print @param code & @param book
	 */
	@Override
	public String toString() {
		return "Course [code=" + code + ", book=" + book + "]";
	}
	
	
}
