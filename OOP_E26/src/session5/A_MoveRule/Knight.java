package session5.A_MoveRule;

import session5.A_MoveRule.rules.LShape;

/**
 *
 */
public class Knight extends ChessPiece {

    public Knight(String color) {
        super("Knight", color);
        addRule(new LShape());
    }

    @Override
    protected char getLetter() {
        return 'N';
    }
}

