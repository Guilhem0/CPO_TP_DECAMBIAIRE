/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manipe_decambiaire;

/**
 *
 * @author guilh
 */
public class TP2_Manipe_DECAMBIAIRE {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        //3:
        Tartiflette assiette1= new Tartiflette(500);
        Tartiflette assiette2= new Tartiflette(600);
        Tartiflette assiette3=assiette2;
        //on a crée 3 éléments, assiette 2 et 3 ont la même valeur mais sont 2 tartiflettes différentes
        
        //4:
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        //5:
        assiette2= assiette1;
        assiette1=assiette3; // même technique qu'au dessus
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;  //on affiche a nouveau, et cela a fonctionné
        
        //6:
        // La ligne "Moussaka assiette666 = assiette1 ;" est incorrecte
        // La ligne "Moussaka assiette667 = new Tartiflette() ;" est incorrecte
        //Une référence objet ne peut pas referencer un autre type d'objet 
        
        //7:
        Moussaka Tab [] = new Moussaka[10];  // création du tableau
        for (int i=0;i<10;i++){ //pour chaque case du tableau, on crée une moussaka
            Tab[i]= new Moussaka(i); //le nombre de callorie est égal au numero de case de la moussaka
        }
        System.out.println(Tab[1].nbCalories);
        System.out.println(Tab[4].nbCalories); // je print 2 cases du tableau pour vérifier si cela fonctionne
    }

}
