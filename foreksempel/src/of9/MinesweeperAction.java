package of9;

public class MinesweeperAction {
	private int row, column;
	private boolean isFlag; // If the action is not flagging, it is always opening
	
	public MinesweeperAction(String input) {
		String[] args = input.split(",");
		row = Integer.parseInt(args[0]);
		column = Integer.parseInt(args[1]);
		isFlag = args.length > 2 && args[2].equalsIgnoreCase("f");
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public boolean isFlag() {
		return isFlag;
	}
}
