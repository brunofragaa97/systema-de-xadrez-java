package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

			//-------------PARTIDA DE TABULEIRO-----------------
			//EST� � A CLASSE QUE CONT�M TODAS AS REGRAS DO JOGO
public class ChessMatch {
		
	private Board board;
	
			//� IMPORTANTE ENTENDER, EST� CLASSE � QUEM DEVE SABER A DIMEN��O DO JOGO
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
			
	
/*											M�TODOS
			  
			  
			   O PROGRAMA DEVE ENXERGAR APENAS A PE�A DE XADREZ E N�O A PE�A EM SI                             */
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {         // PERCORRE A LINHA HORIZONTAL DO TABULEIRO
			for (int j = 0 ; j < board.getColumns(); j++) { // PERCORRE A LINHA VERTICAL
				mat[i][j] = (ChessPiece) board.piece(i, j); // DOWNCAST PARA PE�A DE XADREZ
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
