/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javaetudiant;

/**
 *
 * @author IBRAHIMA SARR
 */
public class FicheNote {
     private String nom_fiche_note;
    private String date;


    public FicheNote() {
    }

    public FicheNote(String nom_fiche_note,String date) {
        this.nom_fiche_note=nom_fiche_note;
        this.date=date;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }

    public String getNom_fiche_note() {
        return this.nom_fiche_note;
    }

    public void setNom_fiche_note(String nom_fiche_note) {
        this.nom_fiche_note = nom_fiche_note;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
            " nom_fiche_note='" + getNom_fiche_note() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }
}
