package session5.A_MoveRule;

import session5.A_MoveRule.rules.Diagonal;
import session5.A_MoveRule.rules.StraightLine;

public class King extends ChessPiece {

    public King(String color) {
        super("King", color);
        addRule(new StraightLine(1));
        addRule(new Diagonal(1));
    }

    @Override
    protected char getLetter() {
        return 'K';
    }
}
