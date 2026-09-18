package session3.E_ChessGame;

/**
 * The Bishop, any distance diagonally. This is the "Bishop" case of
 * session 2's switch, moved into a class of its own.
 */
public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super("Bishop", color);
    }

    @Override
    public boolean isLegalMove(ChessBoard board, int toRow, int toCol) {
        return Movements.isLegalDiagonalMove(board, getRow(), getCol(), toRow, toCol, 7);
    }

    @Override
    protected char getLetter() {
        return 'B';
    }
}
