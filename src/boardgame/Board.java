package boardgame;

public class Board {
	
	private int rows;
	private int columns;
			//CRIA MATRIZ DE PE�AS 
	private Piece[][] pieces;
	
			//N�O NECESSITA DE PE�A NA INICIALIZA��O, POR ISSO N�O EST� DENTRO DO CONSTRUTOR
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

			//ENCAPSULAMENTO
	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
			//M�TODOS
	public Piece piece (int row, int column) {
		return pieces[row][column];
	}
			//SOBRECARGA
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
			
	
	
	
}
