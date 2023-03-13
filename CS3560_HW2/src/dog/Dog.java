package dog;
//Q5d 
public class Dog {
	private String breed;
	private String name;
	
	Paw paw1 = new Paw(1);
	Paw paw2 = new Paw(2);
	Paw paw3 = new Paw(3);
	Paw paw4 = new Paw(4);
	
	/**
	 * 
	 */
	public Dog() {
		
	}
	
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return breed
	 */
	public String getBreed() {
		return breed;
	}
	
	/**
	 * 
	 * @param breed
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", name=" + name + ", paw1=" + paw1 + ", paw2=" + paw2 + ", paw3=" + paw3
				+ ", paw4=" + paw4 + "]";
	}
	
	
	
}
