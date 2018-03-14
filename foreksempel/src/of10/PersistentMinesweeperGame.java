package of10;

public interface PersistentMinesweeperGame {
	
	public void save(MinesweeperBoard board, String filename); 
	
	public void load(String filename); 
	
}
