package boardgame;

public class Board {
	
	private int rows;
	private int columns;
			//CRIA MATRIZ DE PEÇAS 
	private Piece[][] pieces;
	
			//NÃO NECESSITA DE PEÇA NA INICIALIZAÇÃO, POR ISSO NÃO ESTÁ DENTRO DO CONSTRUTOR
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
	
	
			//MÉTODOS
	public Piece piece (int row, int column) {
		return pieces[row][column];
	}
			//SOBRECARGA
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
			
	
	
	
}
