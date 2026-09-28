package intro_assignment_s2.Badminton;

public class Team {
    private String teamName;
    private Player player1;
    private Player player2;

    public Team(String teamName, Player player1, Player player2) {
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
    }

    public double averageAge() {
        return (player1.getAge() + player2.getAge()) / 2.0;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void recordWin() {
        player1.addWin();
        player2.addWin();
    }

    public void recordLoss() {
        player1.addLoss();
        player2.addLoss();
    }

    @Override
    public String toString() {
        return teamName;
    }
}
