package sn.supinfo.javaetudiant;




public class Etudiant extends Personne {
     private int matricule;
public Etudiant(String nom, String prenom, int age, int matricule)
    {
       /* super(nom,prenom, age,matricule)*/   /*Erreur à cette ligne*/
        this.matricule=matricule;
    }
 public void afficheEtranger()
    {
    super.affiche();
    System.out.println("Pays d/'origine:"+matricule+" ");
    }
}