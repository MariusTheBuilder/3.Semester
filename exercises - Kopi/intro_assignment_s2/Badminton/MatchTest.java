package intro_assignment_s2.Badminton;

public class MatchTest {
    public static void main(String[] args) {
        Player p1 = new Player("Anders", "Holm", 20);
        Player p2 = new Player("Bo", "Jensen", 29, "SportyBrand");
        Player p3 = new Player("Camilla", "Nielsen", 22);
        Player p4 = new Player("Ditte", "Larsen", 36);

        Team red = new Team("Red Dragons", p1, p2);
        Team blue = new Team("Blue Falcons", p3, p4);

        // Test Team.averageAge() directly
        System.out.println("Red average age: " + red.averageAge());
        System.out.println("Blue average age: " + blue.averageAge());

        Match match = new Match(red, blue);
        System.out.println("Match average age: " + match.averageAge());

        // Print each player's ratio before any matches
        System.out.println("--- Before match ---");
        printPlayerStats(p1);
        printPlayerStats(p2);
        printPlayerStats(p3);
        printPlayerStats(p4);

        // Play a few matches so ratios actually diverge
        match.reportResult(red);   // red wins
        match.reportResult(red);   // red wins again
        match.reportResult(blue);  // blue wins once

        System.out.println("--- After 3 matches ---");
        printPlayerStats(p1);
        printPlayerStats(p2);
        printPlayerStats(p3);
        printPlayerStats(p4);

        // Now bestWinLossRatio() is actually meaningful
        System.out.println("Best win-loss ratio: " + match.bestWinLossRatio());
    }

    private static void printPlayerStats(Player p) {
        System.out.println(p + " -> win/loss ratio: " + p.winLossRatio());
    }
}
