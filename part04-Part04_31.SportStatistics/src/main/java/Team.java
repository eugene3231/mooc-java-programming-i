/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Team {
    private String name;
    private int matches;
    private int wins;
    private int losses;
    
    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.matches = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getMatches() {
        return this.matches;
    }
    
    public int getWins() {
        return this.wins;
    }
    public int getLosses() {
        return this.losses;
    }
    
    public void setWin() {
        this.wins++;
        matches++;
    }
    
    public void setLose() {
        this.losses++;
        matches++;
    }
    
    
}
