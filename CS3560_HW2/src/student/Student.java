package student;



public class Student {

    private String name, major;
    private double gpa;

    public Student() {

    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;

    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;

    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getMajor() {
        return major;
    }

   
    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", major=" + major + ", gpa=" + gpa + "]";
    }

    /**
     * 
     * @param student
     * @return true if major and name are the same, else false
     */

    public boolean equals(Student student) {
    	boolean isEqual;
        if(this.getName().equals(student.getName()) && this.getMajor().equals(student.getMajor())) {
            isEqual = true;
        }
        else {
            isEqual = false;
            
        }
        return isEqual;
    }
}