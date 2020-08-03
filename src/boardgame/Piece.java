package boardgame;

public class Piece {
			
			//UMA PE�A TEM UMA POSI��O E UM TABULEIRO
	protected Position position;
	private Board board;
	
			//UMA PE�A PODE INICIAR VAZIA, POR ISSO N�O PRECISA DE POSI��O NO CONSTRUTOR
	public Piece(Board board) {
	this.board = board;
	position = null;
	}
		
						
			/*								ENCAPSULAMENTO
			APENAS USO DO 'GET', PARA N�O PERMITIR QUE O TABULEIRO SEJA DENTRO DA PE�A
		  	SOMENTE CLASSES DENTRO DO MESMO PACOTE E SUBPASTAS PODERAO ACESSAR A  PE�A */
	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
