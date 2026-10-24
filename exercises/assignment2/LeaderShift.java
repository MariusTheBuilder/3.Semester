package assignment2;

public class LeaderShift extends Shift {
    private int leaderFestivals;

    public LeaderShift(int hours, String task, int leaderFestivals) {
        super(hours, task);
        this.leaderFestivals = leaderFestivals;
    }

    @Override
    public int points() {
        if (leaderFestivals < 3) {
            return getHours() * 2;
        } else {
            return getHours() * 3;
        }
    }

    @Override
    public String ruleName() {
        if (leaderFestivals < 3) {
            return "2 per hour: new leader";
        } else {
            return "3 per hour: experienced leader";
        }
    }
}
