package chess;

import boardgame.Board;
import boardgame.Piece;

		//AO UTILIZAR "HERANÇA", O COMPILADOR RECLAMA POIS EXIGE "CONSTRUTOR" DA CLASSE "PIECE"
public class ChessPiece extends Piece {
	
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
	
	

}
