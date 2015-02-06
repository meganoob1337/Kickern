package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class Player {
    private String name;
    private String position;


    public Player(String pname,String pos)
    {
        name = pname;
        position = pos;

    }
    public String getName()
    {
        return name;
    }
    public String getPosition()
    {
        return position;
    }
}
