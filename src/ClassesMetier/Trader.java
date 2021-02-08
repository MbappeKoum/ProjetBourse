/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Trader
{
    // A vous de jouer
    
    private int idTrader;
    private String nomTrader;
    private ArrayList<Action> lesActions;
    
    public Trader(int unIdTrader, String unNomTrader)
    {
        idTrader = unIdTrader;
        nomTrader = unNomTrader;
        lesActions = new ArrayList<Action>();
    }

    public int getIdTrader() {
        return idTrader;
    }

    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    public String getNomTrader() {
        return nomTrader;
    }

    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }

    public ArrayList<Action> getlesActions() {
        return lesActions;
    }

    public void setlesActions(ArrayList<Action> sesActions) {
        this.lesActions = lesActions;
    }
}


