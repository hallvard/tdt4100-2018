package of2;

public class Book {
	
	String name; 
	int numberOfPages; 
	int pageYouAreReading ; 
	
	public Book(String name, int numberOfPages) {
		//THis er for å peke på objektvariablene som deklareres over. 
		this.name = name; 
		this.numberOfPages = numberOfPages; 
		this.pageYouAreReading = 0; 
	}
	
	public boolean flipToNextPage() {
		//Sjekker at en ikke har lest mer sider enn det som er i boka
		if (this.pageYouAreReading==this.numberOfPages) {
			return false; 
		}
		this.pageYouAreReading++; 
		return true; 
	}
	
	public void flipToPreviousPage() {
		this.pageYouAreReading--; 
	}
	
	public static void main(String[] args) {
		Book harrypotter = new Book("Harry Potter 1", 354);
		System.out.println(harrypotter.pageYouAreReading);
		for (int i=0; i<400; i++) {
			harrypotter.flipToNextPage(); 
			System.out.println(harrypotter.pageYouAreReading); }
		
	}
	
	
}
