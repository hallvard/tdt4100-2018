package of10forberedelse;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PersistentMinesweeper {
	
	public void save(String filename, MinesweeperBoard board) {
		try {
			PrintWriter writer = new PrintWriter(filename);
			
			for(int i=0; i<board.getRows(); i++) {
				
				for (int j=0; j<board.getColumns(); j++) {
					MinesweeperCell cell = board.getCell(i, j); 
					System.out.println(cell);
					if (cell.getValue()=='x') {
						if(cell.isBomb()) {
							System.out.println("Is Bomb");
							writer.print("B");
						}
						else {
							writer.print("X");
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
		}
			catch (FileNotFoundException e) {
				System.out.println("error");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
