package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

		//AO UTILIZAR "HERANÇA", O COMPILADOR RECLAMA POIS EXIGE "CONSTRUTOR" DA CLASSE "PIECE"
public abstract class ChessPiece extends Piece {
	
	private Color color;

			//CONSTRUTOR
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

			//APENAS USO DO GET, PARA QUE A COR DE UMA PEÇA NÃO SEJA ALTERADA, APENAS SERA ACESSADA
	public Color getColor() {
		return color;
	}
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	

}
