package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

			//-------------PARTIDA DE TABULEIRO-----------------
			//ESTÁ É A CLASSE QUE CONTÉM TODAS AS REGRAS DO JOGO
public class ChessMatch {
		
	private Board board;
	
			//É IMPORTANTE ENTENDER, ESTÁ CLASSE É QUEM DEVE SABER A DIMENÇÃO DO JOGO
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
			
	
/*											MÉTODOS
			  
			  
			   O PROGRAMA DEVE ENXERGAR APENAS A PEÇA DE XADREZ E NÃO A PEÇA EM SI                             */
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {         // PERCORRE A LINHA HORIZONTAL DO TABULEIRO
			for (int j = 0 ; j < board.getColumns(); j++) { // PERCORRE A LINHA VERTICAL
				mat[i][j] = (ChessPiece) board.piece(i, j); // DOWNCAST PARA PEÇA DE XADREZ
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK),new Position(0, 4));
		board.placePiece(new King(board, Color.BLACK),new Position(7, 4));
	}
}
