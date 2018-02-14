package of6forberedelse;

import java.util.ArrayList;
import java.util.List;

public class MineSweeper {
	
	
	private List<List<MineSweeperCell>> board = new ArrayList(); 
	private int rows, columns; 
	boolean gameOver = false; 
	
	public MineSweeper(int rows, int columns, double bombProp) {
		this.rows = rows; 
		this.columns = columns ; 
		
		for (int i=0; i<rows; i++) {
			board.add(new ArrayList<MineSweeperCell>()); 
			for (int j=0; j<columns; j++) {
				MineSweeperCell cell = new MineSweeperCell();
				if (Math.random()<bombProp) {
					cell.setBomb();
				}
				board.get(i).add(cell); 
				
			}
		}
	}
	
	public MineSweeperCell getCell(int row, int column) {
		return this.board.get(row).get(column); 
	}
	public void openCell(int row, int column) {
		if(getCell(row, column).isBomb()) {
			this.gameOver = true; 
			getCell(row, column).openCell(0);
			return; 
		}
		int adjacentCell = 0; 
		if (row-1>= 0) {
			adjacentCell += getCell(row-1, column).isBomb() ? 1 : 0; 
		}
		if (row+1<this.rows) {
			adjacentCell += getCell(row+1, column).isBomb() ? 1 : 0; 
		}
		if (column-1>= 0) {
			adjacentCell += getCell(row, column-1).isBomb() ? 1 : 0; 
		}
		if (column+1<this.columns) {
			adjacentCell += getCell(row, column+1).isBomb() ? 1 : 0; 
		}
		getCell(row, column).openCell(adjacentCell);
		if (adjacentCell==0) {
			if (row+1<this.rows) {
				if (getCell(row+1, column).getValue()=='x') {
				openCell(row+1, column);}
			}
			if (column-1>= 0) {
				if (getCell(row, column-1).getValue()=='x') {
				openCell(row, column-1);}
			}
			if (row-1>= 0) {
				if (getCell(row-1, column).getValue()=='x') {
				openCell(row-1, column);}
			}
			if (column+1<this.columns) {
				if (getCell(row, column+1).getValue()=='x') {
				openCell(row, column+1);}
			}
		}
		
		
	}
	
	public int isGameOver() {
		if (!gameOver) {
			int cellCount = 0;
			int bombCount = 0;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (board.get(i).get(j).getValue() == 'x') {
						cellCount++;
						if (board.get(i).get(j).isBomb()) {
							bombCount++;
						}
					}
				}
			}
			return cellCount==bombCount ? 2 : 0;
		}
		return 1;
	}
	
	public void getInput(String in) {
		String[] inputs = in.split(",");
		int x = Integer.parseInt(inputs[0]); 
		int y = Integer.parseInt(inputs[1]);
		this.openCell(x,  y);
	}
	
	public String toString() {
		
		String board = "";
		for (int i=0; i<rows; i++) {
			board += "|"; 
			for (int j=0; j<columns; j++) {
				
				board += getCell(i, j); 
				board+="|"; 
			}
			board += "\n";
		}
		if (this.isGameOver()==1) {
			board += "\n \n Spillet er over, du tapte!"; 
		}
		else if(this.isGameOver()==2) {
			board += "\n \n Spillet er over, du vant!"; 
			
		}
		return board; 
	}
	public static void main(String[] args) {
		MineSweeper game = new MineSweeper(10, 10, 0.33);
		System.out.println(game);
		game.openCell(0, 0);
		System.out.println(game);
		game.openCell(4, 4);

		System.out.println(game);
	}
}
