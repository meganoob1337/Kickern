package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class GameCtrl {
    private KickerList kList;
    private Player

    public GameCtrl(int kickerAnzahl)
    {
        createKickerList(kickerAnzahl);
    }

    public void createKickerList(int anzahl)
    {
        kList = new KickerList();
        kList.initList(anzahl);
    }
}
