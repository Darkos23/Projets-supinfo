/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.test;


import sn.supinfo.javaetudiant.Groupe;

/**
 *
 * @author IBRAHIMA SARR
 */
public class Test_Groupe {
     public static void main(String [] args){
        
        Groupe g1 = new Groupe();
        
           g1.setNom_groupe("Pr310"); 
           g1.setDate_creation("24/03/2021");
           g1.setModule_groupe("Semestre 1: Anglais, Java, Analyse de multidimentionnelle, BI, Reseaux...");
          
         System.out.print(g1);
         System.out.print(g1);
         System.out.print(g1);
}
}
