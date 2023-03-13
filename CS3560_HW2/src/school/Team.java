package school;
//Q5c
public class Team {
	
	private int code;
	Player player = new Player("player1", false);
	
	/***
	 * no arg constructor
	 */
	public Team() {
		
	}
	
	/***
	 * 
	 * @return code
	 */
	public int getCode() {
		return code;
	}
	
	/***
	 * 
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Team [code=" + code + ", player=" + player + "]";
	}
	
	
 
}
