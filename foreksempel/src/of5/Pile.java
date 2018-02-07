package of5;

public class Pile {
	
	private int currentPieceCount ; 
	
	public Pile(int currentPieceCount) {
		this.currentPieceCount = currentPieceCount; 
	}
	
	public int getNumber() {
		return currentPieceCount;
	}
	
	public boolean isValidMove(int number) {
		return number<=this.currentPieceCount; 
	}
	public void removePieces(int number) {
		if (!this.isValidMove(number)) {
			throw new IllegalArgumentException("Cannot remove more stones than in pile");
		}
		this.currentPieceCount -= number; 
	}
	
}
