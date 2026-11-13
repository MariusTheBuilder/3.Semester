package intro_assignment_s2.Badminton;

public class Player {
    private String firstName;
    private String lastName;
    private int age;
    private int wins;
    private int losses;
    private String sponsor;

    //
    public Player(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 0, 0, null);
    }

    //
    public Player(String firstName, String lastName, int age, String sponsor) {
        this(firstName, lastName, age, 0, 0, sponsor);
    }

    public Player(String firstName, String lastName, int age, int wins, int losses, String sponsor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.wins = wins;
        this.losses = losses;
        this.sponsor = sponsor;
    }

    public double winLossRatio() {
        if (losses == 0) {
            return wins; // avoid division by zero
        }
        return (double) wins / losses;
    }

    public void addWin() {
        wins++;
    }

    public void addLoss() {
        losses++;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
