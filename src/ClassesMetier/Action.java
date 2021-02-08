/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetier;

/**
 *
 * @author jacqu
 */
public class Action
{
    // A vous de jouer
    private int idAction;
    private String nomAction;
    private double valeurReel;
    private double valeurAchat;
    private int quantiteAchat;
    
    
    public Action(int uneAction,String unNomAction,double unevaleurReel, double unevaleurAchat,int uneQuantiteAchat)
    {
        idAction = uneAction;
        nomAction = unNomAction;
        valeurReel = unevaleurReel;
        valeurAchat = unevaleurAchat;
        quantiteAchat = uneQuantiteAchat;   
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public String getNomAction() {
        return nomAction;
    }

    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }

    public double getvaleurReel() {
        return valeurReel;
    }

    public void setvaleurReel(double coursReel) {
        this.valeurReel = coursReel;
    }

    public double getvaleurAchat() {
        return valeurAchat;
    }

    public void setvaleurAchat(double coursAchat) {
        this.valeurAchat = coursAchat;
    }

    public int getQuantiteAchat() {
        return quantiteAchat;
    }

    public void setQuantiteAchat(int quantiteAchat) {
        this.quantiteAchat = quantiteAchat;
    }

}
