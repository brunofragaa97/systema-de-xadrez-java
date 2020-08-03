package boardgame;

public class Piece {
			
			//UMA PEÇA TEM UMA POSIÇÃO E UM TABULEIRO
	protected Position position;
	private Board board;
	
			//UMA PEÇA PODE INICIAR VAZIA, POR ISSO NÃO PRECISA DE POSIÇÃO NO CONSTRUTOR
	public Piece(Board board) {
	this.board = board;
	position = null;
	}
		
						
			/*								ENCAPSULAMENTO
			APENAS USO DO 'GET', PARA NÃO PERMITIR QUE O TABULEIRO SEJA DENTRO DA PEÇA
		  	SOMENTE CLASSES DENTRO DO MESMO PACOTE E SUBPASTAS PODERAO ACESSAR A  PEÇA */
	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
