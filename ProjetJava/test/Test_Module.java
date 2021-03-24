/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.test;


import sn.supinfo.javaetudiant.Module;

/**
 *
 * @author IBRAHIMA SARR
 */
public class Test_Module {
      public static void main(String [] args){
   
          Module m1 = new Module();
        
         m1.setNom(" Java ");
         m1.setVolume_horaire(" 20 heures ");
         m1.setCoef( 2 );
         m1.setDescription(" Java est une technique informatique développée initialement par Sun Microsystems puis acquise par Oracle suite au rachat de l'entreprise.");
          
         System.out.print(m1);
         System.out.print(m1);
         System.out.print(m1);
         System.out.print(m1);
}
}