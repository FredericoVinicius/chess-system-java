package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
		position = null; //a posi��o da pe�a rec�m-criada � nula, n�o est� colocada no tabuleiro board
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
