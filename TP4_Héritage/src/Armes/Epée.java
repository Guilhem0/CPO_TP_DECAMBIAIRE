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
        if(uneFinesse>0 && uneFinesse<100){
            finesse=uneFinesse;
        }
        if(uneFinesse>100){
            finesse=100;
        }
        if(uneFinesse<0){
            finesse=0;
        }
        if(unNivAttaque>0 && unNivAttaque<100){
            nivAttaque=unNivAttaque;
        }
        if(unNivAttaque>100){
            nivAttaque=100;
        }
        if(unNivAttaque<0){
            nivAttaque=0;
        }

        
        
    }

    public int getFinesse() {
        return finesse;
    }
    public String getNom() {
        return nom;
    }
    public int getNivAttaque() {
        return nivAttaque;
    }

    
    
    public void setFinesse(int finesse) {
        if(finesse>0 && finesse<100){
            this.finesse=finesse;
        }
        if(finesse>100){
            this.finesse=100;
        }
        if(finesse<0){
            this.finesse=0;
        }
    }
    public void setNivAttaque(int nivAttaque) {
        if(nivAttaque>0 && nivAttaque<100){
            this.nivAttaque=nivAttaque;
        }
        if(nivAttaque>100){
            this.nivAttaque=100;
        }
        if(nivAttaque<0){
            this.nivAttaque=0;
        }
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
    @Override  //on cree un toString specialise pour les epees
    public String toString() {
        return "Epee{Nom = "+nom+ ", Niveau = "+nivAttaque+", finesse = " + finesse + '}';
    }

}
