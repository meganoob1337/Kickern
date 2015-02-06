package de.Meganoob1337;

import java.util.ArrayList;

/**
 * Created by Andrei on 06.02.2015.
 */
public class PlayerList {
    private ArrayList<Player> playerList;

    public PlayerList()
    {
        playerList = new ArrayList<Player>();

    }
    public void addPlayer(Player player)
    {
        playerList.add(player);
    }
    public ArrayList<Player> getPlayerList()
    {
        return playerList;
    }
}
