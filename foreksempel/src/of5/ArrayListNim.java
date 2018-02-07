package of5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNim {
	
	private List<Pile> piles = new ArrayList<Pile>(); 
	
	public ArrayListNim() {
		this(10);
	}
	
	public ArrayListNim(int pilesize) {
		
		for (int i=0; i<3; i++) {
			piles.add(new Pile(pilesize));
		}
	}
	
	public boolean isValidMove(int number, int targetPile) {
		//Pilene vet selv om et move er gyldig
		if (this.isGameOver() || !this.piles.get(targetPile).isValidMove(number)) {
			return false; 
		}
		return true; 
	}
	//NB: Sjekker ikke at targetPile er gyldig i denne oppgaven
	public void removePieces(int number, int targetPile) {
		if (this.isGameOver()) {
			throw new IllegalStateException("Game is over");
		}
		piles.get(targetPile).removePieces(number);
	}
	
	public int getPileCount(int targetPile) {
		return this.piles.get(targetPile).getNumber();
	}
	
	public String toString() {
		return "Nim [piles=" + piles + "]";
		

	}
	
	
	
	public boolean isGameOver() {
//		Spillet kun over når alle piles er tomme
//		Ny løkke-construct, går gjennom hvert objekt
		for (Pile pile: this.piles) {
			if (pile.getNumber()<=0) {
				return true; 
			}
		}
		return false; 
	}
}
