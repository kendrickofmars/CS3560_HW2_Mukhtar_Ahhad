package school;
//Q5a
public class Transcript {
	private String course;
	private double grade;
	
	/**
	 * 
	 * @param course
	 * @param grade
	 * fully paramaterized constructor
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
	
	/**
	 * 
	 * @param course, update course value
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * 
	 * @return grade
	 */
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	/***
	 * tostring to print out vals of course and grade
	 */
	@Override
	public String toString() {
		return "Transcript [course=" + course + ", grade=" + grade + "]";
	}
	
	
	
}
