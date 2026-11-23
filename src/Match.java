public class Match {
    String team1;
    String team2;
    String matchDate;

    // Constructor
    Match(String t1, String t2, String date) {
        team1 = t1;
        team2 = t2;
        matchDate = date;
    }

    // Display match details
    void displayMatch() {
        System.out.println("Match Details:");
        System.out.println(team1 + " vs " + team2);
        System.out.println("Match Date: " + matchDate);
    }
}

