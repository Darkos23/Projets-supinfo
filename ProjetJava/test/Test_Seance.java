/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.test;


import sn.supinfo.javaetudiant.Seance;

/**
 *
 * @author IBRAHIMA SARR
 */
public class Test_Seance {
    
public static void main(String [] args){
        
         Seance s1 = new Seance();

         s1.setDate(" Devoir de Java ");
         s1.setHeure_debut(" 15h ");
         s1.setHeure_fin(" 17h ");
         s1.setSolde_heure(" Le total d'heure est : 3H");
        
           
            System.out.print(s1);
            System.out.print(s1);
            System.out.print(s1);
         
          
        }
}
