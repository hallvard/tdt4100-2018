package of5;
/*
 * Gjennomgått i øvingsforelesning 07.02
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class SimpleBoard {
	
	private int rows, columns;
	
	private List<List<Cell>> board = new ArrayList() ; 
	
	public SimpleBoard(int rows, int columns) {
		this.rows = rows; 
		this.columns = columns; 
		//Lager en ny liste med Cell-objekts med tilfeldige tall {0, 1, 2}
		for(int i=0; i<rows; i++) {
			board.add(new ArrayList<Cell>());
			for (int j=0; j<columns; j++) {
				int cellValue = (int) (Math.random()*3);
				board.get(i).add(new Cell(cellValue));
			}
		}
	}
	//Intern innkapsling
	private Cell getCell(int row, int column) {
		return board.get(row).get(column);
	}
	// Teller antall tomme ruter (value=0) på en gitt rad
	public int countEmpty(int row) {
		int counter = 0; 
		for (int j=0; j<this.columns; j++) {
			if (getCell(row, j).isEmpty()) {
				counter ++; 
			}
		}
		return counter ; 
	}
	
	public String toString() {
		String out = ""; 
		for(int i=0; i<this.rows; i++) {
			for(int j=0; j<this.columns; j++) {
				out += getCell(i, j).getValue(); //Bruker intern innkapsling
			}
			out += "\n"; //linjeskift
		}
		
		
		return out; 
	}
	
	public static void main(String[] args) {
		SimpleBoard brett = new SimpleBoard(10, 10); 
		System.out.println(brett);
		System.out.println(brett.countEmpty(0));
	}
}
