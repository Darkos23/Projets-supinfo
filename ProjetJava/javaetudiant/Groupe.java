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
public class Groupe {
    private String nom_groupe;
    private String date_creation;
    private String module_groupe;

    public Groupe() {
    }

    public Groupe(String nom_groupe,String date_creation,String module_groupe) {
        this.nom_groupe=nom_groupe;
        this.date_creation=date_creation;
        this.module_groupe=module_groupe;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }

    public String getNom_groupe() {
        return nom_groupe;
    }

    public void setNom_groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getModule_groupe() {
        return module_groupe;
    }

    public void setModule_groupe(String module_groupe) {
        this.module_groupe = module_groupe;
    }
        

    @Override
    public String toString() {
        return "{" +
            " nom_groupe='" + getNom_groupe() + "'" +
            ", date_creation='" + getDate_creation() + "'" +
            ", module_groupe='" + getModule_groupe() + "'" +
            "}";
    }
 
}


