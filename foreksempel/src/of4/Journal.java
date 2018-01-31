package of4;

import java.util.ArrayList;
import java.util.List;

public class Journal {
	
	private String name; 
	private int numberOfArticles ; 
	
	private List<Article> articles = new ArrayList<Article>();
	
	public Journal(String name, int numberOfArticles) {
		this.name = name; 
		this.numberOfArticles = numberOfArticles; 
	}
	
	public List<Article> getArticles(){
		return articles; 
	}
	public void addArticle(Article article) {
		if(this.articles.contains(article)) {
			throw new IllegalArgumentException("Du har allerede artikkelen");
		}
		if (this.numberOfArticles==this.articles.size()) {
			throw new IllegalArgumentException("Fullt i journalen");
		}
		this.articles.add(article);
	}
	public static void main(String[] args) {
		Journal j = new Journal("Java weekly", 2); 
		Article a1 = new Article("Java 9", "H. Trætteberg"); 
		Article a2 = new Article("No comprendo Java", "Gunnar Bovim"); 
		Article a3 = new Article("Java er gøy", "Student i F1"); 
		
		j.addArticle(a1);
		j.addArticle(a2);
		j.addArticle(a3);
	}
}
