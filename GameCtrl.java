package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class GameCtrl {
    private KickerList kList;
    private PlayerList plist;

    public GameCtrl(int kickerAnzahl)
    {
        createKickerList(kickerAnzahl);
    }

    public void createKickerList(int anzahl)
    {
        kList = new KickerList();
        kList.initList(anzahl);
    }
    public void createPlayerList()
    {
        plist = new PlayerList();
    }

    //@Param pos  0 = Defense 1 = Defense
    public void newPlayer(String name,int pos)
    {
        plist.addPlayer(new Player(name,pos));
    }


}
