package boardgame;

public abstract class Piece {

			// UMA PEÇA TEM UMA POSIÇÃO E UM TABULEIRO
	protected Position position;
	private Board board;

			// UMA PEÇA PODE INICIAR VAZIA, POR ISSO NÃO PRECISA DE POSIÇÃO NO CONSTRUTOR
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

			/*
			 * ENCAPSULAMENTO APENAS USO DO 'GET', PARA NÃO PERMITIR QUE O TABULEIRO SEJA
			 * DENTRO DA PEÇA SOMENTE CLASSES DENTRO DO MESMO PACOTE E SUBPASTAS PODERAO
			 * ACESSAR A PEÇA
			 */
	protected Board getBoard() {
		return board;
	}


	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
