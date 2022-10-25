/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_decambiaire;

import java.util.Scanner;
import static tp2_convertisseurobjet_decambiaire.Convertisseur.CelciusVersFarenheit;
import static tp2_convertisseurobjet_decambiaire.Convertisseur.CelciusVersKelvin;
import static tp2_convertisseurobjet_decambiaire.Convertisseur.FarenheitVersCelcius;
import static tp2_convertisseurobjet_decambiaire.Convertisseur.FarenheitVersKelvin;
import static tp2_convertisseurobjet_decambiaire.Convertisseur.KelvinVersCelcius;
import static tp2_convertisseurobjet_decambiaire.Convertisseur.KelvinVersFarenheit;

public class TP2_convertisseurObjet_DECAMBIAIRE {

    public static void main(String[] args) {
        
        double temp;
        double ind;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        temp = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n...\n6) De Farenheit vers Kelvin");
        ind = sc.nextDouble();
        
        if (ind==1){
            temp=CelciusVersKelvin(temp);
            System.out.println(temp);
        }
        if (ind==2){
            temp=KelvinVersCelcius(temp);
            System.out.println(temp);
        }
        if (ind==3){
            temp=FarenheitVersCelcius(temp);
            System.out.println(temp);
        }
        if (ind==4){
            temp=CelciusVersFarenheit(temp);
            System.out.println(temp);
        }
        if (ind==5){
            temp=KelvinVersFarenheit(temp);
            System.out.println(temp);
        }
        if (ind==6){
            temp=FarenheitVersKelvin(temp);
            System.out.println(temp);
        } 
        //Convertisseur obj1 = new Convertisseur
    }
}
