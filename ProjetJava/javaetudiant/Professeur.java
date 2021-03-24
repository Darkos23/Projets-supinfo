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
public class Professeur{
 protected String nom;
    protected String prenom;
    protected String matiere;
    
    
    public Professeur(){
    
    }
   
    public Professeur(String nom, String prenom, String matiere){
    this.nom= nom;
    this.prenom= prenom;
    this.matiere= matiere;
   
  
    
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }


}

