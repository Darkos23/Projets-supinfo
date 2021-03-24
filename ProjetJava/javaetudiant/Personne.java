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
public class Personne{
  private String nom;
    private String prenom;
    private String telephone;
    private String mail;
    private int age;
    
    
    public Personne(){
    
    }
    
public Personne(String nom, String prenom, String mail, int age, String tel)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=tel;
        this.mail=mail;
        this.age=age;
    }
 public void affiche()
    {
    System.out.print("Nom:"+nom+" ");
    System.out.print("Prenom:"+prenom+" ");
    System.out.println("Age:"+age+" ");
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 

    

}
