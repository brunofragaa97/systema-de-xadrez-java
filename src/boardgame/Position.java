package boardgame;

public class Position {

	private int row;
	private int column;
	
				//CONSTRUTOR
	public Position(int row, int column){
		this.row = row;
		this.column = column;
	}

				//ENCAPSULAMENTO
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

				//DESCRIÇÃO DA CLASSE
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
