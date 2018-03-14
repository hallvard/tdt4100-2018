package of10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PersistentMinesweeper implements PersistentMinesweeperGame{

	@Override
	public void save(MinesweeperBoard board, String filename)  {
		
		try {
			PrintWriter writer = new PrintWriter(filename);
			
			for (int i=0; i<board.getRows(); i++) {
				
				for (int j=0; j<board.getColumns(); j++) {
					MinesweeperCell cell = board.getCell(i, j); 
					if(cell.getValue()=='x') {
						if(cell.isBomb()) {
							writer.print("B");
						}
						else {
							writer.print("x");
						}
					}
					else {
						writer.print(cell.getValue());
					}
				}
				writer.println();
			}
			writer.flush();
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void load(String filename) {
		// TODO Auto-generated method stub
		
	}

}
