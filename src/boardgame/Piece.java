package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
		position = null; //a posição da peça recém-criada é nula, não está colocada no tabuleiro board
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
