package session3.E_ChessGame;

/**
 * The knight, moves in L shapes. This is the "Knight" case of session
 * 2's switch, moved into a class of its own.
 */
public class Knight extends ChessPiece {

    public Knight(String color) {
        super("Knight", color);
    }

    @Override
    public boolean isLegalMove(ChessBoard board, int toRow, int toCol) {
        int rowDistance = Math.abs(toRow - getRow());
        int colDistance = Math.abs(toCol - getCol());

        return (rowDistance == 2 && colDistance == 1)
                || (rowDistance == 1 && colDistance == 2);
    }

    @Override
    protected char getLetter() {
        return 'N';
    }
}
