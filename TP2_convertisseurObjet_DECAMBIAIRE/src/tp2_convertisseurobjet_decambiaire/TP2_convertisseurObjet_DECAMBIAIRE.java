/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_decambiaire;

import java.util.Scanner;

public class TP2_convertisseurObjet_DECAMBIAIRE {

        public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);       
        double temp;//le nombre que saisi l'utilisateur
        double ind;//le nombre de la comparaison qu'il souhaite
        double valeur;//le résultat de la conversion
        valeur=0;
        
        Convertisseur c = new Convertisseur();//création de l'objet convertisseur
        System.out.println("Entrer la température");
        temp=sc.nextDouble();//demande de saisi sur l'interface
        System.out.println("Choisissez le numéro de la conversion");
        System.out.println("Index numéro de conversion : \n 1:CelciusVersKelvin \n 2:KelvinVersCelcius \n 3:FahrenheitVersCelcius \n 4:CelciusVersFahrenheit \n 5:FahrenheitVersKelvin \n 6:KelvinVersFahrenheit");
        ind=sc.nextDouble();//saisi sur l'interface
        
        
        //si l'utilisateur choisi la conversion 1
        if (ind==1){
            valeur=c.CelciusVersKelvin(temp);//on récupère le calcul de conversion avec le nombre saisi
            System.out.println(valeur+"K");//affichage du résulat dans l'unité correspondante
        }
        if (ind==2){
            valeur=c.KelvinVersCelcius(temp);
            System.out.println(valeur+"C");
        }
        if (ind==3){
            valeur=c.FahrenheitVersCelcius(temp);
            System.out.println(valeur+"C");
        }
        if (ind==4){
            valeur=c.CelciusVersFahrenheit(temp);
            System.out.println(valeur+"F");
        }
        
        if (ind==5){
            valeur=c.FahrenheitVersKelvin(temp);
            System.out.println(valeur+"K");
        }
        if (ind==6){
            valeur=c.KelvinVersFahrenheit(temp);
            System.out.println(valeur+"F");
        } 
  
        
    }
    
}
