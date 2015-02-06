package de.Meganoob1337;

import java.util.ArrayList;

/**
 * Created by Andrei on 06.02.2015.
 */
public class KickerList {
    private ArrayList<Kicker> free;
    private ArrayList<Kicker> occupied;
    private ArrayList<Kicker> list;

    public KickerList(ArrayList<Kicker> klist)
    {
        list = klist;
    }
    public KickerList()
    {
        list = new ArrayList<Kicker>();
    }
}
