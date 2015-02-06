package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class Team {
    private Player player1;
    private Player player2;
    private String teamname;

    public Team(Player p1,Player p2)
    {
        player1 = p1;
        player2 = p2;

    }
    public Team(Player p1,Player p2,String name)
    {
        player1 = p1;
        player2 = p2;
        teamname = name;
    }


}
