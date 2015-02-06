package de.Meganoob1337;

/**
 * Created by Andrei on 06.02.2015.
 */
public class Team {
    private Player player1;
    private Player player2;
    private String teamname;
    private int kassiert;
    private int geschossen;
    private int punkte;
    public int siege;
    public int niederlagen;
    public int unentschieden;
    public int spiele;


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

    public int getKassiert()
    {
        return kassiert;
    }

    public int getGeschossen()
    {
        return geschossen;
    }

    public int getPunkte()
    {
        return punkte;
    }
    public int getDifferenz()
    {
        return geschossen-kassiert;
    }
    public void addSpiel(int gesch,int kass,int pt)
    {
        geschossen += gesch;
        kassiert += kass;
        punkte += pt;
        spiele++;
        if(gesch>kass)
        {
            siege++;
        }
        if(kass>gesch)
        {
            niederlagen++;
        }
        if(kass == gesch)
        {
            unentschieden++;
        }
    }

    public int getSiege(){
        return siege;
    }
    public int getNiederlagen(){
        return niederlagen;
    }
    public int getUnentschieden(){
        return unentschieden;
    }
    public int getSpiele(){
        return spiele;
    }
}
