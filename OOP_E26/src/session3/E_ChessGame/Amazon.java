package session3.E_ChessGame;

/**
 * The Amazon, moves like a Queen and a Knight.
 *
 */
public class Amazon extends ChessPiece {

    public Amazon(String color) {
        super("Amazon", color);
    }

    @Override
    public boolean isLegalMove(ChessBoard board, int toRow, int toCol) {
        int rowDistance = Math.abs(toRow - getRow());
        int colDistance = Math.abs(toCol - getCol());

        return Movements.isLegalHorizontalMove(board, getRow(), getCol(), toRow, toCol, 7)
                || Movements.isLegalVerticalMove(board, getRow(), getCol(), toRow, toCol, 7)
                || Movements.isLegalDiagonalMove(board, getRow(), getCol(), toRow, toCol, 7)
                || (rowDistance == 2 && colDistance == 1)
                || (rowDistance == 1 && colDistance == 2);
    }

    @Override
    protected char getLetter() {
        return 'A';
    }
}
