package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
				//CRIA A PARTIDA DE TABULEIRO
		ChessMatch chessMatch = new ChessMatch();
				//USER INTERFACE
		UI.printBoard(chessMatch.getPieces());

		
	}

}
