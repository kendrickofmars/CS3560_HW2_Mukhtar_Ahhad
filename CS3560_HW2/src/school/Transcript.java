package school;

public class Transcript {
	private String course;
	private double grade;
	
	/**
	 * 
	 * @param course
	 * @param grade
	 * create a new transcript with the parameters passed in from student class 
	 */
	public Transcript(String course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	/**
	 * @return course
	 */
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
}
