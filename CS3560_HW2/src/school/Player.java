package school;
//Q5c
public class Player {
	Team team = new Team();
	private String name;
	private boolean expert;
	
	public Player(String name, boolean expert) {
		super();
		this.name = name;
		this.expert = expert;
	}

	@Override
	public String toString() {
		return "Player [team=" + team + ", name=" + name + ", expert=" + expert + "]";
	}
	
	
	
}
