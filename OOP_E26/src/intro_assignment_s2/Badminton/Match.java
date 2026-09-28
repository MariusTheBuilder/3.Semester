package intro_assignment_s2.Badminton;

public class Match {
    private Team red;
    private Team blue;

    public Match(Team red, Team blue) {
        this.red = red;
        this.blue = blue;
    }

    public double averageAge() {
        return (red.averageAge() + blue.averageAge()) / 2.0;
    }

    public Player bestWinLossRatio() {
        Player[] players = {
                red.getPlayer1(), red.getPlayer2(),
                blue.getPlayer1(), blue.getPlayer2()
        };

        Player best = players[0];
        for (Player p : players) {
            if (p.winLossRatio() > best.winLossRatio()) {
                best = p;
            }
        }
        return best;
    }

    public void reportResult(Team winner) {
        if (winner == red) {
            red.recordWin();
            blue.recordLoss();
        } else if (winner == blue) {
            blue.recordWin();
            red.recordLoss();
        } else {
            throw new IllegalArgumentException("Winner must be one of the two teams in this match");
        }
    }
}
