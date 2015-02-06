package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */

// Position 0 = Defense
//Position 1 = Offense
public class Player {
    private String name;
    private int position;


    public Player(String pname,int pos)
    {
        name = pname;
        position = pos;

    }
    public String getName()
    {
        return name;
    }
    public int getPosition()
    {
        return position;
    }
}
