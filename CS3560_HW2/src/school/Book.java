package school;
//Q5b
public class Book {
	
	private String name;
	private String author;
	
	/***
	 * declaring new course object and instantiating with 100000 as value
	 */
	Course course = new Course(100000);
	
	/***
	 * {@summary: no-arg constructor that updates name and author fields}
	 */
	public Book() {
		super();
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", course=" + course + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
