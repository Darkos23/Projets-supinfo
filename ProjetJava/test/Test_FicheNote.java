/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.test;

import sn.supinfo.javaetudiant.FicheNote;

/**
 *
 * @author IBRAHIMA SARR
 */
public class Test_FicheNote {
       public static void main(String [] args){
        
        FicheNote fn1 = new FicheNote();
        
           fn1.setNom_fiche_note("Evaluation de Java Pr310"); 
           fn1.setDate("24/03/2021");
          
            System.out.print(fn1);
            System.out.print(fn1);
}
}