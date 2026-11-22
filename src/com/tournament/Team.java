package com.tournament;
import java.util.ArrayList;

public class Team {
	private String teamName;
    private ArrayList<String> players;
    private int points;
    private int wins;
    private int draws;
    private int losses;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
        points = 0;
        wins = 0;
        draws = 0;
        losses = 0;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(String player) {
        players.add(player);
    }

    public ArrayList<String> getPlayers() {
        return players;
    }
}


