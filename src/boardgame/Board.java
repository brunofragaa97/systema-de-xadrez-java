package boardgame;

public class Board {
	
	private int rows;
	private int columns;
			//CRIA UMAMATRIZ DE PE�AS 
	private Piece[][] pieces;
	
			//N�O NECESSITA DE PE�A NA INICIALIZA��O, POR ISSO N�O EST� DENTRO DO CONSTRUTOR
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

			//ENCAPSULAMENTO
			//N�O � NECESSARIO QUE ACESSEM NEM AS COLUNAS E NEM AS LINHAS ATRAVEZ DO "SET"
	public int getRows() {
		return rows;
	}
	public int getColumns() {
		return columns;
	}

	
			//M�TODOS
	public Piece piece (int row, int column) {
		if(!positionExists(row, column)) {	//PROGRAMA��O DEFENSIVA
			throw new BoardException("Position not on the board");//PROGRAMA��O DEFENSIVA
		}
		return pieces[row][column];
	}
			//SOBRECARGA
	public Piece piece (Position position) {
		if(!positionExists(position)) {		//PROGRAMA��O DEFENSIVA
			throw new BoardException("Position not on the board");//PROGRAMA��O DEFENSIVA
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {		//PROGRAMA��O DEFENSIVA
			throw new BoardException("There is already a piece on position " + position);//PROGRAMA��O DEFENSIVA
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
			//M�TODO AUXILIAR
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns; 
		
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
			//TESTA SE TEM ALGUMA PE�A NESTA POSI��O
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {		//PROGRAMA��O DEFENSIVA
			throw new BoardException("Position not on the board");//PROGRAMA��O DEFENSIVA
		}
		return piece(position) != null;
	}
	
	
}
