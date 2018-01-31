package of4;

public class Article {
	
	private String name, author; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Journal getJournal() {
		return journal;
	}

	public void setJournal(Journal journal) {
		this.journal = journal;
	}

	private Journal journal ;
	
	public Article(String name, String author) {
		this.name = name; 
		this.author = author; 
	}
	public Article(String name, int pages) {
		
	}
	
	
	public Article(String author) {
		this.author = author; 
	}
	
	public String toString() {
		return "Artikkelen " + name + " er skrevet av: " + author; 
	}
	
	public static void main(String[] args) {
		Article a1 = new Article("The functional use of Java", "H. Trætteberg"); 
	}
}
