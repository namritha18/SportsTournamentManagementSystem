public class Team {

    String teamName;
    String[] players = new String[20];
    int count = 0;

    Team(String name) {
        teamName = name;
    }

    void addPlayer(String playerName) {
        players[count] = playerName;
        count++;
    }

    void displayTeam() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Players:");

        for (int i = 0; i < count; i++) {
            System.out.println(players[i]);
        }
    }
}