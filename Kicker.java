package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class Kicker {
    private int tischnummer;
    private Team team1;
    private Team team2;
    public Kicker(int nummer)
    {
        tischnummer = nummer;
    }

    public int getNummer()
    {
        return tischnummer;
    }
    public void setTeams(Team t1,Team t2)
    {
        team1 = t1;
        team2 = t2;
    }
}
