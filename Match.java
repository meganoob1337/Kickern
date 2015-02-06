package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class Match {
    private Kicker kicker;
    private Team team1;
    private Team team2;

    public Match(int kickernr,Team t1,Team t2)
    {
        kicker = new Kicker(kickernr);
        team1= t1;
        team2 = t2;
    }
}
