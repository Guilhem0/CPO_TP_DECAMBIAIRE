/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;


/**
 *
 * @author guilh
 */
public class Epée extends Arme {
    int finesse;
    
    public Epée(String n, int unNivAttaque, int uneFinesse){
        super(n,unNivAttaque);
        if(uneFinesse>0){
            finesse=uneFinesse;
        }else{
            finesse=0;
        }
    }
    
    @Override  //on cree un toString specialise pour les epees
    public String toString() {
        return "Epee{Nom = "+nom+ ", Niveau = "+nivAttaque+", finesse = " + finesse + '}';
    }

}
