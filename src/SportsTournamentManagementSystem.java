
import java.util.Scanner;

public class SportsTournamentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static Team[] teams = new Team[20];
    static Match[] matches = new Match[50];

    static int teamCount = 0;
    static int matchCount = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== SPORTS TOURNAMENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Teams and Players");
            System.out.println("2. Display All Teams");
            System.out.println("3. Schedule Matches");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    registerTeam();
                    break;

                case 2:
                    displayTeams();
                    break;

                case 3:
                    scheduleMatch();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    // Feature 1: Register teams and players
    static void registerTeam() {

        if (teamCount >= 20) {
            System.out.println("Team limit reached!");
            return;
        }

        System.out.print("Enter team name: ");
        String name = sc.nextLine();

        Team t = new Team(name);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n < 1 || n > 20) {
            System.out.println("Enter between 1 and 20 players.");
            return;
        }

        for (int i = 0; i < n; i++) {

            System.out.print("Enter player " + (i + 1) + " name: ");
            String player = sc.nextLine();

            t.addPlayer(player);
        }

        teams[teamCount] = t;
        teamCount++;

        System.out.println("Team registered successfully!");
    }

    // Feature 2: Display all registered teams
    static void displayTeams() {

        if (teamCount == 0) {
            System.out.println("No teams registered!");
        } else {

            for (int i = 0; i < teamCount; i++) {

                System.out.println("\nTeam " + (i + 1));
                teams[i].displayTeam();
            }
        }
    }

    // Feature 3: Schedule matches between teams
    static void scheduleMatch() {

        if (teamCount < 2) {
            System.out.println("Register at least two teams first!");
            return;
        }

        if (matchCount >= 50) {
            System.out.println("Match limit reached!");
            return;
        }

        System.out.println("\nRegistered Teams:");

        for (int i = 0; i < teamCount; i++) {
            System.out.println((i + 1) + ". " + teams[i].teamName);
        }

        System.out.print("Select first team number: ");
        int a = sc.nextInt();

        System.out.print("Select second team number: ");
        int b = sc.nextInt();
        sc.nextLine();

        if (a < 1 || a > teamCount ||
            b < 1 || b > teamCount || a == b) {

            System.out.println("Invalid team selection!");
            return;
        }

        System.out.print("Enter match date: ");
        String date = sc.nextLine();

        matches[matchCount] = new Match(
            teams[a - 1].teamName,
            teams[b - 1].teamName,
            date
        );

        matchCount++;

        System.out.println("Match scheduled successfully!");
    }
}

