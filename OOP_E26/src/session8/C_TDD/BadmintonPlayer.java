package session8.C_TDD;

public class BadmintonPlayer {
    private String name;
    private int matchesWon;
    private int matchesLost;



    public BadmintonPlayer(String name, int matchesWon, int matchesLost) {
        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
    }

    public String getName() {
        return name;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

}
