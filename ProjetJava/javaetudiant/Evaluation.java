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
public class Evaluation {
     private String type;
    private String date;
    private String duree;


    public Evaluation() {
    }

    public Evaluation(String type,String date,String duree) {
        this.type=type;
        this.date=date;
        this.duree=duree;
    }


    public static void afficher(){
        System.out.println("Bonjour ");
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuree() {
        return this.duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", date='" + getDate() + "'" +
            ", duree='" + getDuree() + "'" +
            "}";
    }
}
