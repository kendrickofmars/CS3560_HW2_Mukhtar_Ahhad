package school;
//Q5h
public class Worker {
	private String name;
	private double hourlyRate;
	
	
	/**
	 * 
	 * @param name
	 * @param hourlyRate
	 */
	public Worker(String name, double hourlyRate) {
		
		this.name = name;
		this.hourlyRate = hourlyRate;
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
	 * @return hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * 
	 * @param hourlyRate
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	

}
