package school;
//Q5h
public class Payroll {
	Worker worker = new Worker("James", 15.75);
	public Payroll() {
		
	}
	
	
	/**
	 * 
	 * @param worker
	 */
	public void processPayments(Worker worker) {
		System.out.println("Payment processed for worker " + worker.getName());
	}
	
}
