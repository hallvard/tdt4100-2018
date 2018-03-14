package of10forberedelse;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperBoard {
	
	private List<List<MinesweeperCell>> board = new ArrayList<>(); 
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	private int rows, columns; 
	boolean gameOver = false; 
	
	public MinesweeperBoard(int rows, int columns, double bombProp) {
		this.rows = rows; 
		this.columns = columns; 
		
		for (int i=0; i<rows; i++) {
			board.add(new ArrayList<MinesweeperCell>()); 
			for (int j=0; j<columns; j++) {
				MinesweeperCell cell = new MinesweeperCell(); 
				if(Math.random()<bombProp) {
					cell.setBomb();
				}
				
				board.get(i).add(cell);
			}
		}
		
	}
	
	public MinesweeperCell getCell(int row, int column) {
		if(row<0 || column<0 || row>=this.rows || column>=this.columns) {
			throw new MinesweeperBoardException("You are outside of the board, stop cheatin");
		}
		return this.board.get(row).get(column); 
	}
	
	public void openCell(int row, int column) {
		if(this.getCell(row, column).isBomb()) {
			this.gameOver = true; 
			getCell(row, column).openCell(0);
			return ; 
		}
		int adjacentCell = 0; 
		if(row+1<this.rows) {
			adjacentCell += getCell(row+1, column).isBomb() ? 1 : 0;
		}
		if(row-1>=0) {
			adjacentCell += getCell(row-1, column).isBomb() ? 1 : 0;
		}
		if(column-1>=0) {
			adjacentCell += getCell(row, column-1).isBomb() ? 1 : 0;
		}
		if(column+1<this.columns) {
			adjacentCell += getCell(row, column+1).isBomb() ? 1 : 0;
			/*Tilsvarende
			if(getCell(row, column+1).isBomb()) {
				adjacentCell += 1; 
			}*/
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
	public void setFlag(int row, int column) {
		getCell(row, column).setFlag(); 
	}
	
	
	public String toString() {
		String board = ""; 
		for(int i=0; i<this.rows; i++) {
			board +="|"; 
			for (int j=0; j<this.columns; j++) {
				board += getCell(i, j); 
				board +="|"; 
			}
			board += "\n";
		}
		if(this.isGameOver()==0) {
			board += "\n Spillet er over. Du tapte!"; 
		}
		if(this.isGameOver()==2) {
			board += "\n Spillet er over. Du vant!"; 
		}
		return board ; 
	}
	
	public int isGameOver() {
		if(this.gameOver) {
			return 0; 
		}
		for(int i=0; i<this.rows; i++) {
			for(int j=0; j<this.columns; j++) {
				if(getCell(i, j).getValue()=='x' || getCell(i, j).getValue()=='F') {
					if(!getCell(i, j).isBomb()) {
						return 1 ; 
					}
				}
			}
		}
		return 2 ; 
	}
	
	public void getInput(String in) {
		String[] args = in.split(",");
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		if (args.length > 2 && args[2].equalsIgnoreCase("f")) setFlag(row, col);
		else openCell(row, col);
	}
	
	public static void main(String[] args) {
		MinesweeperBoard game = new MinesweeperBoard(10, 10, 0.2); 
		game.openCell(0, 0);
		game.openCell(4,  4);
		game.openCell(3, 3);
		System.out.println(game);
		PersistentMinesweeper save = new PersistentMinesweeper(); 
		save.save("test.txt", game);
	}
	
}
