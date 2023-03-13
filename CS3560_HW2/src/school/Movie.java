package school;
//Q5g
public class Movie {
	private String name;
	private String genre;
	
	/**
	 * 
	 * @param name
	 * @param genre
	 */
	public Movie(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
